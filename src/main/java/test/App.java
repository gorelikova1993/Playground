package test;

import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args){
        System.out.println(encrypt("move")); // "omev"
        System.out.println(encrypt("attack")); // "taatkc"
            // Если число символов нечётное,
        // то последний символ остается на своем месте
        System.out.println(encrypt("go!")); // "og!"
    }

    public static int countChars(String str, char ch) {
        // BEGIN (write your solution here)
        int count = 0;
        int i = 0;
        while(i < str.length()) {
            if(ch == Character.toLowerCase(str.charAt(i))){
                count++;
            }
            i++;
        }
        return count;
        // END
    }

    public static String encrypt(String str) {
        // BEGIN (write your solution here)
        String result = "";
        int steps = str.length() / 2;
        boolean isEven = true;
        if (str.length() % 2 != 0) {
            isEven = false;
        }
        int index = 0;
        for (int i = 0; i < steps; i++) {
            result = result + str.charAt(index + 1);
            result = result + str.charAt(index);
            index = index + 2;

        }
        if(!isEven){
            result = result + str.charAt(str.length() - 1);
        }
        return result;
        // END
    }



}