package hackerrank;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by virus on 06/02/16.
 */
public class Array_and_simple_queries {

        public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int M = sc.nextInt();
            List<Integer> list = new LinkedList<Integer>();
            for(int n=0; n<N; n++) {
                list.add(sc.nextInt());
            }

            for(int m=0; m<M; m++) {
                int type = sc.nextInt();
                int start = sc.nextInt();
                int end = sc.nextInt();
                int length = end-start+1;
                if(type == 1) {
                    while (length > 0) {
                        int val = list.remove(end-1);
                        list.add(0, val);
                        length--;
                    }
                }else {
                    while (length>0) {
                        int val = list.remove(start-1);
                        list.add(val);
                        length--;
                    }
                }
            }
            System.out.println(Math.abs(list.get(0) - list.get(list.size()-1)));
            for(int i:list) {
                System.out.print(i+" ");
            }
        }
}

