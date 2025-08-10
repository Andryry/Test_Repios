package KataTest.JavaCore2.ObgAndClas;

import java.util.Objects;

public class WeekDays {
    public static void main(String[] args) {

    }
}

enum Day {
    MONDAY("Понедельник", false),
    TUESDAY("Вторник", false),
    WEDNESDAY("Среда", false),
    THURSDAY("Четверг", false),
    FRIDAY("Пятница", false),
    SATURDAY("Суббота", true),
    SUNDAY("Воскресенье", true);
    private String nameDay;
    private boolean chilDay;

    Day(String russianName, boolean chilDay) {
        this.nameDay = russianName;
        this.chilDay = chilDay;
    }

    public boolean isWeekend() {
        return this.chilDay;
    }

    public String getRusName() {
        return this.nameDay;
    }


}
