package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Work {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
//
//        int[] hexs = new int[32];
//        int hex = 0x00;
//        for(int i = 0; i < 32; i++) {
//                hexs[i] = i;
//
//        }

        System.out.println(str);


/*        System.out.println("PASTE");

  //      String s = "ddddd" +
                "\n"+
                "dddddd";

        System.out.println(s);


        System.out.println("AFTER");
        for (int i = 0; i < 32; i++) {
            s = s.replace((char)hexs[i], ' ');

        }
        System.out.println(s);
*/
//        str = str.replace("№", "N");
//        System.out.println(str);
    }


    //TODO запомнить
    public static String replaceSpecial(String source, String s, String[] specialSymbols) {
        if (source == null || source.isEmpty()) return "";
        String result = source;
        for (String symbol : specialSymbols) {
            result = result.replace(symbol, s);
        }
        return result;
    }
}
