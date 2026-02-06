package stepick.tasks.javaguru;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Triple<Integer, Integer, Integer> triple = readInput();
        int n = triple.getFirst(); //  представляющее число голов, которые меч срубает одним ударом.
        int m = triple.getSecond(); //представляющее число голов дракона.
        int k = triple.getThird(); //представляющее число голов, которые дракон может отрастить за раз.
        int result = 0;

        if (m > n && k > n) {
            result = -1;
        } else if (n == m) {
            result = 1;
        } else {
            int hit = 0;
            while (m > 0) {
                m -= n;
                hit++;
                if (m > 0) m += k;
            }
            result = hit;
        }

        System.out.println(result);
    }

    public static Triple<Integer, Integer, Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().trim().split(" \\| ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);
        return new Triple<>(n, m, k);
    }
}

class Triple<A, B, C> {
    private final A first;
    private final B second;
    private final C third;

    public Triple(A first, B second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public C getThird() {
        return third;
    }
}