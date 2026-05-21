package stepick.javabasic.ifelseswtich;

import algorithms.SelectionSort;

import java.util.Scanner;

//Две команды студентов участвовали в олимпиаде по программированию.
// В первой команде было два человека, а во второй - четыре.
//Баллы, которые набрал каждый студент,
// вводятся с консоли (сначала две оценки первой команды, а потом - четыре оценки второй).
//В командном зачете сравниваются средние баллы каждой команды.
// Если средний балл первой команды больше, то нужно вывести слово "First",
// если больше средний балл второй команды, то слово "Second",
// а если эти средние баллы равны - то слово "Draw".
public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        int num6 = scanner.nextInt();
        
        double avgFirst = (num1 + num2) / 2.0;
        double avgSecond = (num3 + num4 + num5 + num6) / 4.0;
        if (avgFirst > avgSecond) {
            System.out.println("First");
        } else if (avgSecond > avgFirst) {
            System.out.println("Second");
        } else {
            System.out.println("Draw");
        }
    }
}
