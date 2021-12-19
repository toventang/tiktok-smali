package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import com.google.c.c.ai;
import com.google.c.c.au;
import com.google.c.c.x;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

public abstract class ag<E> extends ah<E> implements au<E> {

    /* renamed from: a  reason: collision with root package name */
    private transient z<E> f53891a;

    /* renamed from: b  reason: collision with root package name */
    private transient ai<au.a<E>> f53892b;

    static {
        Covode.recordClassIndex(33379);
    }

    /* access modifiers changed from: package-private */
    public abstract au.a<E> a(int i2);

    @Override // com.google.c.c.au
    public abstract ai<E> elementSet();

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.x
    public abstract Object writeReplace();

    ag() {
    }

    public static <E> ag<E> of() {
        return bd.f53992a;
    }

    public static class a<E> extends x.b<E> {

        /* renamed from: a  reason: collision with root package name */
        ay<E> f53897a;

        /* renamed from: b  reason: collision with root package name */
        boolean f53898b;

        /* renamed from: c  reason: collision with root package name */
        boolean f53899c;

        static {
            Covode.recordClassIndex(33381);
        }

        public a() {
            this(4);
        }

        public final ag<E> a() {
            if (this.f53897a.f53959c == 0) {
                return ag.of();
            }
            if (this.f53899c) {
                this.f53897a = new ay<>(this.f53897a);
                this.f53899c = false;
            }
            this.f53898b = true;
            return new bd(this.f53897a);
        }

        @Override // com.google.c.c.x.b
        public final /* bridge */ /* synthetic */ x.b a(Iterator it) {
            super.a(it);
            return this;
        }

        public final a<E> b(Iterator<? extends E> it) {
            super.a(it);
            return this;
        }

        public final a<E> b(E... eArr) {
            super.a(eArr);
            return this;
        }

