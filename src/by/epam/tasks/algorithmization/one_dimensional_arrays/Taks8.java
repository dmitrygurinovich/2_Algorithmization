package by.epam.tasks.algorithmization.one_dimensional_arrays;

/*
8. Дана последовательность целых чисел a1,a2, ... ,an . Образовать новую последовательность, выбросив из
исходной те члены, которые равны min(a1,a2, ... ,an) .
 */
public class Taks8 {

	public static void main(String[] args) {
		int[] array;
		int[] newArray;
		int qtNumbers;
		int min;

		array = new int[] { 5, 1, 4, 3, 4, 5, 6, 1, 8, 9, 10, 1, 12, 13, 2, 15, 1, 47, 18, 19 };
		qtNumbers = 0;
		min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {

			min = Math.min(array[i], min);

		}

		for (int i = 0; i < array.length; i++) {

			if (array[i] == min) {
				qtNumbers++;
			}

		}

		for (int k = 0; k < qtNumbers; k++) {

			for (int i = 0; i < array.length - 1; i++) {

				if (array[i] == min) {
					array[i] = (array[i] + array[i + 1]) - array[i];
					array[i + 1] = min;
				}

			}

		}

		newArray = new int[array.length - qtNumbers];

		for (int i = 0; i < newArray.length; i++) {

			newArray[i] = array[i];

		}

		System.out.print("NewArray: ");

		for (int i : newArray) {

			System.out.print(i + " ");

		}
	}

}