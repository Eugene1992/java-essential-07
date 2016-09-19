package HwTwoOOPSquare;

/**
 * Created by Roma on 19.09.2016.
 */
public class Rectangle extends Square{
    protected int b;
    public Rectangle(int a, int b){
        super(a);
        this.b=b;
    }
    @Override
    public void figue() {
        double S = a*b;
        System.out.println(S);
    }
}
