package hackerrank;

import java.util.Scanner;

/**
 * Created by sredreddy on 4/20/2016.
 */
public class Java_1D_Array_Part_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] numbers = new int[t];
        for(int i=0; i<t; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();

        int output = 0;
        for (int j=0; j<numbers.length; j++ ) {
            int sum =0;
            for(int k=j; k>=0; k--) {
                sum += numbers[k];
                if(sum < 0)
                    output++;
            }
        }
        System.out.println(output);
    }
}
