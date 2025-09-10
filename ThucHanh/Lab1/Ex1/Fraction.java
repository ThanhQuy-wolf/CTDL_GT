public class Fraction {
    private int number = 0;
    private int denom = 1;

    Fraction() {};

    Fraction(int x, int y) {
        this.number = x;
        this.denom = y;
    }

    Fraction(Fraction f) {
        this.number = f.number;
        this.denom = f.denom;
    }

    public String toString() {
        return number + "/" + denom;
    }

    public boolean equals(Object f) {
        if (!(f instanceof Fraction)) return false;
        Fraction other = (Fraction) f;
        return this.number * other.denom == this.denom * other.number;
    }
}
