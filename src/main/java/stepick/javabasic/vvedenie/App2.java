package stepick.javabasic.vvedenie;

import java.util.Scanner;

//Вычислите стоимость товара с учетом скидки. Пользователь вводит цену товара в виде двух целых чисел через пробел (рубли копейки).
// В следующей строке он вводит размер скидки в процентах (также целое число). Цену нужно вывести так, как показано в тесте.
//Учтите, что здесь не применяется округление по правилам математики. Стоимость товара всегда учитывается в большую сторону.
//При выводе число рублей и копеек выводится в двух позициях (т.е. 00 коп., если копеек нет)
public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rubles = scanner.nextInt();
        int kopeiks = scanner.nextInt();
        int discount = scanner.nextInt();
        
        int discountInKopeiks = ((rubles * 100 + kopeiks) * discount) / 100;
        int total = (rubles * 100 + kopeiks) - discountInKopeiks;
        System.out.printf("%02d руб. %02d коп.", total / 100, total % 100);
    }
}
