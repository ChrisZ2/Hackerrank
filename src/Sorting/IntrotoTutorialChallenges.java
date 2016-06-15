package Sorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IntrotoTutorialChallenges {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v=input.nextInt();
        int size=input.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
        	array[i]=input.nextInt();
        }
        input.close();
        int index=Arrays.binarySearch(array, v);
        System.out.println(index);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