        a(int i2) {
            this.f53897a = new ay<>(i2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.c.c.x.b
        public final /* bridge */ /* synthetic */ x.b a(Object[] objArr) {
            super.a(objArr);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.c.c.x.b
        public final /* synthetic */ x.b b(Object obj) {
            return a(obj, 1);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x005f A[LOOP:1: B:13:0x0059->B:15:0x005f, LOOP_END] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.google.c.c.ag.a<E> a(java.lang.Iterable<? extends E> r5) {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.c.c.ag.a.a(java.lang.Iterable):com.google.c.c.ag$a");
        }

        public final a<E> a(E e2, int i2) {
            if (i2 == 0) {
                return this;
            }
            if (this.f53898b) {
                this.f53897a = new ay<>(this.f53897a);
                this.f53899c = false;
            }
            this.f53898b = false;
            k.a(e2);
            ay<E> ayVar = this.f53897a;
            ayVar.a(e2, i2 + ayVar.b(e2));
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public final class b extends ai.b<au.a<E>> {
        private static final long serialVersionUID = 0;

        static {
            Covode.recordClassIndex(33382);
        }

        @Override // com.google.c.c.ai
        public final int hashCode() {
            return ag.this.hashCode();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.ai, com.google.c.c.x
        public final Object writeReplace() {
            return new c(ag.this);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.x
        public final boolean a() {
            return ag.this.a();
        }

        public final int size() {
            return ag.this.elementSet().size();
        }

        private b() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.ai.b
        public final /* bridge */ /* synthetic */ Object a(int i2) {
            return ag.this.a(i2);
        }

        @Override // com.google.c.c.x
        public final boolean contains(Object obj) {
            if (obj instanceof au.a) {
                au.a aVar = (au.a) obj;
                if (aVar.b() > 0 && ag.this.count(aVar.a()) == aVar.b()) {
                    return true;
                }
            }
            return false;
        }

        /* synthetic */ b(ag agVar, byte b2) {
            this();
        }
    }

    static class c<E> implements Serializable {
        final ag<E> multiset;

        static {
            Covode.recordClassIndex(33383);
        }

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return this.multiset.entrySet();
        }

        c(ag<E> agVar) {
            this.multiset = agVar;
        }
    }

    public static <E> a<E> builder() {
        return new a<>();
    }

    @Override // com.google.c.c.x
    public z<E> asList() {
        z<E> zVar = this.f53891a;
        if (zVar != null) {
            return zVar;
        }
        z<E> asList = super.asList();
        this.f53891a = asList;
        return asList;
    }

    public int hashCode() {
        return bk.a(entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.c.c.x, com.google.c.c.x, java.lang.Iterable
    public br<E> iterator() {
        final br<au.a<E>> it = entrySet().iterator();
        return new br<E>() {
            /* class com.google.c.c.ag.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            int f53893a;

            /* renamed from: b  reason: collision with root package name */
            E f53894b;

            static {
                Covode.recordClassIndex(33380);
            }

            public final boolean hasNext() {
                if (this.f53893a > 0 || it.hasNext()) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public final E next() {
                if (this.f53893a <= 0) {
                    au.a aVar = (au.a) it.next();
                    this.f53894b = (E) aVar.a();
                    this.f53893a = aVar.b();
                }
                this.f53893a--;
                return this.f53894b;
            }
        };
    }

    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.c.c.au
    public ai<au.a<E>> entrySet() {
        ai<au.a<E>> aiVar = this.f53892b;
        if (aiVar == null) {
            if (isEmpty()) {
                aiVar = ai.of();
            } else {
                aiVar = new b(this, (byte) 0);
            }
            this.f53892b = aiVar;
        }
        return aiVar;
    }

    public static <E> ag<E> copyOf(E[] eArr) {
        return a(eArr);
    }

    public boolean equals(Object obj) {
        return av.a(this, obj);
    }

    private static <E> ag<E> a(E... eArr) {
        return new a().b((Object[]) eArr).a();
    }

    public static <E> ag<E> copyOf(Iterator<? extends E> it) {
        return new a().b((Iterator) it).a();
    }

    public static <E> ag<E> of(E e2) {
        return a(e2);
    }

    @Override // com.google.c.c.au, com.google.c.c.x
    public boolean contains(Object obj) {
        if (count(obj) > 0) {
            return true;
        }
        return false;
    }

    public static <E> ag<E> copyOf(Iterable<? extends E> iterable) {
        int i2;
        if (iterable instanceof ag) {
            ag<E> agVar = (ag) iterable;
            if (!agVar.a()) {
                return agVar;
            }
        }
        if (iterable instanceof au) {
            i2 = ((au) iterable).elementSet().size();
        } else {
            i2 = 11;
        }
        a aVar = new a(i2);
        aVar.a((Iterable) iterable);
        return aVar.a();
    }

    @Override // com.google.c.c.au
    public final int add(E e2, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.c.c.au
    public final int remove(Object obj, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.c.c.au
    public final int setCount(E e2, int i2) {
        throw new UnsupportedOperationException();
    }

    public static <E> ag<E> of(E e2, E e3) {
        return a(e2, e3);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.x
    public final int a(Object[] objArr, int i2) {
        br<au.a<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            au.a<E> next = it.next();
            Arrays.fill(objArr, i2, next.b() + i2, next.a());
            i2 += next.b();
        }
        return i2;
    }

    @Override // com.google.c.c.au
    public final boolean setCount(E e2, int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    public static <E> ag<E> of(E e2, E e3, E e4) {
        return a(e2, e3, e4);
    }

    public static <E> ag<E> of(E e2, E e3, E e4, E e5) {
        return a(e2, e3, e4, e5);
    }

    public static <E> ag<E> of(E e2, E e3, E e4, E e5, E e6) {
        return a(e2, e3, e4, e5, e6);
    }

    public static <E> ag<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E... eArr) {
        return new a().a(e2, 1).a(e3, 1).a(e4, 1).a(e5, 1).a(e6, 1).a(e7, 1).b((Object[]) eArr).a();
    }
}
