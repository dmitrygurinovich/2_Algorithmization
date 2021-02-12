package by.epam.tasks.algorithmization.arrays_of_arrays;

/*
1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
public class Task1 {

	public static void main(String[] args) {
		int[][] array;
		int arrayLength;
		
		arrayLength = 6;
		array = new int[arrayLength][arrayLength];

		for (int i = 0; i < arrayLength; i++) {


			for (int k = 0; k < arrayLength; k++) {

				array[i][k] = (int) (Math.random() * 100);

			}

		}

		System.out.println("Матрица до преобразования: ");

		for (int i = 0; i < array.length; i++) {

			for (int k = 0; k < array.length; k++) {

				System.out.print(array[i][k] + "\t");

			}
			System.out.print("\n");

		}

		System.out.print("\n");
		System.out.println("Массив после преобразований: ");

		for (int i = 0; i < array.length; i++) {

			for (int k = 0; k < array.length; k++) {

				if ((k % 2 != 0) && (array[0][k] > array[array.length - 1][k])) {
					System.out.print(array[i][k] + "\t");
				}

			}
			System.out.print("\n");

		}

	}

}
