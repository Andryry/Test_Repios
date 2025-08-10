package KataTest.JavaCore4.intInputStrim;

import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = new ByteArrayInputStream(new byte[]{3, 10, 4, -1, 5, 7, -4});
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        print(inputStream, outputStream);
        byte[] array = outputStream.toByteArray();
        for (byte b : array) {
            System.out.println(b);
        }
    }

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int byteRead;
        while ((byteRead = inputStream.read()) != -1) {
            if ((byte) byteRead % 2 == 0) {
                outputStream.write(byteRead);
            }
        }
        outputStream.flush();

    }
}
