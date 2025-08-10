package KataTest.JavaCore5;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NewMaps {
    public static void main(String[] args) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(("Алексей 3000" +
                "\nДмитрий 9000\nАнтон 3000\nАлексей 7000" +
                "\nАнтон 8000").getBytes());
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(bais));
        getSalesMap(buffReader);
    }

    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> salesMap = new HashMap<>();
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()) {
            String name = scanner.next();
            long sales = scanner.nextLong();
            salesMap.merge(name,sales,Long::sum);
        }
        scanner.close();
        return salesMap;

    }
}
