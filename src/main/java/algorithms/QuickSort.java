package algorithms;

public class QuickSort {
    // Главный метод для запуска быстрой сортировки
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Находим индекс опорного элемента
            int pivotIndex = partition(array, low, high);

            // Рекурсивно сортируем левую часть
            quickSort(array, low, pivotIndex - 1);

            // Рекурсивно сортируем правую часть
            quickSort(array, pivotIndex + 1, high);
        }
    }

    // Метод для разделения массива и нахождения позиции опорного элемента
    private static int partition(int[] array, int low, int high) {
        // Берём последний элемент как опорный
        int pivot = array[high];

        // Индекс меньшего элемента
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // Если текущий элемент меньше или равен опорному
            if (array[j] <= pivot) {
                i++; // Увеличиваем индекс меньшего элемента
                // Меняем местами элементы
                swap(array, i, j);
            }
        }

        // Помещаем опорный элемент на правильную позицию
        swap(array, i + 1, high);

        // Возвращаем индекс опорного элемента
        return i + 1;
    }

    // Метод для обмена двух элементов в массиве
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Тестирование
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        System.out.println("Исходный массив:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("Отсортированный массив:");
        printArray(array);
    }

    // Метод для вывода массива
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
