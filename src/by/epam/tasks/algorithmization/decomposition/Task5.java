package by.epam.tasks.algorithmization.decomposition;

import java.util.Arrays;

/*5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов) */
public class Task5 {
    public static void main(String[] args) {
        int[] array;

        array = generateArrayOfRandomNumbers(10);

        printArray("Массив чисел: ", array);
        sortArrayByUp(array);
        System.out.println("Второе по величине число массива: " + array[array.length - 2]);

    }

    public static void sortArrayByUp(int[] arr) {
        boolean sorted;
        int temp;

        sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i] + arr[i + 1];
                    arr[i] = temp - arr[i];
                    arr[i + 1] = temp - arr[i + 1];
                    sorted = false;
                }
            }
        }
    }

    public static int[] generateArrayOfRandomNumbers(int n) {
        int[] arr;

        arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = generateRandomNumber();
        }
        return arr;
    }

    public static int generateRandomNumber() {
        int num;
        num = (int) (Math.random() * 100);
        return num;
    }

    public static void printArray(String str, int[] arr) {
        System.out.println(str + "\n" + Arrays.toString(arr) + "\n");
    }
}