package by.epam.tasks.algorithmization.one_dimensional_arrays;

/*
6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.
 */
public class Task6 {

    public static void main(String[] args) {
        int[] array;
        int sum;

        array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        sum = 0;

        for (int i = 1; i < array.length; i++) {

            if (isPrime(i) == true) {
                sum += array[i];
            }

        }
        System.out.println("Сумма: " + sum);
    }

    static boolean isPrime(int n) {
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

}