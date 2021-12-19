package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import com.google.c.c.z;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class x<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[] f54103a = new Object[0];

    /* access modifiers changed from: package-private */
    public abstract boolean a();

    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract br<E> iterator();

    public static abstract class b<E> {
        static {
            Covode.recordClassIndex(33542);
        }

        public abstract b<E> b(E e2);

        b() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.c.c.x$b<E> */
        /* JADX WARN: Multi-variable type inference failed */
        public b<E> a(Iterator<? extends E> it) {
            while (it.hasNext()) {
                b(it.next());
            }
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.c.c.x$b<E> */
        /* JADX WARN: Multi-variable type inference failed */
        public b<E> a(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            return this;
        }

        public b<E> a(E... eArr) {
            for (E e2 : eArr) {
                b(e2);
            }
            return this;
        }

        static int a(int i2, int i3) {
            if (i3 >= 0) {
                int i4 = i2 + (i2 >> 1) + 1;
                if (i4 < i3) {
                    i4 = Integer.highestOneBit(i3 - 1) << 1;
                }
                if (i4 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i4;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    x() {
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    static {
        Covode.recordClassIndex(33540);
    }

    public final Object[] toArray() {
        int size = size();
        if (size == 0) {
            return f54103a;
        }
        Object[] objArr = new Object[size];
        a(objArr, 0);
        return objArr;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new z.d(toArray());
    }

    public z<E> asList() {
        if (isEmpty()) {
            return z.of();
        }
        Object[] array = toArray();
        return z.b(array, array.length);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public static abstract class a<E> extends b<E> {

        /* renamed from: a  reason: collision with root package name */
        Object[] f54104a;

        /* renamed from: b  reason: collision with root package name */
        int f54105b = 0;

        /* renamed from: c  reason: collision with root package name */
        boolean f54106c;

        static {
            Covode.recordClassIndex(33541);
        }

        a(int i2) {
            k.a(i2, "initialCapacity");
            this.f54104a = new Object[i2];
        }

        /* renamed from: a */
        public a<E> b(E e2) {
            k.a(e2);
            a(this.f54105b + 1);
            Object[] objArr = this.f54104a;
            int i2 = this.f54105b;
            this.f54105b = i2 + 1;
            objArr[i2] = e2;
            return this;
        }

        private void a(int i2) {
            Object[] objArr = this.f54104a;
            if (objArr.length < i2) {
                this.f54104a = Arrays.copyOf(objArr, a(objArr.length, i2));
                this.f54106c = false;
            } else if (this.f54106c) {
                this.f54104a = (Object[]) objArr.clone();
                this.f54106c = false;
            }
        }

        @Override // com.google.c.c.x.b
        public b<E> a(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                a(this.f54105b + collection.size());
                if (collection instanceof x) {
                    this.f54105b = ((x) collection).a(this.f54104a, this.f54105b);
                    return this;
                }
            }
            super.a((Iterable) iterable);
            return this;
        }

        @Override // com.google.c.c.x.b
        public b<E> a(E... eArr) {
            ax.a((Object[]) eArr, eArr.length);
            a(this.f54105b + eArr.length);
            System.arraycopy(eArr, 0, this.f54104a, this.f54105b, eArr.length);
            this.f54105b += eArr.length;
            return this;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        k.a(tArr);
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) ba.a(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
        return tArr;
    }

    /* access modifiers changed from: package-private */
    public int a(Object[] objArr, int i2) {
        br<E> it = iterator();
        while (it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
        return i2;
    }
}
