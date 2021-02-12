package by.epam.tasks.algorithmization.decomposition;

/*7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9. */
public class Task7 {
    public static void main(String[] args) {
        int n;

        n =9;

        System.out.println(sumOfFactorials(n));
    }

    static int sumOfFactorials(int n) {
        int sum;

        sum = 0;

        for (int i = 1; i <= n; i++) {
            sum+=factorial(i);
        }
        return sum;
    }

    static int factorial(int n) {
        int fact;

        fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
