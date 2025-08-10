package KataTest.JavaCore1.Massiv;

public class Revers {
        public static int[] inverseArray(int[] numbers) {
            int[] newar = new int[numbers.length];
            int j = 0;
            for (int i = numbers.length - 1; i >= 0; i--) {
                newar[j] = numbers[i];
                j++;
            }
            return newar;
        }


    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 2, 3, 1, 2};
        inverseArray(a);

    }
}
//class test{
//    public static void main(String[] args) {
//        int a [] = {1,2,3,4,5};
//        for (int i = a.length-1; i>=0; i--) {
//            System.out.println(a[i]);
//        }
//    }
//}
