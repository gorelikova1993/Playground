package algorithms;

import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
//        System.out.println(fibEffective(10));
//        printSequence(10);
        fibonachiByStream(10);
    }

    private static void fibonachiByStream(int n) {
        Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0]+ arr[1]})
                .limit(n)
                .map(y -> y[0])
                .forEach(System.out::println);
    }
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711

    private static long fibEffective(int n) {
        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++)
            arr[i] = arr[i - 1] + arr[i - 2];

        return arr[n];
    }

    private static void printSequence(int n) {
        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++)
            arr[i] = arr[i - 1] + arr[i - 2];

        for(int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

}
