package algorithms;

import java.util.stream.IntStream;

public class FindFactorial {
    public static void main(String[] args) {
        System.out.println(getFactorial(5));
        System.out.println(getFactorialRec(5));
        System.out.println(getFactorialStream(5));
    }
    //TODO  улучшить

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public static int getFactorialRec(int f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return f * getFactorial(f - 1);
        }
    }

    public static int getFactorialStream(int f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return IntStream.rangeClosed(2, f).reduce((x, y) -> x * y).getAsInt();
        }
    }
}
