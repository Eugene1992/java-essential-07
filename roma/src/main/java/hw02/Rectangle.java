package hw02;

/**
 * Created by Roma on 19.09.2016.
 */
public class Rectangle extends Shape {

    protected int secondSide;

    public Rectangle(int side, int secondSide){
        super(side);
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        double area = side * secondSide;
        return area;
    }
}
