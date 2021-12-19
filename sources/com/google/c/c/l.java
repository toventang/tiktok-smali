package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.f;
import com.google.c.a.k;
import com.google.c.a.m;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public final class l {
    static {
        Covode.recordClassIndex(33516);
    }

    static class b<F, T> extends AbstractCollection<T> {

        /* renamed from: a  reason: collision with root package name */
        final Collection<F> f54059a;

        /* renamed from: b  reason: collision with root package name */
        final f<? super F, ? extends T> f54060b;

        static {
            Covode.recordClassIndex(33518);
        }

        public final void clear() {
            this.f54059a.clear();
        }

        public final boolean isEmpty() {
            return this.f54059a.isEmpty();
        }

        public final int size() {
            return this.f54059a.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return an.a(this.f54059a.iterator(), this.f54060b);
        }

        b(Collection<F> collection, f<? super F, ? extends T> fVar) {
            this.f54059a = (Collection) k.a(collection);
            this.f54060b = (f) k.a(fVar);
        }
    }

    static class a<E> extends AbstractCollection<E> {

        /* renamed from: a  reason: collision with root package name */
        final Collection<E> f54057a;

        /* renamed from: b  reason: collision with root package name */
        final com.google.c.a.l<? super E> f54058b;

        static {
            Covode.recordClassIndex(33517);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<E> iterator() {
            return an.a(this.f54057a.iterator(), this.f54058b);
        }

        public final Object[] toArray() {
            return ap.a(iterator()).toArray();
        }

        public final int size() {
            int i2 = 0;
            for (E e2 : this.f54057a) {
                if (this.f54058b.a(e2)) {
                    i2++;
                }
            }
            return i2;
        }

        public final void clear() {
            Collection<E> collection = this.f54057a;
            com.google.c.a.l<? super E> lVar = this.f54058b;
            if (!(collection instanceof RandomAccess) || !(collection instanceof List)) {
                Iterator<T> it = collection.iterator();
                k.a(lVar);
                while (it.hasNext()) {
                    if (lVar.a(it.next())) {
                        it.remove();
                    }
                }
                return;
            }
            am.a((List) collection, (com.google.c.a.l) k.a(lVar));
        }

        public final boolean isEmpty() {
            Collection<E> collection = this.f54057a;
            com.google.c.a.l<? super E> lVar = this.f54058b;
            Iterator<T> it = collection.iterator();
            k.a(lVar, "predicate");
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (lVar.a(it.next())) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(E e2) {
            k.a(this.f54058b.a(e2));
            return this.f54057a.add(e2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                k.a(this.f54058b.a(it.next()));
            }
            return this.f54057a.addAll(collection);
        }

        public final boolean contains(Object obj) {
            if (l.a((Collection<?>) this.f54057a, obj)) {
                return this.f54058b.a(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final boolean remove(Object obj) {
            if (!contains(obj) || !this.f54057a.remove(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) ap.a(iterator()).toArray(tArr);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f54057a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f54058b.a(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f54057a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f54058b.a(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        a(Collection<E> collection, com.google.c.a.l<? super E> lVar) {
            this.f54057a = collection;
            this.f54058b = lVar;
        }
    }

    public static <F, T> Collection<T> a(Collection<F> collection, f<? super F, T> fVar) {
        return new b(collection, fVar);
    }

    static boolean a(Collection<?> collection, Object obj) {
        k.a(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: com.google.c.a.l[] */
    /* JADX WARN: Multi-variable type inference failed */
    public static <E> Collection<E> a(Collection<E> collection, com.google.c.a.l<? super E> lVar) {
        if (!(collection instanceof a)) {
            return new a((Collection) k.a(collection), (com.google.c.a.l) k.a(lVar));
        }
        a aVar = (a) collection;
        return new a(aVar.f54057a, new m.a(Arrays.asList(k.a(aVar.f54058b), k.a(lVar)), (byte) 0));
    }
}
