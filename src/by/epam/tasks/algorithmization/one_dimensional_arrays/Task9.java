package by.epam.tasks.algorithmization.one_dimensional_arrays;

/*
9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.
 */
public class Task9 {

    public static void main(String[] args) {
        int[] array;
        int max;
        int minNum;
        int count;
        int k;

        array = new int[]{5, 8, 1, 4, 3, 1, 4, 8, 1, 5, 6, 1, 8, 9, 10, 8, 12, 13, 8, 2, 15, 47, 1, 1, 8, 18, 19};
        max = Integer.MIN_VALUE;
        minNum = Integer.MAX_VALUE;
        count = 0;

        for (int i = 0; i < array.length; i++) {

            for (k = 0; k < array.length; k++) {

                if (array[k] == array[i]) {
                    count++;
                }

            }

            k = 0;
            max = Math.max(max, count);
            count = 0;

        }

        for (int i = 0; i < array.length; i++) {

            for (k = 0; k < array.length; k++) {
                if (array[k] == array[i]) {
                    count++;
                }
            }

            k = 0;

            if (count == max) {
                minNum = Math.min(minNum, array[i]);
            }
            count = 0;

        }
        System.out.println("min: " + minNum);
    }
}
