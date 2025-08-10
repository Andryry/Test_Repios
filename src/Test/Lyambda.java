package Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.*;

public class Lyambda {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("яблоко", "банан", "вишня");

        Calculator ca = (a, b) -> System.out.println(a + b);
        ca.calc(12, 14);

        String as = "Hel";
        IsEmptyes la = (a) -> a.length() == 0;
        System.out.println(la.empty(as));


        Kvadrat<Double> duo = (numq) -> numq * numq;
        System.out.printf("%.1f", duo.calca(12.2));
        System.out.println();


        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);
        Collections.sort(numbers);
        System.out.println(numbers);
    }


}

interface SortToName {
    void sortir();
}


interface Calculator {
    void calc(int a, int b);
}

interface IsEmptyes {
    boolean empty(String a);
}

interface Kvadrat<T> {
    T calca(T num);
}

interface SortToValue {
    void num();
}
