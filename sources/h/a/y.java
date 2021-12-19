package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.a.a;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class y implements a, ListIterator {

    /* renamed from: a  reason: collision with root package name */
    public static final y f158654a = new y();

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        return false;
    }

    public final boolean hasPrevious() {
        return false;
    }

    public final int nextIndex() {
        return 0;
    }

    public final int previousIndex() {
        return -1;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private y() {
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final /* synthetic */ Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ Object previous() {
        throw new NoSuchElementException();
    }

    static {
        Covode.recordClassIndex(105089);
    }
}
