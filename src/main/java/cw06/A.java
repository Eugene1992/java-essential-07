package cw06;

/**
 * Created by evgeniy on 24/09/16.
 */
public interface A {
    public static final int k = 10;

    public abstract void doSomething();

    default void d() {

    }

    static void s() {

    }
}
