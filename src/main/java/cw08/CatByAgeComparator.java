package cw08;

import java.util.Comparator;

public class CatByAgeComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat cat1, Cat cat2) {
        if (cat1.getAge() > cat2.getAge()) {
            return 1;
        }
        if (cat1.getAge() < cat2.getAge()) {
            return -1;
        }
        return 0;
    }
}
