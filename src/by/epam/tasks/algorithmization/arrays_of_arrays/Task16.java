package by.epam.tasks.algorithmization.arrays_of_arrays;

/*
16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
..., n^2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат.
Пример магического квадрата порядка 3:
	6 1 8
	7 5 3
	2 9 4
*/
public class Task16 {

    public static void main(String[] args) {
        int[][] array;
        int n;
        int arrayElement;

        n = 3;
        arrayElement = 1;
        array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = arrayElement;
                arrayElement++;
            }
        }

        while (!isMagic(array, n)) {
            randomChange(array);
        }

        print(array);

    }

    public static int sumOfRows(int array[][], int n) {
        int[] tempArray;
        tempArray = new int[n];
        int sumOfRow;
        boolean result;

        result = true;
        sumOfRow = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumOfRow += array[i][j];
            }
            tempArray[i] = sumOfRow;
            sumOfRow = 0;
        }

        for (int i = 1; i < tempArray.length; i++) {
            if (tempArray[i - 1] != tempArray[i]) {
                result = false;
            }
        }
        if (result) {
            for (int i = 0; i < array.length; i++) {
                sumOfRow += array[0][i];
            }
        }
        return sumOfRow;
    }

    public static int sumOfColumns(int array[][], int n) {
        int[] tempArray;
        tempArray = new int[n];
        int sumOfColumn;
        boolean result;

        result = true;
        sumOfColumn = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumOfColumn += array[j][i];
            }
            tempArray[i] = sumOfColumn;
            sumOfColumn = 0;
        }

        for (int i = 1; i < tempArray.length; i++) {
            if (tempArray[i - 1] != tempArray[i]) {
                result = false;
            }
        }

        if (result) {
            for (int i = 0; i < array.length; i++) {
                sumOfColumn += array[i][0];
            }
        }
        return sumOfColumn;
    }

    public static int sumOfMainDiagonal(int arr[][]) {
        int sumOfMainDiagonal;
        sumOfMainDiagonal = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfMainDiagonal += arr[i][i];
        }
        return sumOfMainDiagonal;
    }

    public static int sumOfDiagonal(int arr[][]) {
        int sumOfDiagonal;
        int k;

        sumOfDiagonal = 0;
        k = arr[0].length - 1;
        for (int i = 0; i < arr.length; i++) {
            sumOfDiagonal += arr[i][k];
            k--;
        }
        return sumOfDiagonal;
    }

    public static boolean isMagic(int arr[][], int n) {
        boolean isMagic;
        isMagic = false;

        if (sumOfRows(arr, n) == sumOfColumns(arr, n)) {
            if (sumOfColumns(arr, n) == sumOfMainDiagonal(arr)) {
                if (sumOfMainDiagonal(arr) == sumOfDiagonal(arr)) {
                    isMagic = true;
                }
            }
        }
        return isMagic;
    }

    public static int[][] randomChange(int arr[][]) {
        int tempArray[];
        int p = 0;
        int x1, y1;
        int k = arr.length * arr.length;
        tempArray = new int[k];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                tempArray[p] = arr[i][j];
                p++;
            }
        }

        p = 0;

        x1 = generateRandomNum(tempArray);
        y1 = generateRandomNum(tempArray);

        while (x1 == y1) {
            x1 = generateRandomNum(tempArray);
            y1 = generateRandomNum(tempArray);
        }

        replaceElement(tempArray, x1, y1);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = tempArray[p];
                p++;
            }
        }

        return arr;
    }

    public static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    public static int generateRandomNum(int tempArray[]) {
        int number;
        number = (int) (Math.random() * (tempArray.length));
        return number;
    }

    public static void replaceElement(int arr[], int a, int b) {
        int tempElement;
        tempElement = arr[a] + arr[b];
        arr[a] = tempElement - arr[a];
        arr[b] = tempElement - arr[b];
    }
}
