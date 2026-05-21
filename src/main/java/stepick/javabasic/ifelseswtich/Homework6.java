package stepick.javabasic.ifelseswtich;

import java.util.Scanner;

//Найти минимальное из пяти целых чисел, введенных пользователем.
public class Homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        int min = num1;
        
        if (num2 < min) {
            min = num2;
        }
        
        if (num3 < min) {
            min = num3;
        }
        
        if (num4 < min) {
            min = num4;
        }
        
        if (num5 < min) {
            min = num5;
        }
        
        System.out.println(min);
    }
}
