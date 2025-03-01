package algorithms;

public class ShellSort {

    // Метод для выполнения сортировки Шелла
    public static void shellSort(int[] array) {
        int n = array.length;

        // Начальное значение шага (h)
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Выполняем сортировку вставками с текущим шагом
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j = i;

                // Сравниваем элементы, находящиеся на расстоянии gap
                while (j >= gap && array[j - gap] > temp) {
                    array[j] = array[j - gap];
                    j -= gap;
                }

                // Вставляем элемент на правильную позицию
                array[j] = temp;
            }
        }
    }

    // Метод для вывода массива
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Исходный массив:");
        printArray(array);

        shellSort(array);

        System.out.println("Отсортированный массив:");
        printArray(array);
    }
}