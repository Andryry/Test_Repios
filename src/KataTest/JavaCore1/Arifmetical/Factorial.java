package KataTest.JavaCore1.Arifmetical;

import java.math.BigInteger;

public class Factorial {

    public static BigInteger factorial1(int value) {
        if (value <= 1) {
            return BigInteger.valueOf(1);
        } else {
            return BigInteger.valueOf(value).multiply(factorial1(value - 1));
        }
    }

    public static BigInteger factorial(int value) {
        BigInteger a = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            a = a.multiply(BigInteger.valueOf(i));
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(factorial(230));
        System.out.println(isWeekend1("Monday"));
    }

    public int determineGroup(int age) {
        if (age > 7 && age < 13) {
            return 1;
        }
        if (age > 14 && age < 17) {
            return 2;
        }
        if (age > 18 && age < 65) {
            return 3;
        } else {
            return -1;
        }
    }

    public static boolean isWeekend(String weekday) {

        if (weekday == "Monday" || weekday == "Tuesday" || weekday == "Wednesday" || weekday == "Thursday" || weekday == "Friday") {
            return false;
        } else if (weekday == "Saturday" || weekday == "Sunday") {
            return true;
        } else {
            return false;
        }


    }
    public static String isWeekend1(String weekday) {
        return weekday == "Monday" || weekday == "Tuesday" || weekday == "Wednesday" || weekday == "Thursday" || weekday == "Friday" ? "Надо еще поработать":"Ура, выходной!";

    }


}
