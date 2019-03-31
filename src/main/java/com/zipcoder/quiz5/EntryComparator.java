package com.zipcoder.quiz5;

import java.util.Comparator;

public class EntryComparator implements Comparator<Entry> {
    @Override
    public int compare(Entry o1, Entry o2) {
        return o1.getCount()-o2.getCount();
    }
}
