package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestSmth {
    public static void main(String[] args) {

        System.out.println(TestSmth.joinNumbersFromRange(2, 2));
        System.out.println(TestSmth.joinNumbersFromRange(1, 5));
        System.out.println(TestSmth.joinNumbersFromRange(10, 12));
    }

    public static String joinNumbersFromRange(int start, int finish) {
        // BEGIN (write your solution here)
        String str = "";
        if(start == finish) {
            str = "" + start;
        } else {
        int i = start;
        while(i <= finish) {

            str = str + "" + i;
            i++;
        } }
        return str;
        // END
    }
}
