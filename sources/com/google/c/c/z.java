package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.i;
import com.google.c.a.k;
import com.google.c.c.x;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class z<E> extends x<E> implements List<E>, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    private static final bs<Object> f54107a = new b(bb.f53976a, 0);

    @Override // com.google.c.c.x
    public final z<E> asList() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public static class c<E> extends z<E> {

        /* renamed from: a  reason: collision with root package name */
        private final transient z<E> f54109a;

        static {
            Covode.recordClassIndex(33547);
        }

        @Override // com.google.c.c.z
        public final z<E> reverse() {
            return this.f54109a;
        }

        @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, com.google.c.c.z, com.google.c.c.z, com.google.c.c.x, com.google.c.c.x, java.lang.Iterable
        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return z.super.iterator();
        }

        @Override // java.util.List, com.google.c.c.z, com.google.c.c.z
        public final /* bridge */ /* synthetic */ ListIterator listIterator() {
            return z.super.listIterator();
        }

        public final int size() {
            return this.f54109a.size();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.x
        public final boolean a() {
            return this.f54109a.a();
        }

        c(z<E> zVar) {
            this.f54109a = zVar;
        }

        private int a(int i2) {
            return (size() - 1) - i2;
        }

        @Override // com.google.c.c.z, com.google.c.c.x
        public final boolean contains(Object obj) {
            return this.f54109a.contains(obj);
        }

        @Override // com.google.c.c.z
        public final int indexOf(Object obj) {
            int lastIndexOf = this.f54109a.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return a(lastIndexOf);
            }
            return -1;
        }

        @Override // com.google.c.c.z
        public final int lastIndexOf(Object obj) {
            int indexOf = this.f54109a.indexOf(obj);
            if (indexOf >= 0) {
                return a(indexOf);
            }
            return -1;
        }

        @Override // java.util.List, com.google.c.c.z, com.google.c.c.z
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
            return z.super.listIterator(i2);
        }

        @Override // java.util.List
        public final E get(int i2) {
            k.a(i2, size());
            return this.f54109a.get(a(i2));
        }

        @Override // java.util.List, com.google.c.c.z, com.google.c.c.z
        public final z<E> subList(int i2, int i3) {
            k.a(i2, i3, size());
            return this.f54109a.subList(size() - i3, size() - i2).reverse();
        }
    }

    /* access modifiers changed from: package-private */
    public class e extends z<E> {

        /* renamed from: a  reason: collision with root package name */
        final transient int f54110a;

        /* renamed from: b  reason: collision with root package name */
        final transient int f54111b;

        static {
            Covode.recordClassIndex(33549);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.x
        public final boolean a() {
            return true;
        }

        public final int size() {
            return this.f54111b;
        }

        @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, com.google.c.c.z, com.google.c.c.z, com.google.c.c.x, com.google.c.c.x, java.lang.Iterable
        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return z.super.iterator();
        }

        @Override // java.util.List, com.google.c.c.z, com.google.c.c.z
        public final /* bridge */ /* synthetic */ ListIterator listIterator() {
            return z.super.listIterator();
        }

        @Override // java.util.List
        public final E get(int i2) {
            k.a(i2, this.f54111b);
            return (E) z.this.get(i2 + this.f54110a);
        }

        @Override // java.util.List, com.google.c.c.z, com.google.c.c.z
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
            return z.super.listIterator(i2);
        }

        @Override // java.util.List, com.google.c.c.z, com.google.c.c.z
        public final z<E> subList(int i2, int i3) {
            k.a(i2, i3, this.f54111b);
            z zVar = z.this;
            int i4 = this.f54110a;
            return zVar.subList(i2 + i4, i3 + i4);
        }

        e(int i2, int i3) {
            this.f54110a = i2;
            this.f54111b = i3;
        }
    }

    z() {
    }

    public static <E> z<E> of() {
        return (z<E>) bb.f53976a;
    }

    public static <E> z<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E e13, E... eArr) {
        k.a(eArr.length <= 2147483635, "the total number of elements must fit in an int");
        int length = eArr.length + 12;
        Object[] objArr = new Object[length];
        objArr[0] = e2;
        objArr[1] = e3;
        objArr[2] = e4;
        objArr[3] = e5;
        objArr[4] = e6;
        objArr[5] = e7;
        objArr[6] = e8;
        objArr[7] = e9;
        objArr[8] = e10;
        objArr[9] = e11;
        objArr[10] = e12;
        objArr[11] = e13;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        Object[] a2 = ax.a(objArr, length);
        return b(a2, a2.length);
    }

    public static <E> z<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        Object[] a2 = ax.a(new Object[]{e2, e3, e4, e5, e6, e7, e8, e9, e10}, 9);
        return b(a2, a2.length);
    }

    public static <E> z<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
        Object[] a2 = ax.a(new Object[]{e2, e3, e4, e5, e6, e7, e8, e9, e10, e11}, 10);
        return b(a2, a2.length);
    }

    public static <E> z<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12) {
        Object[] a2 = ax.a(new Object[]{e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12}, 11);
        return b(a2, a2.length);
    }

    public static final class a<E> extends x.a<E> {
        static {
            Covode.recordClassIndex(33545);
        }

        public a() {
            this(4);
        }

        public final z<E> a() {
            this.f54106c = true;
            return z.b(this.f54104a, this.f54105b);
        }

        a(int i2) {
            super(i2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.c.c.x.a
        public final /* bridge */ /* synthetic */ x.a a(Object obj) {
            super.b(obj);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.c.c.x.a, com.google.c.c.x.b
        public final /* synthetic */ x.b b(Object obj) {
            super.b(obj);
            return this;
        }

        public final a<E> c(E e2) {
            super.b((Object) e2);
            return this;
        }

        @Override // com.google.c.c.x.a, com.google.c.c.x.b
        public final /* bridge */ /* synthetic */ x.b a(Iterable iterable) {
            super.a(iterable);
            return this;
        }

        public final a<E> b(Iterator<? extends E> it) {
            super.a((Iterator) it);
            return this;
        }

        @Override // com.google.c.c.x.b
        public final /* bridge */ /* synthetic */ x.b a(Iterator it) {
            super.a(it);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.c.c.x.a, com.google.c.c.x.b
        public final /* bridge */ /* synthetic */ x.b a(Object[] objArr) {
            super.a(objArr);
            return this;
        }
    }

    static class d implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        static {
            Covode.recordClassIndex(33548);
        }

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return z.copyOf(this.elements);
        }

        d(Object[] objArr) {
            this.elements = objArr;
        }
    }

    public static <E> a<E> builder() {
        return new a<>();
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, com.google.c.c.x, com.google.c.c.x, java.lang.Iterable
    public br<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public bs<E> listIterator() {
        return listIterator(0);
    }

    public z<E> reverse() {
        if (size() <= 1) {
            return this;
        }
        return new c(this);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.x
    public Object writeReplace() {
        return new d(toArray());
    }

    static {
        Covode.recordClassIndex(33544);
    }

    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = (((i2 * 31) + get(i3).hashCode()) ^ -1) ^ -1;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public static class b<E> extends a<E> {

        /* renamed from: a  reason: collision with root package name */
        private final z<E> f54108a;

        static {
            Covode.recordClassIndex(33546);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.c.c.a
        public final E a(int i2) {
            return this.f54108a.get(i2);
        }

        b(z<E> zVar, int i2) {
            super(zVar.size(), i2);
            this.f54108a = zVar;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.List
    public final E remove(int i2) {
        throw new UnsupportedOperationException();
    }

    public static <E> a<E> builderWithExpectedSize(int i2) {
        k.a(i2, "expectedSize");
        return new a<>(i2);
    }

    public static <E> z<E> of(E e2) {
        Object[] a2 = ax.a(new Object[]{e2}, 1);
        return b(a2, a2.length);
    }

    @Override // com.google.c.c.x
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public static <E> z<E> copyOf(Iterable<? extends E> iterable) {
        k.a(iterable);
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E extends Comparable<? super E>> z<E> sortedCopyOf(Iterable<? extends E> iterable) {
        Comparable[] comparableArr = (Comparable[]) am.b(iterable).toArray(new Comparable[0]);
        ax.a((Object[]) comparableArr, comparableArr.length);
        Arrays.sort(comparableArr);
        return b(comparableArr, comparableArr.length);
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public bs<E> listIterator(int i2) {
        k.b(i2, size());
        return isEmpty() ? (bs<E>) f54107a : new b(this, i2);
    }

    public static <E> z<E> copyOf(Collection<? extends E> collection) {
        if (collection instanceof x) {
            z<E> asList = ((x) collection).asList();
            if (!asList.a()) {
                return asList;
            }
            Object[] array = asList.toArray();
            return b(array, array.length);
        }
        Object[] array2 = collection.toArray();
        Object[] a2 = ax.a(array2, array2.length);
        return b(a2, a2.length);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.google.c.c.z$a */
    /* JADX WARN: Multi-variable type inference failed */
    public static <E> z<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return of(next);
        }
        return new a().c(next).b((Iterator) it).a();
    }

    public boolean equals(Object obj) {
        if (obj == k.a(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i2 = 0; i2 < size; i2++) {
                        if (i.a(get(i2), list.get(i2))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!i.a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static <E> z<E> copyOf(E[] eArr) {
        if (eArr.length == 0) {
            return of();
        }
        Object[] objArr = (Object[]) eArr.clone();
        Object[] a2 = ax.a(objArr, objArr.length);
        return b(a2, a2.length);
    }

    @Override // java.util.List
    public final void add(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final E set(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    static <E> z<E> b(Object[] objArr, int i2) {
        if (i2 == 0) {
            return of();
        }
        return new bb(objArr, i2);
    }

    public static <E> z<E> of(E e2, E e3) {
        Object[] a2 = ax.a(new Object[]{e2, e3}, 2);
        return b(a2, a2.length);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.x
    public int a(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }

    @Override // java.util.List
    public z<E> subList(int i2, int i3) {
        k.a(i2, i3, size());
        int i4 = i3 - i2;
        if (i4 == size()) {
            return this;
        }
        if (i4 == 0) {
            return of();
        }
        return new e(i2, i4);
    }

    public static <E> z<E> sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        k.a(comparator);
        Object[] a2 = am.a(iterable);
        ax.a(a2, a2.length);
        Arrays.sort(a2, comparator);
        return b(a2, a2.length);
    }

    public static <E> z<E> of(E e2, E e3, E e4) {
        Object[] a2 = ax.a(new Object[]{e2, e3, e4}, 3);
        return b(a2, a2.length);
    }

    public static <E> z<E> of(E e2, E e3, E e4, E e5) {
        Object[] a2 = ax.a(new Object[]{e2, e3, e4, e5}, 4);
        return b(a2, a2.length);
    }

    public static <E> z<E> of(E e2, E e3, E e4, E e5, E e6) {
        Object[] a2 = ax.a(new Object[]{e2, e3, e4, e5, e6}, 5);
        return b(a2, a2.length);
    }

    public static <E> z<E> of(E e2, E e3, E e4, E e5, E e6, E e7) {
        Object[] a2 = ax.a(new Object[]{e2, e3, e4, e5, e6, e7}, 6);
        return b(a2, a2.length);
    }

    public static <E> z<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        Object[] a2 = ax.a(new Object[]{e2, e3, e4, e5, e6, e7, e8}, 7);
        return b(a2, a2.length);
    }

    public static <E> z<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        Object[] a2 = ax.a(new Object[]{e2, e3, e4, e5, e6, e7, e8, e9}, 8);
        return b(a2, a2.length);
    }
}
