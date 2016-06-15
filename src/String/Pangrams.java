package String;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangrams {

    public static void main(String[] args) {
    	Scanner input =new Scanner(System.in);
    	String test=input.nextLine();
    	input.close();
    	if(testPangrams(test)){
    		System.out.println("pangram");
    	}else{
    		System.out.println("not pangram");
    	}
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
    public static boolean testPangrams(String str){
    	for (char a='A';a<='Z';a++){
    		if(str.indexOf(a)==-1 && str.indexOf((char)(a+32))==-1 ){
    			//This will check both upperletter case and lowerletter case
    			//remember in Ascii, upper+32 = lower
    			return false;
    		}
    	}
    	return true;
    }
}

