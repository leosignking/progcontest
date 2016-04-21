package hackerrank;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by sredreddy on 4/20/2016.
 */
public class Super_Reduced_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.next());
        sc.close();
        System.out.println(reduceString(str, 0));
    }

    static String reduceString(StringBuilder str, int index) {
        if("".equals(str.toString().trim())) return "Empty String";
        if(str.length() < index+2)  {
            return str.toString();
        }
        char[] c = str.substring(index,index+2).toCharArray();
        if(c[0] == c[1]) {
            str.deleteCharAt(index);
            str.deleteCharAt(index);
            if(index > 0)
                index--;
        }else index++;
        return reduceString(str, index).toString();
    }



}
