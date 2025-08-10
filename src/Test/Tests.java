package Test;

public class Tests   {
    public static void main(String[] args) {
        int a = 0;
        try {
            a = 5+3;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (a ==8) {
        throw new RuntimeException("Капец лох"); }

    }
}
