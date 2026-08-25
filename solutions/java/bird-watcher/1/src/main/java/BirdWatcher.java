
class BirdWatcher {
    private int[] birdsPerDay = {0, 2, 5, 3, 7, 8, 4};

    public BirdWatcher(int[] birdsPerDayOther) {
        birdsPerDay = birdsPerDayOther.clone();
    }

    // Weird design.  I had to do this to get the tests to pass.
    public static int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int count : birdsPerDay)
            if (count == 0)
                return true;
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int last_index = Math.min(numberOfDays, birdsPerDay.length);
        for (int i = 0; i < last_index; i++)
            sum += birdsPerDay[i];
        return sum;
    }

    public int getBusyDays() {
        int days = 0;
        for (int count : birdsPerDay)
            if (count >= 5)
                days++;
        return days;
    }
}
