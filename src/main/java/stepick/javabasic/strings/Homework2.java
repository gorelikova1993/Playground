package stepick.javabasic.strings;

import java.util.Scanner;

//Введите строку (в ней возможны пробелы).
// Замените в ней каждый символ «;»   на пару символов «.,»
public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.replace(";", ".,");
        System.out.println(str);
    }
}
