package hw02;

/**
 * Created by Roma on 19.09.2016.
 */
public class Trapeze extends Shape {

    private int secondSide;
    private int height;

    public Trapeze(int side, int secondSide, int height) {
        super(side);
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (side + secondSide) / 2 * height;
    }
}
