package by.epam.tasks.algorithmization.decomposition;

/*
15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */
public class Task15 {
    public static void main(String[] args) {
        int n;

        n = 6;

        checkNumbers(n);
    }

    private static void checkNumbers(int n) {
        int min;
        int max;

        min = minElement(n);
        max = maxElement(n);

        for (int i = min; i <= max; i++) {

            if (digitsIsIncreasingSequence(i)) {
                printNumber(i);
            }

        }

    }

    private static boolean digitsIsIncreasingSequence(int num) {
        int[] arr;
        int arrLength;
        boolean isIncreasingSequence;

        isIncreasingSequence = true;
        arrLength = countOfDigits(num);
        arr = new int[arrLength];

        while (num > 0) {
            arr[arrLength - 1] = num % 10;
            num = (num - (num % 10)) / 10;
            arrLength--;
        }

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i + 1] - arr[i] != 1) {
                isIncreasingSequence = false;
            }

        }
        return isIncreasingSequence;

    }

    private static int countOfDigits(int num) {
        int count;

        count = 0;

        while (num > 0) {
            num = (num - (num % 10)) / 10;
            count++;
        }
        return count;
    }

    private static int minElement(int n) {
        return (int) (1 * (Math.pow(10, (n - 1))));
    }

    private static int maxElement(int n) {
        int max;

        max = 9;

        for (int i = 1; i < n; i++) {
            max *= 10;
            max += 9;
        }
        return max;
    }

    private static void printNumber(int num) {
        System.out.print(num + " ");
    }
}
