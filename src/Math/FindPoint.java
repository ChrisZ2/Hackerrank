package Math;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindPoint {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int test=input.nextInt();
    	int flag=0;
    	while(flag<test){
    		int px=input.nextInt();
    		int py=input.nextInt();
    		int qx=input.nextInt();
    		int qy=input.nextInt();
    		System.out.print(2*qx-px+" ");
            
    		System.out.print(2*qy-py);
    		System.out.print("\n");
    		flag++;
    	}
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
