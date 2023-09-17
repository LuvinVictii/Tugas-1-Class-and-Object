package id.its.pbo;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
    	this.month = (month >= 1 && month <= 12) ? month : 1;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (isValidDay(this.month, day, this.year)) {
            this.day = day;
        } else {
        	this.day = 1;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year >= 0 ? year : 0;
    }

    public String displayDate() {
        return month + "/" + day + "/" + year;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private boolean isValidDay(int month, int day, int year) {
        if (day < 1 || day > 31) {
        	return false;
        }

        switch (month) {
            case 4: case 6: case 9: case 11:
                return day <= 30;
            case 2:
                return isLeapYear(year) ? day <= 29 : day <= 28;
            default:
                return true;
        }
    }
}

