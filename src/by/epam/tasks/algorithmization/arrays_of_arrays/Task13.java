package by.epam.tasks.algorithmization.arrays_of_arrays;

/*
13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */
public class Task13 {
    public static void main(String[] args) {
        int[][] array;
        int[] tempArray;
        int n;

        n = 6;
        array = new int[n][n];
        tempArray = new int[n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("Матрица до сортировки:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                tempArray[j] = array[j][i];
            }

    		boolean sorted = false;
    		int temp;
    		while (!sorted) {
    			sorted = true;
    			for (int k = 0; k < tempArray.length - 1; k++) {
    				if (tempArray[k] > tempArray[k + 1]) {
    					temp = tempArray[k];
    					tempArray[k] = tempArray[k + 1];
    					tempArray[k + 1] = temp;
    					sorted = false;
    				}
    			}
    		}

            for (int j = 0; j < array.length; j++) {
                array[j][i] = tempArray[j];
            }
        }

        System.out.println("\nМатрица после сортировки " +
                "\nстолбцов по возрастанию:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                tempArray[j] = array[j][i];
            }

    		boolean sorted = false;
    		int temp;
    		while (!sorted) {
    			sorted = true;
    			for (int k = 0; k < tempArray.length - 1; k++) {
    				if (tempArray[k] < tempArray[k + 1]) {
    					temp = tempArray[k];
    					tempArray[k] = tempArray[k + 1];
    					tempArray[k + 1] = temp;
    					sorted = false;
    				}
    			}
    		}

            for (int j = 0; j < array.length; j++) {
                array[j][i] = tempArray[j];
            }
        }

        System.out.println("\nМатрица после сортировки " +
                "\nстолбцов по убыванию:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
