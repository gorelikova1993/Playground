package stepick.algortithmsanddatastructures.arrays.practice;

import java.util.Scanner;

//Написать метод printSumAndAvg(), который выводит сумму и среднее арифметическое
// (с округлением до одного знака после запятой) в одномерном массиве.
public class Homework2 {
    public static void printSumAndAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float avg = (float) sum / arr.length;
        System.out.print(sum + " ");
        System.out.printf("%.1f%n", avg);
        // Напишите решение
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printSumAndAvg(arr);
    }
}
