package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            String str=Integer.toString(n);
            char[] temp=str.toCharArray();
            int count=0;
            for(char a:temp){
            	int c=Character.getNumericValue(a);
            	if(c!=0&&n%c==0){
            		count++;
            	}
            	
            }
            System.out.println(count);
        }
        in.close();
    }
}

