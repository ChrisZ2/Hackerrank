package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LisasWorkbook {

    public static void main(String[] args) {
    	Scanner input=new Scanner(System.in);
    	//n chapters
    	int n=input.nextInt();
    	//k questions
    	int k=input.nextInt();
    	//number of question in one chapter
    	int j=2;
    	//accumulated page number
    	int x=0; 
    	//current page number
    	int y=0;
        int count=0 ;
    	int[] nq=new int[n];
    	for(int i=0;i<n;i++){
    		nq[i]=input.nextInt();
    	}
    	for(int i=0;i<n;i++){
    		x=x+(j-2)/k+1;
    		for(j=1;j<=nq[i];j++){
    			y = x+(j-1)/k;
    			if(y==j){
    				count++;
    			}
    			
    		}
    		
    	}
    	System.out.println(count);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}