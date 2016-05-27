package codechef;

import java.util.Scanner;

/**
 * Created by virus on 05/12/16.
 */
public class HS08TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        double Y = sc.nextDouble();
        if(X>Y || X%5 !=0) {
            System.out.printf("%.2f",Y);
        } else {
            System.out.printf("%.2f", Y-X-0.5);
        }
    }
}

