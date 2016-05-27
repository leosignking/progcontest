package hackerrank;

import java.util.Scanner;

/**
 * Created by virus on 05/12/16.
 */
public class Day_2_Operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        double totalAmount = mealCost + (mealCost * tipPercent/100) + (mealCost *taxPercent/100);

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(totalAmount);

        // Print your result
        System.out.println("The total meal cost is "+totalCost+" dollars.");
    }
}
