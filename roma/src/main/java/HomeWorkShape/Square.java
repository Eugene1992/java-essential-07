package HomeWorkShape;

/**
 * Created by Roma on 22.09.2016.
 */
public class Square extends Shape{

Square(int a){
    super(a);
}

    @Override
    public double square() {
        double s;
        s=Math.pow(a,2.0);
        return s;
    }
}
