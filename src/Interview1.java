import java.util.Scanner;
import java.util.Stack;

/**
 * Created by virus on 05/20/16.
 */
public class Interview1 {

    public static void main(String[] args) {
        System.out.println(recursiveCall("(+  5 4 6)"));
        System.out.println(recursiveCall("(* 2 (- 7 3) 4)"));
        System.out.println(recursiveCall("(+ 3 (* 5 2)(- 6 3))"));

    }

    //(+ 5 4 6 (* 1 2))
    private static int recursiveCall(String s) {
        s = s.substring(1, s.lastIndexOf(")"));
        char[] chars = s.toCharArray();
        char operator = '+';
        int total = 0;
        boolean isFirst = false;
        for(int i=0; i<chars.length; i++) {
            if(chars[i] == ' ') continue;
            if(chars[i] == '(')
                if(i==0) continue;
                else {
                    String t = s.substring(i);
                    String sT = t.substring(0, t.indexOf(")")+1);
                    int temp = recursiveCall(sT);
                    switch (operator) {
                        case '+': total += temp; break;
                        case '-': total -= temp; break;
                        case '*': total *= temp; break;
                        case '/': total /= temp; break;
                    }
                    i += sT.length()-1;
                }
            else if(chars[i] == '+' || chars[i] == '-' || chars[i] == '*' || chars[i] == '/') {
                operator = chars[i];
                isFirst = true;
            } else if(chars[i] == ')')
                return total;
            else {
                switch (operator) {
                    case '+':
                        if(isFirst) total = Character.getNumericValue(chars[i]);
                        else total += Character.getNumericValue(chars[i]);
                        isFirst = false;
                        break;
                    case '-':
                        if(isFirst) total = Character.getNumericValue(chars[i]);
                        else total -= Character.getNumericValue(chars[i]);
                        isFirst = false;
                        break;
                    case '*':
                        if(isFirst) total = Character.getNumericValue(chars[i]);
                        else total *= Character.getNumericValue(chars[i]);
                        isFirst = false;
                        break;
                    case '/':
                        if(isFirst) total = Character.getNumericValue(chars[i]);
                        else total /= Character.getNumericValue(chars[i]);
                        isFirst = false;
                        break;
                    default:
                        break;
                }
            }
        }
        return total;
    }

}
