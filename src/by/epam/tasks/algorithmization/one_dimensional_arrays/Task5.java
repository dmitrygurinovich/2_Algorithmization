package by.epam.tasks.algorithmization.one_dimensional_arrays;

/*
5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */
public class Task5 {

	public static void main(String[] args) {
		int[] array;

		array = new int[] { -5, -2, -1, 0, 1, 4, 6, 8, 14, 16, 19, 23, 29 };

		for (int i = 0; i < array.length; i++) {

			if (array[i] > i) {
				System.out.print(array[i] + " ");
			}

		}

	}

}
