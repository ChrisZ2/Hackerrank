package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Cutthesticks {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int size = keyboard.nextInt(); // get total number of sticks

		ArrayList<Integer> list = new ArrayList<Integer>(size);
		for (int i = 0; i < size; i++) {
			int values = keyboard.nextInt();
			list.add(values);
		}
		list.removeAll(Collections.singleton(0));// remove all zeroes if present
		Collections.sort(list); // sort in ascending order
		while (list.size() > 0) {
			int smallest = list.get(0); // get the smallest element
			for (int i = 0; i < list.size(); i++) {

				list.set(i, list.get(i) - smallest);
			}
			// System.out.println(list);
			System.out.println(list.size());
			list.removeAll(Collections.singleton(0)); // remove the elements
														// which are zero after
														// cutting the sticks
			// System.out.println(list);
		}

	}

}