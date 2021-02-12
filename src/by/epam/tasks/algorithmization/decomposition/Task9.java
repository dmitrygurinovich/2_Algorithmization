package by.epam.tasks.algorithmization.decomposition;

/*9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой. */
public class Task9 {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        int t;

        x = 24;
        y = 10;
        z = 35;
        t = 20;

        squareOfQuadrangle(x, y, z, t);
    }

    private static void squareOfQuadrangle(int x, int y, int z, int t) {
        double diagonal;
        double p;
        double s1;
        double s2;

        diagonal = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        s1 = (x * y) / 2;
        p = (diagonal + z + t) / 2;
        s2 = Math.sqrt((p * (p - diagonal)) * (p - z) * (p - t));

        System.out.println(s1 + s2);
    }
}
