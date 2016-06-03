package codility;

import java.util.Scanner;

/**
 * Created by virus on 05/30/16.
 */
public class Problem1 {

    public static int fibnocii(int n)  {
        int a = 0, b = 1, c, i;
        if( n == 0)
            return a;
        for (i = 2; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        sc.close();
        int i = 1;
        int prev = 1;
        int next = 1;
        while (true) {
            int result = fibnocii(i++);
            prev = next;
            next = result;
            System.out.println(prev+":"+next);
            if(next >= X) break;
        }
        System.out.println(Math.min(Math.abs(X-prev), Math.abs(next-X)));
    }
}
