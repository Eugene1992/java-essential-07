package HomeWorkShape;

/**
 * Created by Roma on 22.09.2016.
 */
public abstract class Shape {
    protected int a;
    protected double r;

    Shape(int a) {
        this.a = a;

    }
    Shape(double r){
        this.r=r;
    }

    public abstract double square();
}
