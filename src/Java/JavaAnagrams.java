package Java;

import java.io.*;
import java.util.*;

public class JavaAnagrams {

    static boolean isAnagram(String A, String B) {
    	String A1=A.toUpperCase();
        String B2=B.toUpperCase();
    	
      
     char[] Ac1=A1.toCharArray();
     char[] Bc1=B2.toCharArray();
     Arrays.sort(Ac1);
     Arrays.sort(Bc1);
     
      return Arrays.equals(Ac1, Bc1);
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
/*
 * Here, using a hash table to keep the record of each existing character in string a, and then check the occurrence of each characters in string b.
1st, If they share the same length.
2nd, Needs to check if the ith character exists in string b.
3rd, subtract the number from hash table for each existing character in string b, until it's zero already. Then return false for that value.
Time complexity: O(n); n is the length of strings.
Space complexity: O(n); n is the number of unique characters in the strings, it should be smaller than the length of string.

It just takes more time to program.

import java.util.Arrays;
import java.util.Hashtable;

/**
 * Decide if two strings are anagrams or not.
 */


/*public class Anagrams {

    
     * Check if they share the same characters with the same counts.
     
    public boolean isAnagramsUnsorted(String a, String b) {
        if (a == null || b == null)
            return false;
        if (a.length() != b.length())
            return false;
        Hashtable<String, Integer> set = new Hashtable<String, Integer>();
        for (int i = 0; i < a.length(); i++) {
            Integer tmp = set.get("" + a.charAt(i));
            if (tmp == null) {
                set.put("" + a.charAt(i), 1);
            } else {
                set.put("" + a.charAt(i), tmp + 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            Integer tmp = set.get("" + b.charAt(i));
            if (tmp == null)
                return false;
            if (tmp.intValue() == 0)
                return false;
            set.put("" + b.charAt(i), tmp - 1);
        }
        return true;
    }
}

 */

