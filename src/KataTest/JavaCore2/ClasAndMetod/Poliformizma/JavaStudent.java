package KataTest.JavaCore2.ClasAndMetod.Poliformizma;

public class JavaStudent extends Polif.Student {
    public JavaStudent() {
        super("Прохожу курс по Java.");
    }


}
class LazyStudent extends Polif.Student {

    public LazyStudent() {
    }

    @Override
    public void study() {
        System.out.println("Сегодня не учусь, мне лень.");
    }
}