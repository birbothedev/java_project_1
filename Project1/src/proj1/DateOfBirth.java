package proj1;

public class DateOfBirth {
    private Month month;
    public int day;
    public int year;

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


    public DateOfBirth(){
        this.day = 0;
        this.year = 0;
        this.month = Month.JANUARY;
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
    public DateOfBirth(Month month, int day, int year){
        this.month = month;
        // validate day and year
        setDay(day);
        setYear(year);
    }
}

