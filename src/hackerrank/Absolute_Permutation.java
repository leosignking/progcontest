package hackerrank;

import java.util.*;

/**
 * Created by virus on 05/21/16.
 */
public class Absolute_Permutation {
    public static void main(String[] args) {
        String numbers = "123456789";
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t=0; t<T; t++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            String e = numbers.substring(0, N);
            StringBuilder str = new StringBuilder("");
            perm("", e, K, str);
            if(str.length() == 0)
                System.out.println("-1");
            else{
                String[] s = str.toString().split(";");
                List<String> l = new ArrayList<>();
                l.addAll(Arrays.asList(s));
                Collections.sort(l);
                String out = l.get(0);
                for(int i=0; i<out.length(); i++) {
                    System.out.print(out.charAt(i)+" ");
                }
                System.out.println();

            }
        }
    }

    private static void perm(String prefix, String s, int K, StringBuilder str){
        int N = s.length();
        if (N == 0) {
            if(absPerm(prefix, K)){
                str.append(prefix+";");
            }
        }
        else {
            for (int i = 0; i < N; i++)
                perm(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, N), K, str);
        }
    }

    private static boolean absPerm(String P, int K) {
        char c[]  = P.toCharArray();
        for(int i=0; i<c.length; i++) {
            if(Math.abs(Character.getNumericValue(c[i]) - (i+1)) != K)
                return false;
        }
        return true;
    }

}
