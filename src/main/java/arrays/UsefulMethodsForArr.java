package arrays;

import java.util.Arrays;

public class UsefulMethodsForArr {
    public static void main(String[] args) {
        double[] arr = {2.0, 3.5, 89, 100.45};
        System.out.println("Поиск максимального значения в массиве " + findMax(arr));
        System.out.println();
        System.out.println("вычисление среднего значения массива " + avg(arr));
        System.out.println();
        System.out.println("копирование значений в другой массив " + Arrays.toString(copyArrIntoOtherArr(arr)));
        System.out.println();
        reverseArr(arr);
        System.out.println("перестановка элементов массива в обратном порядке " + Arrays.toString(arr));
        System.out.println();
        double[][] a1 = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        double[][] b1 = {{1,2,6,7}, {4,6,7,8}, {2,6,7,3}};
        double[][] c1 = matrixMultiplication(a1, b1);
        System.out.println("умножение матрицы на матрицу(квадратные матрицы)");
        for (int i = 0; i < c1.length; i++) {
            for (int j = 0; j < c1[0].length; j++) {
                System.out.print(c1[i][j] + " ");
            }
            System.out.println();
        }


    }
    //Поиск максимального значения в массиве
    public static double findMax(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    //вычисление среднего значения массива
    public static double avg(double[] arr) {
        int size = arr.length;
        double sum = 0.0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        return sum / size;
    }

    //копирование значений в другой массив
    public static double[] copyArrIntoOtherArr(double[] arr1) {
        int size = arr1.length;
        double[] arr2 = new double[size];
        for (int i = 0; i < size; i++) {
            arr2[i] = arr1[i];
        }
        return arr2;
    }

    //перестановка элементов массива в обратном порядке
    public static void reverseArr(double[] arr) {
        int N  = arr.length;
        for (int i = 0; i < N/2; i++) {
            double temp = arr[i];
            arr[i] = arr[N - 1 - i];
            arr[N - i - 1] = temp;
        }
    }

    //умножение матрицы на матрицу(квадратные матрицы)
    // a[][] * b[][] = c[][]
    public static double[][] matrixMultiplication(double[][] a, double[][] b) {
        int N = a.length;
        double[][] c = new double[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                //вычисление скалярного произведения
                //cтроки i и столбца j
                for (int k = 0; k < N; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
}
