package KataTest.JavaCore1.Massiv;

public class Center {
    public static int[] getArrayMiddle(int[] numbers) {
        int central = numbers.length / 2;
        int length = numbers.length;
        if (numbers.length ==0) {
            return new int [0];
        }
        if (length % 2 == 0) {
            int[] a = new int[2];
            a[0] = numbers[central-1];
            a[1] = numbers[central];
            return a;
        } else {
            return new int[]{numbers[central]};
        }
    }

    public static void main(String[] args) {
        int [] asd = {112,233,3123,412,5};
        System.out.println(getArrayMiddle(asd));
    }
}
