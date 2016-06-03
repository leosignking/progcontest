package hackerrank;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by virus on 06/03/16.
 */
public class Simple_Text_Editor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        StringBuilder str = new StringBuilder();
        Stack<StringBuilder> last = new Stack<>();
        for(int q=0; q<Q; q++) {
            int type = sc.nextInt();
            if(type == 1) {
                last.push(new StringBuilder(str.toString()));
                str.append(sc.next());
            }else if(type == 2) {
                last.push(new StringBuilder(str.toString()));
                int n = sc.nextInt();
                str.replace(str.length()-n, str.length(), "");
            }else if(type == 3) {
                System.out.println(str.charAt(sc.nextInt()-1));
            } else {
                if(last.isEmpty()){
                    str = new StringBuilder();
                }else
                    str = last.pop();
            }
        }
    }
}
