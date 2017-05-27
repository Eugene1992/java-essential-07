package HomeWorkShape;

/**
 * Created by Roma on 22.09.2016.
 */
public class Rectangle extends Square {
    protected int b;

    Rectangle(int a, int b) {
        super(a);
        this.b = b;
    }

    @Override
    public double square() {
        double s;
        s = a * b;
        return s;
    }
}
