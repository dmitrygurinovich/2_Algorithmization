package by.epam.tasks.algorithmization.arrays_of_arrays;

/*
9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
 */
public class Task9 {
    public static void main(String[] args) {
        int[][] array;
        int[] sumOfArrayColumn;
        int maxSum;
        int n;

        n = 8;
        array = new int[n][n];
        sumOfArrayColumn = new int[n];
        maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sumOfArrayColumn[i] += array[j][i];
                maxSum = Math.max(sumOfArrayColumn[i], maxSum);
            }
        }

        System.out.println("Массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }

        System.out.println("Сумма столбцов:");
        for (int i = 0; i < sumOfArrayColumn.length; i++) {
            System.out.print(sumOfArrayColumn[i] + "\t");
        }
        System.out.print("\nМасимальная сумма столбцов: " + maxSum);
    }
}
