package Implementation;

import java.util.Scanner;

public class SherlockandTheBeast {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
          int t = in.nextInt();
         while((t--)>0){
             int n = in.nextInt();
             StringBuilder answer = new StringBuilder();
            for(int j = 0;j <= n/5;j++){
                //System.out.println("J="+j+" N/5="+(n/5));
                //System.out.println("(n-5*j) = "+(n-5*j));
                 if((n-5*j)%3 == 0){
                    for(int k = 0;k< n-5*j;k++)
                         answer.append("5");
                     for(int k = 0;k < 5*j;k++)
                         answer.append("3");
                    System.out.println(answer.toString());
                     break;
                 }
            }
             if(answer.toString().equals(""))
                 System.out.println(-1);
         }
         in.close();
    }
}


