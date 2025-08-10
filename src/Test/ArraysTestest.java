package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArraysTestest {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3);
        Gen gen = new Gen(); // при создании класса, мы не обозначили параметр
        // поэтому в дальнейшем используя его, будет происходить стирание типов
        // Чтобы избежать проблему, надо Gen <Integer> gen = new Gen<>();
        // вызовется тогда первый метод и он будет работать без проблем
        gen.m(integers);
    }

    static class Gen<T> { // Класс параметризован!!
        <T> void m(Collection <T> collection) {// Вызвался бы этот метод, но из-за стирания
            //типов он не подходит. Но в нем проблем никаких нет
            for (T s : collection) {
                System.out.println(s);
            }
        }

        <T> void m(List<String> list) { // вызов этого метода, потому что дженерики
            // удаляться из-за стирания типов. Подходит по сигнатуре
            // выдаст ClassCastExeption из-за того, что метод принимает String
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
class Boxex <T>{
    static <T> Boxex <T> bax () { // Первая <T> относится к методу,
        // Boxex <T> тип возвращаемого значения. Возвращаем класс,
        // а он у нас параметризован
        return null;
    }
}
class ArraysTest {
    public static void main(String[] args) {
        List<ArrayList> al = new ArrayList<ArrayList>();  //— корректно, т.к. типы совпадают.
//        ArrayList<List> al = new ArrayList<ArrayList>();// — не скомпилируется,
        // потому что типы в <> должны совпадать,
        // чтобы это избежать, унжно либо все оставлять ArrayList,
        // либо List<List> list = new ArrayList<>();
        // чтобы хранить всех, кто имплиментирует List
    }
}