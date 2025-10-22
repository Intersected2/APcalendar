public class APCalendar
{
    /** Returns true if year is a leap year and false otherwise. */
    private boolean isLeapYear(int year){
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
    public int numberOfLeapYears(int year1, int year2){
        int x = year2 - year1;
        int ly = 0;
        while (x >= 4){
            x = x - 4;
            ly = ly + 1;
        }
        return ly;
    }
    /** Returns the value representing the day of the week for the first day of year,
     * where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
     */
    private int firstDayOfYear(int year){
    return 0;
    }
    /** Returns n, where month, day, and year specify the nth day of the year.
     * Returns 1 for January 1 (month = 1, day = 1) of any year.
     * Precondition: The date represented by month, day, year is a valid date.
     */
    private int dayOfYear(int month, int day, int year){
    return 0;
    }
    /** Returns the value representing the day of the week for the given date
     * (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
     * and 6 denotes Saturday.
     * Precondition: The date represented by month, day, year is a valid date.
     */
    public int dayOfWeek(int month, int day, int year){
    return 0;
    }
}