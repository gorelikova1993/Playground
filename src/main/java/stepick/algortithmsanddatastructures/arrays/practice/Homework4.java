package stepick.algortithmsanddatastructures.arrays.practice;

import java.util.Scanner;

public class Homework4 {
    //Удалить заданный элемент массива по индексу (уменьшить размер исходного массива и сдвинуть элементы).
    
    public static void printArr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static int [] delElementFromArr(int[]arr, int index){
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        // Напишите решение
        return newArr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int index = sc.nextInt();
        arr = delElementFromArr(arr,index);
        printArr(arr);
    }
}
