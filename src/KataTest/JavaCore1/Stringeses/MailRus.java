package KataTest.JavaCore1.Stringeses;

import java.util.regex.Pattern;

public class MailRus {
    //"^[\\w.-]+@[\\w.-]+\\.[a-z]{2,6}$"
    public static boolean isGmailOrOutlook(String email) {
        return Pattern.matches("^[\\w.-]+@[\\w.-]+\\.[a-z]{2,6}$", email);

    }

    public static void main(String[] args) {
        String mail = "K@list.ru";
        System.out.println(isGmailOrOutlook(mail));
    }
}
