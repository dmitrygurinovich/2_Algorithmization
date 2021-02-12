package by.epam.tasks.algorithmization.arrays_of_arrays;

/* 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * | 1     1     1   ...    1     1     1 |
 * | 0     1     1   ...    1     1     0 |
 * | 0     0     1   ...    1     0     0 |
 * | .     .     .   ...   .      .     . |
 * | .     .     .   ...    .     .     . |
 * | .     .     .   ...     .    .     . |
 * | 0     1     1   ...    1     1     0 |
 * | 1     1     1   ...    1     1     1 |
 * */
public class Task6 {

    public static void main(String[] args) {
        int[][] array;
        int n;
        int j;
        int startPositionInRowLoop;
        int lastPositionInRowLoop;

        n = 8;
        array = new int[n][n];
        startPositionInRowLoop = 0;
        lastPositionInRowLoop = array.length;

        for (int i = 0; i < array.length; i++) {

            if (i < array.length / 2) {
                for (j = startPositionInRowLoop; j < lastPositionInRowLoop; j++) {
                    array[i][j] = 1;
                }
                startPositionInRowLoop++;
                lastPositionInRowLoop--;
            } else {
                startPositionInRowLoop--;
                lastPositionInRowLoop++;
                for (j = startPositionInRowLoop; j < lastPositionInRowLoop; j++) {
                    array[i][j] = 1;
                }
            }

        }



        for (int i = 0; i < array.length; i++) {

            for (j = 0; j < array.length; j++) {

                System.out.print(array[i][j] + "\t");

            }
            System.out.print("\n");
        }

    }

}