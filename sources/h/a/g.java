package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.a.a;
import h.f.b.b;
import h.f.b.f;
import h.f.b.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

final class g<T> implements a, Collection<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T[] f158643a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f158644b;

    static {
        Covode.recordClassIndex(105064);
    }

    @Override // java.util.Collection
    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super T> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) f.a(this, tArr);
    }

    public final /* bridge */ int size() {
        return this.f158643a.length;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return b.a(this.f158643a);
    }

    public final boolean isEmpty() {
        if (this.f158643a.length == 0) {
            return true;
        }
        return false;
    }

    public final Object[] toArray() {
        T[] tArr = this.f158643a;
        boolean z = this.f158644b;
        l.d(tArr, "");
        if (z && l.a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        l.b(copyOf, "");
        return copyOf;
    }

    public final boolean contains(Object obj) {
        return i.a(this.f158643a, obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        l.d(collection, "");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public g(T[] tArr, boolean z) {
        l.d(tArr, "");
        this.f158643a = tArr;
        this.f158644b = z;
    }
}
