package KataTest.JavaCore5;

import java.util.HashSet;
import java.util.Set;

public class symmetricDifference {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        Set setOne = new HashSet(set1);
        Set setTwo = new HashSet(set2);
        setOne.removeAll(set2);
        setTwo.removeAll(set1);
        setOne.addAll(setTwo);
        return setOne;
    }


    public static void main(String[] args) {

        Set<Integer> s1 = new HashSet<>();
        s1.add(12);
        s1.add(2);
        s1.add(34);
        s1.add(21);

        HashSet<Integer> s2 = new HashSet<>();
        s2.add(0);
        s2.add(1);
        s2.add(21);
        s2.add(2);

        Set<Integer> result = symmetricDifference(s1, s2);
        System.out.println(result);

    }
}
