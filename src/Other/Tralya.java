package Other;

import java.io.*;
import java.nio.ByteBuffer;

public class Tralya {
    public static void main(String[] args) {

        ByteBuffer byteBuffer = ByteBuffer.allocate(128);
        try (
              FileInputStream fis = new FileInputStream("test.txt") ) {

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
