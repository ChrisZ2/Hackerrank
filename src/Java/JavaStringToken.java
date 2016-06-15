package Java;

import java.io.*;
import java.util.*;

public class JavaStringToken {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		String ss="[ !,?\\._'@]+";
		String[] result=s.trim().split(ss);
		if(s.trim().isEmpty()){
			System.out.println(0);
		}else{
			System.out.println(result.length);
			for(String re:result){
				System.out.println(re);
			}
		}
		
		// Complete the code

	}
}
