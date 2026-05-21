package stepick.algortithmsanddatastructures.arrays;

import java.util.Scanner;

public class ExampleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        // Ввод значений
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        // Вывод значений
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nsum = " + sum);
        System.out.println("avg = " + (double) sum/arr.length);
        // Нахождение индекса и значения минимального элемента
        int min = arr[0];
        int indexMin = 0;
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]){
                indexMin = i;
                min = arr[indexMin];
            }
        }
        System.out.println("min = " + arr[indexMin] + " index = " + indexMin);
        // Нахождение индекса и значения минимального элемента
        int max = arr[0];
        int indexMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                indexMax = i;
                max = arr[indexMax];
            }
        }
        System.out.println("max = " + arr[indexMax] + " index = " + indexMax);
    }
}
