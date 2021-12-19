package h.a;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.f;
import h.f.b.l;
import h.f.b.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Predicate;

public abstract class a<E> implements h.f.b.a.a, Collection<E> {
    static {
        Covode.recordClassIndex(105036);
    }

    public abstract int a();

    @Override // java.util.Collection
    public boolean add(E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return a();
    }

    public Object[] toArray() {
        return f.a(this);
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return n.a(this, ", ", "[", "]", 0, (CharSequence) null, new C4180a(this), 24);
    }

    /* renamed from: h.a.a$a  reason: collision with other inner class name */
    static final class C4180a extends m implements b<E, CharSequence> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(105037);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4180a(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(Object obj) {
            if (obj == this.this$0) {
                return "(this Collection)";
            }
            return String.valueOf(obj);
        }
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        l.d(tArr, "");
        T[] tArr2 = (T[]) f.a(this, tArr);
        Objects.requireNonNull(tArr2, "null cannot be cast to non-null type kotlin.Array<T>");
        return tArr2;
    }

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (E e2 : this) {
            if (l.a((Object) e2, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
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
}
