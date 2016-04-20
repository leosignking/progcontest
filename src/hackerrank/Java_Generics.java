package hackerrank;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by sredreddy on 4/20/2016.
 */

class Printer {
    void printArray(Object[] objectArr) {
        for(Object object : objectArr) {
            if(object instanceof Integer)
                System.out.println((Integer)object);
            else if(object instanceof String)
                System.out.println((String)object);
        }
    }
}

public class Java_Generics {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1,2,3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count =0;
        for(Method method: Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if(name.equals("printArray"))
                count++;
        }
        if(count>1) System.out.println("Method overloading is not allowed!");
        assert count==1;
    }
}
