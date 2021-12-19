package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.a.a;
import h.f.b.f;
import h.f.b.l;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class ab implements a, Serializable, Set {
    public static final ab INSTANCE = new ab();
    private static final long serialVersionUID = 3406603774387020532L;

    @Override // java.util.Collection, java.util.Set
    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean add(Void r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.Set
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
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object[] toArray() {
        return f.a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) f.a(this, tArr);
    }

    public final String toString() {
        return "[]";
    }

    private ab() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // java.util.Collection, java.util.Set, java.lang.Iterable
    public final Iterator iterator() {
        return y.f158654a;
    }

    public final int size() {
        return getSize();
    }

    static {
        Covode.recordClassIndex(105039);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return contains((Void) obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        l.d(collection, "");
        return collection.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Set) || !((Set) obj).isEmpty()) {
            return false;
        }
        return true;
    }
}
