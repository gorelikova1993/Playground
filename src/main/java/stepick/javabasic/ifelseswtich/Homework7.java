package stepick.javabasic.ifelseswtich;

import java.util.Scanner;

//Программа должна определить зарплату служащего компании.
// Пользователь вводит количество отработанных часов (целое) и почасовой тариф (вещественное).
// Тариф - это стоимость одного часа работы служащего. Компания платит за первые 20 часов (включительно)
// по обычному тарифу. За время, отработанное от 20 (не включая) до 40 часов (включительно) -
// тариф за каждый час умножается на полтора. А если служащий работает свыше 40 часов,
// то он получает двойной тариф эти часы переработки.
//Например, если служащий отработал 42 часа, а почасовой тариф 10.5 рублей, то он получит
//20*10.5=210 рублей за первые 20 часов;
//20*10.5*1.5=315 рублей за вторые 20 часов;
//2*10.5*2=42 рубля за последние 2 часа.
//Итого 210+315+42=567 рублей.
//Вывести зарплату служащего, округлив ее до двух знаков после десятичной точки.
// Если введено отрицательное значение количества часов или отрицательный тариф, вывести ERROR.
public class Homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        double tariff = scanner.nextDouble();
        if (hours < 0 || tariff < 0.0) {
            System.out.println("ERROR");
            return;
        }
        double sum = 0.0;
        if (hours > 40) {
            sum = 20 * tariff;
            sum = sum + (20 * tariff * 1.5);
            hours = hours - 40;
            sum = sum + (hours * tariff * 2);
            System.out.printf("%.2f", sum);
            return;
        }
        
        if (hours > 20 && hours <= 40) {
            sum = 20 * tariff;
            hours = hours - 20;
            sum = sum + (hours * tariff * 1.5);
            System.out.printf("%.2f", sum);
            return;
        }
        if (hours <= 20) {
            sum = hours * tariff;
            System.out.printf("%.2f", sum);
            return;
        }
    }
}
