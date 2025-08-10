package KataTest.JavaCore4.intInputStrim;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class A {
    public static void main(String[] args) {
        byte[] original = {-1, -2, -3, 4, -25};
        InputStream inputStream = new ByteArrayInputStream(original);
        try {
            int ans = sumOfStream(inputStream);
            System.out.println(ans);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();

    }


    public static int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int byteRead;

        while ((byteRead = inputStream.read()) != -1) {
            sum += (byte)byteRead;
        }


        return sum;
    }
}


