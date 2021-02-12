package by.epam.tasks.algorithmization.sorts;

import java.util.Arrays;

/*4. Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ... <= an .Требуется переставить числа в
порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1 . Если ai > ai+1 , то делается
перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
*/
public class Task4 {

    public static void main(String[] args) {
        int[] array;
        int n;
        int count;

        n = 12;
        array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = generateRandomNumber();
        }

        printArray("Последовательность до сортировки: ", array);
        count = sortArrayByUp(array);
        printArray("Последовательность после сортировки: ", array);
        System.out.println("Колличество перестановок: " + count);
    }

    public static int sortArrayByUp(int[] arr) {
        boolean sorted;
        int temp;
        int count;

        count = 0;
        sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i] + arr[i + 1];
                    arr[i] = temp - arr[i];
                    arr[i + 1] = temp - arr[i + 1];
                    sorted = false;
                    count++;
                }
            }
        }
        return count;
    }

    public static void printArray(String str, int[] arr) {
        System.out.println(str + "\n" + Arrays.toString(arr) + "\n");
    }

    public static int generateRandomNumber() {
        int num;
        num = (int) (Math.random() * 100);
        return num;
    }

}
