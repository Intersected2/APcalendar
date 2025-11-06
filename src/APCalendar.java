public class APCalendar {
    /** Returns true if year is a leap year and false otherwise. */
    public static boolean isLeapYear(int year){
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
        int ly = 0;
        int ram1 = year1;
        int ram2 = year2;
        if (year2 >= year1) {
            for (int i = 0; ram2 >= ram1;){
                if (ram1 % 4 == 0){
                    ly++;
                }
                ram1++;
            }
        }else if (year1 >= year2) {
            for (int i = 0; ram1 >= ram2;){
                if (ram2 % 4 == 0){
                    ly++;
                }
                ram2++;
            }
        }
        return ly;
    }
    public static int exclusivenumberOfLeapYears(int year1, int year2){
        int ly = 0;
        int eram1 = year1;
        int eram2 = year2;
        if (year2 > year1) {
            for (int i = 0; eram2 > eram1;){
                if (eram1 % 4 == 0){
                    ly++;
                }
                eram1++;
            }
        }else if (year1 > year2) {
            for (int i = 0; eram1 > eram2;){
                if (eram2 % 4 == 0){
                    ly++;
                }
                eram2++;
            }
        } else if (year1 == year2){
            if (eram1 % 4 == 0){
                ly++;
            }
        }
        return ly;
    }
    /** Returns the value representing the day of the week for the first day of year,
     * where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
     */
    public static int firstDayOfYear(int year){
        int day = 1;
        for (int i = 1; i < year; i++){
            day++;
            if (isLeapYear(i)){
                day++;
            }
        }
        return day % 7 - 1;
    }
    /** Returns n, where month, day, and year specify the nth day of the year.
     * Returns 1 for January 1 (month = 1, day = 1) of any year.
     * Precondition: The date represented by month, day, year is a valid date.
     */
    public static int dayOfYear(int month, int day, int year){
        boolean ly = false;
        int start = firstDayOfYear(year);
        int days = 0;
        if (year % 4 == 0){
            ly = true;
        }
        if (ly == false){
            if (month == 1){
            days = 0;
            days = days + day;
            }
            if (month == 2){
                days = 31;
                days = days + day;
            }
            if (month == 3){
                days = 59;
                days = days + day;
            }
            if (month == 4){
                days = 90;
                days = days + day;
            }
            if (month == 5){
                days = 120;
                days = days + day;
            }
            if (month == 6){
                days = 151;
                days = days + day;
            }
            if (month == 7){
                days = 181;
                days = days + day;
            }
            if (month == 8){
                days = 212;
                days = days + day;
            }
            if (month == 9){
                days = 243;
                days = days + day;
            }
            if (month == 10){
                days = 273;
                days = days + day;
            }
            if (month == 11){
                days = 304;
                days = days + day;
            }
            if (month == 12){
                days = 334;
                days = days + day;
            }
        } else if (ly == true){
            if (month == 1){
                days = 0;
                days = days + day;
            }
            if (month == 2){
                days = 31;
                days = days + day;
            }
            if (month == 3){
                days = 60;
                days = days + day;
            }
            if (month == 4){
                days = 91;
                days = days + day;
            }
            if (month == 5){
                days = 121;
                days = days + day;
            }
            if (month == 6){
                days = 152;
                days = days + day;
            }
            if (month == 7){
                days = 182;
                days = days + day;
            }
            if (month == 8){
                days = 213;
                days = days + day;
            }
            if (month == 9){
                days = 244;
                days = days + day;
            }
            if (month == 10){
                days = 274;
                days = days + day;
            }
            if (month == 11){
                days = 305;
                days = days + day;
            }
            if (month == 12){
                days = 335;
                days = days + day;
            }
        }
        return days;
    }
    /** Returns the value representing the day of the week for the given date
     * (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
     * and 6 denotes Saturday.
     * Precondition: The date represented by month, day, year is a valid date.
     */
    public static int dayOfWeek(int month, int day, int year){
        int ram = dayOfYear(month,day,year);
        int days = 0;
        days = firstDayOfYear(year);
        days = days + ram - 1;
        days = days % 7;
        if (days == 7){
            days = 0;
        }
        return days;
    }
}
