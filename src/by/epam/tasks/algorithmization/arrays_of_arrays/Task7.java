package by.epam.tasks.algorithmization.arrays_of_arrays;

/* 7. Сформировать квадратную матрицу порядка N по правилу:
   A[I, J] = sin((I^2 - J^2) / N)
   и подсчитать количество положительных элементов в ней.
*/
public class Task7 {
    public static void main(String[] args) {
        double [][] array;
        int n;
        int countOfPositiveElements;

        n = 4;
        countOfPositiveElements = 0;
        array = new double[n][n];

        for (int i = 0; i < array.length ; i++) {

            for (int j = 0; j <array.length ; j++) {

                array[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if (array[i][j] > 0) {
                    countOfPositiveElements++;
                }

            }

        }

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                System.out.print(array[i][j] + "\t");

            }
            System.out.println("\n");

        }
        System.out.println("Колличество положительных элементов: " + countOfPositiveElements);
    }
}
