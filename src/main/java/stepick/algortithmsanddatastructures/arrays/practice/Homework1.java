package stepick.algortithmsanddatastructures.arrays.practice;

import java.util.Scanner;
//Написать метод uniqueValues(), который определяет кол-во элементов массива без учета их дубликатов
public class Homework1 {
    public static int uniqueValues(int[] arr){
        int uniqueCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentNum = arr[i];
            boolean flagIsUnique = true;
            for (int j = 0; j < i; j++) {
                if (arr[j] == currentNum) {
                    flagIsUnique = false;
                    break;
                }
            }
            if (flagIsUnique) {
                uniqueCount++;
            }
        }
        // Напишите решение
        return uniqueCount;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(uniqueValues(arr));
    }
}
