// Given two strings s and p, return an array of all the start indices of p's 
// anagrams
//  in s. You may return the answer in any order.

 

// Example 1:

// Input: s = "cbaebabacd", p = "abc"
// Output: [0,6]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllAnagramStartIndexLIst_438 {

   public static List<Integer> findAllAnagrams(String s , String p){
        
    Map<Character, Integer> pMap=new HashMap<>();
    List<Integer> list=new ArrayList<>();

    for( char c: p.toCharArray()){
        pMap.put(c, pMap.getOrDefault(c,0)+1);
    }

    int pLength=p.length();

    int left=0;
    int right=0;


    Map<Character, Integer> wMap=new HashMap<>();

    while(right<s.length()){

        char ch=s.charAt(right);

        wMap.put(ch, wMap.getOrDefault(ch,0)+1);
        
        if(right-left+1==pLength){
            if(pMap.equals(wMap)){
                list.add(left);
            }
            char chLeft=s.charAt(left);
            if(wMap.get(chLeft)==1){
                wMap.remove(chLeft);
            }else{
                wMap.put(chLeft,wMap.get(chLeft)-1);
            }
            left++;

        }
        right++;



    }

return list;

   }


    public static void main(String[] args) {



        String s = "cbaebabacd"; 
        String p = "abc";
        
        System.out.println(findAllAnagrams(s, p));
    }

}
