package by.epam.tasks.algorithmization.arrays_of_arrays;

/*
3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
public class Task3 {

	public static void main(String[] args) {
		int[][] array;
		int arrayLenght;

		arrayLenght = 6;
		array = new int[arrayLenght][arrayLenght];

		for (int k = 0; k < arrayLenght; k++) {

			for (int p = 0; p < arrayLenght; p++) {

				array[k][p] = (int) (Math.random() * 100);

			}

		}

		System.out.println("Матрица: ");
		for (int k = 0; k < array.length; k++) {

			for (int p = 0; p < array.length; p++) {

				System.out.print(array[k][p] + "\t");

			}
			System.out.print("\n");

		}
		
		System.out.print("\n");
		System.out.print("k-я строка:\n");

		for (int i = 0; i < arrayLenght; i++) {

			System.out.print(array[array.length - 1][i] + "\t");
		}


		System.out.print("\n\n");
		System.out.print("p-й столбец:\n");

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i][arrayLenght-1] + "\t");

		}
	}

}
