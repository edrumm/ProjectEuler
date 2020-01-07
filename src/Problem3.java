public class Problem3 {

    /*
     * ProjectEuler problem 3
     * Largest prime factor
     *
     * Calculate lpf of 600,851,475,143
     */

    public long run() {
        return calculate(600851475143L);
    }

    public long calculate(long n) {
        long factor = 0;

        // Test only with odd numbers as evens are not prime and testing with all values takes a VERY long time
        for (long i = 3; i <= Math.sqrt(n); i += 2) {

            if (n % i == 0 && isPrime(i)) {
                factor = i;
            }
        }

        return factor;
    }

    private boolean isPrime(long n) {

        for (int i = 3; i <= Math.sqrt(n); i += 2) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
