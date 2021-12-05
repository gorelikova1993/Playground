package algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        //O(log(n))
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13};
        int key = 34;
//        System.out.println(binarySearch(num, key));
        System.out.println(binaryRecursion(num, key, 0, num.length - 1));
    }

    public static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (key < a[middle]) {
                high = middle - 1;
            } else if (key > a[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static int binaryRecursion(int[] a, int key, int from, int to) {
        if (from <= to) {
            int mid = (from + to) / 2;

            if (a[mid] > key) {
                return binaryRecursion(a, key, from, mid - 1);
            } else if (a[mid] < key) {
                return binaryRecursion(a, key, mid + 1, to);
            }
            return mid;
        }
        return -1;
    }


}
