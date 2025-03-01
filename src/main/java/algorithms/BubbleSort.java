package algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {20, 1, 0, 5, 10, 4};
        bubbleSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
