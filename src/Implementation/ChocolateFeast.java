package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ChocolateFeast {
	 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }
     
    private static long Solve(int n, int a, int b){
         
         //Write code to solve each of the test over here
         
        long buy = (long) n/a;
        long free = (long) buy/b;
        long left = (long) buy%b;
        long all = buy + free;
        while((left+free)/b>=1 && left>0){
            free = (left + free)/b;
            left = (left + free)%b;
            all = all + free;
        } 
        return all;
    }
}

