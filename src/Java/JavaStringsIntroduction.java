package Java;

import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        iloop:
        
        for(int i=0;i<Math.min(A.length(),B.length());i++){
            if((int)(A.charAt(i)-B.charAt(i))>0){
                System.out.println("Yes");
                break iloop;
            }else if(((int)(A.charAt(i)-B.charAt(i)))<0){
                System.out.println("No");
                break iloop;
            }else{
            	int l1=A.length();
            	int l2=B.length();
            	if(l1<l2){
            		System.out.println("No") ;
            	}else if(l1==l2){
            		System.out.println("No");
            		
            	}else{
            		System.out.println("Yes");
            	}
               
                break iloop;
            }
        }
        StringBuilder A1=new StringBuilder(A);
        StringBuilder B1=new StringBuilder(B);
        A1.setCharAt(0,Character.toUpperCase(A1.charAt(0)));
        B1.setCharAt(0,Character.toUpperCase(B1.charAt(0)));   
        System.out.println(A1.toString()+" "+B1.toString());
        /* Enter your code here. Print output to STDOUT. */
        
    }
}

