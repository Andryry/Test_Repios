package KataTest.JavaCore4.intInputStrim;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class InputStrimReader {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        StringBuilder numbers = new StringBuilder();
        int byteReader;
        while ((byteReader = inputStreamReader.read()) != -1) {
            char s = (char) byteReader;
            numbers.append(s);
        }
        String num = new String(numbers);
        return num;
    }
    public static void main(String[] args) throws IOException {
        byte[] bb = new byte[] {48, 49, 50, 51}; //0, 1, 2, 3
        ByteArrayInputStream bis = new ByteArrayInputStream(bb);
        System.out.println(readAsString(bis, Charset.forName("ASCII")));
    }

}
