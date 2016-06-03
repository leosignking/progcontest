package hackerrank;

import java.util.Scanner;

/**
 * Created by virus on 06/01/16.
 */
public class Binary_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String binary = Integer.toBinaryString(number);
        System.out.println(binary);
        int maxCones = maxContinousOnes(binary);
        System.out.println(maxCones);
    }

    private static int maxContinousOnes(String binary) {
        int max = 0;
        int temp = 0;

        for (char c: binary.toCharArray()) {
            if(Character.getNumericValue(c) == 1) {
                temp++;
            } else {
                max = Math.max(temp, max);
                temp = 0;
            }
        }
        max = Math.max(temp, max);
        return max;
    }
}
