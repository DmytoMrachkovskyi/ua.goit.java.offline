package ua.goit.java.simple.collection;

import java.util.Collection;

/**
 * Created by dmrachkovskyi on 6/3/2016.
 */
public interface SimpleList {

    void add(Object element);

    Object get(int index);

    void set(int index, Object element);

    int remove(Object element);

    void addAll(Collection source);

    int size();

    boolean contains(Object element);

    boolean isEmpty();

}
