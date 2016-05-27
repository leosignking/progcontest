package hackerrank;

import java.util.Scanner;

/**
 * Created by virus on 05/07/16.
 */
public class ProjectEuler_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t=0; t<T; t++) {
            int N = scanner.nextInt();
            N = N-1;
            //S=d*int(x/d)*(1+int(x/d))/2.
            // multiples of 3 and 5 have multiples of 15 as common. Hence subtract multiples of 15
            int sumOf3 = 3*(int)(N/3)*(1+(int)(N/3))/2;
            int sumOf5 = 5*(int)(N/5)*(1+(int)(N/5))/2;
            int sumOf15 = 15*(int)(N/15)*(1+(int)(N/15))/2;

            System.out.println(sumOf3 + sumOf5 - sumOf15);
        }
    }
}
