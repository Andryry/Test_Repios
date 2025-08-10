package Test;

public class Exeptioneses {
    public static boolean chekPassword (String pass) {
        if (pass.length() < 8) {
            throw new LochExe();
        }
        return true;
    }

    public static void main(String[] args) {

        try {
            System.out.println(chekPassword("Fash213f"));
        } catch (LochExe e) {
            System.out.println("Вы ввели не верно нахуй");
        }
    }
}

class LochExe extends RuntimeException {
    public LochExe() {
    }
}
