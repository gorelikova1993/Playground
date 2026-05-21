package stepick.javabasic.ifelseswtich;
//Грузовой самолет должен пролететь с грузом из пункта А в пункт С через пункт В.
// Емкость бака для топлива у самолета – 300 литров. В точке А бак заправляют полностью.
// Потребление топлива на 1 км в зависимости от веса груза у самолета следующее:
//          - до 500 кг  (включительно) :    1 литров / км
//          - до 1000 кг (включительно):   4 литров / км
//          - до 1500 кг (включительно):   7 литров / км
//          - до 2000 кг (включительно):   9 литров / км.
//          - более 2000 кг – самолет не поднимает.
//Пользователь вводит расстояние между пунктами А и В,
// расстояние между пунктами В и С, а также вес груза. Программа должна рассчитать
// какое минимальное количество топлива необходимо для дозаправки самолету в пункте В,
// чтобы долететь из пункта А в пункт С. В случае невозможности преодолеть любое из
// расстояний – программа должна вывести ERROR.
//Числовой результат работы программы округляется до двух знаков после десятичной точки.


import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distanceAB = scanner.nextInt();
        int distanceBC = scanner.nextInt();
        int weight = scanner.nextInt();
        if (distanceAB < 0 || distanceBC < 0 || weight > 2000) {
            System.out.print("ERROR");
            return;
        }
        
        double fuelPerKM;
        if (weight <= 500) {
            fuelPerKM = 1;
        } else if (weight <= 1000) {
            fuelPerKM = 4;
        } else if (weight <= 1500) {
            fuelPerKM = 7;
        } else {
            fuelPerKM = 9;
        }
        double tankCapacity = 300;
        double fuelAB = distanceAB * fuelPerKM;
        double fuelBC = distanceBC * fuelPerKM;
        
        if (fuelAB > tankCapacity || fuelBC > 300) {
            System.out.println("ERROR");
            return;
        }
        
        double remainingFuel = tankCapacity - fuelAB;
        double needToRefuel = fuelBC - remainingFuel;
        
        if (needToRefuel < 0) {
            needToRefuel = 0;
        }
        System.out.printf("%.2f", needToRefuel);
    }
}
