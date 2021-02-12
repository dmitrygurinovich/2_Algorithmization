package by.epam.tasks.algorithmization.sorts;

import java.util.Arrays;

/* 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив. */
public class Task1 {

	public static void main(String[] args) {
		int[] firstArray;
		int[] secondArray;
		int[] newArray;
		int k;

		firstArray = new int[10];
		secondArray = new int[7];
		newArray = new int[firstArray.length + secondArray.length];
		k = 5;

		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = (int) (Math.random() * 10);
		}

		for (int i = 0; i < secondArray.length; i++) {
			secondArray[i] = (int) (Math.random() * 10);
		}

		for (int i = 0; i < k; i++) {
			newArray[i] = firstArray[i];
		}

		for (int i = k; i < k + secondArray.length; i++) {
			newArray[i] = secondArray[i - k];
		}

		for (int i = k + secondArray.length; i < newArray.length; i++) {
			newArray[i] = firstArray[i - secondArray.length];
		}

		printArray("Первый массив:", firstArray);
		printArray("Второй масссив:", secondArray);
		printArray("Результат:", newArray);

	}

	public static void printArray(String str, int[] arr) {
		System.out.println(str + "\n" + Arrays.toString(arr) + "\n");
	}

}
