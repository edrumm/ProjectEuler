public class Problem014 {

    /*
     * ProjectEuler problem 14
     * Longest Collatz sequence
     *
     * Which starting number, under one million, produces the longest chain?
     */

    public int run() {
        int longest = 0;
        int longestNumber = 0;
        int chainLength;

        for (int i = 2; i < 1000000; i++) {
            chainLength = chain(i);

            if (chainLength > longest) {
                longest = chainLength;
                longestNumber = i;
            }
        }

        return longestNumber;
    }

    private int chain(long n) {
        int length = 1;

        while (n > 1) {

            if (n % 2 == 0) {
                n /= 2;

            } else {
                n = n * 3 + 1;
            }
            length++;
        }
        return length;
    }
}
