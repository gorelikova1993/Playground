package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList =  new LinkedList<>();
        measureTimeAdd(linkedList);
        measureTimeAdd(arrayList);
        System.out.println("GettingTime: ");
        measureTimeGet(linkedList);
        measureTimeGet(arrayList);

        System.out.println("AddingFirst: ");
        measureTimeAddFirst(linkedList);
        measureTimeAddFirst(arrayList);
    }

    private static void measureTimeAdd(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

    private static void measureTimeGet(List<Integer> list) {
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();

        for (int i =  0; i < 10000; i++) {
            list.get(i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

    private static void measureTimeAddFirst(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            list.add(0, i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
