
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        in.close();
        int po=0;
        int ne=0;
        int ze=0;
        for(int i=0;i<n;i++){
        	if(arr[i]>0){
        		po++;
        	}else if(arr[i]<0){
        		ne++;
        	}else{
        		ze++;
        	}
        }
        double fpo=(double)po/n;
        double fne=(double)ne/n;
        double fze=(double)ze/n;
        System.out.println(fpo);
        System.out.println(fne);
        System.out.println(fze);
        
    }
}

