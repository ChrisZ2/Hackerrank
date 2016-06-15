package Arrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArraysDS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int narr[]=new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        in.close();
        for(int j=0;j<n;j++){
        	narr[j]=arr[n-j-1];
        }
        //Using static method in Arrays(Arrays.toString)
        for(int k=0;k<n;k++){
        	System.out.print(Integer.toString(narr[k])+" ");
        }
        
    }
}
