package hackerrank;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by virus on 04/22/16.
 */
public class Algorithms_Reverse_Shuffle_Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Set<Character> strSet = new HashSet<>();
        for(char c: str.toCharArray()) {
            strSet.add(c);
        }

        StringBuilder stringBuilder = new StringBuilder("");
        for(char c : strSet) {
            stringBuilder.append(c);
        }
        char[] _cArr = stringBuilder.toString().toCharArray();

        for(int i=0; i<_cArr.length; i++) {
            for(int j=i+1; j<_cArr.length; j++) {
                if(_cArr[j] < _cArr[i]) {
                    char c = _cArr[i];
                    _cArr[i] = _cArr[j];
                    _cArr[j] = c;
                }
            }
        }
        System.out.println(new String(_cArr));
    }
    //asdfghghsfad
}
