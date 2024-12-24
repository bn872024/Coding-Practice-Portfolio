/*
 * Isomorphic Strings
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters.
 No two characters may map to the same character, but a character may map to itself.
 Input: s = "egg", t = "add"
 Output: true

 * 
 * 
 * 
 */

import java.util.HashMap;

public class IsomorphicStrings {

     public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character>  source= new HashMap<Character, Character>();
        HashMap<Character, Character>  target= new HashMap<Character, Character>();

}

public static void main(String[] args) {
    String s="ege";
    String t="dee";

    IsomorphicStrings isObj=new IsomorphicStrings();

    System.out.println(" s and t are Isomorphic ? " +  isObj.isIsomorphic(s,t));
}


}
