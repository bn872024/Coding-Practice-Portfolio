import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
class TwoSum{
public int[] twoSum(int[] nums, int target){
        if(nums==null || nums.length<2)    
        /*  need to remember that nums==null , we should put before as
         * In Java, logical operators like || evaluate from left to right. If nums == null is true, 
         * then the second condition nums.length < 2 will not be evaluated, preventing a NullPointerException
         */
            return new int[] {-1,-1};

        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
                /*The correct order is {map.get(complement), i} because: map.get(complement) represents 
                the index of the previously encountered number that, when added to nums[i], equals the target.
                 if returning order of indexes does not matter, then you can either way
                 */
            }
            else{
                map.put(nums[i], i);
            }
        }
        return new int[] {-1,-1};


}


public static void main(String[] args) {
    int[] num1= {2,7,11,15};
    int target1=9;
    int[] num2={3,2,4};
    int target2=6;
    int[] num3={3,3};
    int target3=6;
    int[] num4={3,3,5,6};
    int target4=10;
    TwoSum ts=new TwoSum();
    System.out.println("Target1 is found in :"+ Arrays.toString(ts.twoSum(num1, target1)));
    System.out.println("Target2 is found in :"+ Arrays.toString(ts.twoSum(num2, target2)));
    System.out.println("Target3 is found in :"+ Arrays.toString(ts.twoSum(num3, target3)));
    System.out.println("Target4 is found in :"+ Arrays.toString(ts.twoSum(num4, target4)));

}

}
