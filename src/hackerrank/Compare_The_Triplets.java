package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by virus on 05/21/16.
 */
public class Compare_The_Triplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        in.close();

        int aScore = 0;
        int bScore = 0;
        if(a0 > b0) aScore++;
        else if(a0 < b0) bScore++;

        if(a1 > b1) aScore++;
        else if(a1<b1) bScore++;

        if(a2 > b2) aScore++;
        else if(a2<b2) bScore++;

        System.out.println(aScore +" "+ bScore);
    }
}
