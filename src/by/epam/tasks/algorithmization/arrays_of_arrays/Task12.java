package by.epam.tasks.algorithmization.arrays_of_arrays;

/*
12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */
public class Task12 {
    public static void main(String[] args) {
        int[][] array;
        int n;

        n = 6;
        array = new int[n][n];

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
            System.out.println(" ");
        }
        
        for (int i = 0; i < array.length; i++) {
    		boolean sorted = false;
    		int temp;
    		while (!sorted) {
    			sorted = true;
    			for (int j = 0; j < array.length - 1; j++) {
    				if (array[i][j] > array[i][j + 1]) {
    					temp = array[i][j];
    					array[i][j] = array[i][j + 1];
    					array[i][j + 1] = temp;
    					sorted = false;
    				}
    			}
    		}
        }

        System.out.println("\nМатрица после сортировки в строках \nпо возрастанию:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < array.length; i++) {
    		boolean sorted = false;
    		int temp;
    		while (!sorted) {	
    			sorted = true;
    			for (int j = 0; j < array.length - 1; j++) {
    				if (array[i][j] < array[i][j + 1]) {
    					temp = array[i][j];
    					array[i][j] = array[i][j + 1];
    					array[i][j + 1] = temp;
    					sorted = false;
    				}
    			}
    		}
        }

        System.out.println("\nМатрица после сортировки в строках \nпо убыванию:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}
