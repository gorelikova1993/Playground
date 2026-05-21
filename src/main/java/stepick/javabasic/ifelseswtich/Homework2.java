package stepick.javabasic.ifelseswtich;

import java.util.Scanner;

//Пользователь вводит целое трехзначное число. Вывести сумму его нечетных цифр.
//
//Если число не является трехзначным, вывести "ERROR".
//
//Если нечетных цифр нет, то вывести "NO".
//296
public class Homework2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        a = Math.abs(a);
        int sum = 0;
        if (a % 100 % 2 == 0) {
            sum += a % 100;
        }
    }
}
