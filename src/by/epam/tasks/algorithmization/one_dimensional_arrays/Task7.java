package by.epam.tasks.algorithmization.one_dimensional_arrays;

/*
7. Даны действительные числа a1,a2, ... ,a2n . Найти max( a1 + a2n, a2 + a2(n-1), ... ,an + a(n+1)) .
 */
public class Task7 {

    public static void main(String[] args) {

        int[] array;
        int[] newArray;
        int newArrayLength;
        int max;

        array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        newArrayLength = array.length / 2;
        newArray = new int[newArrayLength];

        for (int i = 0; i < newArray.length; i++) {

            newArray[i] = array[i] + array[array.length - 1];

        }

        max = Integer.MIN_VALUE;

        for (int i = 0; i < newArrayLength; i++) {

            max = Math.max(max, newArray[i]);

        }

        System.out.println("max = " + max);
    }
}