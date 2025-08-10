package KataTest.JavaCore5;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

public class PairClass<T, K> {
    T value;
    K value1;

    public PairClass(T value, K value1) {
        this.value = value;
        this.value1 = value1;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PairClass<?, ?> pairClass = (PairClass<?, ?>) o;
        return Objects.equals(value, pairClass.value) && Objects.equals(value1, pairClass.value1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, value1);
    }

    public T getFirst() {
        if (value == null) {
            throw new NoSuchElementException("No value present");
        }
        return value;
    }

    public K getSecond() {
        if (value1 == null) {
            throw new NoSuchElementException("No value present");
        }
        return value1;
    }


    public static <T, K> PairClass<T, K> of(T value, K valu1) {

        return new PairClass<>(value, valu1);
    }

    public static void main(String[] args) {
        PairClass<Integer, String> pair = PairClass.of(1, "hello");

        Integer i = pair.getFirst(); // 1

        String s = pair.getSecond(); // "hello"

        PairClass<Integer, String> pair2 = PairClass.of(1, "hello");

        boolean mustBeTrue = pair.equals(pair2); // true!

        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
    }


}
