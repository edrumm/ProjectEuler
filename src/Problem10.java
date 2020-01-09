public class Problem10 {

    /*
     * ProjectEuler problem 10
     * Summation of primes
     *
     * Find the sum of all the primes below two million.
     */

    public long run() {
        // start at 2 as it's the only even prime number
        // count all other odds only
        long sum = 2;

        for (int i = 3; i < 2000000; i += 2) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private boolean isPrime(int n) {

        for (int i = 3; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
