package KataTest.JavaCore1.Massiv;

public class MegaQuest {
    public static void printOddNumbers(int[] arr) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                continue;
            } else {
                a++;
            }
        }

        int[] b = new int[a];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                continue;
            } else {
                b[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < b.length; i++) {
            if (i < b.length - 1) {
                System.out.print(b[i] + ",");
            }
            if (i == b.length - 1) {
                System.out.println(b[i]);
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printOddNumbers(a);
    }

}