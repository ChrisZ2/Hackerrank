package Java;

import java.util.Scanner;

public class WelcometoJava{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		System.out.println("================================");
		for(;cin.hasNext();){
			String s=cin.next();
			int a=cin.nextInt();
			System.out.printf("%-15s%03d\n",s,a);
			//-15 means make s into length of 15, make up with white space after
			//s
			//03mean 3 digits
		}
		System.out.println("================================");
	}
}
