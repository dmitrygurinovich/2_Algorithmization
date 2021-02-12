package by.epam.tasks.algorithmization.decomposition;

/*
14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию.
 */
public class Task14 {
    public static void main(String[] args) {
        int k;

        k = 120;

        searchingArmstrongNumber(k);
    }

    private static void searchingArmstrongNumber(int k) {
        System.out.println("Числа Армстронга:");
        for (int i = 1; i <= k; i++) {

            if (isArmstrongNumber(i)) {
                System.out.print(i +"\t");
            }

        }
    }

    private static boolean isArmstrongNumber(int num) {
        int n;
        int sum;

        n = countOfDigits(num);
        sum = sumOfDigits(num);

        if (Math.pow(sum, n) == num) {
            return true;
        } else {
            return false;
        }

    }

    private static int sumOfDigits(int num) {
        int sum;

        sum = 0;

        while (num > 0) {
            sum += num % 10;
            num = (num - (num % 10)) / 10;
        }

        return sum;
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
}
