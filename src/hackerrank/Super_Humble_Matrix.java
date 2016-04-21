package hackerrank;

import java.util.Scanner;

/**
 * Created by sredreddy on 4/20/2016.
 */
public class Super_Humble_Matrix {

    public static void main(String[] args) {

        System.out.println(720%(10^9 + 7));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        if(N==M) {
            M= 1;
        }
        long unique = 1;
        for(int i=1; i<=N*M; i++) {
            unique *= i;
        }
        System.out.println(unique);
        System.out.println(unique %(10^9 + 7));
    }
}
