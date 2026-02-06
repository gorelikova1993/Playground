package stream.video1;

import java.util.ArrayList;
import java.util.List;


public class Homework {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add((int)(Math.random() * 1000));
        }
        List<Integer> filtered = filter(numbers, ( n) -> n > 100);
        List<String> mapped = map(filtered);
        for (String i : mapped) {
            System.out.println(i);
        }
    }

    private static List<String> map(List<Integer> numbers) {
        List<String> result = new ArrayList<>();
        for (int number : numbers) {
            result.add("Number: " + number);
        }
        return result;
    }

    private static List<Integer> filter(List<Integer> list, Predicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (predicate.test(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
