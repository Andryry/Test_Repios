package Test;

public class Recurseya {
    public static void numbersRecur (int a) {
        if (a == 1) {
            System.out.println("1");
            return;
        }
        System.out.println(a);
        numbersRecur(a -1);
    }

    public static void main(String[] args) {
        numbersRecur(10);
    }

}
