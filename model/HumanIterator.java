package model;

import java.util.Iterator;
import java.util.List;

public class HumanIterator<T extends HumanItem> implements Iterator<T> {
    private List<T> familyList;
    private int index;

    public HumanIterator(List<T> familyList) {
        this.familyList = familyList;
    }

    @Override
    public boolean hasNext() {
        return index < familyList.size();
    }

    @Override
    public T next() {
        return familyList.get(index++);
    }
}
