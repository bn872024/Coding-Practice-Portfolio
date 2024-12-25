/*

The Longest Substring Without Repeating Characters problem is a classic coding challenge often asked in interviews. The goal is to find the length of the longest substring in a given string that contains no repeating characters.

Problem Description
Given a string s, you need to find the length of the longest substring that does not have any repeating characters.

Example
Input:
s = "abcabcbb"

Output:
3

Explanation:
The longest substring without repeating characters is "abc", with a length of 3.

*/

import java.util.HashSet;
import java.util.Set;

class LongestSubStringLengthWithoutRepeat{


        /**
         * Finds the length of the longest substring without repeating characters.
         *
         * @param s The input string. If null or empty, the result is 0.
         * @return The length of the longest substring without repeating characters.
         */
        public int findLengthNoRepeatingChars(String s) {
            // Handle edge cases for null or empty string
            if (s == null || s.length() < 1) {
                return 0;
            }
    
            // Set to keep track of unique characters in the current window
            Set<Character> hs = new HashSet<>();
    
            int left = 0; // Pointer for the start of the current window
            int maxLength = 0; // Tracks the maximum length of substrings found
    
            // Loop through each character in the string
            for (int i = 0; i < s.length(); i++) {
                // If character is already in the set, remove characters from the left
                // until the duplicate is removed
                while (hs.contains(s.charAt(i))) {
                    hs.remove(s.charAt(left));
                    left++;
                }
                // Add the current character to the set
                hs.add(s.charAt(i));
                // Update the maximum length
                maxLength = Math.max(maxLength, i - left + 1);
            }
            return maxLength;
        }
    
        public static void main(String[] args) {
            LongestSubStringLengthWithoutRepeat obj = new LongestSubStringLengthWithoutRepeat();
    
            // Test Case 1
            String s1 = "abcabcbb";
            System.out.println("Test Case 1:");
            System.out.println("Input: " + s1);
            System.out.println("Output: " + obj.findLengthNoRepeatingChars(s1)); // Expected: 3
    
            // Test Case 2
            String s2 = "bbbbb";
            System.out.println("Test Case 2:");
            System.out.println("Input: " + s2);
            System.out.println("Output: " + obj.findLengthNoRepeatingChars(s2)); // Expected: 1
    
            // Test Case 3
            String s3 = "pwwkew";
            System.out.println("Test Case 3:");
            System.out.println("Input: " + s3);
            System.out.println("Output: " + obj.findLengthNoRepeatingChars(s3)); // Expected: 3
    
            // Test Case 4
            String s4 = " ";
            System.out.println("Test Case 4:");
            System.out.println("Input: " + s4);
            System.out.println("Output: " + obj.findLengthNoRepeatingChars(s4)); // Expected: 1
    
            // Test Case 5
            String s5 = "dvdf";
            System.out.println("Test Case 5:");
            System.out.println("Input: " + s5);
            System.out.println("Output: " + obj.findLengthNoRepeatingChars(s5)); // Expected: 3
        }
    }
    
    /**
     * In case of char array inout we would do as below:
     *  // public int findLengthNoRepeatingChars(char[] chars){

    // for (int i=0; i<chars.length; i++){
    //     while(hs.contains(chars[i])){
    //         hs.remove(chars[left]);
    //         left++;
            
    //     }
    //     hs.add(chars[i]);
    //     maxLength=Math.max(maxLength, i-left+1);
    // }
    // return maxLength;
     * 
     * 
     */