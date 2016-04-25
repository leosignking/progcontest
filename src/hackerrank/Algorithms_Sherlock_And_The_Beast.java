package hackerrank;

import java.util.Scanner;

/**
 * Created by sredreddy on 4/21/2016.
 */
public class Algorithms_Sherlock_And_The_Beast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            if(n == 1) {
                System.out.println("-1");
                continue;
            }
            int m3 = 0;
            int m5 = n;

            while (true) {
                if(m5%3==0 && m5!=0) {
                    if(m5==n) break;
                    if(m3!=0 && m3%5==0)
                        break;
                }
                if(m3%5==0 && m3!=0) {
                    if(m3==n) break;
                }
                if(m3==n || m5==0) break;
                m5--;
                m3++;
            }
            for (int i=0; i<m5; i++)
                System.out.print("5");
            if(m3%5==0)
                for (int i=0; i<m3; i++)
                    System.out.print("3");
            else if(m5<=0)
                System.out.print("-1");
            System.out.println();
        }
    }

}
