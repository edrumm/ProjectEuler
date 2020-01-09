public class Problem002 {

    /*
     * ProjectEuler problem 1
     * Even Fibonacci numbers
     *
     * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
     * find the sum of the even-valued terms.
     */

    public int run() {
        int sum = 0;
        int a = 1, b = 2, ab = 0;

        while (a < 4000000) {

            if (a % 2 == 0) {
                sum += a;
            }

            ab = a + b;
            a = b;
            b = ab;
        }
        return sum;
    }
}
