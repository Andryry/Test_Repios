package KataTest.JavaCore2.Exeption;

public class BadCreditHistoryException extends RuntimeException {
    public BadCreditHistoryException(String message) {
        System.out.println("Проблемы с банковской историей");

    }
}
