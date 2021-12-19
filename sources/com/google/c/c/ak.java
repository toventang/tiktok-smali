package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import com.google.c.c.ai;
import com.google.c.c.x;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

public abstract class ak<E> extends al<E> implements bm<E>, NavigableSet<E> {

    /* renamed from: a  reason: collision with root package name */
    transient ak<E> f53908a;
    public final transient Comparator<? super E> comparator;

    static {
        Covode.recordClassIndex(33394);
    }

    /* access modifiers changed from: package-private */
    public abstract ak<E> a(E e2, boolean z);

    /* access modifiers changed from: package-private */
    public abstract ak<E> a(E e2, boolean z, E e3, boolean z2);

    /* access modifiers changed from: package-private */
    public abstract ak<E> b();

    /* access modifiers changed from: package-private */
    public abstract ak<E> b(E e2, boolean z);

    @Override // java.util.NavigableSet
    public abstract br<E> descendingIterator();

    @Override // com.google.c.c.ai, com.google.c.c.ai, java.util.AbstractCollection, java.util.Collection, java.util.Set, java.util.NavigableSet, com.google.c.c.x, com.google.c.c.x, java.lang.Iterable
    public abstract br<E> iterator();

    public static <E> ak<E> of() {
        return bf.f54002b;
    }

    @Override // java.util.SortedSet, com.google.c.c.bm
    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    public static <E extends Comparable<?>> a<E> naturalOrder() {
        return new a<>(aw.f53956a);
    }

    @Override // java.util.NavigableSet
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    public static <E extends Comparable<?>> a<E> reverseOrder() {
        return new a<>(Collections.reverseOrder());
    }

    @Override // java.util.NavigableSet
    public ak<E> descendingSet() {
        ak<E> akVar = this.f53908a;
        if (akVar != null) {
            return akVar;
        }
        ak<E> b2 = b();
        this.f53908a = b2;
        b2.f53908a = this;
        return b2;
    }

    @Override // java.util.SortedSet
    public E first() {
        return iterator().next();
    }

