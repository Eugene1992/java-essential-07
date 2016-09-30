package cw07;

import java.io.Serializable;
import java.util.List;

public class Plane extends BasePlane {

    public String name;
    private static int privateField;

    public Plane(String name) {
        this.name = name;
    }

    public class Engine extends SuperEngine implements Serializable {

        public double volume;
        static final int k = 10;

        public Engine(double volume) {
            this.volume = volume;
        }

        public void engineMove() {
            System.out.println(basePlaneField);
            basePlaneMethod();
            System.out.println(superEngineField);
            superEngineMethod();
            System.out.println(privateField);
        }

        public int getPerivateField() {
            return privateField;
        }
    }

    public void planeMove() {
        System.out.println(basePlaneField);
        basePlaneMethod();
        new Engine(10.0).superEngineMethod();
    }

    static class NestedClass {

        static void k() {
            System.out.println(privateField);
            System.out.println(new Plane("").name);
        }

        void ns() {

        }
    }
}
