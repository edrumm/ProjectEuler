public class Problem017 {

    /*
     * ProjectEuler problem 17
     * Number letter counts
     *
     * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words,
     * how many letters would be used?
     */

    private String[] units = {"zero", "one", "two", "three", "four", "five", "six", "seven",
                                "eight", "nine"};
    private String[] teens = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                                "seventeen", "eighteen", "nineteen"};
    private String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
                                "eighty", "ninety"};

    public int run() {
        int h = 0, t = 0, u = 1, count = 0;
        for (int i = 0; i < 999; i++) {

            if (u > 9) {
                t++;
                u = 0;
            }

            if (t > 9) {
                h++;
                t = 0;
            }

            count += toWords(h, t, u).length();
            u++;
        }

        String thousand = "onethousand";
        count += thousand.length();

        return count;
    }

    private String toWords(int h, int t, int u) {
        String str = "";

        if (h > 0 && t == 0 && u == 0) {
            return units[h] + "hundred";

        } else if (h > 0) {
            str += units[h] + "hundredand";
        }

        if (t == 0 && u > 0) {
            str += units[u];

        } else if (u == 0 && t > 0) {
            str += tens[t];

        } else if (t == 1 && u > 0) {
            str += teens[u - 1];

        } else {
            str += tens[t];
            str += units[u];
        }

        return str;
    }
}
