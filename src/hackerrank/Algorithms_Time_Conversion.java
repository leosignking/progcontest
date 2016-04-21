package hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by sredreddy on 4/21/2016.
 */
public class Algorithms_Time_Conversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        time.substring(0, time.length()-2);
        SimpleDateFormat origDateFormat = new SimpleDateFormat("hh:mm:ssaa");
        try {
            Date date = origDateFormat.parse(time);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            System.out.println(simpleDateFormat.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
