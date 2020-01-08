public class EulerSolutions {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("01: " + new Problem1().run());
        System.out.println("02: " + new Problem2().run());
        System.out.println("03: " + new Problem3().run());
        System.out.println("04: " + new Problem4().run());
        System.out.println("05: " + new Problem5().run());
        System.out.println("06: " + new Problem6().run());
        System.out.println(System.currentTimeMillis() - start + "ms");
    }
}
