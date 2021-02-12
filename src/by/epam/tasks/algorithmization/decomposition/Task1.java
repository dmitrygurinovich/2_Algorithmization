package by.epam.tasks.algorithmization.decomposition;

/*1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел: НОК(A, B) = (А*B) / НОД(A, B)  */
public class Task1 {
    public static void main(String[] args) {
        int a;
        int b;

        a = 9;
        b = 12;

        System.out.println("НОД чисел " + a + " и " + b + ": " + nod(a, b));
        System.out.println("НОК чисел " + a + " и " + b + ": " + nok(a, b));
    }

    private static int nod(int a, int b) {
        int nod = -1; //temp
        int min;

        min = (a > b) ? b : a;

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                nod = i;
            }
        }
        return nod;
    }

    private static int nok(int a, int b) {
        return ((a * b) / nod(a, b));
    }
}
