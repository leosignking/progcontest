package hackerrank;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by virus on 06/02/16.
 */
public class Balanced_Paranthesis {

    private static final char L_PAREN    = '(';
    private static final char R_PAREN    = ')';
    private static final char L_BRACE    = '{';
    private static final char R_BRACE    = '}';
    private static final char L_BRACKET  = '[';
    private static final char R_BRACKET  = ']';


    private static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch: s.toCharArray()) {
            if(ch == L_PAREN || ch == L_BRACE || ch == L_BRACKET) {
                stack.push(ch); continue;
            }
            if(stack.isEmpty()) return false;
            if(ch == R_BRACE) {
                if(stack.pop() != L_BRACE) return false;
            } else if(ch == R_BRACKET){
                if(stack.pop() != L_BRACKET) return false;
            } else if(ch == R_PAREN) {
                if(stack.pop() != L_PAREN) return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++) {
            String s = sc.next();
            System.out.println(isBalanced(s) ? "YES" : "NO");
        }
    }
}
