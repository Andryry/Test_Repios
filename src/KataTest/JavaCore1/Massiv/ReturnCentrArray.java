package KataTest.JavaCore1.Massiv;

import java.util.Arrays;

public class ReturnCentrArray {
    public static int [] getArrayMiddle(int[] numbers) {
        int central = numbers.length / 2;
        int length = numbers.length;

        if (numbers.length ==0){
            return new int[0];
        }

        if (length % 2 == 0) {
            return Arrays.copyOfRange(numbers, numbers[central], numbers[central-1]);


        } else {
            int a [] = Arrays.copyOf(numbers,numbers[central]);
            return a;

        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5,7};
        getArrayMiddle(a);
    }
}
