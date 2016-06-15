package Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaHashset {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int test=input.nextInt();
        HashSet<ArrayList> set=new HashSet<ArrayList>();
        while(test>0){
        	ArrayList<String> temp=new ArrayList<String>();
        	temp.add(input.next());
        	temp.add(input.next());
        	set.add(temp);
        	System.out.println(set.size());
        	test--;
        	/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        }
//        Iterator it=set.iterator();
//        while(it.hasNext()){
//        	System.out.println(it.next().toString());
//        }
    }
}
