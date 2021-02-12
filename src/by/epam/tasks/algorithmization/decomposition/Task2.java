package by.epam.tasks.algorithmization.decomposition;

/*2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел. */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(nod(6, 18, 12, 24));
    }

    private static int nod(int a, int b, int c, int d) {
        int[] arr;
        int nod;
        int min;

        nod = -1;
        arr = new int[]{a, b, c, d};
        min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }

        for (int j = 1; j <= min; j++) {
            if (a % j == 0 && b % j == 0 && c % j == 0 && d % j == 0) {
                nod = j;
            }
        }
        return nod;
    }
}
