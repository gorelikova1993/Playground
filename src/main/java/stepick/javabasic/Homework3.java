package stepick.javabasic;

import java.util.Scanner;

//Пользователь вводит с клавиатуры денежную сумму в рублях и копейках (рубли и копейки вводятся в разные переменные).
// Программа должна откорректировать введенную сумму в правильную форму.
// Например, если пользователь ввел 22 и 978, то программа должна вывести 31 р. 78 к.
public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rublesFromKeyboard = scanner.nextInt();
        int kopeiksFromKeyboard = scanner.nextInt();
        int rubles = kopeiksFromKeyboard / 100 + rublesFromKeyboard;
        int kopeiks = kopeiksFromKeyboard % 100;
        System.out.println(rubles + " р. " + kopeiks + " к.");
    }
}
