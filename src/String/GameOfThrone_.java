package String;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GameOfThrone_ {

	public static void main(String[] args) {

		// Insteading of using hashmap, why not just count the sequence
		// The following are Java 7 answer I fixed it, bravo
		Scanner stdin = new Scanner(System.in);
		String inputString = stdin.nextLine();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < inputString.length(); i++) {
			if (map.containsKey(inputString.charAt(i))) {
				map.remove(inputString.charAt(i));
			} else {
				map.put(inputString.charAt(i), i);
			}
		}

		// System.out.println(map.size());
		if (map.size() == 1 || map.size() == 0) {
			String ans = "YES";
			System.out.println(ans);
		} else {
			String ans = "NO";
			System.out.println(ans);
		}
		stdin.close();
	}
}
// The following are Java 8 answer

/*
 * 
 * 
 * 
 * 
 * import java.util.*;
 * 
 * public class GameOfThrones1 {
 * 
 * public static void main(String[] args) { Scanner stdin = new
 * Scanner(System.in); String line = stdin.nextLine(); Map<Character, Integer>
 * charMap = new HashMap<>(); for(int i = 0; i < line.length(); i++) { char c =
 * line.charAt(i); int count = charMap.getOrDefault(c, 0); //Look up this
 * charMap.put(c, count + 1); } System.out.println(isPalindrome(line.length(),
 * charMap)); stdin.close(); }
 * 
 * private static String isPalindrome(int length, Map<Character, Integer>
 * charMap) { boolean isPalindrome = true; if(length % 2 == 0) { for(char key :
 * charMap.keySet()) { if(charMap.get(key) % 2 != 0) { isPalindrome = false;
 * break; } } } if(length % 2 != 0) { int oddCount = 0; for(char key :
 * charMap.keySet()) { if(charMap.get(key) % 2 != 0) { oddCount++; } }
 * isPalindrome = oddCount == 1//Checking if isPalindrome equals 1 or not; }
 * //If it's then right, if it's not , it's false if(isPalindrome) { return
 * "YES"; } else { return "NO"; } } }
 */

// Assign ans a value of YES or NO, depending on whether or not inputString
// satisfies the required condition
