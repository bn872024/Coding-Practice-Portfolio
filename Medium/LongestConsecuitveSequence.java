/*
 * Longest Consecutive Sequence
Given an array of integers nums, return the length of the longest consecutive sequence of elements that can be formed.

A consecutive sequence is a sequence of elements in which each element is exactly 1 greater than the previous element. The elements do not have to be consecutive in the original array.

You must write an algorithm that runs in O(n) time.

Example 1:

Input: nums = [2,20,4,10,3,4,5]

Output: 4
 * 
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class LongestConsecutiveSequence{

    public int findLongestSequence(int[] nums){

            if(nums==null || nums.length<1)
                return 0;
    
            int longest=0;

            Set<Integer> hs=new HashSet<>();
            // add the unique values to the set
            for(int num:nums){
                hs.add(num);
            }

            // We can traverse through the set .. as we need unique consicutive sequence
            for(int num : hs){
                if(!hs.contains(num-1)){  // this is num-1 is to check if there is no previous number we can safely calculate only forward consecutives
                    int length=1;  // this length is need to be declared here because this will  be used to count the length of 
                    // the streak so it will be used to calculate the out side of innner while loop.
                    // and it will set again as 1 when we calculate for a second item /iteration.
                    while(hs.contains(num+length)){
                        length++;
                    }
                    longest=Math.max(longest,length);

                }   
            }
            return longest;
    }


    public static void main(String[] args){
        LongestConsecutiveSequence obj=new LongestConsecutiveSequence();

        int[] input1={2,20,4,10,3,4,5};


        System.out.println("Input Array was :"+ Arrays.toString(input1) + " Longest Sequnce length is : " + obj.findLongestSequence(input1));
    }
}