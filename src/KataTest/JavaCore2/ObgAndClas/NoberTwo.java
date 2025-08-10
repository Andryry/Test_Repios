package KataTest.JavaCore2.ObgAndClas;

public class NoberTwo {
    public static class ComplexNumber {

        private double re;

        private double im;

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

        @Override
        public boolean equals(Object obj) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            ComplexNumber that = (ComplexNumber) obj;
            return that.im == this.im && that.re == this.re;
        }
    }

}
