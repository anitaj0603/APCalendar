public class APCalendar {
    private static boolean isLeapYear(int year) {
        boolean four = year % 4 == 0;
        boolean hundred = year % 100 == 0;
        boolean fourHundred = year % 400 == 0;
        return four && (!hundred || fourHundred);
    }

    public static int numberOfLeapYears(int year1, int year2) {
        int count = 0;
        for (int year = year1; year <= year2; year++) {
            if (isLeapYear(year)) {
                count++;
            }
        }
        return count;
    }

    private static int firstDayOfYear(int year) {
        int day = 1; // January 1, 0001 was a Monday
        for (int y = 1; y < year; y++) {
            day++;
            if (isLeapYear(y)) {
                day++;
            }
        }
        return day % 7;
    }

    private static int dayOfYear(int month, int day, int year) {
        int days = 0;
        if (month > 1) days += 31;
        if (month > 2) days += isLeapYear(year) ? 29 : 28;
        if (month > 3) days += 31;
        if (month > 4) days += 30;
        if (month > 5) days += 31;
        if (month > 6) days += 30;
        if (month > 7) days += 31;
        if (month > 8) days += 31;
        if (month > 9) days += 30;
        if (month > 10) days += 31;
        if (month > 11) days += 30;
        days += day;
        return days;
    }

    public static int dayOfWeek(int month, int day, int year) {
        int dayNum = dayOfYear(month, day, year);
        int firstDay = firstDayOfYear(year);
        return (firstDay + dayNum - 1) % 7;
    }
}