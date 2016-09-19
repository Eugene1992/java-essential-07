package cw05.abstract_example;

/**
 * Created by evgeniy on 19/09/16.
 */
public abstract class Shape {

    protected int side;

    public Shape(int side) {
        this.side = side;
    }

    public abstract double getArea();

    void f() {

    }
}
