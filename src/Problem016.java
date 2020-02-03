import java.math.BigInteger;

public class Problem016 {

    /*
     * ProjectEuler problem 16
     * Power digit sum
     *
     * What is the sum of the digits of the number 2 ^ 1000?
     */

    public int run() {
        int sum = 0;
        String num = new BigInteger("2").pow(1000).toString();

        for (int i = 0; i < num.length(); i++) {
            sum += num.charAt(i) - '0';
        }
        return sum;
    }
}
