package by.epam.tasks.algorithmization.arrays_of_arrays;

/*
10. Найти положительные элементы главной диагонали квадратной матрицы.
 */
public class Task10 {
    public static void main(String[] args) {
        int[][] array;
        int n;

        n = 8;
        array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((Math.random() * 10) < 4) {
                    array[i][j] = (int) (Math.random() * -10);
                } else {
                    array[i][j] = (int) (Math.random() * 10);
                }
            }
        }

        System.out.println("Матрица:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }

        System.out.println("\nПоложительные элементы \n" +
                "главной диагонали матрицы: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] > 0) {
                System.out.print(array[i][i] + "\t");
            }
        }
    }
}
