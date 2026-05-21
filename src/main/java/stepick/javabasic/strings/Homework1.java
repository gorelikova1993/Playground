package stepick.javabasic.strings;

import java.util.Arrays;
import java.util.Scanner;

//Введите три строки (могут содержать пробелы).
// Выведите их в порядке возрастания.
public class Homework1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        
        String[] arr = new String[]{str1, str2, str3};
        Arrays.sort(arr);
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
