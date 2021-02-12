package by.epam.tasks.algorithmization.arrays_of_arrays;

/*
14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.
 */
public class Task14 {
	public static void main(String[] args) {
		int[][] array;
		int m;
		int n;
		int arrayRowStartPosition;

		arrayRowStartPosition = 0;
		
		m = (int) (1 + Math.random() * 10);
		while (m < 3) {
			m = (int) (1 + Math.random() * 10);
		}

		n = (int) (1 + Math.random() * 10);
		while ((n < 3) || (m < n)) {
			n = (int) (1 + Math.random() * 10);
		}

		array = new int[m][n];
		System.out.println("Матрица " + "[" + n + "] x [" + m + "]");
		
		
		for (int i = 0; i < array.length; i++) {
			int j;
			
			for (j = arrayRowStartPosition; j < array[i].length; j++) {
				array[i][j] = 1;
			}
			arrayRowStartPosition++;
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
}
