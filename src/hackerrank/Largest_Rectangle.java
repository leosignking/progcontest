package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by virus on 06/03/16.
 */
public class Largest_Rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int b[] = new int[T];

        for(int t=0; t<T; t++) {
            b[t] = sc.nextInt();
        }

        Arrays.sort(b);

        long max = 1L;
        for(int i=0; i<b.length; i++) {
            max = Math.max(max, b[i]*T);
            T--;
        }

        System.out.println(max);
    }
}
