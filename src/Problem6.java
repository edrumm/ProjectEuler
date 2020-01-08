public class Problem6 {

    /*
     * ProjectEuler problem 6
     * Sum square difference
     *
     * Find the difference between the sum of the squares of the first one hundred natural numbers
     * and the square of the sum.
     */

    public int run() {
        int sumOfSquare = 0, squareOfSum = 0;

        for (int i = 1; i <= 100; i++) {
            squareOfSum += i;
            sumOfSquare += i * i;
        }

        squareOfSum *= squareOfSum;
        return (squareOfSum - sumOfSquare);
    }
}
