//Uncomment this file after you finish implementing fraction
/**
 * This client uses the newly immutable Fraction class.
 */
public class UseFraction {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(-2, -3);
        System.out.println(f1);

        Fraction f2 = new Fraction(4, -24);
        System.out.println(f2);

        Fraction sum = f1.add(f2);
        System.out.println(sum);

        // no longer need to do this to "undo" a change to f1
        // f1.subtract(f2);

        System.out.println(f1);
        System.out.println();

        Fraction f3 = new Fraction(27, 1);
        System.out.println(f3);
        System.out.println();

        Fraction f4 = new Fraction(3, 4);
        Fraction f5 = new Fraction(4, 36);
        Fraction f6 = f4;  // no need to clone
        Fraction product = f4.multiply(f5);
        System.out.println(product);

        // have to reassign to change product
        product = product.divide(f5);
        System.out.println(f4);

        System.out.println(f6);
    }
}