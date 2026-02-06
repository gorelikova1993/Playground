package stream.video2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Homework {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add((int)(Math.random() * (200 - 100 + 1) + 100));
        }
        List<String> list = numbers.stream()
                .filter((n -> n % 5 == 0 && n % 2 == 0))
                .map(Math::sqrt)
                .map(s -> "Корень: " + s)
                .toList();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
