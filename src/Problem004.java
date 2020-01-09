public class Problem004 {

    /*
     * ProjectEuler problem 3
     * Largest palindrome product
     *
     * Find the largest palindrome made from the product of two 3-digit numbers
     */

    public int run() {
        int pal = 0;

        for (int i = 100; i < 1000; i++) {
            for (int j = i; j < 1000; j++) {

                int ij = i * j;

                if (palindrome(ij) && ij > pal) {
                    pal = i * j;
                }
            }
        }
        return pal;
    }

    private boolean palindrome(int n) {
        int reversed = 0;

        for (int i = n; i != 0; i /= 10) {
            reversed = reversed * 10 + i % 10;
        }

        if (n == reversed) {
            return true;
        }
        return false;
    }
}
