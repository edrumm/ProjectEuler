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
    private String[] tens = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
                                "eighty", "ninety"};

    public int run() {
        int h = 0, t = 0, u = 1; // hundreds, tens, units
        int chrCount = 0;
        String words;

        for (int i = 0; i <= 1000; i++) {
            words = "";

            if (u > 9) { u = 0; }

            if (h != 0 && t == 0 && u == 0) {
                words += units[h] + "hundred";
                chrCount += words.length();

                u++;
                continue;

            } else if (h != 0) {
                words += units[h] + "hundredand"; // ignore spaces in final count
            }

            if (t == 0 && u == 0) {
                words += tens[t];
                chrCount += words.length();

                u++;
                continue;

            } else {
                words += tens[t];
            }

            // TODO:

        }

        return 0;
    }
}
