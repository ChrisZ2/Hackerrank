package String;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MakeItAnagram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	try{
    		String first=br.readLine().toLowerCase();
        	String second=br.readLine().toLowerCase();
        	char[] char1=first.toCharArray();
        	char[] char2=second.toCharArray();
        	//Initiated the counter array to count the frequency
        	int[] counter=new int['z'-'a'+1];
        	for(char a:char1){
        		counter[a-'a']++;//count frequency for first array
        	}
        	for(char a:char2){
        		counter[a-'a']--;//count the frequency for second array
        	}
        	int sum=0;
        	for(int i=0;i<counter.length;i++){
        		sum+=(int)Math.abs(counter[i]);
        	}
        	System.out.println(sum);
    	}catch(IOException e){
    		System.out.println("Invalide input");
    	}
    	
    	
    }
}
