/*15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.*/
package by.epam.tasks.algorithmization.arrays_of_arrays;

public class Task15 {

    public static void main(String[] args) {
        int array[][];
        int m;
        int max;

        m = 8;
        array = new int[m][m];
        max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                max = Math.max(max, array[i][j]);
            }
        }

        System.out.print("Матрица до преобразований: \n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println(" ");
        }

        System.out.println("\nmax = " + max);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = max;
                }
            }
        }

        System.out.print("Матрица после преобразований: \n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }

}
