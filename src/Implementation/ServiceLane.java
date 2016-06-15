package Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServiceLane {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        for(int width_i=0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < t; a0++){
            int i = in.nextInt();
            int j = in.nextInt();
            ArrayList<Integer> list=new ArrayList<Integer>();
            for(int start=i;start<=j;start++){
            	list.add(width[start]);
            }
            Collections.sort(list);
            System.out.println(list.get(0));
        }
    }
}

