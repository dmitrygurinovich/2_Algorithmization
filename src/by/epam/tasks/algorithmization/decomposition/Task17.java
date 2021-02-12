package by.epam.tasks.algorithmization.decomposition;

/*
17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */
public class Task17 {
    public static void main(String[] args) {
        int num;

        num = 124;

        print(numberMinusSumOfDigits(num));
    }

    private static int numberMinusSumOfDigits(int n) {
        int counter;

        counter = 0;

        while (n != 0) {
            n -= sumOdDigits(n);
            counter++;
        }
        return counter;
    }

    private static int sumOdDigits(int n) {
        int sum;

        sum = 0;

        while (n > 0) {
            sum += (n % 10);
            n = (n - (n % 10)) / 10;
        }

        return sum;
    }

    private static void print(int num) {
        System.out.print(num);
    }


}
