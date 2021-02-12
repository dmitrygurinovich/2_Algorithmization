package by.epam.tasks.algorithmization.arrays_of_arrays;

/* 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * |1   2    3   ...  n |
 * |n  n-1  n-2  ...  1 |
 * |1   2    3   ...  n |
 * |n  n-1  n-2  ...  1 |
 * |.   .    .   .    . |
 * |.   .    .    .   . |
 * |.   .    .     .  . |
 * |n  n-1  n-2  ...  1 |
 * */
public class Task4 {

    public static void main(String[] args) {
        int[][] array;
        int n;
        int firstNumArr;
        int lastNumArr;

        n = 6;
        firstNumArr = 1;
        lastNumArr = 6;

        array = new int[n][n];

        for (int i = 0; i < array.length; i++) {

            firstNumArr = 1;
            lastNumArr = n;

            for (int j = 0; j < array.length; j++) {

                if ((i + 2) % 2 == 0) {
                    // для не четных строк
                    array[i][j] = firstNumArr;
                    firstNumArr++;
                } else {
                    // для четных строк
                    array[i][j] = lastNumArr;
                    lastNumArr--;
                }

            }

        }

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                System.out.print(array[i][j] + "\t");

            }
            System.out.print("\n");

        }
    }

}
