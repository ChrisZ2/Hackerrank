package Java;

import java.util.*;
import java.io.*;

public class JavaDatatypes {
	public static void main(String[] argh) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			for (int i = 0; i < t; i++) {

				try {
					long x = sc.nextLong();
					System.out.println(x + " can be fitted in:");
					if (x >= -128 && x <= 127){
						System.out.println("* byte");
					}
						
					if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE){
						System.out.println("* short");
					}
					if(x>=Integer.MIN_VALUE && x<= Integer.MAX_VALUE){
						System.out.println("* int");
					}
					System.out.println("* long");
					// Complete the code
				} catch (Exception e) {
					System.out.println(sc.next() + " can't be fitted anywhere.");
				}

			}
			t--;
		}
		sc.close();
		
	}
}
