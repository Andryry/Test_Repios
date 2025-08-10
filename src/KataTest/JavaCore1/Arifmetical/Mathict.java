package KataTest.JavaCore1.Arifmetical;

public class Mathict {
    public static void main(String[] args) {
//        System.out.println(getAgeDiff((byte) 14, (byte) 59));
//        System.out.println(charExpression(1));
//        maxLongSqr();
        System.out.println(isPowerOfTwo(2));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(8));

    }

    public static boolean isPowerOfTwo(int value) {
        int b = Math.abs(value);
        if (Integer.bitCount(b) == 1) {
            return true;
        } else {
            return false;
        }

    }

//    public static byte getAgeDiff(byte age1, byte age2) {
//        byte c = (byte) Math.max(age1, age2);
//        byte b = (byte) Math.min(age1, age2);
//        byte a = (byte) (c - b);
//        return a;
//    }
//    public static char charExpression(int a) {
//        return  (char) ('\\'+ a);}

//    public static void maxLongSqr() {
//        long max = Long.MAX_VALUE;
//        BigInteger a = new BigInteger(String.valueOf(max));
//        BigInteger b = a.multiply(a);
//
//        System.out.println("Квадрат макс. знач long " + b);
//
//        //Твой код тут
//    }


}
