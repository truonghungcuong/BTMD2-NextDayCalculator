public class NextDayCalculator {

    public static int[] nextDay(int[] date) {  // int[] date = new int[] {int day, int month, int year}
        if (date.length !=3) return null;

        int day = date[0];
        int month = date[1];
        int year = date[2];

        day += 1;

        if (day > daysInMonth(month, year)) {
            day = 1;
            month += 1;
        }

        if (month > monthsInYear()) {
            month = 1;
            year += 1;
        }

        return new int[]{day, month, year};
    }

    public static int monthsInYear() {
        return 12;
    }

    public static int daysInMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        if (year % 4 == 0)
            return true;
        return false;
    }
}