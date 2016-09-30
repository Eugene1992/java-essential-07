package cw07;

/**
 * Created by evgeniy on 24/09/16.
 */
public class Test {
    public static void main(String[] args) {
        Plane.Engine inner =
                new Plane("Il-21").new Engine(400.0);

        Plane.NestedClass nested =
                new Plane.NestedClass();

        new Plane.NestedClass();

        Plane.NestedClass.k();
    }
}
