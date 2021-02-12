package by.epam.tasks.algorithmization.arrays_of_arrays;

/*
/11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.
 */
public class Task11 {
    public static void main(String[] args) {
        int[][] array;

        array = new int[10][20];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 0 + (int) (Math.random() * 15);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < array.length; i++) {
            int countRowWithNumberFive = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == 5) {
                    countRowWithNumberFive++;
                }
            }
            if (countRowWithNumberFive >= 3) {
                System.out.println("\nВ " + i + " строке число 5 повторяется " + countRowWithNumberFive + " раз" + "\nСтрока:");
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[i][j] + "\t");
                }
            }
        }


    }
}
