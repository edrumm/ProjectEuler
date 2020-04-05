public class Problem019 {

    /*
     * Project Euler problem 19
     * Counting Sundays
     *
     * How many Sundays fell on the first of the month during the twentieth century
     * (1 Jan 1901 to 31 Dec 2000)?
     */

    public int run() {
        int sundays = 0;

        for (int year = 1901; year <= 2000; year++) {

            for (int month = 1; month <= 12; month++) {

                if (isSunday(1, month, year)) {
                    sundays++;
                }
            }
        }

        return sundays;
    }

    // Zeller's Congruence
    private boolean isSunday(int day, int month, int year) {
        if (month == 1) {
            month = 13;
        } else if (month == 2) {
            month = 14;
        }

        int k = year % 100;
        int j = year / 100;

        int h = day + 13 * (month + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
        h %= 7;

        return h == 1;
    }
}
