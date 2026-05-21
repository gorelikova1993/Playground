package stepick.algortithmsanddatastructures.arrays.practice;

import java.util.Scanner;

//Написать метод определяющий наибольшее число одинаковых идущий подряд элементов
// одномерного массива типа int, при их отсутствии возвращается 1.
public class Homework3  {
    public static int findSameInLine(int[] arr) {
        int count = 1;
        int currentCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++;
            } else {
                currentCount = 1;
            }
            
            if (currentCount > count) {
                count = currentCount;
            }
        }
        
        // Напишите решение
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findSameInLine(arr));
    }
}
