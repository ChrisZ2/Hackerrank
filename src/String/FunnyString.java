package String;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		while (testCases > 0) {

			String str = in.next();
			char[] original = new char[str.length()];
			char[] reverse = new char[str.length()];

			for (int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {
				original[i] = str.charAt(i);
				reverse[j] = str.charAt(i);
			}
			outter:
			for (int i = 0, j = 1; j < str.length(); j++, i++) {
				int val1 = Math.abs(original[j] - original[i]);
				int val2 = Math.abs(reverse[j] - reverse[i]);
				if (val1 != val2){
					System.out.println("Not Funny");
				    break outter;
				}else if (val1 == val2 && j == str.length() - 1){
					//see the termination condition
					System.out.println("Funny");
				}
					
			}

			testCases--;

		}
		in.close();

	}
}
