package Other;

import java.util.Objects;

public class Stydentses {
    int age;
    String name;
    Kafedra kaf;
    int id;

    public Stydentses(int age, String name, Kafedra kaf, int id) {
        this.age = age;
        this.name = name;
        this.kaf = kaf;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Stydentses st = (Stydentses) o;
        return st.age == this.age && st.id == this.id && this.name.equalsIgnoreCase(st.name);
    }

    @Override
    public String toString() {
        return "Stydentses {" +
                "id =" + id +
                ", name = '" + name + '\'' +
                ", kaf = " + kaf +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, kaf);
    }

    enum Kafedra {
        Menedjment, PianoForte, Conducter;
    }

    public static void main(String[] args) {
        Stydentses st1 = new Stydentses(23,"Piter", Kafedra.Menedjment, 1);
        Stydentses st2 = new Stydentses(23,"Piter",Kafedra.PianoForte, 1 );
        System.out.println(st1);
        System.out.println(st1.equals(st2));

    }

}


