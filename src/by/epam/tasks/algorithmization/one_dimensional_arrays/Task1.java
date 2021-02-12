package by.epam.tasks.algorithmization.one_dimensional_arrays;

/*
1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */
public class Task1 {

	public static void main(String[] args) {
		int k, i, sum;
		int[] array;

		k = 40;
		sum = 0;
		array = new int[] { 23, 54, 20, 40, 45, 80, 12, 53, 120, 160 };

		for (i = 0; i < array.length; i++) {

			if ((array[i] % k) == 0) {
				sum += array[i];
			}

		}
		System.out.println("Сумма элементов, кратных K: " + sum);
	}

}
