package KataTest.JavaCore2.InterfAndClasses;

import java.util.Arrays;

public class Classest {
}

class AsciiCharSequence implements CharSequence {

    byte[] a;

    public AsciiCharSequence(byte[] a) {
        this.a = a;
    }

    @Override
    public int length() {
        return a.length;
    }

    @Override
    public char charAt(int index) {
        return (char) (a[index] & 0xFF);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        int length = end - start;
        byte[] subArray = new byte[length];
        System.arraycopy(a, start, subArray, 0, length);
        return new AsciiCharSequence(subArray);
    }

    @Override
    public String toString() {
        return new String(a, java.nio.charset.StandardCharsets.US_ASCII);
    }

    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println(answer.charAt(3));
    }

}