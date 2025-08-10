package Test;

import java.util.Comparator;

public class Porols implements Comparable {
    private String namw;

    public String getNamw() {
        return namw;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
class PCompar implements Comparator <Porols>{

    @Override
    public int compare(Porols o1, Porols o2) {
        return o1.getNamw().length() - o2.getNamw().length();
    }


}
