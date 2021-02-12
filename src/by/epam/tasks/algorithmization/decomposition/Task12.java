package by.epam.tasks.algorithmization.decomposition;

import java.util.Arrays;

/*12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
являются числа, сумма цифр которых равна К и которые не большее N. */
public class Task12 {
    public static void main(String[] args) {

        int K;
        int N;
        int numOfDigits;
        int arrLength;
        int[] arr;

        K = 20;
        N = 5000;
        arrLength = 3;
        numOfDigits = 4;
        arr = createArray(K, N, arrLength, numOfDigits);

        printArray(arr);
    }

    private static int[] createArray(int K, int N, int arrLength, int numOfDigits) {
        int[] arr;

        arr = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {

            while (sumOfDigitsIsK(arr[i]) != K || arr[i] >= N) {
                arr[i] = generateRandomNumber(numOfDigits);
            }

        }
        return arr;
    }

    private static int sumOfDigitsIsK(int num) {
        int sum;

        sum = 0;

        while (num > 0) {
            sum += (num % 10);
            num -= (num % 10);
            num /= 10;
        }
        return sum;
    }

    private static int generateRandomNumber(int numOfDigits) {
        int num;

        num = 0;

        for (int i = 0; i < numOfDigits - 1; i++) {

            num *= 10;
            num += generateRandomDigit();
        }

        return num;
    }

    private static int generateRandomDigit() {
        int num;

        num = (int) (Math.random() * 100);
        return num;
    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
