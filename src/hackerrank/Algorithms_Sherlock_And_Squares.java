package hackerrank;

import java.util.Scanner;

/**
 * Created by sredreddy on 4/21/2016.
 */
public class Algorithms_Sherlock_And_Squares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if(A==0 || B==0) {
                System.out.println("Invalid");
                continue;
            }

            int counter = (int)(Math.floor(Math.sqrt(B))- Math.ceil(Math.sqrt(A)))+1;
            System.out.println(counter);
        }
    }
}
