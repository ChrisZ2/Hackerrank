package Implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            if(n==0){
            	System.out.println(1);
            }else if(n%2==0){
            	int height=1;
            	for(int i=0;i<n/2;i++){
            		height=height*2;
            		height=height+1;
            	}
            	System.out.println(height);
            }else{
            	int height=1;
            	for(int i=0;i<n/2;i++){
            		height=height*2;
            		height=height+1;
            	}
            	System.out.println(height*2);
            }
        }
        in.close();
    }
}
