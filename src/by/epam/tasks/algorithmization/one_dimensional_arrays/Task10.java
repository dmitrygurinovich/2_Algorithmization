package by.epam.tasks.algorithmization.one_dimensional_arrays;

/*
10. Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */
public class Task10 {

	public static void main(String[] args) {
		int[] array;

		array = new int[] { 5, 8, 1, 4, 3, 1, 4, 8, 1, 5, 6, 1, 8, 9, 10, 8, 12, 13, 8, 2, 15, 47, 1, 1, 8, 19 };

		for (int i = 1; i < (array.length / 2)+1; i++) {

			array[2*i-1] = 0;

		}

		for (int i = 1; i < array.length / 2; i++) {

			array[i] = array[i*2];
			array[i*2] = 0;

		}
		
		System.out.print("New array: ");

		for (int i : array) {

			System.out.print(i + " ");

		}

	}

}
