package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public final class bf<E> extends ak<E> {

    /* renamed from: b  reason: collision with root package name */
    static final bf<Comparable> f54002b = new bf<>(z.of(), aw.f53956a);

    /* renamed from: c  reason: collision with root package name */
    final transient z<E> f54003c;

    @Override // com.google.c.c.ai, com.google.c.c.x
    public final z<E> asList() {
        return this.f54003c;
    }

    @Override // com.google.c.c.ai, com.google.c.c.ai, java.util.Collection, java.util.Set, java.util.NavigableSet, com.google.c.c.ak, com.google.c.c.ak, java.lang.Iterable, java.util.AbstractCollection, com.google.c.c.x, com.google.c.c.x
    public final br<E> iterator() {
        return this.f54003c.iterator();
    }

    public final int size() {
        return this.f54003c.size();
    }

    @Override // java.util.NavigableSet, com.google.c.c.ak, com.google.c.c.ak
    public final br<E> descendingIterator() {
        return this.f54003c.reverse().iterator();
    }

    static {
        Covode.recordClassIndex(33469);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.ak
    public final ak<E> b() {
        Comparator reverseOrder = Collections.reverseOrder(this.comparator);
        if (isEmpty()) {
            return a(reverseOrder);
        }
        return new bf(this.f54003c.reverse(), reverseOrder);
    }

    @Override // java.util.SortedSet, com.google.c.c.ak
    public final E first() {
        if (!isEmpty()) {
            return this.f54003c.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet, com.google.c.c.ak
    public final E last() {
        if (!isEmpty()) {
            return this.f54003c.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.x
    public final boolean a() {
        return this.f54003c.a();
    }

    @Override // com.google.c.c.x
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f54003c, obj, this.comparator) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.NavigableSet, com.google.c.c.ak
    public final E ceiling(E e2) {
        int d2 = d(e2, true);
        if (d2 == size()) {
            return null;
        }
        return this.f54003c.get(d2);
    }

    @Override // java.util.NavigableSet, com.google.c.c.ak
    public final E floor(E e2) {
        int c2 = c(e2, true) - 1;
        if (c2 == -1) {
            return null;
        }
        return this.f54003c.get(c2);
    }

    @Override // java.util.NavigableSet, com.google.c.c.ak
    public final E higher(E e2) {
        int d2 = d(e2, false);
        if (d2 == size()) {
            return null;
        }
        return this.f54003c.get(d2);
    }

    @Override // java.util.NavigableSet, com.google.c.c.ak
    public final E lower(E e2) {
        int c2 = c(e2, false) - 1;
        if (c2 == -1) {
            return null;
        }
        return this.f54003c.get(c2);
    }

    @Override // java.util.Collection, java.util.Set, java.util.AbstractCollection
    public final boolean containsAll(Collection<?> collection) {
        if (collection instanceof au) {
            collection = ((au) collection).elementSet();
        }
        if (!bn.a(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        br<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int a2 = a(next2, next);
                if (a2 >= 0) {
                    if (a2 != 0) {
                        break;
                    } else if (!it2.hasNext()) {
                        return true;
                    } else {
                        next = it2.next();
                    }
                } else if (!it.hasNext()) {
                    return false;
                } else {
                    next2 = it.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034 A[Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }] */
    @Override // com.google.c.c.ai
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r5 = 1
            if (r7 != r6) goto L_0x0004
            return r5
        L_0x0004:
            boolean r0 = r7 instanceof java.util.Set
            r4 = 0
            if (r0 != 0) goto L_0x000a
            return r4
        L_0x000a:
            java.util.Set r7 = (java.util.Set) r7
            int r1 = r6.size()
            int r0 = r7.size()
            if (r1 == r0) goto L_0x0017
            return r4
        L_0x0017:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x001e
            return r5
        L_0x001e:
            java.util.Comparator r0 = r6.comparator
            boolean r0 = com.google.c.c.bn.a(r0, r7)
            if (r0 == 0) goto L_0x0047
            java.util.Iterator r3 = r7.iterator()
            com.google.c.c.br r2 = r6.iterator()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
        L_0x002e:
            boolean r0 = r2.hasNext()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r0 == 0) goto L_0x0045
            java.lang.Object r1 = r2.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            java.lang.Object r0 = r3.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r0 == 0) goto L_0x0044
            int r0 = r6.a(r1, r0)     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r0 == 0) goto L_0x002e
        L_0x0044:
            return r4
        L_0x0045:
            return r5
        L_0x0046:
            return r4
        L_0x0047:
            boolean r0 = r6.containsAll(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c.c.bf.equals(java.lang.Object):boolean");
    }

    bf(z<E> zVar, Comparator<? super E> comparator) {
        super(comparator);
        this.f54003c = zVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.x
    public final int a(Object[] objArr, int i2) {
        return this.f54003c.a(objArr, i2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.ak
    public final ak<E> a(E e2, boolean z) {
        return a(0, c(e2, z));
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.ak
    public final ak<E> b(E e2, boolean z) {
        return a(d(e2, z), size());
    }

    private bf<E> a(int i2, int i3) {
        if (i2 == 0 && i3 == size()) {
            return this;
        }
        if (i2 < i3) {
            return new bf<>(this.f54003c.subList(i2, i3), this.comparator);
        }
        return a(this.comparator);
    }

    private int c(E e2, boolean z) {
        int binarySearch = Collections.binarySearch(this.f54003c, k.a(e2), comparator());
        if (binarySearch < 0) {
            return binarySearch ^ -1;
        }
        if (z) {
            return binarySearch + 1;
        }
        return binarySearch;
    }

    private int d(E e2, boolean z) {
        int binarySearch = Collections.binarySearch(this.f54003c, k.a(e2), comparator());
        if (binarySearch < 0) {
            return binarySearch ^ -1;
        }
        if (z) {
            return binarySearch;
        }
        return binarySearch + 1;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.ak
    public final ak<E> a(E e2, boolean z, E e3, boolean z2) {
        return b(e2, z).a(e3, z2);
    }
}
