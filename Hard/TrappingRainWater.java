package Hard;
/*
***
 * You are given an array non-negative integers height which represent an elevation map. Each value height[i] 
 * represents the height of a bar, which has a width of 1.
Return the maximum area of water that can be trapped between the bars.
Example 1:
Input: height = [0,2,0,3,1,0,1,3,2,1]

Output: 9
 *
 */
 public class TrappingRainWater{

        public int calcualateTrappedWater(int[] height){
                
            int leftPointer=0; 
            int rightPointer=height.length-1;
            
            int leftMaxHeight=height[leftPointer]; //0
            int rightMaxHeight=height[rightPointer]; //1

            int water=0;
            
            while(leftPointer<rightPointer){
                if(height[leftPointer]<height[rightPointer]){
                    if(leftMaxHeight< height[leftPointer]){
                        leftMaxHeight=height[leftPointer];
                    }
                    water+=leftMaxHeight-height[leftPointer];
                    leftPointer++;
                   
                }
                else{
                   if(rightMaxHeight<height[rightPointer]){
                    rightMaxHeight=height[rightPointer];
                   }
                   water+=rightMaxHeight-height[rightPointer];
                   rightPointer--;

                }



            }
            return water;
           
        }   

    
    public static void main(String[] args) {
        TrappingRainWater tw=new TrappingRainWater();
        int[] input= {0,2,0,3,1,0,1,3,2,1};
        System.out.println("Answer: "+ tw.calcualateTrappedWater(input));

    }
 }