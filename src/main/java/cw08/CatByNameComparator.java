package cw08;

import java.util.Comparator;

/**
 * Created by evgeniy on 26/09/16.
 */
public class CatByNameComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat1.getName().compareTo(cat2.getName());
    }
}
