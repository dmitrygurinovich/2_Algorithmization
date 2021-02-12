package by.epam.tasks.algorithmization.arrays_of_arrays;

import java.util.Scanner;

/* 8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
 */
public class Task8 {
    public static void main(String[] args) {
        int[][] array;
        int firsElementOfArray;
        int firstColumnNumber;
        int secondColumnNumber;
        int temp;
        int n;

        n = 6;
        array = new int[n][n];
        firsElementOfArray = 1;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                array[i][j] = firsElementOfArray;
                firsElementOfArray++;

            }

        }

        System.out.println("Массив до изменений:");

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                System.out.print(array[i][j] + "\t");

            }
            System.out.println("");

        }

        Scanner numberColumnIn = new Scanner(System.in);

        System.out.println("Введите номер первого столбца: ");
        while (!numberColumnIn.hasNextInt()) {
            numberColumnIn.next();
            System.out.println("Введите номер первого столбца: ");
        }
        firstColumnNumber = numberColumnIn.nextInt();

        System.out.println("Введите номер второго столбца: ");
        while (!numberColumnIn.hasNextInt()) {
            numberColumnIn.next();
            System.out.println("Введите номер второго столбца: ");
        }
        secondColumnNumber = numberColumnIn.nextInt();

        numberColumnIn.close();

        for (int i = 0; i < array.length; i++) {

            temp = array[i][firstColumnNumber] + array[i][secondColumnNumber];
            array[i][firstColumnNumber] = temp - array[i][firstColumnNumber];
            array[i][secondColumnNumber] = temp - array[i][secondColumnNumber];

        }

        System.out.println("Массив после изменений:");
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                System.out.print(array[i][j] + "\t");

            }
            System.out.println("");

        }
    }
}
