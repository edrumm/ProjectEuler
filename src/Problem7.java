public class Problem7 {

    /*
     * ProjectEuler problem 7
     * 10001st prime
     *
     * What is the 10,001st prime number?
     */

    public int run() {
        // start prime count at 1 because we know 2 is a prime
        // all other primes are odd
        int primes = 1, n = 1;

        while (primes < 10001) {

            n += 2;

            if (isPrime(n)) {
                primes++;
            }
        }

        return n;
    }

    private boolean isPrime(int n) {

        for (int i = 3; i <= Math.sqrt(n); i += 2) {

            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
