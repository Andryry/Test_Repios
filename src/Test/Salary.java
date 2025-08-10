package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Objects;

public class Salary  {
private boolean olek;
long money;


public long Agashaismilioner (){money = 10000000;
 long plusMoney=1234567890;
 return money+plusMoney;
}

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Salary salary = (Salary) o;
        return olek == salary.olek && money == salary.money;
    }

    @Override
    public int hashCode() {
        return Objects.hash(olek, money);
    }

    @Override
    public String toString() {
        return "Salary{" +
                "olek=" + olek +
                ", money=" + money +
                '}';
    }

    public boolean isOlek() {
        return olek;
    }

    public void setOlek(boolean olek) {
        this.olek = olek;
    }


    public static void main(String[] args) {
        System.out.println("asdasf");
        Salary salary = new Galya();

    }
}
class Galya extends Salary implements Swimng {
//    public static void main(String[] args) {
//        Salary s = new Salary();
////        s.setOlek(true);
////        System.out.println(s.isOlek());
////        s.money=1234567890;
//        System.out.println(s.getClass());
//
//    }

public void eat () {
    System.out.println("Eat");
}

    @Override
    public void swims() {

    }
}