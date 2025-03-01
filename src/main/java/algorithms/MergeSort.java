package algorithms;

public class MergeSort {

    // Главный метод сортировки
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return; // Если массив пустой или содержит один элемент, он уже отсортирован
        }

        // Находим середину массива
        int mid = array.length / 2;

        // Создаем левую и правую части массива
        int[] leftArray = new int[mid];
        int[] rightArray = new int[array.length - mid];

        // Копируем элементы в левую часть
        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
        }

        // Копируем элементы в правую часть
        for (int i = mid; i < array.length; i++) {
            rightArray[i - mid] = array[i];
        }

        // Рекурсивно сортируем левую и правую части
        mergeSort(leftArray);
        mergeSort(rightArray);

        // Сливаем отсортированные части обратно в исходный массив
        merge(array, leftArray, rightArray);
    }

    // Метод для слияния двух отсортированных массивов
    private static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;

        // Сравниваем элементы из левой и правой частей и помещаем их в исходный массив
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        // Добавляем оставшиеся элементы из левой части
        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }

        // Добавляем оставшиеся элементы из правой части
        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
        }
    }

    // Метод для вывода массива
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Точка входа
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Исходный массив:");
        printArray(array);

        mergeSort(array);

        System.out.println("Отсортированный массив:");
        printArray(array);
    }
}