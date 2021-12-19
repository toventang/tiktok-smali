package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.f;
import com.google.c.a.k;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public final class ap {
    static {
        Covode.recordClassIndex(33408);
    }

    /* access modifiers changed from: package-private */
    public static class b<T> extends AbstractList<T> {

        /* renamed from: a  reason: collision with root package name */
        public final List<T> f53924a;

        static {
            Covode.recordClassIndex(33410);
        }

        public void clear() {
            this.f53924a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
        public Iterator<T> iterator() {
            return listIterator();
        }

        public int size() {
            return this.f53924a.size();
        }

        b(List<T> list) {
            this.f53924a = (List) k.a(list);
        }

        private int b(int i2) {
            int size = size();
            k.a(i2, size);
            return (size - 1) - i2;
        }

        public final int a(int i2) {
            int size = size();
            k.b(i2, size);
            return size - i2;
        }

        @Override // java.util.List, java.util.AbstractList
        public T get(int i2) {
            return this.f53924a.get(b(i2));
        }

        @Override // java.util.List, java.util.AbstractList
        public ListIterator<T> listIterator(int i2) {
            final ListIterator<T> listIterator = this.f53924a.listIterator(a(i2));
            return new ListIterator<T>() {
                /* class com.google.c.c.ap.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                boolean f53925a;

                static {
                    Covode.recordClassIndex(33411);
                }

                public final boolean hasNext() {
                    return listIterator.hasPrevious();
                }

                public final boolean hasPrevious() {
                    return listIterator.hasNext();
                }

                public final int previousIndex() {
                    return nextIndex() - 1;
                }

                public final int nextIndex() {
                    return b.this.a(listIterator.nextIndex());
                }

                public final void remove() {
                    k.b(this.f53925a, "no calls to next() since the last call to remove()");
                    listIterator.remove();
                    this.f53925a = false;
                }

                @Override // java.util.Iterator, java.util.ListIterator
                public final T next() {
                    if (hasNext()) {
                        this.f53925a = true;
                        return (T) listIterator.previous();
                    }
                    throw new NoSuchElementException();
                }

                @Override // java.util.ListIterator
                public final T previous() {
                    if (hasPrevious()) {
                        this.f53925a = true;
                        return (T) listIterator.next();
                    }
                    throw new NoSuchElementException();
                }

                @Override // java.util.ListIterator
                public final void add(T t) {
                    listIterator.add(t);
                    listIterator.previous();
                    this.f53925a = false;
                }

                @Override // java.util.ListIterator
                public final void set(T t) {
                    k.b(this.f53925a);
                    listIterator.set(t);
                }
            };
        }

        @Override // java.util.List, java.util.AbstractList
        public T remove(int i2) {
            return this.f53924a.remove(b(i2));
        }

        /* access modifiers changed from: protected */
        public void removeRange(int i2, int i3) {
            subList(i2, i3).clear();
        }

        @Override // java.util.List, java.util.AbstractList
        public void add(int i2, T t) {
            this.f53924a.add(a(i2), t);
        }

        @Override // java.util.List, java.util.AbstractList
        public T set(int i2, T t) {
            return this.f53924a.set(b(i2), t);
        }

        @Override // java.util.List, java.util.AbstractList
        public List<T> subList(int i2, int i3) {
            k.a(i2, i3, size());
            return ap.a((List) this.f53924a.subList(a(i3), a(i2)));
        }
    }

    static class c<F, T> extends AbstractList<T> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final f<? super F, ? extends T> function;

        static {
            Covode.recordClassIndex(33412);
        }

        public final void clear() {
            this.fromList.clear();
        }

        public final boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
        public final Iterator<T> iterator() {
            return listIterator();
        }

        public final int size() {
            return this.fromList.size();
        }

        @Override // java.util.List, java.util.AbstractList
        public final T get(int i2) {
            return (T) this.function.a(this.fromList.get(i2));
        }

        @Override // java.util.List, java.util.AbstractList
        public final ListIterator<T> listIterator(int i2) {
            return new bp<F, T>(this.fromList.listIterator(i2)) {
                /* class com.google.c.c.ap.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(33413);
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.c.c.bo
                public final T a(F f2) {
                    return (T) c.this.function.a(f2);
                }
            };
        }

        @Override // java.util.List, java.util.AbstractList
        public final T remove(int i2) {
            return (T) this.function.a(this.fromList.remove(i2));
        }

        c(List<F> list, f<? super F, ? extends T> fVar) {
            this.fromList = (List) k.a(list);
            this.function = (f) k.a(fVar);
        }
    }

    static class d<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final f<? super F, ? extends T> function;

        static {
            Covode.recordClassIndex(33414);
        }

        public final void clear() {
            this.fromList.clear();
        }

        public final int size() {
            return this.fromList.size();
        }

        @Override // java.util.List, java.util.AbstractList, java.util.AbstractSequentialList
        public final ListIterator<T> listIterator(int i2) {
            return new bp<F, T>(this.fromList.listIterator(i2)) {
                /* class com.google.c.c.ap.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(33415);
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.c.c.bo
                public final T a(F f2) {
                    return (T) d.this.function.a(f2);
                }
            };
        }

        d(List<F> list, f<? super F, ? extends T> fVar) {
            this.fromList = (List) k.a(list);
            this.function = (f) k.a(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static class a<T> extends b<T> implements RandomAccess {
        static {
            Covode.recordClassIndex(33409);
        }

        a(List<T> list) {
            super(list);
        }
    }

    public static <E> ArrayList<E> a(Iterator<? extends E> it) {
        ArrayList<E> arrayList = new ArrayList<>();
        an.a(arrayList, it);
        return arrayList;
    }

    public static <E> ArrayList<E> a(Iterable<? extends E> iterable) {
        k.a(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList<>((Collection) iterable);
        }
        return a(iterable.iterator());
    }

    public static <E> ArrayList<E> a(E... eArr) {
        k.a(eArr);
        int length = eArr.length;
        k.a(length, "arraySize");
        ArrayList<E> arrayList = new ArrayList<>(com.google.c.f.a.a(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static <T> List<T> a(List<T> list) {
        if (list instanceof z) {
            return ((z) list).reverse();
        }
        if (list instanceof b) {
            return ((b) list).f53924a;
        }
        if (list instanceof RandomAccess) {
            return new a(list);
        }
        return new b(list);
    }

    public static <F, T> List<T> a(List<F> list, f<? super F, ? extends T> fVar) {
        if (list instanceof RandomAccess) {
            return new c(list, fVar);
        }
        return new d(list, fVar);
    }
}
