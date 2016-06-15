package Java;

import java.util.*;

public class JavaStack {

	  private static final Map<Character, Character> validChars = populateValidChars();

	  private static Map<Character, Character> populateValidChars() {
	    Map<Character, Character> map = new HashMap<Character, Character>();
	    map.put('[', ']');
	    map.put('{', '}');
	    map.put('(', ')');
	    return map;
	  }

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    while(sc.hasNext()){
	      String str = sc.next();
	      System.out.println(valid(str));
	    }
	  }

	  public static boolean valid(String str) {
	    Stack<Character> stack = new Stack<Character>();

	    for (int i = 0; i < str.length(); i++) {
	      char c = str.charAt(i);

	      if (validChars.containsKey(c)) { // opening paren
	        stack.push(c);
	      } else if (validChars.containsValue(c) && !stack.empty()) { // closing paren
	        //checking the right part
	    	  char closingParen = validChars.get(stack.pop());
	    	  //check if they are match
	        if (c != closingParen) { return false; }
	      } else { // invalid character
	        return false;
	      }
	    }

	    return stack.empty();
	  }
	}
