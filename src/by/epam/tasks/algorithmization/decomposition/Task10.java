package by.epam.tasks.algorithmization.decomposition;

import java.util.Arrays;

/*10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
являются цифры числа N. */
public class Task10 {
    public static void main(String[] args) {
        int number;

        number = 231563743;

        printArray(numToArray(number));
    }

    private static int countOfDigits(int n) {
        int count;

        count = 0;

        while (n > 0) {
            n = (n - (n % 10)) / 10;
            count++;
        }
        return count;
    }

    private static int[] numToArray(int num) {
        int n;
        int[] arr;

        n = countOfDigits(num);
        arr = new int[n];

        while (num > 0) {
            arr[n - 1] = num % 10;
            num = (num - (num % 10)) / 10;
            n--;
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
