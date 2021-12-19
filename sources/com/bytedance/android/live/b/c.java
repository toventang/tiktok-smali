package com.bytedance.android.live.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.i;
import com.google.gson.l;
import h.f.b.f;
import h.f.b.m;
import h.l.g;
import h.l.h;
import h.l.k;
import h.l.p;
import h.l.r;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* access modifiers changed from: package-private */
public final class c implements h.f.b.a.a, List<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final i f7337a;

    static {
        Covode.recordClassIndex(3535);
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<Object> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void sort(Comparator<? super Object> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object[] toArray() {
        return f.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) f.a(this, tArr);
    }

    final class a implements h.f.b.a.a, ListIterator<Object> {

        /* renamed from: b  reason: collision with root package name */
        private int f7339b;

        /* renamed from: c  reason: collision with root package name */
        private int f7340c;

        static {
            Covode.recordClassIndex(3536);
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int nextIndex() {
            return this.f7340c;
        }

        public final boolean hasPrevious() {
            if (this.f7340c > 0) {
                return true;
            }
            return false;
        }

        public final int previousIndex() {
            return this.f7340c - 1;
        }

        public final boolean hasNext() {
            if (this.f7340c < c.this.f7337a.a()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, java.util.ListIterator
        public final Object next() {
            i iVar = c.this.f7337a;
            int i2 = this.f7340c;
            this.f7340c = i2 + 1;
            this.f7339b = i2;
            l a2 = iVar.a(i2);
            if (a2 != null) {
                return n.b(a2);
            }
            return null;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            i iVar = c.this.f7337a;
            int i2 = this.f7340c - 1;
            this.f7340c = i2;
            this.f7339b = i2;
            l a2 = iVar.a(i2);
            if (a2 != null) {
                return n.b(a2);
            }
            return null;
        }

        public /* synthetic */ a(c cVar) {
            this(0);
        }

        public a(int i2) {
            this.f7340c = i2;
            this.f7339b = -1;
        }
    }

    public static final class b implements h.f.b.a.a, Iterator<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f7341a;

        /* renamed from: b  reason: collision with root package name */
        private final Iterator<l> f7342b;

        static {
            Covode.recordClassIndex(3537);
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            return this.f7342b.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            l next = this.f7342b.next();
            if (next != null) {
                return n.b(next);
            }
            return null;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(c cVar) {
            this.f7341a = cVar;
            Iterator<l> it = cVar.f7337a.iterator();
            h.f.b.l.b(it, "");
            this.f7342b = it;
        }
    }

    private static <T> T a() {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new b(this);
    }

    @Override // java.util.List
    public final ListIterator<Object> listIterator() {
        return new a(this);
    }

    public final int size() {
        return this.f7337a.a();
    }

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    static final class d extends m implements h.f.a.b<l, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f7343a = new d();

        static {
            Covode.recordClassIndex(3539);
        }

        d() {
            super(1);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(l lVar) {
            l lVar2 = lVar;
            if (lVar2 != null) {
                return n.b(lVar2);
            }
            return null;
        }
    }

    public c(i iVar) {
        h.f.b.l.d(iVar, "");
        this.f7337a = iVar;
    }

    public final boolean contains(Object obj) {
        return ((Boolean) a()).booleanValue();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        h.f.b.l.d(collection, "");
        return ((Boolean) a()).booleanValue();
    }

    @Override // java.util.List
    public final Object get(int i2) {
        l a2 = this.f7337a.a(i2);
        if (a2 != null) {
            return n.b(a2);
        }
        return null;
    }

    public final int indexOf(Object obj) {
        return ((Number) a()).intValue();
    }

    public final int lastIndexOf(Object obj) {
        return ((Number) a()).intValue();
    }

    @Override // java.util.List
    public final ListIterator<Object> listIterator(int i2) {
        return new a(i2);
    }

    /* renamed from: com.bytedance.android.live.b.c$c  reason: collision with other inner class name */
    static final class C0098c extends m implements h.f.a.m<Integer, l, Boolean> {
        final /* synthetic */ int $fromIndex;
        final /* synthetic */ int $toIndex;

        static {
            Covode.recordClassIndex(3538);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0098c(int i2, int i3) {
            super(2);
            this.$fromIndex = i2;
            this.$toIndex = i3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ Boolean invoke(Integer num, l lVar) {
            boolean z;
            int intValue = num.intValue();
            int i2 = this.$toIndex;
            if (this.$fromIndex <= intValue && i2 > intValue) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Override // java.util.List
    public final List<Object> subList(int i2, int i3) {
        Iterator<l> it = this.f7337a.iterator();
        h.f.b.l.b(it, "");
        h a2 = k.a(it);
        C0098c cVar = new C0098c(i2, i3);
        h.f.b.l.d(a2, "");
        h.f.b.l.d(cVar, "");
        return k.g(k.e(new r(new h.l.d(new g(a2), true, new p.b(cVar)), p.c.f158790a), d.f7343a));
    }
}
