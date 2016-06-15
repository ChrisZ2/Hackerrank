package Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java1DArrayEasy {

    public static void main(String[] args) {
    	Scanner input =new Scanner(System.in);
    	int size=input.nextInt();
    	int[] array=new int[size+1];
    	
    	for(int i=1;i<=size;i++){
    		array[i]=array[i-1]+input.nextInt();
    	}
    	input.close();
    	int keep=0;
    	for(int i=0;i<size;i++){
    		for(int j=i;j<=size;j++){
    			if(array[j]-array[i]<0){
    			 keep++;
    			}
    		}
    	}
    	System.out.println(keep);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
