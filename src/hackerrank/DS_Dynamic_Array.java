package hackerrank;

import java.util.*;

/**
 * Created by virus on 04/28/16.
 */
public class DS_Dynamic_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        Map<Integer, List<Integer>> integerMap = new HashMap<>();

        int lastAns = 0;
        for(int q=0; q<Q; q++) {
            int i = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(i==1) {
                int seq = ((x^lastAns)%N);
                List<Integer> list = integerMap.get(seq);
                if(list == null )
                    list = new ArrayList<>();

                list.add(y);
                integerMap.put(seq, list);
            } else {
                int seq = ((x^lastAns)%N);
                lastAns = integerMap.get(seq).get(y%integerMap.size());
                System.out.println(lastAns);
            }
        }
    }
}