    @Override // java.util.SortedSet
    public E last() {
        return descendingIterator().next();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.ai, com.google.c.c.x
    public Object writeReplace() {
        return new b(this.comparator, toArray());
    }

    public static final class a<E> extends ai.a<E> {

        /* renamed from: e  reason: collision with root package name */
        private final Comparator<? super E> f53909e;

        static {
            Covode.recordClassIndex(33395);
        }

        /* renamed from: b */
        public final ak<E> a() {
            ak<E> a2 = ak.a(this.f53909e, this.f54105b, this.f54104a);
            this.f54105b = a2.size();
            this.f54106c = true;
            return a2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.c.c.ai.a, com.google.c.c.x.a
        public final /* synthetic */ x.a a(Object obj) {
            super.b(obj);
            return this;
        }

        @Override // com.google.c.c.ai.a
        public final /* bridge */ /* synthetic */ ai.a b(Iterable iterable) {
            super.a(iterable);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.c.c.ai.a
        public final /* bridge */ /* synthetic */ ai.a c(Object obj) {
            super.b(obj);
            return this;
        }

        @Override // com.google.c.c.ai.a
        public final /* bridge */ /* synthetic */ ai.a b(Iterator it) {
            super.a(it);
            return this;
        }

        public final a<E> c(Iterator<? extends E> it) {
            super.a((Iterator) it);
            return this;
        }

        public a(Comparator<? super E> comparator) {
            this.f53909e = (Comparator) k.a(comparator);
        }

        @Override // com.google.c.c.ai.a, com.google.c.c.x.a, com.google.c.c.x.b
        public final /* synthetic */ x.b a(Iterable iterable) {
            super.a(iterable);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.c.c.ai.a
        public final /* bridge */ /* synthetic */ ai.a b(Object[] objArr) {
            super.a(objArr);
            return this;
        }

        public final a<E> c(E... eArr) {
            super.a((Object[]) eArr);
            return this;
        }

        @Override // com.google.c.c.ai.a, com.google.c.c.x.b
        public final /* synthetic */ x.b a(Iterator it) {
            super.a(it);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.c.c.ai.a, com.google.c.c.x.a, com.google.c.c.x.b
        public final /* synthetic */ x.b a(Object[] objArr) {
            super.a(objArr);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.c.c.ai.a, com.google.c.c.x.a, com.google.c.c.x.b
        public final /* synthetic */ x.b b(Object obj) {
            super.b(obj);
            return this;
        }
    }

    static class b<E> implements Serializable {
        private static final long serialVersionUID = 0;
        final Comparator<? super E> comparator;
        final Object[] elements;

        static {
            Covode.recordClassIndex(33396);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.c.c.ak$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return new a(this.comparator).c(this.elements).a();
        }

        public b(Comparator<? super E> comparator2, Object[] objArr) {
            this.comparator = comparator2;
            this.elements = objArr;
        }
    }

    ak(Comparator<? super E> comparator2) {
        this.comparator = comparator2;
    }

    public static <E> ak<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(aw.f53956a, iterable);
    }

    public static <E> a<E> orderedBy(Comparator<E> comparator2) {
        return new a<>(comparator2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.SortedSet, java.util.NavigableSet
    public ak<E> headSet(E e2) {
        return headSet((Object) e2, false);
    }

    @Override // java.util.SortedSet, java.util.NavigableSet
    public ak<E> tailSet(E e2) {
        return tailSet((Object) e2, true);
    }

    public static <E> ak<E> copyOf(Collection<? extends E> collection) {
        return copyOf((Comparator) aw.f53956a, (Collection) collection);
    }

    public static <E extends Comparable<? super E>> ak<E> of(E e2) {
        return new bf(z.of(e2), aw.f53956a);
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e2) {
        return (E) am.c(tailSet((Object) e2, true));
    }

    @Override // java.util.NavigableSet
    public E floor(E e2) {
        return (E) an.a(headSet((Object) e2, true).descendingIterator());
    }

    @Override // java.util.NavigableSet
    public E higher(E e2) {
        return (E) am.c(tailSet((Object) e2, false));
    }

    @Override // java.util.NavigableSet
    public E lower(E e2) {
        return (E) an.a(headSet((Object) e2, false).descendingIterator());
    }

    static <E> bf<E> a(Comparator<? super E> comparator2) {
        return aw.f53956a.equals(comparator2) ? (bf<E>) bf.f54002b : new bf<>(z.of(), comparator2);
    }

    public static <E> ak<E> copyOfSorted(SortedSet<E> sortedSet) {
        Comparator a2 = bn.a(sortedSet);
        z copyOf = z.copyOf((Collection) sortedSet);
        if (copyOf.isEmpty()) {
            return a(a2);
        }
        return new bf(copyOf, a2);
    }

    public static <E> ak<E> copyOf(Iterator<? extends E> it) {
        return copyOf(aw.f53956a, it);
    }

    public static <E extends Comparable<? super E>> ak<E> copyOf(E[] eArr) {
        return a(aw.f53956a, eArr.length, (Object[]) eArr.clone());
    }

    /* access modifiers changed from: package-private */
    public final int a(Object obj, Object obj2) {
        return this.comparator.compare(obj, obj2);
    }

    @Override // java.util.SortedSet, java.util.NavigableSet
    public ak<E> subSet(E e2, E e3) {
        return subSet((Object) e2, true, (Object) e3, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.c.c.ak<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public ak<E> headSet(E e2, boolean z) {
        return a(k.a(e2), z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.c.c.ak<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public ak<E> tailSet(E e2, boolean z) {
        return b(k.a(e2), z);
    }

    public static <E> ak<E> copyOf(Comparator<? super E> comparator2, Collection<? extends E> collection) {
        return copyOf((Comparator) comparator2, (Iterable) collection);
    }

    public static <E extends Comparable<? super E>> ak<E> of(E e2, E e3) {
        return a(aw.f53956a, 2, e2, e3);
    }

    public static <E> ak<E> copyOf(Comparator<? super E> comparator2, Iterable<? extends E> iterable) {
        k.a(comparator2);
        if (bn.a(comparator2, iterable) && (iterable instanceof ak)) {
            ak<E> akVar = (ak) iterable;
            if (!akVar.a()) {
                return akVar;
            }
        }
        Object[] a2 = am.a(iterable);
        return a(comparator2, a2.length, a2);
    }

    public static <E> ak<E> copyOf(Comparator<? super E> comparator2, Iterator<? extends E> it) {
        return new a(comparator2).c((Iterator) it).a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    static <E> ak<E> a(Comparator<? super E> comparator2, int i2, E... eArr) {
        if (i2 == 0) {
            return a(comparator2);
        }
        ax.a((Object[]) eArr, i2);
        Arrays.sort(eArr, 0, i2, comparator2);
        int i3 = 1;
        for (int i4 = 1; i4 < i2; i4++) {
            Object obj = (Object) eArr[i4];
            if (comparator2.compare(obj, (Object) eArr[i3 - 1]) != 0) {
                eArr[i3] = obj;
                i3++;
            }
        }
        Arrays.fill(eArr, i3, i2, (Object) null);
        int length = eArr.length / 2;
        E[] eArr2 = eArr;
        if (i3 < length) {
            eArr2 = (E[]) Arrays.copyOf(eArr, i3);
        }
        return new bf(z.b(eArr2, i3), comparator2);
    }

    public static <E extends Comparable<? super E>> ak<E> of(E e2, E e3, E e4) {
        return a(aw.f53956a, 3, e2, e3, e4);
    }

    @Override // java.util.NavigableSet
    public ak<E> subSet(E e2, boolean z, E e3, boolean z2) {
        boolean z3;
        k.a(e2);
        k.a(e3);
        if (this.comparator.compare(e2, e3) <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        k.a(z3);
        return a(e2, z, e3, z2);
    }

    public static <E extends Comparable<? super E>> ak<E> of(E e2, E e3, E e4, E e5) {
        return a(aw.f53956a, 4, e2, e3, e4, e5);
    }

    public static <E extends Comparable<? super E>> ak<E> of(E e2, E e3, E e4, E e5, E e6) {
        return a(aw.f53956a, 5, e2, e3, e4, e5, e6);
    }

    public static <E extends Comparable<? super E>> ak<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E... eArr) {
        int length = eArr.length + 6;
        Comparable[] comparableArr = new Comparable[length];
        comparableArr[0] = e2;
        comparableArr[1] = e3;
        comparableArr[2] = e4;
        comparableArr[3] = e5;
        comparableArr[4] = e6;
        comparableArr[5] = e7;
        System.arraycopy(eArr, 0, comparableArr, 6, eArr.length);
        return a(aw.f53956a, length, comparableArr);
    }
}
