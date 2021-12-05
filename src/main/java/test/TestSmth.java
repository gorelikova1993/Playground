package test;

public class TestSmth {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3};
        System.out.println(method(arr, 0,4));
    }
//    public static int method(int[] array, int left, int right, int value) {
//        int middle;
//        if (left >= right) {
//            return 0;
//        }
//        else if (left == right - 1) {
//            if (array[left] == value) {
//                return 1;
//            }
//            else return 0;
//        }
//        else {
//            middle = (left + right) / 2;
//            return method(array, left, middle, value)
//                    + method(array, middle, right, value);
//        }
//    }

    public static int method(int[] array, int left , int right) {
        int middle;
        if (left == right) {
            if (array[left] % 2 == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            middle = (left + right) / 2;
            return method(array, left, middle)
                    + method(array, middle + 1, right);
        }
    }
}
