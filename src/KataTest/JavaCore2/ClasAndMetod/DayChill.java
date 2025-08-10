package KataTest.JavaCore2.ClasAndMetod;

public class DayChill {

    public static boolean isWeekend(String dayName) {
        if (dayName.equalsIgnoreCase("Sunday") || dayName.equalsIgnoreCase("Saturday")) {
            return true;
        } else {
            return false;
        }
    }

    public static int weekendCount(String[] days) {
        int day = 0;
        for (int i = 0; i < days.length; i++) {
            if (isWeekend(days[i])) {
                day++;
            }
        }
        return day;
    }

    public static int weekdayCount(String[] days) {
        int count = days.length - weekendCount(days);
        return count;
    }

    public static void main(String[] args) {
        String[] days = new String[]{"Saturday", "SUNDAY", "Monday", "Friday", "tuesday", "saturday", "Wednesday", "Thursday", "sUNDAY"};
        System.out.println(weekendCount(days));
        System.out.println(weekdayCount(days));
        System.out.println(isWeekend("SUndy"));
    }
}
