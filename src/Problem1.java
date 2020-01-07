public class Problem1 {

    /*
     * ProjectEuler problem 1
     * Multiples of 3 and 5
     *
     * Find the sum of all multiples of 3 or 5 below 1,000
     */

    public int run() {
        return multiples();
    }

    public int multiples() {
        int sum = 0;

        for (int i = 0; i < 1000; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }

        }
        return sum;
    }
}
