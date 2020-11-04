package ru.avalon.java.dev.j10.labs.common;

import ru.avalon.java.dev.j10.labs.Sort;
import java.util.Comparator;
import java.util.Arrays;

public class Sortcl implements Sort {

    public void sort(Object[] array) {
        Arrays.sort(array);
    }

    public void sort(Comparable[] array) {
        Arrays.sort(array);
    }

    public void sort(Object[] array, Comparator comparator) {
        Arrays.sort(array, comparator);
    }
}
