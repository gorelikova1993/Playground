package collections;

import java.util.*;

public class TestComparator {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("cat");
        animals.add("frog");
        animals.add("dog");
        animals.add("duck");

        Collections.sort(animals, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        } );
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(4);
        numbers.add(901);
        numbers.add(-100);

        Collections.sort(numbers);
        System.out.println(numbers);
    }
}

