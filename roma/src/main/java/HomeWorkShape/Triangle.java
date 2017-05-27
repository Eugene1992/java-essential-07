package HomeWorkShape;

/**
 * Created by Roma on 24.09.2016.
 */
public class Triangle extends Shape{
    protected int ha;
    Triangle(int a, int ha){
        super(a);
        this.ha=ha;
    }

    @Override
    public double square() {
        double s;
        s=1/2*a*ha;
        return s;
    }
}
