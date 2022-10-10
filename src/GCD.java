import java.util.Random;

import static java.lang.Math.abs;

public class GCD {

    public static void main(String[] args) {
        int n1 = random(100);
        int n2 = random(100);
        System.out.printf("Finding gcd for %d %d%n", n1, n2);
        System.out.printf("Result is %d%n", euclid(n1, n2));
    }

    private static int random(int bound) {
        return abs(new Random().nextInt(bound));
    }

    public static int euclid(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return euclid(n2, n1 % n2);
    }
}
