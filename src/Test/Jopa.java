package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Jopa {
    public static void main(String[] args) {
List <Integer> ls = new ArrayList<>();
ls.add(12);
List <Double> ld = new ArrayList<>();
ld.add(1.12);
        ArrayList <List> list = new ArrayList<List>();
   list.add(ls);
   list.add(ld);
   System.out.println(list);


    }

}
