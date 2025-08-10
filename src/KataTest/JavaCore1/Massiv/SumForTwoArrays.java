package KataTest.JavaCore1.Massiv;

import java.util.Arrays;

public class SumForTwoArrays {
    public static void mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] a = new int[firstArray.length+secondArray.length];
        System.arraycopy(firstArray, 0, a, 0, firstArray.length);
        System.arraycopy(secondArray, 0, a, firstArray.length, secondArray.length);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int [] a = {1,2,3};
        int b [] = {12,214,1};
    mergeAndSort(a,b);
    }
}
