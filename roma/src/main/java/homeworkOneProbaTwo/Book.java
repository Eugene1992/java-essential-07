package homeworkOneProbaTwo;

/**
 * Created by Roma on 11.09.2016.
 */
public class Book {
    private String name;
    private int index;
    private int pages;
    private double price;
    private boolean availebility;

    Book(String name, int index, int pages, double price, boolean availebility) {
        this.name = name;
        if (index > 0 && pages > 0 && price > 0) {
            this.index = index;
            this.pages = pages;
            this.price = price;
        } else {
            throw new Error("value of 'index' or 'pages' or 'price'");
        }
        this.availebility = availebility;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIndex(int index) {
        if (index > 0) {
            this.index = index;
        }
    }

    public int getIndex() {
        return index;
    }

    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setAvailebility(boolean availebility) {
        this.availebility = availebility;
    }

    public boolean getAvailebiliti() {
        return availebility;
    }
}
