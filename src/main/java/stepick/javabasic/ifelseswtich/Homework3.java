package stepick.javabasic.ifelseswtich;

import java.util.Scanner;

//Пользователь вводит целое трехзначное число. Вывести сумму его нечетных цифр.
//
//Если число не является трехзначным, вывести "ERROR".
//
//Если нечетных цифр нет, то вывести "NO".
public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0 ;
        a = Math.abs(a);
        if (a < 100 || a > 999) {
            System.out.println("ERROR");
            return;
        }
        for (int i = 1; i < 4; i ++) {
            if (a % 10 % 2 != 0 ) {
                sum = sum + a % 10;
            }
            a = a / 10;
        }
         if (sum == 0) {
            System.out.println("NO");
        } else {
            System.out.println(sum);
        }
    }
}
