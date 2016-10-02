package cw10;

/**
 * Created by evgeniy on 02/10/16.
 */
public class ChildCat {

    private String name;

    public ChildCat(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ChildCat{" +
                "name='" + name + '\'' +
                '}';
    }
}
