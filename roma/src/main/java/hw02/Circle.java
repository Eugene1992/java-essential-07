package hw02;

import static java.lang.Math.pow;

/**
 * Created by Roma on 19.09.2016.
 */
public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * pow(radius, 2) / 2;
    }
}
