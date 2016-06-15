package Math;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockandMovingTiles {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int l=input.nextInt();
        int s1=input.nextInt();
        int s2=input.nextInt();
        int test=input.nextInt();
        int count=0;
        while(count<test){
        	int area=input.nextInt();
        	double diff=Math.abs(s2-s1)/Math.sqrt(2);
        	double side=Math.sqrt(area);
        	double time=(l-side)/diff;
        	System.out.println(time);
        	count++;
        }
    	/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    }
}
