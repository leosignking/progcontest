package hackerrank;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by virus on 05/30/16.
 */
public class Test {

    private static final char[] HEX_CHARS = "0123456789abcdef".toCharArray();

    public static String asHex(byte[] buf)
    {
        char[] chars = new char[2 * buf.length];
        for (int i = 0; i < buf.length; ++i)
        {
            chars[2 * i] = HEX_CHARS[(Character.getNumericValue(buf[i]) & 0xF0) >>> 4];
            chars[2 * i + 1] = HEX_CHARS[buf[i] & 0x0F];
        }
        return new String(chars);
    }

    static int substrings1(String str) {
        HashSet<String> all = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                String temp = str.substring(j, i+1);
                if(temp != null && !("".equals(temp.trim()))) {
                    temp = temp.replaceAll(temp.charAt(0) + "", "");
                    if ("".equals(temp)) {
                        all.add(str.substring(j, i + 1));
                    }
                }
            }
        }
        return all.size();
    }


    private static String asciiToHex(String asciiValue)
    {
        char[] chars = asciiValue.toCharArray();
        StringBuffer hex = new StringBuffer();
        for (int i = 0; i < chars.length; i++)
        {
            hex.append(Integer.toHexString(Character.getNumericValue(chars[i])));
        }
        return hex.toString();
    }

    public static String toHex(String arg) {
        return String.format("%040x", new BigInteger(1, arg.getBytes()));
    }

    public static void main(String[] args) {
        String s = "1000000000000";
        Long  l = Long.valueOf(s);
        String result = Long.toHexString(l);
        result = result.replace("1","I").replace("0","O").replace("15","F").replace("14","E").replace("13","D").replace("12","C")
                .replace("11","B").replace("10","A");
        if(result.contains("3") || result.contains("4") || result.contains("5")
                || result.contains("6") || result.contains("7") || result.contains("8")
                || result.contains("9")) {
            System.out.println("ERROR");
        } else {
            System.out.println(result);
        }

        /*int A[] = {4850, 100, 30, 30, 100, 50, 100};
        int intialCap = A[0];
        Arrays.sort(A);

        int remaining = 5000-intialCap;
        int counter = 0;
        for(int i=0; i<A.length; i++) {
            if(A[i] == intialCap) continue;
            else {
                int val = remaining - A[i];
                if(val >= 0) {
                    remaining = val;
                    counter++;
                    if(val == 0) break;
                }
            }

        }
        System.out.println(counter);*/
    }
}

