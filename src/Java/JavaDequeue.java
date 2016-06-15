package Java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaDequeue {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
	    Deque<Integer> deque = new ArrayDeque<Integer>();
	    int n = in.nextInt();
	    int m = in.nextInt();

	    int max = 0;
	    int lastRemoved = 0;
	    //Using hashset to store the unique numbers
	    Set<Integer> set = new HashSet<Integer>();
	    for (int i = 0; i < n; i++) {
	        int num = in.nextInt();
	        deque.addLast(num);
	        set.add(num);
	        if(deque.size() == m){
	        	//return the number of unique number in subarray
	            max = Math.max(max,set.size());
	            lastRemoved = deque.removeFirst();
	            //if we don't have the number in the queue, we have
	            //to remove it from set(the first element)
	            //you don't have to remove everything from set
	            if(!deque.contains(lastRemoved)){
	                set.remove(lastRemoved);
	            }
	        }
	    }
	    System.out.println(max);        
	    in.close();
	}
	
}
