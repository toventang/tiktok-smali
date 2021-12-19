package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import com.google.c.c.x;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

public abstract class ai<E> extends x<E> implements Set<E> {

    /* renamed from: a  reason: collision with root package name */
    private transient z<E> f53900a;

    static {
        Covode.recordClassIndex(33385);
    }

    public static boolean shouldTrim(int i2, int i3) {
        return i2 < (i3 >> 1) + (i3 >> 2);
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.c.c.x, com.google.c.c.x, java.lang.Iterable
    public abstract br<E> iterator();

    /* access modifiers changed from: package-private */
    public static abstract class b<E> extends ai<E> {
        static {
            Covode.recordClassIndex(33387);
        }

        /* access modifiers changed from: package-private */
        public abstract E a(int i2);

        b() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.ai
        public final z<E> d() {
            return new z<E>() {
                /* class com.google.c.c.ai.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(33388);
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.c.c.x
                public final boolean a() {
                    return b.this.a();
                }

                public final int size() {
                    return b.this.size();
                }

                @Override // java.util.List
                public final E get(int i2) {
                    return (E) b.this.a(i2);
                }
            };
        }

        @Override // com.google.c.c.ai, com.google.c.c.ai, java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.c.c.x, com.google.c.c.x, java.lang.Iterable
        public br<E> iterator() {
            return asList().iterator();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.x
        public final int a(Object[] objArr, int i2) {
            return asList().a(objArr, i2);
        }
    }

    ai() {
    }

    public static <E> ai<E> of() {
        return be.f53996a;
    }

    public static class a<E> extends x.a<E> {

        /* renamed from: d  reason: collision with root package name */
        Object[] f53901d;

        /* renamed from: e  reason: collision with root package name */
        private int f53902e;

        static {
            Covode.recordClassIndex(33386);
        }

        public a() {
            super(4);
        }

        public ai<E> a() {
            ai<E> construct;
            Object[] objArr;
            int i2 = this.f54105b;
            if (i2 == 0) {
                return ai.of();
            }
            if (i2 == 1) {
                return ai.of(this.f54104a[0]);
            }
            if (this.f53901d == null || ai.b(this.f54105b) != this.f53901d.length) {
                construct = ai.construct(this.f54105b, this.f54104a);
                this.f54105b = construct.size();
            } else {
                if (ai.shouldTrim(this.f54105b, this.f54104a.length)) {
                    objArr = Arrays.copyOf(this.f54104a, this.f54105b);
                } else {
                    objArr = this.f54104a;
                }
                int i3 = this.f53902e;
                Object[] objArr2 = this.f53901d;
                construct = new be<>(objArr, i3, objArr2, objArr2.length - 1, this.f54105b);
            }
            this.f54106c = true;
            this.f53901d = null;
            return construct;
        }

        a(int i2) {
            super(i2);
            this.f53901d = new Object[ai.b(i2)];
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.c.c.ai$a<E> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public a<E> a(Iterable<? extends E> iterable) {
            k.a(iterable);
            if (this.f53901d != null) {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            } else {
                super.a((Iterable) iterable);
            }
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.c.c.ai$a<E> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public a<E> a(Iterator<? extends E> it) {
            k.a(it);
            while (it.hasNext()) {
                b(it.next());
            }
            return this;
        }

        /* renamed from: c */
        public a<E> b(E e2) {
            k.a(e2);
            if (this.f53901d != null) {
                int b2 = ai.b(this.f54105b);
                Object[] objArr = this.f53901d;
                if (b2 <= objArr.length) {
                    int length = objArr.length - 1;
                    int hashCode = e2.hashCode();
                    int a2 = w.a(hashCode);
                    while (true) {
                        int i2 = a2 & length;
                        Object[] objArr2 = this.f53901d;
                        Object obj = objArr2[i2];
                        if (obj != null) {
                            if (obj.equals(e2)) {
                                break;
                            }
                            a2 = i2 + 1;
                        } else {
                            objArr2[i2] = e2;
                            this.f53902e += hashCode;
                            super.b((Object) e2);
                            break;
                        }
                    }
                    return this;
                }
            }
            this.f53901d = null;
            super.b((Object) e2);
            return this;
        }

        /* renamed from: b */
        public a<E> a(E... eArr) {
            if (this.f53901d != null) {
                for (E e2 : eArr) {
                    b(e2);
                }
            } else {
                super.a((Object[]) eArr);
            }
            return this;
        }
    }

    static class c implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        static {
            Covode.recordClassIndex(33389);
        }

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return ai.copyOf(this.elements);
        }

        c(Object[] objArr) {
            this.elements = objArr;
        }
    }

    public static <E> a<E> builder() {
        return new a<>();
    }

    public int hashCode() {
        return bk.a(this);
    }

    @Override // com.google.c.c.x
    public z<E> asList() {
        z<E> zVar = this.f53900a;
        if (zVar != null) {
            return zVar;
        }
        z<E> d2 = d();
        this.f53900a = d2;
        return d2;
    }

    /* access modifiers changed from: package-private */
    public z<E> d() {
        Object[] array = toArray();
        return z.b(array, array.length);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.x
    public Object writeReplace() {
        return new c(toArray());
    }

    public static <E> ai<E> of(E e2) {
        return new bl(e2);
    }

    public static <E> a<E> builderWithExpectedSize(int i2) {
        k.a(i2, "expectedSize");
        return new a<>(i2);
    }

    public static <E> ai<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    static int b(int i2) {
        int max = Math.max(i2, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (true) {
                double d2 = (double) highestOneBit;
                Double.isNaN(d2);
                if (d2 * 0.7d >= ((double) max)) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            if (max >= 1073741824) {
                z = false;
            }
            k.a(z, "collection too large");
            return 1073741824;
        }
    }

    public static <E> ai<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof ai) && !(collection instanceof SortedSet)) {
            ai<E> aiVar = (ai) collection;
            if (!aiVar.a()) {
                return aiVar;
            }
        }
        Object[] array = collection.toArray();
        return construct(array.length, array);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ai) || !c() || !((ai) obj).c() || hashCode() == obj.hashCode()) {
            return bk.a(this, obj);
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.google.c.c.ai$a */
    /* JADX WARN: Multi-variable type inference failed */
    public static <E> ai<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return of(next);
        }
        return new a().b(next).a((Iterator) it).a();
    }

