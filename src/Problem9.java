public class Problem9 {

    /*
     * ProjectEuler problem 9
     * Special Pythagorean triplet
     *
     * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
     * Find the product abc.
     */

    public int run() {
        // a < b < c
        for (int a = 1; a < 1000; a++) {
            for (int b = a + 1; b < 1000; b++) {

                int c = 1000 - b - a;

                if ((a * a) + (b * b) == (c * c)) {
                    return a * b * c;
                }
            }
        }
        return 0;
    }
}
