import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String time = in.next();
	        in.close();
	        int le=time.length();
	        StringBuilder st=new StringBuilder(time);
	        if(time.charAt(le-2)=='P'){
	        	int i=Integer.parseInt(time.substring(0,2));
	        	if(i<12){
	        		i=i+12;
	        	}
	        	
	        	String temp=Integer.toString(i);
	        	st.setCharAt(0, temp.charAt(0));
	        	st.setCharAt(1,temp.charAt(1));
	        	String lf=st.toString();
	        	String finals=lf.substring(0, lf.length()-2);
	        	System.out.println(finals);
	        }else{
	        	int i=Integer.parseInt(time.substring(0,2));
	        	if(i==12){
	        		st.setCharAt(0, '0');
	        		st.setCharAt(1, '0');
	        	}
	        	String lf=st.toString();
	        	String finals=lf.substring(0, lf.length()-2);
	        	System.out.println(finals);
	        }
	        
	    }
	 
}
