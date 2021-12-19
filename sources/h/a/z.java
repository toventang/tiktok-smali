package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.a.a;
import h.f.b.f;
import h.f.b.l;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

public final class z implements a, Serializable, List, RandomAccess {
    public static final z INSTANCE = new z();
    private static final long serialVersionUID = -7390468764508069838L;

    @Override // java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void add(int i2, Void r4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean add(Void r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Void r2) {
        l.d(r2, "");
        return false;
    }

    public final int getSize() {
        return 0;
    }

    public final int hashCode() {
        return 1;
    }

    public final int indexOf(Void r2) {
        l.d(r2, "");
        return -1;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final int lastIndexOf(Void r2) {
        l.d(r2, "");
        return -1;
    }

    @Override // java.util.List
    public final Void remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Void set(int i2, Void r4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object[] toArray() {
        return f.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) f.a(this, tArr);
    }

    public final String toString() {
        return "[]";
    }

    private z() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return y.f158654a;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return y.f158654a;
    }

    public final int size() {
        return getSize();
    }

    static {
        Covode.recordClassIndex(105090);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return contains((Void) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        l.d(collection, "");
        return collection.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof List) || !((List) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return indexOf((Void) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return lastIndexOf((Void) obj);
    }

    @Override // java.util.List
    public final Void get(int i2) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i2 + '.');
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        if (i2 == 0) {
            return y.f158654a;
        }
        throw new IndexOutOfBoundsException("Index: ".concat(String.valueOf(i2)));
    }

    @Override // java.util.List
    public final List subList(int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3);
    }
}
