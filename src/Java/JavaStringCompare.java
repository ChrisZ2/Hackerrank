package Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaStringCompare {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner input=new Scanner(System.in);
    	String line=input.nextLine();
    	int len=input.nextInt();
    	input.close();
    	String max=line.substring(0,len);
    	String min=line.substring(0,len);
    	//using compareto method inside the string object
    	//-1 means smaller than
    	//0 means equal
    	//1 means larger than
    	for(int i=0;i<line.length()-len+1;i++){
    		if(max.compareTo(line.substring(i,i+len))<0){
    			max=line.substring(i,i+len);
    		}else if(min.compareTo(line.substring(i,i+len))>0){
    			min=line.substring(i,i+len);
    		}
    	}
    	System.out.println(min);
    	System.out.println(max);
    }
}