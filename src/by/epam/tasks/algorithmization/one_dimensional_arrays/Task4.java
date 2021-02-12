package by.epam.tasks.algorithmization.one_dimensional_arrays;

import java.lang.Math;
import java.util.Arrays;

/*
4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */
public class Task4 {

    public static void main(String[] args) {
        int array[];
        int max;
        int min;
        int maxIndex;
        int minIndex;

        array = new int[]{-5, -2, -1, 0, 1, 4, 6, 8, 14, 16, 19, 23, 29};
        maxIndex = 0;
        minIndex = 0;
        max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }

        min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                minIndex = i;
            }
            if (array[i] == max) {
                maxIndex = i;
            }
        }

        array[minIndex] = max;
        array[maxIndex] = min;

        System.out.println(Arrays.toString(array));
    }

}
