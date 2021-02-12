package by.epam.tasks.algorithmization.sorts;

import java.util.Arrays;

/*2. Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <=  bm. Образовать из них новую последовательность
чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.*/
public class Task2 {

	public static void main(String[] args) {
		int[] firstArray;
		int[] secondArray;
		int[] newArray;
		int n;
		int m;

		n = 8;
		m = 6;
		firstArray = new int[n];
		secondArray = new int[m];

		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = generateRandomInt();
		}
		
		for (int i = 0; i < secondArray.length; i++) {
			secondArray[i] = generateRandomInt();
		}
		
		sortArrayByUp(firstArray);
		sortArrayByUp(secondArray);
		
		printArray("Первая последовательность:", firstArray);
		printArray("Вторая последовательность:", secondArray);
		
		newArray = mergeArrays(firstArray, secondArray);
		
		sortArrayByUp(newArray);
		printArray("Итоговая последовательность: ", newArray);
		


	}
	
	public static void sortArrayByUp(int[] arr) {
		boolean sorted = false;
		int temp;
		while (!sorted) {
			sorted = true;
			for (int k = 0; k < arr.length - 1; k++) {
				if (arr[k] > arr[k + 1]) {
					temp = arr[k];
					arr[k] = arr[k + 1];
					arr[k + 1] = temp;
					sorted = false;
				}
			}
		}
	}
	
	public static int[] mergeArrays(int[] firstArr, int[] secondArr) {
		int[] newArray;
		newArray = new int[firstArr.length + secondArr.length];
		
		for (int i = 0; i < firstArr.length; i++) {
			newArray[i] = firstArr[i];
		}
		
		for (int i = firstArr.length; i < newArray.length; i++) {
			newArray[i] = secondArr[i-(firstArr.length)];
		}
		
		return newArray;
	}
	
	public static void printArray(String str, int[] arr) {
		System.out.println(str + "\n" + Arrays.toString(arr) + "\n");
	}
	
	public static int generateRandomInt() {
		int num;
		num = (int)(Math.random() * 10);
		return num;
	}

}
