package algorithms;

public class InsertionSort {
    // Метод для сортировки массива методом вставки
    public static void insertionSort(int[] array) {
        int n = array.length;

        // Проходим по массиву, начиная со второго элемента
        for (int i = 1; i < n; i++) {
            int key = array[i]; // Элемент, который нужно вставить на правильное место
            int j = i - 1;

            // Сдвигаем элементы, которые больше key, на одну позицию вправо
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            // Вставляем key на правильную позицию
            array[j + 1] = key;
        }
    }

    // Метод для вывода массива
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Точка входа в программу
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};

        System.out.println("Исходный массив:");
        printArray(array);

        insertionSort(array); // Вызываем метод сортировки

        System.out.println("Отсортированный массив:");
        printArray(array);
    }
}
