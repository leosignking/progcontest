package codechef;

import java.util.Scanner;

/**
 * Created by virus on 05/12/16.
 */
public class Enormous_Input_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int counter = 0;
        for(int n=0; n<N; n++) {
            int t = sc.nextInt();
            if(t%k == 0)
                counter++;
        }
        System.out.println(counter);
    }
}
