package Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaLoops {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int test=input.nextInt();
        while(test>0){
        	int a=input.nextInt();
        	int b=input.nextInt();
        	int n=input.nextInt();
        	int sum=a;
        	int count=0;
        	while(count<n){
        		sum=(int) (sum+Math.pow(2, count)*b);
        		System.out.print(sum+" ");
        		count++;
        	}
        	System.out.print("\n");
        }
        
        input.close();
    	/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}