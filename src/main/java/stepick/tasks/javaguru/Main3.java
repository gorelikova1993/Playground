package stepick.tasks.javaguru;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        String message = readInput();
        StringBuilder resultStr = new StringBuilder();
        char[] chars = message.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                chars[i + 1] = Character.toUpperCase(chars[i + 1]);
            }
        }
        String s = new String(chars);
        resultStr = new StringBuilder(s);



        String result = resultStr.toString();
        System.out.println(result);
    }

    public static String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim();
    }
}
