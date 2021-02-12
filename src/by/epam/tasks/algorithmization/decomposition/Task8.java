package by.epam.tasks.algorithmization.decomposition;

import java.util.Arrays;

/*8. Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m. */
public class Task8 {
    public static void main(String[] args) {
        int[] array;

        array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = generateRandomNumber();
        }

        printArray("Массив:", array);
        sums(array, 1);
        sums(array, 3);
        sums(array, 4);
    }

    private static void sums(int arr[], int k) {
        int sum;

        sum = 0;

        for (int i = k; i < k + 3; i++) {
            sum += arr[i];
        }
        System.out.println("array[" + k + "]" + " + array[" + (k + 1) + "]" + " + array[" + (k + 2) + "] = " + sum);
    }

    private static int generateRandomNumber() {
        int num;

        num = (int) (Math.random() * 100);

        return num;
    }

    private static void printArray(String text, int[] arr) {
        System.out.println(text + "\n" + Arrays.toString(arr));
    }

}
