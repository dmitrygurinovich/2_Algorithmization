package by.epam.tasks.algorithmization.sorts;

import java.util.Arrays;

/*3. Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an .Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.
*/
public class Task3 {

	public static void main(String[] args) {
		int[] array;
		int n;

		n = 10;
		array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = generateRandomNumber();
		}

		printArray("Последовательность до сортировки: ", array);
		sortArrayByDown(array);
		printArray("Последовательность после сортировки: ", array);

	}

	public static void sortArrayByDown(int[] arr) {
		int startPosition;
		int temp;
		int maxPosition;
		int max;

		maxPosition = 0;
		startPosition = 0;
		max = Integer.MIN_VALUE;

		while (startPosition < arr.length) {
			for (int i = startPosition; i < arr.length; i++) {
				max = Math.max(arr[i], max);
			}

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == max) {
					maxPosition = i;
				}
			}
			
			max = Integer.MIN_VALUE;

			temp = arr[startPosition] + arr[maxPosition];
			arr[startPosition] = temp - arr[startPosition];
			arr[maxPosition] = temp - arr[maxPosition];

			startPosition++;
		}

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
