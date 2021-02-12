package by.epam.tasks.algorithmization.sorts;

import java.util.Arrays;

/*5. Сортировка вставками. Дана последовательность чисел a1, a2, ... , an . Требуется переставить числа в порядке
возрастания. Делается это следующим образом. Пусть a1, a2, ... , ai - упорядоченная последовательность, т. е.
a1 <= a2 <= ... <= an . Берется следующее число ai + 1 и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i + 1 до n
не будут перебраны.
* Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.*/
public class Task5 {

	public static void main(String[] args) {
		int[] array;
		int n;

		n = 17;
		array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = generateRandomNumber();
		}

		printArray("Последовательность до сортировки: ", array);
		sortingByInsert(array);
		printArray("Последовательность после сортировки:", array);
	}

	public static void sortingByInsert(int[] array) {
		int temp;

		for (int i = 1; i < array.length - 1; i++) {

			if (array[i] > array[i + 1]) {
				temp = array[i + 1];
				int j = binarySearch(array, i, array[i + 1]);
				for (int k = i + 1; k > j; k--) {
					array[k] = array[k - 1];
				}
				array[j] = temp;
			}

		}
	}

	public static int binarySearch(int[] array, int lastIndex, int element) {
		int index;
		int firstIndex;

		index = lastIndex;
		firstIndex = 0;

		while (firstIndex <= lastIndex) {
			index = (firstIndex + lastIndex) / 2;
			if (array[index] == element) {
				return index;
			} else if (array[index] < element) {
				firstIndex = index + 1;
			} else if (array[index] > element && index != 0 && !(array[index - 1] < element)) {
				lastIndex = index - 1;
			} else {
				break;
			}
		}
		return index;
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