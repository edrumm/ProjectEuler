import java.math.BigInteger;

public class Problem015 {

    /*
     * ProjectEuler problem 15
     * Lattice paths
     *
     * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
     * there are exactly 6 routes to the bottom right corner.
     * How many such routes are there through a 20×20 grid?
     */

    public String run() {
        return factorial(40).divide(factorial(20).pow(2)).toString();
    }

    private BigInteger factorial(int n) {

        if (n == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
        }
    }
}
