package cw10.generics;

import java.util.List;

public interface GenericDAO<T> {

    T get(int id);

    List<T> getAll();

    void create(T t);

    void delete(int id);

    void update(T t);
}
