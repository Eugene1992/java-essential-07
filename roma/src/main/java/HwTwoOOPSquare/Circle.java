package HwTwoOOPSquare;

import static java.lang.Math.pow;

/**
 * Created by Roma on 19.09.2016.
 */
public class Circle {
    private int R;
    final float Pi=3.14F;
    public Circle(int R){
        this.R=R;
    }

    public void figue(){
        double S;
        S=(Pi*pow(R,2))/2;
        System.out.println(S);
    }
}
