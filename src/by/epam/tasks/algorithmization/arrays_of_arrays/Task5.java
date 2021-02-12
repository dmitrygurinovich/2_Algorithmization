package by.epam.tasks.algorithmization.arrays_of_arrays;

/* 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * | 1   1   1   ...   1   1   1 |
 * | 2   2   2   ...   2   2   0 |
 * | 3   3   3   ...   3   0   0 |
 * | .   .   .   .     .   .   . |
 * | .   .   .    .    .   .   . |
 * | .   .   .     .   .   .   . |
 * | n-1 n-1 0   ...   0   0   0 |
 * | n   0   0   ...   0   0   0 |
 * */
public class Task5 {

	public static void main(String[] args) {
		int[][] array;
		int arrElem;
		
		int n = 7;
		array = new int[n][n];
		
		int columnLength = array.length;
		
		for (int i = 0; i < array.length; i++) {

			arrElem = 1;
			for (int k = 0; k < columnLength; k++) {

				array[k][i] = arrElem;
				arrElem++;

			}
			columnLength--;
			
		}

		for (int i = 0; i < array.length; i++) {

			for (int k = 0; k < array.length; k++) {

				System.out.print(array[i][k] + "\t");

			}
			System.out.print("\n");

		}
	}
}
