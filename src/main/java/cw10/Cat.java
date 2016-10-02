package cw10;

public class Cat implements Cloneable {

    private String name;
    private int age;
    private ChildCat childCat;

    public Cat(String name, int age, ChildCat childCat) {
        this.name = name;
        this.age = age;
        this.childCat = childCat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChildCat getChildCat() {
        return childCat;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
