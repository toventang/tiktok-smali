package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import com.google.c.c.au;
import com.google.c.c.av;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class h<E> extends AbstractCollection<E> implements au<E> {

    /* renamed from: a  reason: collision with root package name */
    private transient Set<E> f54052a;

    /* renamed from: b  reason: collision with root package name */
    private transient Set<au.a<E>> f54053b;

    static {
        Covode.recordClassIndex(33510);
    }

    /* access modifiers changed from: package-private */
    public abstract Iterator<E> a();

    /* access modifiers changed from: package-private */
    public abstract Iterator<au.a<E>> b();

    /* access modifiers changed from: package-private */
    public abstract int c();

    public abstract void clear();

    class a extends av.b<E> {
        static {
            Covode.recordClassIndex(33511);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.av.b
        public final au<E> a() {
            return h.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<E> iterator() {
            return h.this.a();
        }

        a() {
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends av.c<E> {
        static {
            Covode.recordClassIndex(33512);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.av.c
        public final au<E> a() {
            return h.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<au.a<E>> iterator() {
            return h.this.b();
        }

        public final int size() {
            return h.this.c();
        }

        b() {
        }
    }

    h() {
    }

    @Override // com.google.c.c.au
    public Set<E> elementSet() {
        Set<E> set = this.f54052a;
        if (set != null) {
            return set;
        }
        a aVar = new a();
        this.f54052a = aVar;
        return aVar;
    }

    @Override // com.google.c.c.au
    public Set<au.a<E>> entrySet() {
        Set<au.a<E>> set = this.f54053b;
        if (set != null) {
            return set;
        }
        b bVar = new b();
        this.f54053b = bVar;
        return bVar;
    }

    public final int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    public final String toString() {
        return entrySet().toString();
    }

    public final boolean equals(Object obj) {
        return av.a(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e2) {
        add(e2, 1);
        return true;
    }

    @Override // com.google.c.c.au
    public boolean contains(Object obj) {
        if (count(obj) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.c.c.au
    public final boolean remove(Object obj) {
        if (remove(obj, 1) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        if (collection instanceof au) {
            collection = ((au) collection).elementSet();
        }
        return elementSet().removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        k.a(collection);
        if (collection instanceof au) {
            collection = ((au) collection).elementSet();
        }
        return elementSet().retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        k.a(this);
        k.a(collection);
        if (collection instanceof au) {
            au auVar = (au) collection;
            if (auVar instanceof e) {
                e eVar = (e) auVar;
                if (eVar.isEmpty()) {
                    return false;
                }
                k.a(this);
                for (int a2 = eVar.f54042a.a(); a2 >= 0; a2 = eVar.f54042a.a(a2)) {
                    add(eVar.f54042a.b(a2), eVar.f54042a.c(a2));
                }
                return true;
            } else if (auVar.isEmpty()) {
                return false;
            } else {
                for (au.a<E> aVar : auVar.entrySet()) {
                    add(aVar.a(), aVar.b());
                }
                return true;
            }
        } else if (collection.isEmpty()) {
            return false;
        } else {
            return an.a(this, collection.iterator());
        }
    }

    @Override // com.google.c.c.au
    public int add(E e2, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.c.c.au
    public int remove(Object obj, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.c.c.au
    public int setCount(E e2, int i2) {
        k.a(i2, "count");
        int count = count(e2);
        int i3 = i2 - count;
        if (i3 > 0) {
            add(e2, i3);
        } else if (i3 < 0) {
            remove(e2, -i3);
        }
        return count;
    }

    @Override // com.google.c.c.au
    public boolean setCount(E e2, int i2, int i3) {
        k.a(i2, "oldCount");
        k.a(i3, "newCount");
        if (count(e2) != i2) {
            return false;
        }
        setCount(e2, i3);
        return true;
    }
}
