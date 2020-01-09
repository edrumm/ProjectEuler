public class Problem005 {

    /*
     * ProjectEuler problem 5
     * Smallest multiple
     *
     * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
     */

    public int run() {
        int n = 20;

        while (true) {

            if (divisibleToTwenty(n)) {
                return n;
            } else {
                n++;
            }
        }
    }

    private boolean divisibleToTwenty(int n) {

        for (int i = 1; i < 20; i++) {

            if (n % i != 0) {
                return false;
            }
        }
        return true;
    }
}
