package by.epam.tasks.algorithmization.arrays_of_arrays;

/*
2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class Task2 {

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

		System.out.println("Матрица: ");

		for (int i = 0; i < array.length; i++) {

			for (int k = 0; k < array.length; k++) {

				System.out.print(array[i][k] + "\t");

			}
			System.out.print("\n");

		}
		System.out.print("\n");
		System.out.println("Диагональ: ");

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i][i] + "\t");

		}
	}

}
