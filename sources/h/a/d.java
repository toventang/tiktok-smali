package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

public abstract class d<E> extends a<E> implements List<E> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f158636a = new a((byte) 0);

    static {
        Covode.recordClassIndex(105057);
    }

    @Override // java.util.List
    public void add(int i2, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public abstract E get(int i2);

    @Override // java.util.List
    public E remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<E> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i2, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void sort(Comparator<? super E> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(105058);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(int i2, int i3) {
            if (i2 < 0 || i2 >= i3) {
                throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
            }
        }

        public static void b(int i2, int i3) {
            if (i2 < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
            }
        }
    }

    class c extends d<E>.b implements ListIterator<E> {
        static {
            Covode.recordClassIndex(105060);
        }

        @Override // java.util.ListIterator
        public final void add(E e2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(E e2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int nextIndex() {
            return this.f158637a;
        }

        public final boolean hasPrevious() {
            if (this.f158637a > 0) {
                return true;
            }
            return false;
        }

        public final int previousIndex() {
            return this.f158637a - 1;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (hasPrevious()) {
                this.f158637a--;
                return (E) d.this.get(this.f158637a);
            }
            throw new NoSuchElementException();
        }

        public c(int i2) {
            super();
            a.b(i2, d.this.size());
            this.f158637a = i2;
        }
    }

    /* renamed from: h.a.d$d  reason: collision with other inner class name */
    static final class C4181d<E> extends d<E> implements RandomAccess {

        /* renamed from: b  reason: collision with root package name */
        private int f158640b;

        /* renamed from: c  reason: collision with root package name */
        private final d<E> f158641c;

        /* renamed from: d  reason: collision with root package name */
        private final int f158642d;

        static {
            Covode.recordClassIndex(105061);
        }

        @Override // h.a.a
        public final int a() {
            return this.f158640b;
        }

        @Override // java.util.List, h.a.d
        public final E get(int i2) {
            a.a(i2, this.f158640b);
            return this.f158641c.get(this.f158642d + i2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.a.d<? extends E> */
        /* JADX WARN: Multi-variable type inference failed */
        public C4181d(d<? extends E> dVar, int i2, int i3) {
            l.d(dVar, "");
            this.f158641c = dVar;
            this.f158642d = i2;
            int size = dVar.size();
            if (i2 < 0 || i3 > size) {
                throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + size);
            } else if (i2 <= i3) {
                this.f158640b = i3 - i2;
            } else {
                throw new IllegalArgumentException("fromIndex: " + i2 + " > toIndex: " + i3);
            }
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new b();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new c(0);
    }

    /* access modifiers changed from: package-private */
    public class b implements h.f.b.a.a, Iterator<E> {

        /* renamed from: a  reason: collision with root package name */
        public int f158637a;

        static {
            Covode.recordClassIndex(105059);
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasNext() {
            if (this.f158637a < d.this.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                d dVar = d.this;
                int i2 = this.f158637a;
                this.f158637a = i2 + 1;
                return (E) dVar.get(i2);
            }
            throw new NoSuchElementException();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
        }
    }

    public int hashCode() {
        int i2;
        l.d(this, "");
        int i3 = 1;
        for (E e2 : this) {
            int i4 = i3 * 31;
            if (e2 != null) {
                i2 = e2.hashCode();
            } else {
                i2 = 0;
            }
            i3 = i4 + i2;
        }
        return i3;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i2) {
        return new c(i2);
    }

    public int indexOf(Object obj) {
        int i2 = 0;
        for (E e2 : this) {
            if (l.a((Object) e2, obj)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (l.a((Object) listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        l.d(this, "");
        l.d(collection, "");
        if (size() != collection.size()) {
            return false;
        }
        Iterator<E> it = collection.iterator();
        for (E e2 : this) {
            if (!l.a((Object) e2, (Object) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public List<E> subList(int i2, int i3) {
        return new C4181d(this, i2, i3);
    }
}
