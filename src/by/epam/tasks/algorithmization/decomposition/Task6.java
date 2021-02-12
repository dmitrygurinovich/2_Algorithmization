package by.epam.tasks.algorithmization.decomposition;

/*6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.*/
public class Task6 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        a = 11;
        b = 9;
        c = 19;

        isMutuallySimple(a, b, c);

    }

    static int nod(int a, int b, int c) {
        int nod;
        int[] arr;
        int min;

        nod = -1;
        arr = new int[]{a, b, c};
        min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }

        for (int j = 1; j <= min; j++) {
            if (a % j == 0 && b % j == 0 && c % j == 0) {
                nod = j;
            }
        }
        return nod;
    }

    public static void isMutuallySimple(int a, int b, int c) {
        if (nod(a, b, c) == 1) {
            System.out.println("Числа " + a + ", " + b + ", " + c + " взаимно простые.");
        } else {
            System.out.println("Числа " + a + ", " + b + ", " + c + " НЕ взаимно простые.");
        }
    }

}
