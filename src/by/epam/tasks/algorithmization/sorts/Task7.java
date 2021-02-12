package by.epam.tasks.algorithmization.sorts;

import java.util.Arrays;

/*7. Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
Требуется указать те места, на которые нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.*/
public class Task7 {
    public static void main(String[] args) {
        int[] firstArray;
        int[] secondArray;
        int n = 10;

        firstArray = new int[n];
        secondArray = new int[n];

        for (int i = 0; i < n; i++) {
            firstArray[i] = generateRandomNumber();
            secondArray[i] = generateRandomNumber();
        }

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        printArray("Первый массив: ", firstArray);
        printArray("Второй массив: ", secondArray);

        printInsertPlaces(firstArray, secondArray);
    }

    public static void printInsertPlaces(int[] x, int[] y) {
        for (int i = 0; i < y.length; i++) {

            System.out.println("secondArray[" + i + "] = " + y[i] +
                    " вставляем в firstArray на место с индексом " + binarySearch(x, y[i]));

        }
    }

    public static int binarySearch(int[] array, int element) {
        int index;
        int firstIndex;
        int lastIndex;

        index = array.length - 1;
        lastIndex = array.length - 1;
        firstIndex= 0;

        while (firstIndex <= lastIndex) {
            index = (firstIndex + lastIndex) / 2;
            if (array[index] == element) {
                return index;
            } else if (array[index] < element) {
                firstIndex = index + 1;
            } else if (array[index] > element && index != 0 && !(array[index - 1] < element)) {
                lastIndex = index - 1;
            } else {
                break;
            }
        }
        return index;
    }

    public static int generateRandomNumber() {
        int num;

        num = (int) (Math.random() * 100);

        return num;
    }

    public static void printArray(String str, int[] arr) {
        System.out.println(str + "\n" + Arrays.toString(arr) + "\n");
    }
}
