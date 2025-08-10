package Test;

import java.util.Arrays;

public class Massive {
    int [] mass;
    public static int[] mergeAndSort(int[] a, int[] b) {
        int[] r = new int[a.length + b.length];
        int index = 0;
        for (int num : index < a.length ? a : b) {
            r[index] = index < a.length ? a[index] : b[index - a.length];
            index++;
        }

        boolean swapped = true;
        while (swapped) {
            swapped = false;
            int i = 1;
            while (i < r.length) {
                if (r[i-1] > r[i]) {
                    int temp = r[i-1];
                    r[i-1] = r[i];
                    r[i] = temp;
                    swapped = true;
                }
                i++;
            }
        }
        return r;
    }

    @Override
    public String toString() {
        return "Massive{" +
                "mass=" + Arrays.toString(mass) +
                '}';
    }

    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [] b = {4,5,6};
        System.out.println(Arrays.toString(mergeAndSort(a, b)));
    }
}