public class EulerSolutions {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("01: " + new Problem1().run());
        System.out.println("02: " + new Problem2().run());
        System.out.println("03: " + new Problem3().run());
        System.out.println("04: " + new Problem4().run());
        System.out.println("05: " + new Problem5().run());
        System.out.println("06: " + new Problem6().run());
        System.out.println("07: " + new Problem7().run());
        System.out.println("08: " + new Problem8().run());
        System.out.println("09: " + new Problem9().run());
        System.out.println("10: " + new Problem10().run());
        System.out.println(System.currentTimeMillis() - start + "ms");
    }
}
