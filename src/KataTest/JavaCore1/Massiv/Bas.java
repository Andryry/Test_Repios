package KataTest.JavaCore1.Massiv;

import java.util.Arrays;

public class Bas {

        public static void getSubArrayBetween(int[] numbers, int start, int end) {
            if (numbers == null || numbers.length == 0 || start > end) {

            }

            Arrays.sort(numbers);  // Убрать, если порядок элементов важен

            int count = 0;
            for (int num : numbers) {
                if (num >= start && num <= end) {
                    count++;
                }
            }

            int[] result = new int[count];
            int index = 0;
            for (int num : numbers) {
                if (num >= start && num <= end) {
                    result[index++] = num;
                }
            }

            for (int a: result){
                System.out.println(a);
            }
        }



public static void main(String[] args) {
    int[] ars = {1, 2, 3, 4, 5, 6};
    getSubArrayBetween(ars, 1, 4);

}
    }
