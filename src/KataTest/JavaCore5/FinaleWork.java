package KataTest.JavaCore5;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class FinaleWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        int counter = 0;
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            counter++;
            if (counter % 2 == 0) {
                numbers.addFirst(a);
            }
        }
        scanner.close();
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

