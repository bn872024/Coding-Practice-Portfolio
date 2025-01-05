
import java.util.Arrays;

/*
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 * 
 * 
 */

class MoveAllZeorsToRight_283{

        public int[] moveZeors(int[] a){

            int left=0;
            int right=a.length-1;

            while(left<right){

                if(a[left]==0 && a[right]!=0){
                    a[left]=a[right];
                    a[right]=0;
                    left++;
                    right--;

                }
                else if(a[left]==0 && a[right]==0){
                    right--;
                }
                else{
                    left++;
                }
            }
            return a;

        }

    





    public static void main(String[] args) {
        MoveAllZeorsToRight_283 obj=new MoveAllZeorsToRight_283();

        int[] a={0, 0, 1, 0, 3, 0, 12};
        System.out.println("Input Array: "+ Arrays.toString(a));
        System.out.println("Output Array: "+ Arrays.toString(obj.moveZeors(a)));


    }
}