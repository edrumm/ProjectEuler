public class Problem2 {

    /*
     * ProjectEuler problem 1
     * Even Fibonacci numbers
     *
     * Find the sum of all even Fibonacci numbers up to 4,000,000
     */

    public int run() {
        return fibonacci();
    }

    public int fibonacci() {
        int sum = 0;
        int a = 1, b = 2, ab = 0;

        while (a < 4000000) {

            if (isEven(a)) {
                sum += a;
            }

            ab = a + b;
            a = b;
            b = ab;
        }

        return sum;
    }

    private boolean isEven(int n) {

        return (n % 2 == 0);

    }
}
