package HwTwoOOPSquare;

import java.lang.Math;

import static java.lang.Math.pow;


/**
 * Created by Roma on 19.09.2016.
 */
public class Square {
    protected int a;

    public Square(int a) {
        this.a = a;
    }

    public void figue() {
        double S;
        S = pow(a, 2);
        System.out.println(S);
    }
}
