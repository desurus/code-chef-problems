package info.desurus;

/**
 * Created by okryshch on 1/18/16.
 */
public class Rational {
    private int num;   // the numerator
    private int den;   // the denominator

    /**
     * Class constructor.
     *
     * @param numerator integer
     * @param denominator integer
     */
    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new RuntimeException("Denominator is zero");
        }
        int g = gcd(numerator, denominator);
        num = numerator   / g;
        den = denominator / g;

    }

    /**
     * Returns string representation of (this).
     *
     * @return string
     */
    public String toString() {
        if (den == 1) return num + "";
        else          return num + "/" + den;
    }

    /**
     * Returns (this * b).
     *
     * @param b Rational
     * @return Rational
     */
    public Rational times(Rational b) {
        return new Rational(this.num * b.num, this.den * b.den);
    }

    /**
     * Returns (this + b).
     *
     * @param b Rational
     * @return Rational
     */
    public Rational plus(Rational b) {
        int numerator   = (this.num * b.den) + (this.den * b.num);
        int denominator = this.den * b.den;
        return new Rational(numerator, denominator);
    }

    /**
     * Returns 1 / this).
     *
     * @return Rational
     */
    public Rational reciprocal() { return new Rational(den, num);  }

    /**
     * Returns (this / b).
     *
     * @param b Rational
     * @return Rational
     */
    public Rational divides(Rational b) {
        return this.times(b.reciprocal());
    }


    /**
     * Returns Greatest Common Denominator for two numbers.
     *
     * @param m integer
     * @param n integer
     * @return integer
     */
    private static int gcd(int m, int n) {
        if (0 == n) return m;
        else return gcd(n, m % n);
    }
}
