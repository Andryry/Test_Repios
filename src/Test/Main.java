package Test;

import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите выражение (например: 2 + 2 или VI / III):");
            String input = scanner.nextLine().trim();
            scanner.close();

        }
}
