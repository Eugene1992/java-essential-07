package homeworkOneProbaTwo;

/**
 * Created by Roma on 11.09.2016.
 */
public class BookMain {
    public static void main(String[] args) {
        Book bookOne = new Book("Філософія Java", 9100, 517, 55.75, true);
        Book bookTwo = new Book("Java для бабушек", 9101, 620, 66.75, false);
        Book bookThree = new Book("кобзар", 9102, 220, 101.25, true);
        Book bookFour = new Book("Зверобой", 9106, 490, 20.90, false);
        Book bookFive = new Book("Dog mymy", 9111, 945, 69.49, true);
        Book[] bookMas = new Book[]{
                bookOne,
                bookTwo,
                bookThree,
                bookFour,
                bookFive,
        };
        System.out.println(bookOne.getName());
        System.out.println(bookOne.getIndex());
    }

    public static void sortStruct(Book[] bookMas) {
        Book pricemax = bookMas[0];
        for (Book bookMa : bookMas) {
            if (bookMa.getPrice() > pricemax.getPrice()) {
                pricemax = bookMa;
            }
        }
    }
}
