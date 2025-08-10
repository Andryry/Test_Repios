package KataTest.JavaCore2.ClasAndMetod.Poliformizma;

public class Polif {


    public static class Student {
    protected final String studying;

    protected Student(String work) {
        this.studying = work;
    }

    public Student() {
        this.studying = "Прохожу тестовое задание.";
    }
    public void study() {
        System.out.println("Я очень занят. " + studying);
    }
}
}
