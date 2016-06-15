package Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaArraylist {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nay = input.nextInt();
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		int count = 0;
		while (count < nay) {
			int nc = input.nextInt();
			ArrayList<Integer> row = new ArrayList<Integer>();
			for (int i = 0; i < nc; i++) {
				row.add(input.nextInt());
			}
			list.add(row);
			count++;
		}
		int test = input.nextInt();
		while (test > 0) {
			int curentrow = input.nextInt();
			if (curentrow > nay) {
				System.out.println("ERROR!");
			} else {
				ArrayList<Integer> crow = list.get(curentrow-1);
				int curetcol = input.nextInt();
				if (curetcol > crow.size()) {
					System.out.println("ERROR!");
				}else{
					System.out.println(crow.get(curetcol-1));
				}
			}

		}
	}
}
	/*
	 * import java.util.*;
class Solution{
	public static void main(String[]args){
		Scanner cin=new Scanner(System.in);
		int N=Integer.parseInt(cin.next());
		ArrayList<ArrayList<Integer>> m=new ArrayList<ArrayList<Integer>>();
		for(int n=0;n<N;n++){
			int D=Integer.parseInt(cin.next());
			m.add(new ArrayList<Integer>());
			for(int d=0;d<D;d++){
				int x=Integer.parseInt(cin.next());;
				m.get(n).add(x);
			}
		}
		int Q=Integer.parseInt(cin.next());
		for(int q=0;q<Q;q++){
			int x=Integer.parseInt(cin.next()),y=Integer.parseInt(cin.next());
			if(x>m.size()||y>m.get(x-1).size())System.out.println("ERROR!");
			else System.out.println(m.get(x-1).get(y-1));
		}
	}
}
	 
	 
}
	*/