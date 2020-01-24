public class Problem012 {

    /*
     * ProjectEuler problem 12
     * Highly divisible triangular number
     *
     * What is the value of the first triangle number to have over
     * five hundred divisors?
     */

    public int run() {
        int triNumber = 0;
        for (int i = 1; i < Integer.MAX_VALUE - triNumber; i++) {
            triNumber += i;

            if (divisors(triNumber) > 500) {
                return triNumber;
            }
        }
        return 0;
    }


    private int divisors(int n) {
        // start at 2 as we know n is divisible by n and 1
        int divs = 0;

        if (Math.sqrt(n) * Math.sqrt(n) == n) {
            divs++;
        }

        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                divs += 2;
            }
        }
        return divs;
    }
}
