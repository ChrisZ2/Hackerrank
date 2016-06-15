package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockandSquares {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int test=s.nextInt();
        int conut=0;
        while(conut!=test){
        	int small=s.nextInt();
        	int large=s.nextInt();
        	if(small!=(int)(Math.sqrt(small))*(int)(Math.sqrt(small))){
        		System.out.println((int)(Math.sqrt(large))-(int)(Math.sqrt(small)));
        	}else{
        		System.out.println((int)(Math.sqrt(large))-(int)(Math.sqrt(small))+1);
        	}
        	
        	conut++;
        }
    	/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}