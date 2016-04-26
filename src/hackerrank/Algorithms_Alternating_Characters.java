package hackerrank;

import java.util.Scanner;

/**
 * Created by virus on 04/22/16.
 */
public class Algorithms_Alternating_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++) {
            String str = sc.next();
            int deletions = 0;
            for(int i=0; i<str.length(); i++) {
                if(i==str.length()-1) break;
                if(str.charAt(i) == str.charAt(i+1))
                    deletions++;
            }
            System.out.println(deletions);
        }
        sc.close();
    }
}
