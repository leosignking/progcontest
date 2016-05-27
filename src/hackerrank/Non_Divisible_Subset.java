package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by virus on 05/27/16.
 */
public class Non_Divisible_Subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        input = input.replaceAll(" ","").trim();

        for(int i=k; i>1; i++) {
            List<String> list = new ArrayList<>();
            genPermWithLength("", input, i, list);

            for (String s: list) {
                char[] c = s.toCharArray();

            }
        }


        /*list = new ArrayList<>();
        genPerm("", input, list);
        System.out.println(list);*/
    }

    private static void genPermWithLength(String prefix, String s, int permLength, List<String> list) {
        int N = s.length();
        if( prefix.length() == permLength) {
            list.add(prefix);
        }else {
            for(int i=0; i<N; i++) {
                genPermWithLength(prefix + s.charAt(i), s.substring(0,i)+s.substring(i+1, N), permLength, list);
            }
        }
    }

    private static void genPerm(String prefix, String s, List<String> list) {
        int N = s.length();
        if( N == 0) {
            list.add(prefix);
        }else {
            for(int i=0; i<N; i++) {
                genPerm(prefix + s.charAt(i), s.substring(0,i)+s.substring(i+1, N), list);
            }
        }
    }
}
