/*
 * 
 * Problem Description:

Given an integer array nums, the task is to identify the contiguous subarray (containing at least one number) which has the largest sum, and return that sum.

Example:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]

Output: 6

Explanation: The subarray [4,-1,2,1] has the largest sum = 6.
 * 
 * 
 */


public class KadaneMaximumSubArraySum {

    public int findMaxSubArraySum(int[] nums){

        if(nums==null || nums.length<1){
            throw  new IllegalArgumentException("No solution found");
        }

        int maxSumSoFar=nums[0];
        int result=nums[0]; 

        for (int i=1; i<nums.length;i++){

            if(nums[i]> nums[i]+maxSumSoFar){
                maxSumSoFar=nums[i];
            }
            else{
                maxSumSoFar= nums[i]+maxSumSoFar;
            }
            result=Math.max(result,maxSumSoFar);

        }
        return result;


    }

    public static void main(String[] args) {
        KadaneMaximumSubArraySum ks=new KadaneMaximumSubArraySum();


        int[] a={-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(ks.findMaxSubArraySum(a));

        
    }
    
}
