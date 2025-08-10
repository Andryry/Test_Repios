package KataTest.JavaCore1.Massiv;

public class Abc {
    int[] numbers;

    public static void main(String[] args) {
        int[] numbers = {};
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {

            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }

        }
        System.out.print("]");
    }
}
