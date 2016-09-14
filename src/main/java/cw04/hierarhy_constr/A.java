package cw04.hierarhy_constr;

public class A {
    static {
        System.out.println("static initialize A ");
    }

    {
        System.out.println("non-static initialize A ");
    }

    protected String a;

    public A(String a) {
        this.a = a;
        System.out.println("constructor A");
    }
}
