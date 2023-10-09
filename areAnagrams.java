package projectOne;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class areAnagrams {
    public static void main(String[] args) {
        String[] words = {"listen", "silent", "enlist", "inlets", "banana", "hello"};
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isAnagram(words[i], words[j])) {
                    System.out.println(words[i] + " is an anagram of " + words[j]);}
                    
            }          }
        }                                              
    



                 
                                                      
    public static boolean areAnagrams(String aWord,String bWord) {
        int []c=new int[26];
        aWord=aWord.toLowerCase();
        bWord=bWord.toLowerCase();
        for(char ch:aWord.toCharArray()) {
            c[ch-'a']++;
        }
        for(char ch:bWord.toCharArray()) {
            c[ch-'a']--;
        }
        for(int x:c) {
            if(x>0) {
                return false;
            }
        }
        return true;
    }
}
    
    

    public static boolean isAnagram(String s1, String s2) {
    	
    	List<Intger> row1 = new ArrayList
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
       
        return Arrays.equals(c1, c2);
    }
}

