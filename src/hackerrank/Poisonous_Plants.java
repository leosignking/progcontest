package hackerrank;

import java.util.*;

/**
 * Created by virus on 06/03/16.
 */
public class Poisonous_Plants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new LinkedList<Integer>();
        int days = 0;
        for(int n=0; n<N; n++) {
            int val = sc.nextInt();
            list.add(val);
        }


        while(true) {
            int size = list.size();
            Iterator<Integer> iterator = list.iterator();
            int previous = iterator.next();
            while (iterator.hasNext()) {
                int curr = iterator.next();
                if(curr > previous) {
                    iterator.remove();
                }
                previous = curr;
            }

            if(list.size() != size) days += 1;
            else if(list.size() == size) break;
        }

        System.out.println(days);
    }
}
