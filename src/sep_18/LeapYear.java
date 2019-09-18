package sep_18;

import java.util.Calendar;

public class LeapYear {


    public static boolean isLeapYear(int year) {

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        int noOfDays = cal.getActualMaximum(Calendar.DAY_OF_YEAR);

        if(noOfDays > 365){
            return true;
        }

        return false;
    }
}

class Main {

    public static void main(String[] args) {

        System.out.println(LeapYear.isLeapYear(2000));
        System.out.println(LeapYear.isLeapYear(2001));
        System.out.println(LeapYear.isLeapYear(2002));
        System.out.println(LeapYear.isLeapYear(2003));
        System.out.println(LeapYear.isLeapYear(2004));
    }
}