    public static <E> ai<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return of();
        }
        if (length != 1) {
            return construct(eArr.length, (Object[]) eArr.clone());
        }
        return of(eArr[0]);
    }

    public static <E> ai<E> of(E e2, E e3) {
        return construct(2, e2, e3);
    }

    public static <E> ai<E> construct(int i2, Object... objArr) {
        Object[] objArr2 = objArr;
        while (i2 != 0) {
            if (i2 == 1) {
                return of(objArr2[0]);
            }
            int b2 = b(i2);
            Object[] objArr3 = new Object[b2];
            int i3 = b2 - 1;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                Object a2 = ax.a(objArr2[i6], i6);
                int hashCode = a2.hashCode();
                int a3 = w.a(hashCode);
                while (true) {
                    int i7 = a3 & i3;
                    Object obj = objArr3[i7];
                    if (obj == null) {
                        objArr2[i5] = a2;
                        objArr3[i7] = a2;
                        i4 += hashCode;
                        i5++;
                        break;
                    }
                    if (obj.equals(a2)) {
                        break;
                    }
                    a3++;
                }
            }
            Arrays.fill(objArr2, i5, i2, (Object) null);
            if (i5 == 1) {
                return new bl(objArr2[0], i4);
            }
            if (b(i5) < b2 / 2) {
                i2 = i5;
            } else {
                if (shouldTrim(i5, objArr2.length)) {
                    objArr2 = Arrays.copyOf(objArr2, i5);
                }
                return new be(objArr2, i4, objArr3, i3, i5);
            }
        }
        return of();
    }

    public static <E> ai<E> of(E e2, E e3, E e4) {
        return construct(3, e2, e3, e4);
    }

    public static <E> ai<E> of(E e2, E e3, E e4, E e5) {
        return construct(4, e2, e3, e4, e5);
    }

    public static <E> ai<E> of(E e2, E e3, E e4, E e5, E e6) {
        return construct(5, e2, e3, e4, e5, e6);
    }

    public static <E> ai<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E... eArr) {
        boolean z;
        if (eArr.length <= 2147483641) {
            z = true;
        } else {
            z = false;
        }
        k.a(z, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e2;
        objArr[1] = e3;
        objArr[2] = e4;
        objArr[3] = e5;
        objArr[4] = e6;
        objArr[5] = e7;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return construct(length, objArr);
    }
}
