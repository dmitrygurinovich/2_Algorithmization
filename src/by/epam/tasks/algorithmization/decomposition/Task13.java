package by.epam.tasks.algorithmization.decomposition;

import java.util.Arrays;

/*13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
решения задачи использовать декомпозицию. */
public class Task13 {
    public static void main(String[] args) {
        int n;

        n = 80;

        printTwins(n);
    }

    private static void printTwins(int n) {
        int[] arr;

        arr = createArray(n);

        for (int i = 0; i < arr.length - 2; i++) {
            if (isPrime(arr[i]) && isPrime(arr[i + 2])) {
                System.out.print("[" + arr[i] + ", " + arr[i + 2] + "], ");
            }
        }
    }

    private static int[] createArray(int n) {
        int[] arr;
        int arrLength;

        arrLength = getArrayLength(n);
        arr = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            arr[i] = n + i;
        }

        return arr;
    }

    private static boolean isPrime(int n) {
        int count;
        count = 0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                count++;
            }

        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    private static int getArrayLength(int n) {
        return (2 * n - n) + 1;
    }
}
