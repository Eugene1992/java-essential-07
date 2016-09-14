package cw04.hierarhy_constr;

public class C extends B {
    static {
        System.out.println("static initialize C ");
    }

    {
        System.out.println("non-static initialize C ");
    }

    protected String c;

    public C(String a, String b, String c) {
        super(a, b);
        this.c = c;
        System.out.println("constructor C");
    }

    public static void main(String[] args) {
        C c = new C("A", "B", "C");
    }
}
