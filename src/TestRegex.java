import java.util.*;
public class TestRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		String test=S.nextLine();
		S.close();
		String regex="[^a-zA-Z0-9]";
		test=test.replaceAll(regex, "");//This means
		//Only keep things in the regex,
		//and others delete
		System.out.println(test);
	}

}
