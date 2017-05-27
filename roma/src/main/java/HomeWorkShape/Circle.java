package HomeWorkShape;

/**
 * Created by Roma on 22.09.2016.
 */
public class Circle extends Shape {

    Circle(double r) {
        super(r);
    }

    @Override
    public double square() {
        double s;
        s = Math.PI * Math.pow(r, 2.0) / r;
        return s;
    }
}
