package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by sredreddy on 4/20/2016.
 */
public class Java_ArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0; i<n; i++) {
            int d= scanner.nextInt();
            arrayLists.add(new ArrayList<Integer>());
            if(d <= 0) continue;
            for(int j=0; j<d; j++) {
                arrayLists.get(i).add(scanner.nextInt());
            }
        }

        int q = scanner.nextInt();
        for(int j=0; j<q; j++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            try {
                System.out.println(arrayLists.get(x-1).get(y-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
