package stream.video2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i ++) {
            numbers.add((int) (Math.random() * 1000));
        }

        List<String> filtered = numbers.stream()
                .filter((n) -> n % 2 == 0)
                .map((n) -> "Number: " + n)
                .filter(s -> s.endsWith("0"))
                .map(s -> s + "!")
                .toList();

        for (String s : filtered) {
            System.out.println(s);
        }
    }

}
