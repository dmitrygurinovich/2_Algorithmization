package by.epam.tasks.algorithmization.one_dimensional_arrays;

/*
3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
 */
public class Task3 {

    public static void main(String[] args) {
        int array[];
        int negativeNumbers;
        int positivesNumbers;
        int zeroNumbers;

        array = new int[]{-5, -2, -1, 0, 1, 4, 6, 8, 14, 16, 19, 23, 29};
        negativeNumbers = 0;
        positivesNumbers = 0;
        zeroNumbers = 0;

        for (int element : array) {
            if (element < 0) {
                negativeNumbers++;
            }
            if (element == 0) {
                zeroNumbers++;
            }
            if (element > 0) {
                positivesNumbers++;
            }
        }
        System.out.println("Отрицательных чисел: " + negativeNumbers + "\nНулевых элементов: " + zeroNumbers
                + "\nПоложительных элементов :" + positivesNumbers);

    }

}
