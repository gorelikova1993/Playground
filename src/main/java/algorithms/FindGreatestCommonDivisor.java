package algorithms;

/**
 * In mathematics, the greatest common divisor (GCD) of two or more integers, which are not all zero,
 * is the largest positive integer that divides each of the integers. For two integers x, y,
 * the greatest common divisor of x and y is denoted GCD(x,y). For example, the GCD of 8 and 12 is 4, that is, GCD(8,12)=4.
 */

public class FindGreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcd(8, 12));
    }

    public static int gcd(int p, int q) {
        if (q == 0 ) return p;
        int r = p % q;
        return gcd(q, r);
    }
}
