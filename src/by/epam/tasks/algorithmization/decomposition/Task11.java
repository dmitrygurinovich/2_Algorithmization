package by.epam.tasks.algorithmization.decomposition;

/*11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр. */
public class Task11 {
    public static void main(String[] args) {
        int a;
        int b;

        a = 12124;
        b = 123455;

        searchingNumberWithBiggerCountOdDigits(a, b);
    }

    private static int[] countOfDigits(int n) {
        int[] count;

        count = new int[2];
        count[1] = n;

        while (n > 0) {
            n = (n - (n % 10)) / 10;
            count[0]++;
        }
        return count;
    }

    private static void searchingNumberWithBiggerCountOdDigits(int a, int b) {
        int[] firstNum;
        int[] secondNum;

        firstNum= countOfDigits(a);
        secondNum= countOfDigits(b);

        if (firstNum[0] == secondNum[0]) {
            System.out.println("Числа " + firstNum[1] + " и " + secondNum[1] + " содержат одинаковое количество цифр.");
        } else if (firstNum[0] > secondNum[0]) {
            System.out.println("Число " + firstNum[1] + " содержит больше цифр.");
        } else {
            System.out.println("Число " + secondNum[1] + " содержит больше цифр.");
        }
    }
}
