package stepick.javabasic.vvedenie;

import java.util.Scanner;
//На вход программы подается размер интервала времени в секундах.
// Переведите это в часы, минуты и секунды и выведите согласно примеру теста.

public class App1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int interval = scanner.nextInt();
        int minutes = interval / 60;
        int seconds = interval % 60;
        int hours = minutes / 60;
        minutes = minutes % 60;
        System.out.println(hours + " часов " + minutes + " минут " + seconds + " секунд");
    }
}
