package stepick.javabasic.ifelseswtich;
//Пользователь вводит с клавиатуры целое положительное шестизначное число.
// Нужно определить, является ли число счастливым, и вывести YES, если это так,
// и NO в противном случае. Счастливым считается шестизначное число, у
// которого сумма первых трех цифр равна сумме последних трех цифр.
// Если число не шестизначное, то нужно вывести ERROR.

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        number = Math.abs(number);
        if (number > 999999 || number < 100000) {
            System.out.println("ERROR");
            return;
        }
        
        int sumRight = 0;
        int sumLeft = 0;
        int numberRight = number % 1000;
        int numberLeft = number / 1000;
        
        sumRight = sumDigits(numberRight);
        sumLeft = sumDigits(numberLeft);
        if (sumLeft == sumRight) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
    }
    
    public static int sumDigits(int number) {
        int sum = 0;
        for (int i = 1; i < 4; i ++) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}
