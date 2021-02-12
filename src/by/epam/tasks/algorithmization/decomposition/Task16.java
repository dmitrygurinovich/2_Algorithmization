package by.epam.tasks.algorithmization.decomposition;

/*
16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */
public class Task16 {
    public static void main(String[] args) {
        int n;
        int sum;

        n = 4;
        sum = getSum(n);

        printNumber("Сумма: ",sum);
        printNumber("Четных цифр: ",checkSum(sum));

    }

    private static int checkSum (int sum) {
        int count;

        count  = 0;

        while(sum > 0) {
            if ((sum % 10) % 2 == 0) {
                count++;
            }

            sum = (sum -(sum%10)) / 10;
        }
        return count;
    }

    private static int getSum(int n) {
        int min;
        int max;
        int sum;

        min = minElement(n);
        max = maxElement(n);
        sum = 0;

        for (int i = min; i <= max; i++) {
            if (checkNumbers(i)) {
                sum+=i;
            }
        }
        return sum;
    }

    private static boolean checkNumbers(int n) {
        int k;
        boolean isOdd;

        k = n;
        isOdd = true;

        while (k > 0) {
            if ((k % 10) % 2 == 0) {
                isOdd = false;
            }
            k = (k - (k % 10)) / 10;
        }
        return isOdd;
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

    private static void printNumber(String text, int num) {
        System.out.println(text + num + " ");
    }
}
