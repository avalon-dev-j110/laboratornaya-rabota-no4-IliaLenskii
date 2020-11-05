package ru.avalon.java.dev.j10.labs.common;

import java.util.Comparator;

public class PersonComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return -(s1.compareTo(s2));
    }
}
