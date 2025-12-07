class Leap {

    boolean isLeapYear(int year) {
        if (year < 0)
            return false;

        if (year % 100  == 0)
            return year % 400 == 0;
        else
            return year % 4 == 0;
    }

}
