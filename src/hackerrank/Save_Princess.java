package hackerrank;

import java.util.Scanner;

/**
 * Created by virus on 06/01/16.
 */
public class Save_Princess {

    static void displayPathtoPrincess(int[] p, int[] m){
        int max = Math.max(p[1], m[0]);
        int min = Math.min(p[1], m[0]);
        for(int i=min; i<max; i++) {
            if(p[1] > m[0]) {
                System.out.println("UP");
            } else {
                System.out.println("DOWN");
            }
        }

        max = Math.max(p[0], m[1]);
        min = Math.min(p[0], m[1]);

        for(int i=min; i<max; i++ ) {
            if(p[0] > m[1]) System.out.println("LEFT");
            else System.out.println("RIGHT");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        String grid[] = new String[n];

        int p[] = new int[2];
        int m[] = new int[2];
        for(int i = 0; i < n; i++) {
            String input = in.next();
            if(input.contains("m")) {
                m[0] = i; m[1] = input.indexOf("m");
            } else if(input.contains("p")) {
                p[0] = input.indexOf("p"); p[1] = i;
            }
            grid[i] = input;
        }

        displayPathtoPrincess(p,m);
    }
}
