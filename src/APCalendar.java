public class APCalendar {
    /** Returns true if year is a leap year and false otherwise. */
    private static boolean isLeapYear(int year){
        if (year % 4 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    /** Returns the number of leap years between year1 and year2, inclusive.
     * Precondition: 0 <= year1 <= year2
     */
    public static int numberOfLeapYears(int year1, int year2){
        int x = year2 - year1;
        int ly = 0;
        int ram1 = 0;
        int ram2 = 0;
        if (year2 > year1) {
            if (x < 4){
                ram1 = year1;
                ram2 = year2;
                while (ram2 >= ram1){
                    if (ram2 % 4 == 0){
                        ly = 1;
                        return ly;
                    }
                    else{
                        ram2--;
                    }
                }
            }
            while (x >= 4) {
                x = x - 4;
                ly = ly + 1;
            }
        }else if (year1 < year2) {
            x = year1 - year2;
            while (x >= 4) {
                x = x - 4;
                ly = ly + 1;
            }
        }
        return ly;
    }
    /** Returns the value representing the day of the week for the first day of year,
     * where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
     */
    public static int firstDayOfYear(int year){
        int start = 2019;
        int startw= 2;
        int compare = 0;
        int x1 = 0;
        int leapyear = 0;
        int ram = 0;
        if (year > 2019) {
            x1 = year - 2019;
            while (compare >= 4) {
                compare = compare - 4;
                leapyear = leapyear + 1;
            }
            for (int i = 0; leapyear > 1; ) {
                leapyear--;
                i++;
                ram = i;
            }
            x1 = x1 * 365;
            x1 = x1 + ram;
            startw = startw + x1;
            startw %= 7;
            return startw;
        }
        else if (year < 2019) {
                compare = year - 2019;
                while (x1 >= 4) {
                    x1 = x1 - 4;
                    leapyear = leapyear + 1;
                }
            }
        return 0;
        }
    /** Returns n, where month, day, and year specify the nth day of the year.
     * Returns 1 for January 1 (month = 1, day = 1) of any year.
     * Precondition: The date represented by month, day, year is a valid date.
     */
    private static int dayOfYear(int month, int day, int year){
    return 0;
    }
    /** Returns the value representing the day of the week for the given date
     * (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
     * and 6 denotes Saturday.
     * Precondition: The date represented by month, day, year is a valid date.
     */
    public static int dayOfWeek(int month, int day, int year){
    return 0;
    }
}