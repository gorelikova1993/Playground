package stream;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        
        numbers.stream()
                .limit(3)
                .filter(number -> number % 2 == 0)
                .map(number -> "Result")
                .forEach(System.out::println);
    }
}
