package by.epam.tasks.algorithmization.one_dimensional_arrays;

/*
2. Дана последовательность действительных чисел а1 ,а2 ,..., аn. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.
 */
public class Task2 {

	public static void main(String[] args) {
		int array[];
		int z;
		int i;
		int n;
		int count;

		z = 17;
		n = 21;
		count = 0;
		array = new int[n];

		for (i = 0; i < array.length; i++) {
			array[i] = i;
		}

		for (i = 0; i < array.length; i++) {
			if (array[i] > z) {
				array[i] = z;
				count++;
			}
		}

		System.out.print("Массив после замен: ");

		for (int element : array) {
			System.out.print(element + " ");
		}

		System.out.println("\nЧисло замен: " + count);
	}
}
