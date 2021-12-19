package com.bytedance.ugc.ugcwidget;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class UGCSafeList<T> implements Collection<T> {
    private ArrayList<T> copy;
    private final ArrayList<T> list = new ArrayList<>();

    static {
        Covode.recordClassIndex(27964);
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public int size() {
        return this.list.size();
    }

    public Object[] toArray() {
        return this.list.toArray();
    }

    public void clear() {
        this.list.clear();
        this.copy = null;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        ArrayList<T> arrayList = this.copy;
        if (arrayList == null) {
            arrayList = new ArrayList<>(this.list);
            this.copy = arrayList;
        }
        return arrayList.iterator();
    }

    public boolean contains(Object obj) {
        return this.list.contains(obj);
    }

    @Override // java.util.Collection
    public boolean add(T t) {
        boolean add = this.list.add(t);
        this.copy = null;
        return add;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        if (collection == null || !this.list.containsAll(collection)) {
            return false;
        }
        return true;
    }

    public boolean remove(Object obj) {
        boolean remove = this.list.remove(obj);
        this.copy = null;
        return remove;
    }

    @Override // java.util.Collection
    public <T1> T1[] toArray(T1[] t1Arr) {
        return (T1[]) this.list.toArray(t1Arr);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        boolean z;
        if (collection == null || !this.list.addAll(collection)) {
            z = false;
        } else {
            z = true;
        }
        this.copy = null;
        return z;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean z;
        if (collection == null || !this.list.removeAll(collection)) {
            z = false;
        } else {
            z = true;
        }
        this.copy = null;
        return z;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean z;
        if (collection == null || !this.list.retainAll(collection)) {
            z = false;
        } else {
            z = true;
        }
        this.copy = null;
        return z;
    }
}
