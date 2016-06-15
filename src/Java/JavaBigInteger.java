package Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        BigInteger a=input.nextBigInteger();
        BigInteger b=input.nextBigInteger();
        input.close();
        System.out.println(a.add(b).toString());
        System.out.println(a.multiply(b).toString());
    	/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
