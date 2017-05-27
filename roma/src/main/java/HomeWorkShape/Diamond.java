package HomeWorkShape;

/**
 * Created by Roma on 22.09.2016.
 */
public class Diamond extends Shape{
    protected int h;
Diamond(int a, int h){
    super(a);
    this.h=h;
}

    @Override
    public double square() {
        double s;
        s=a*h;
        return s;
    }
}
