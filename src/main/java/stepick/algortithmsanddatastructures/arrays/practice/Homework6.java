package stepick.algortithmsanddatastructures.arrays.practice;

import java.util.Scanner;

//Найти количество элементов в одномерном массиве типа int, которые отличаются от
//среднего арифметического менее чем на 10%.

public class Homework6 {
    public static int findCountElemAboveAvg(int[] arr){
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        avg = avg / arr.length;
        double avg10 = avg * 0.1;
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i] - avg) < avg10) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findCountElemAboveAvg(arr));
    }
}
