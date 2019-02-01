/**
 * Each Fraction object represents an immutable rational number with a numerator and denominator.
 * Fractions are always stored in reduced form such that the GCD of their
 * numerator and denominator is always 1.
 * Class Fraction is incomplete and mutable
 * Let's make it complete and immutable!
 *
 * @pre to all methods: valid arguments  (I know, I know...)
 */
public class Fraction implements Cloneable, Comparable<Fraction> {
    private int numerator, denominator;

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction setNumerator(int n) {
        return new Fraction(n, denominator);
    }

    public Fraction setDenominator(int d) {
        return new Fraction(numerator, d);
    }

    public Fraction clone() {
        return new Fraction(numerator, denominator);
    }

    public int compareTo(Fraction other) {
        return Double.compare(numerator / (double) denominator, other.numerator / (double) other.denominator);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator &&
                denominator == fraction.denominator;
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return String.valueOf(numerator);
        } else {
            return numerator + "/" + denominator;
        }
    }

    public Fraction add(Fraction other) {
        return new Fraction(numerator * other.denominator + other.numerator * denominator, denominator * other.denominator);
    }

    private void reduce() {
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public Fraction subtract(Fraction other) {
        return new Fraction(numerator * other.denominator - other.numerator * denominator, denominator * other.denominator);
    }

    public Fraction multiply(Fraction other) {
        return new Fraction(numerator * other.numerator, denominator * other.denominator);
    }

    public Fraction divide(Fraction other) {
        return new Fraction(numerator * other.denominator, denominator * other.numerator);
    }

    //this method returns greatest common divisor of x and y
    //-6 and 4 is 2
    private static int gcd(int x, int y) {
        if (y == 0)
            return Math.abs(x);
        else
            return gcd(y, x % y);
    }
}