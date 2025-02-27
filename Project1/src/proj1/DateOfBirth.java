package proj1;

import java.time.LocalDate;
import java.time.Period;

public class DateOfBirth {
    private Month month;
    private int day;
    private int year;

    // enum to only allow user to input these months
    public enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public void setDay(int day){
        // make sure user inputs a valid day
        if (day <= 31 && day > 0){
            this.day = day;
        } else {
            System.out.println("Please input a valid day.");
        }
    }

    public int getDay(){
        return day;
    }

    public void setYear(int year){
        // make sure user inputs a valid year
        if (year >= 1000 && year <= 9999){
            this.year = year;
        } else {
            System.out.println("Please input a valid year");
        }
    }

    public int getYear(){
        return year;
    }

    public void setMonth(Month month){
        this.month = month;
    }

    public Month getMonth(){
        return month;
    }

    // constructor with parameters
    public DateOfBirth(int year, Month month, int day){
        this.month = month;
        // validate day and year
        setDay(day);
        setYear(year);
    }

    int calculateAge(){
        // get current date
        LocalDate currentDay = LocalDate.now();
        // use index of the month to get an int value
        int monthValue = month.ordinal() + 1;
        LocalDate birthDateLocalDate = LocalDate.of(year, monthValue, day);
        // calculate age using period.between function
        return Period.between(birthDateLocalDate, currentDay).getYears();
    }
}

