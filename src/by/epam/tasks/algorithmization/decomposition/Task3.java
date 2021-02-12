package by.epam.tasks.algorithmization.decomposition;

/*3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
треугольника. */
public class Task3 {
    public static void main(String[] args) {
        double a;
        a = 8;
        System.out.println(areaOfHexagon(a));
    }

    static double areaOfTriangle (double a) {
        double area;
        area = (Math.sqrt(3) / 4) * Math.pow(a, 2);
        return area;
    }

    static double areaOfHexagon (double a) {
        double area;
        area = areaOfTriangle(a) * 6;
        return area;
    }
}
