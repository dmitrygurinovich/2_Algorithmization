package by.epam.tasks.algorithmization.decomposition;

import java.util.Arrays;

/*4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.*/
public class Task4 {
    public static void main(String[] args) {
        double[][] points;

        points = new double[][]{{-1.0, 3.0}, {6.0, 2.0}, {7.0, -1.0}, {0.0, 6.0}, {3.0, -8.0}};

        printResult(points, maxDistance(points));
    }

    static double[] maxDistance(double[][] points) {
        double distance;
        double maxDistance;
        double[] arr;

        maxDistance = 0;
        arr = new double[3];

        for (int i = 0; i < points.length; i++) {

            for (int j = 0; j < points.length; j++) {

                distance = distance(points[i], points[j]);

                if (distance > maxDistance) {
                    maxDistance = distance;
                    arr[0] = i;
                    arr[1] = j;
                    arr[2] = maxDistance;
                }

            }
        }

        return arr;
    }

    static double distance(double[] point1, double[] point2) {
        double distance;

        distance = Math.sqrt(Math.pow((point2[0] - point1[0]), 2) + Math.pow(point2[1] - point1[1], 2));

        return distance;
    }

    public static void printResult (double[][] points, double[] arr) {
        System.out.print("Максимальное расстояние между точками: ");
        System.out.print(Arrays.toString(points[(int)arr[0]]) + " и ");
        System.out.print(Arrays.toString(points[(int)arr[1]]) + " и равно: " + arr[2]);
    }
}
