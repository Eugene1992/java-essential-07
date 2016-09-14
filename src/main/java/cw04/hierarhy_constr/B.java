package cw04.hierarhy_constr;

public class B extends A {
    static {
        System.out.println("static initialize B ");
    }

    {
        System.out.println("non-static initialize B ");
    }

    protected String b;

    public B(String a, String b) {
        super(a);
        this.b = b;
        System.out.println("constructor B");
    }
}
