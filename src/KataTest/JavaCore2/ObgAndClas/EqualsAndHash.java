package KataTest.JavaCore2.ObgAndClas;

import java.util.Objects;

public class EqualsAndHash {public static class ComplexNumber {
    private double re;
    private double im;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(re, that.re) == 0 && Double.compare(im, that.im) == 0;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(re, im);
    }


    public ComplexNumber() {
    }


    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

}

}
