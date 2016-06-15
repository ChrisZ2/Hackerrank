package String;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Gemstones {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase=input.nextInt();
        int counter=0;
        HashSet<Character> base=new HashSet<Character>();
        HashSet<Character> curr=new HashSet<Character>();
        for(char a='a';a<='z';a++){
        	base.add(a);
        }
        while(counter<testcase){
        	curr.clear();//remember to clear the current set each time
        	char[] carray=input.next().toCharArray();
        	for(int i=0;i<carray.length;i++){
        		curr.add(carray[i]);
        	}
        	base.retainAll(curr);//only contain the same characters
        	counter++;
        }
   
        System.out.println(base.size());
      
    	/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
