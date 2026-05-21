package stepick.algortithmsanddatastructures.arrays.practice;

import java.util.Scanner;

public class Homework5 {
    //Написать метод switchMinMax(), который принимает одномерный массив типа int,
    // находит минимальный и максимальный элемент и меняет их местами.
    
    public static void printArr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void switchMinMax(int [] arr){
        int min = arr[0];
        int max = arr[0];
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                indexMin = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
        }
        int temp = arr[indexMin];
        arr[indexMin] = arr[indexMax];
        arr[indexMax] = temp;
        // Напишите решение
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        switchMinMax(arr);
        printArr(arr);
    }
}
