package stepick.tasks.javaguru;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String message = readInput();
        StringBuilder newStr = new StringBuilder();
        for(int i = 0; i < message.length(); i++) {
            if(Character.isUpperCase(message.charAt(i))) {
                newStr.append(String.valueOf(message.charAt(i)).toLowerCase());
            } else if (Character.isLowerCase(message.charAt(i))){
                newStr.append(String.valueOf(message.charAt(i)).toUpperCase());
            } else {
                newStr.append(message.charAt(i));
            }
        }



        String result = newStr.toString();
        System.out.println(result);
    }

    public static String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim();
    }
}
