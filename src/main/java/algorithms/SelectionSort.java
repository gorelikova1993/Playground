package algorithms;

public class SelectionSort {

    // Метод для выполнения сортировки выбором
    public static void selectionSort(int[] array) {
        int n = array.length;

        // Проходим по каждому элементу массива
        for (int i = 0; i < n - 1; i++) {
            // Ищем индекс минимального элемента в неотсортированной части массива
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; // Обновляем индекс минимального элемента
                }
            }

            // Меняем местами найденный минимальный элемент с первым элементом неотсортированной части
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
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
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Исходный массив:");
        printArray(array);

        selectionSort(array); // Вызываем метод сортировки

        System.out.println("Отсортированный массив:");
        printArray(array);
    }
}