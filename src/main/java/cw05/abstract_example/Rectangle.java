package cw05.abstract_example;

/**
 * Created by evgeniy on 19/09/16.
 */
public class Rectangle extends Shape {

    private int secondSide;

    public Rectangle(int side, int secondSide) {
        super(side);
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return side * secondSide;
    }
}
