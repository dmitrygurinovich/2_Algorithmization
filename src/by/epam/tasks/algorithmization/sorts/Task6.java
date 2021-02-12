package by.epam.tasks.algorithmization.sorts;

import java.util.Arrays;

/*6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. Делается это следующим
образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1, то продвигаются на один элемент вперед. Если ai > ai+1,
то производится перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки. */
public class Task6 {
    public static void main(String[] args) {
        int[] array;
        int n;

        n = 12;
        array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = generateRandomNumber();
        }

        printArray("Последовательность до сортировки: ", array);
        shellSort(array);
        printArray("Последовательность после сортировки: ", array);
    }

    public static void shellSort(int[] arr) {
        int step;

        step = 1;

        while (step < arr.length / 3) {
            step = 3 * step + 1;
        }

        while (step >= 1) {
            for (int i = step; i < arr.length; i++) {
                for (int j = i; j >= step && arr[j] < arr[j - step]; j -= step) {
                    int temp = arr[j];
                    arr[j] = arr[j - step];
                    arr[j - step] = temp;
                }
            }
            step = step / 3;
        }
    }

    public static void printArray(String str, int[] arr) {
        System.out.println(str + "\n" + Arrays.toString(arr) + "\n");
    }

    public static int generateRandomNumber() {
        int num;

        num = (int) (Math.random() * 100);
        
        return num;
    }
}
