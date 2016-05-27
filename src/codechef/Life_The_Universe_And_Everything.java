package codechef;

import java.util.Scanner;

/**
 * Created by virus on 05/12/16.
 */
public class Life_The_Universe_And_Everything {
    /* package codechef; // don't place package name! */

    public static void main(String[] args) throws Exception {
        Codechef.main(args);
    }


}

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            if(n==42)
                break;
            else
                System.out.println(n);

        }
    }
}

