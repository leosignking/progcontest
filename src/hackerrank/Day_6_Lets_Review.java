package hackerrank;

import java.util.Scanner;

/**
 * Created by virus on 05/12/16.
 */
public class Day_6_Lets_Review {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++) {
            String S = sc.next();
            char[] e = new char[S.length()/2+1];
            char[] o = new char[S.length()/2+1];

            for(int i=0; i<S.length(); i++) {
                if(i%2==0)
                    e[i/2] = S.charAt(i);
                else
                    o[(int)i/2] = S.charAt(i);
            }
            System.out.println(new String(e).trim() +" "+new String(o).trim());
        }
    }
}
