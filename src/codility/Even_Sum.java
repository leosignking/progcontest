package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by virus on 05/27/16.
 */
public class Even_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(", ");
        int[] A = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            A[i] = Integer.valueOf(arr[i]);
        }

        int X = 0;
        int Y = Integer.MAX_VALUE;
        solve(A, 0, X, Y);


    }

    private static int solve(int[] A, int counter, int X, int Y) {
        if(A.length == 1 ) {
            if(A[0]%2==0)
                counter++;

            return counter++;
        }

        int sum = 0;
        for(int i=0; i<A.length; i++) {
            if ((A[i] + sum) % 2 == 0) {
                if(X == 0) {
                    X = i;
                    Y = i;
                } else if(Y==i-1){
                    Y=i;
                }
                sum += A[i];
            }else if(i>0 && (A[i] + A[i-1])%2==0) {
                if(X == 0) {
                    X=i-1;
                    Y=i;
                    sum = A[i] + A[i-1];
                } else
                    sum = 0;

            }
        }


        List<Integer> l = new ArrayList<>();
        for(int i=0; i<A.length; i++) {
            l.add(A[i]);
        }

        for (int i = Y; i >= X ; i--) {
            l.remove(i);
        }

        int temp[] = new int[l.size()];
        for(int i=0; i<l.size(); i++) {
            temp[i] = (Integer)l.get(i);
        }
        return solve(temp, counter++, X, Y);
    }

}
