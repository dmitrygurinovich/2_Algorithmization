package by.epam.tasks.algorithmization.sorts;

import java.util.ArrayList;

/*8.Даны дроби p1/q1, p2/q2, ..., pn/qn ( pi, qi - натуральные). Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания.*/
public class Task8 {
    public static void main(String[] args) {
        ArrayList<Fraction> fractions;
        int n;

        fractions = new ArrayList<>();
        n = 6;

        generateArrayListOfRandomFractions(n, fractions);
        printFraction("Дроби до преобразований: ", fractions);
        fractionsToGeneralDenominator(fractions);
        printFraction("Дроби после приведения к общему знаменателю: ", fractions);
        sortFractionsByUp(fractions);
        printFraction("Дроби по возрастанию: ", fractions);
    }

    public static void generateArrayListOfRandomFractions(int n, ArrayList<Fraction> fr) {
        for (int i = 0; i < n; i++) {

            fr.add(new Fraction(generateRandomInt(), generateRandomInt()));

        }
    }

    public static void sortFractionsByUp(ArrayList<Fraction> fr) {
        boolean sorted;
        Fraction temp;

        sorted = false;
        temp = new Fraction();

        while (!sorted) {
            sorted = true;
            for (int k = 0; k < fr.size() - 1; k++) {
                if (fr.get(k).numerator > fr.get(k + 1).numerator) {
                    temp.numerator = fr.get(k).numerator;
                    temp.denominator = fr.get(k).denominator;
                    fr.get(k).numerator = fr.get(k + 1).numerator;
                    fr.get(k).denominator = fr.get(k + 1).denominator;
                    fr.get(k + 1).numerator = temp.numerator;
                    fr.get(k + 1).denominator = temp.denominator;
                    sorted = false;
                }
            }
        }
    }

    public static void fractionsToGeneralDenominator(ArrayList<Fraction> fractions) {
        int generalDenominator;

        generalDenominator = generalDenominator(fractions);

        for (Fraction fr : fractions) {

            fr.numerator = fr.numerator * (generalDenominator / fr.denominator);
            fr.denominator = generalDenominator;

        }
    }

    public static int generalDenominator(ArrayList<Fraction> fractions) {
        int generalFractionDenominator;
        generalFractionDenominator = fractions.get(0).denominator;

        for (Fraction fr : fractions) {
            if (generalFractionDenominator % fr.denominator != 0) {
                generalFractionDenominator *= fr.denominator;
            }
        }
        return generalFractionDenominator;
    }

    public static void printFraction(String text, ArrayList<Fraction> fr) {
        System.out.println(text);
        for (int i = 0; i < fr.size(); i++) {
            System.out.print(fr.get(i).numerator + "/" + fr.get(i).denominator + "   ");
        }
        System.out.println("\n");
    }

    public static int generateRandomInt() {
        int num;

        num = (int)(Math.random() * 10);

        if(num == 0) {
            return generateRandomInt();
        } else {
            return num;
        }
    }
}

class Fraction {
    int numerator;
    int denominator;

    public Fraction() {
        numerator = 0;
        denominator = 0;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
}