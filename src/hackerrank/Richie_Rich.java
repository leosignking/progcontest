package hackerrank;

import java.util.Scanner;

/**
 * Created by virus on 05/21/16.
 */
public class Richie_Rich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        char c[] = s.toCharArray();
        for(int i=0, j=c.length-1; i<c.length; i++, j--) {
            if(c[i] == c[j]) continue;
            else if(k>0) {
                if(c[i] > c[j]) c[j] = c[i];
                else c[i] = c[j];
                k--;
            }
        }
        System.out.println(new String(c));
    }
}
