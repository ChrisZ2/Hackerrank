package String;
import java.util.*;
public class ExcelSheetColumTitle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		input.close();
		if(n<=0||n>26*26){
			throw new IllegalArgumentException("Input is invalid!!");
		}
		StringBuilder sb=new StringBuilder();
		while(n>0){
			n--;
			char ch=(char)(n%26+'A');
			n/=26;
			sb.append(ch);
		}
		System.out.println(sb.reverse().toString());
	}

}
