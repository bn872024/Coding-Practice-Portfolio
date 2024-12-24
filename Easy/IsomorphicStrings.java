/*
 * Isomorphic Strings
 * 
 * Problem Description:
 * Given two strings `s` and `t`, determine if they are isomorphic.
 * Two strings `s` and `t` are isomorphic if the characters in `s` can be replaced to get `t`.
 * 
 * Rules:
 * - All occurrences of a character must be replaced with another character while preserving the order of characters.
 * - No two characters may map to the same character, but a character may map to itself.
 * 
 * Input Example:
 * s = "egg", t = "add"
 * 
 * Output:
 * true (because 'e' maps to 'a' and 'g' maps to 'd', preserving the structure)
 * 
 * Additional Examples:
 * 1. Input: s = "foo", t = "bar"
 *    Output: false (because 'o' cannot map to both 'a' and 'r')
 * 
 * 2. Input: s = "paper", t = "title"
 *    Output: true (because 'p' maps to 't', 'a' to 'i', 'p' to 't', 'e' to 'l', and 'r' to 'e')
 */

 import java.util.HashMap;

 public class IsomorphicStrings {
 
     /**
      * Determines if two strings are isomorphic.
      * 
      * @param s the first string
      * @param t the second string
      * @return true if the strings are isomorphic, false otherwise
      */
     public boolean isIsomorphic(String s, String t) {
         // If lengths are not equal, the strings cannot be isomorphic
         if (s.length() != t.length()) {
             return false;
         }
 
         // HashMaps to maintain mappings from characters in `s` to characters in `t` and vice versa
         HashMap<Character, Character> source = new HashMap<>();
         HashMap<Character, Character> target = new HashMap<>();
 
         // Iterate through each character of the strings
         for (int i = 0; i < s.length(); i++) {
             char charS = s.charAt(i); // Character from string `s`
             char charT = t.charAt(i); // Character from string `t`
            
        // if there is already mapping in the source, check if that is equal to key of target mapping.
        // if not you can say they are not isoMorphic , but if yes then check the reverse
        // meaning , check if there is already target mapping for the key present in source as the value of the 
        // key of target , if no , immediately we can say they are not isomorphic.. and it equals then we continue 
        // to check next character
        // but if yes.. no mapping mapping there meaning we need to add the mapping both source and target and check for nex 
        // character
        // Check if a mapping already exists in `source`
             if (source.containsKey(charS)) {
                 // If the mapping does not match the corresponding character in `t`, return false
                 if (!source.get(charS).equals(charT)) {
                     return false;
                 }
             } 
             // Check if a mapping already exists in `target`
             else if (target.containsKey(charT)) {
                 // If the mapping does not match the corresponding character in `s`, return false
                 if (!target.get(charT).equals(charS)) {
                     return false;
                 }
             } 
             // If no mapping exists, create a new mapping in both `source` and `target`
             else {
                 source.put(charS, charT);
                 target.put(charT, charS);
             }
         }
 
         // If all characters have valid mappings, the strings are isomorphic
         return true;
     }
 
     /**
      * Main method to test the isIsomorphic function.
      */
     public static void main(String[] args) {
         // Test cases
         String s1 = "ege";
         String t1 = "def";
         String s2 = "egg";
         String t2 = "add";
         String s3 = "foo";
         String t3 = "bar";
 
         IsomorphicStrings isObj = new IsomorphicStrings();
 
         System.out.println("s1 and t1 are Isomorphic? " + isObj.isIsomorphic(s1, t1)); // Expected: true
         System.out.println("s2 and t2 are Isomorphic? " + isObj.isIsomorphic(s2, t2)); // Expected: true
         System.out.println("s3 and t3 are Isomorphic? " + isObj.isIsomorphic(s3, t3)); // Expected: false
     }
 }
 