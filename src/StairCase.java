import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StairCase {

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        in.close();
////        String result=" ";
////        for(int j=0;j<n;j++){
////        	result+=result;
////        }
////        StringBuilder str=new StringBuilder(result);
////        char base='#';
////        for(int i=n-1;i>=0;i--){
////        	
////        	str.setCharAt(i, base);
////        	System.out.println(str.toString());
//        	
//        	
//        }
//    }
	public static void main(String[] args) {
	       Scanner scn=new Scanner(System.in);
	  int n=scn.nextInt();
	  for(int i=1;i<=n;i++)
	  {
	   for(int j=1;j<=n;j++)
	    
	   {
	    if((i+j)>n)
	    {
	    System.out.print("#");
	    }
	    else
	    {
	     System.out.print(" ");
	    }
	    
	   }
	   System.out.println();
	   
	  }
	    }

}
