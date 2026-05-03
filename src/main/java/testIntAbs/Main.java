package testIntAbs;

public class Main {
    public static void main(String[] args) {
        Car car = () -> System.out.println("Car goes");
        car.go();
    }
}
