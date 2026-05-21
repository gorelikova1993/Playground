package stepick.javabasic;

import java.util.Scanner;

//Введите значения трех переменных: имени (может состоять из нескольких слов),
// возраста (целое) и размера скидки (вещественное). В
// ыведите на консоль рекламное предложение в формате, показанном в примере теста.
public class Homework2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        double discount = scanner.nextDouble();
        
        System.out.println("С днем рождения, " + name + "! Сегодня Вам " + age + "!\n" +
                "По этому поводу дарим Вам скидку " + discount + "%\n" +
                "на весь ассортимент нашего сайта!");
    }
}
