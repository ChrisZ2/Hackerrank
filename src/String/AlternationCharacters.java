package String;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlternationCharacters {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner input = new Scanner(System.in);
    	int test= input.nextInt();
    	int conditions=1;
    	int[] del=new int[test];
    	while(conditions<=test){
    		String ins=input.next();
    		StringBuilder insb= new StringBuilder(ins);
    		int i=0;
    		
    		int count=0;
    		while(i+1<=insb.length()-1){
    			if(insb.charAt(i)==insb.charAt(i+1)){
    				insb.deleteCharAt(i+1);
    				count++;
    			}else{
    				i++;
    			}
    		}
    		del[conditions-1]=count;
    		//System.out.println(insb.toString());
    		conditions++;
    	}
    	input.close();
    	for(int j=0;j<del.length;j++){
    		System.out.println(del[j]);
    	}
    	
    }
}


