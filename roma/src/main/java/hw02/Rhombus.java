package hw02;

/**
 * Created by Roma on 19.09.2016.
 */
public class Rhombus extends Shape {
    private double angle;

    public Rhombus(int side, double angle) {
        super(side);
        this.angle = angle;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2) * Math.sin(angle);
    }
}
