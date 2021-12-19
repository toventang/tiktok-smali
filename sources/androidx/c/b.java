package androidx.c;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f1792c = new int[0];

    /* renamed from: d  reason: collision with root package name */
    private static final Object[] f1793d = new Object[0];

    /* renamed from: e  reason: collision with root package name */
    private static Object[] f1794e;

    /* renamed from: f  reason: collision with root package name */
    private static int f1795f;

    /* renamed from: g  reason: collision with root package name */
    private static Object[] f1796g;

    /* renamed from: h  reason: collision with root package name */
    private static int f1797h;

    /* renamed from: a  reason: collision with root package name */
    public Object[] f1798a;

    /* renamed from: b  reason: collision with root package name */
    int f1799b;

    /* renamed from: i  reason: collision with root package name */
    private int[] f1800i;

    /* renamed from: j  reason: collision with root package name */
    private f<E, E> f1801j;

    public final int size() {
        return this.f1799b;
    }

    public b() {
        this(0);
    }

    public final boolean isEmpty() {
        if (this.f1799b <= 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(552);
    }

    public final int hashCode() {
        int[] iArr = this.f1800i;
        int i2 = this.f1799b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public final Object[] toArray() {
        int i2 = this.f1799b;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f1798a, 0, objArr, 0, i2);
        return objArr;
    }

    public final void clear() {
        int i2 = this.f1799b;
        if (i2 != 0) {
            a(this.f1800i, this.f1798a, i2);
            this.f1800i = f1792c;
            this.f1798a = f1793d;
            this.f1799b = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set, java.lang.Iterable
    public final Iterator<E> iterator() {
        if (this.f1801j == null) {
            this.f1801j = new f<E, E>() {
                /* class androidx.c.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(553);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.c.f
                public final int a() {
                    return b.this.f1799b;
                }

                /* access modifiers changed from: protected */
                @Override // androidx.c.f
                public final void c() {
                    b.this.clear();
                }

                /* access modifiers changed from: protected */
                @Override // androidx.c.f
                public final Map<E, E> b() {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                @Override // androidx.c.f
                public final int b(Object obj) {
                    return b.this.a(obj);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.c.f
                public final int a(Object obj) {
                    return b.this.a(obj);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.c.f
                public final void a(int i2) {
                    b.this.a(i2);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.c.f
                public final Object a(int i2, int i3) {
                    return b.this.f1798a[i2];
                }

                /* access modifiers changed from: protected */
                @Override // androidx.c.f
                public final E a(int i2, E e2) {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                @Override // androidx.c.f
                public final void a(E e2, E e3) {
                    b.this.add(e2);
                }
            };
        }
        return this.f1801j.d().iterator();
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1799b * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1799b; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f1798a[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    private int a() {
        int i2 = this.f1799b;
        if (i2 == 0) {
            return -1;
        }
        int a2 = c.a(this.f1800i, i2, 0);
        if (a2 < 0 || this.f1798a[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f1800i[i3] == 0) {
            if (this.f1798a[i3] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.f1800i[i4] == 0) {
            if (this.f1798a[i4] == null) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    public b(Collection<E> collection) {
        this();
        if (collection != null) {
            addAll(collection);
        }
    }

    public final int a(Object obj) {
        if (obj == null) {
            return a();
        }
        return a(obj, obj.hashCode());
    }

    public final boolean contains(Object obj) {
        if (a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean remove(Object obj) {
        int a2 = a(obj);
        if (a2 < 0) {
            return false;
        }
        a(a2);
        return true;
    }

    public b(int i2) {
        if (i2 == 0) {
            this.f1800i = f1792c;
            this.f1798a = f1793d;
        } else {
            b(i2);
        }
        this.f1799b = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f1799b - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f1798a[i2])) {
                a(i2);
                z = true;
            }
        }
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: androidx.c.b<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size = this.f1799b + collection.size();
        int[] iArr = this.f1800i;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f1798a;
            b(size);
            int i2 = this.f1799b;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f1800i, 0, i2);
                System.arraycopy(objArr, 0, this.f1798a, 0, this.f1799b);
            }
            a(iArr, objArr, this.f1799b);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1799b; i2++) {
                try {
                    if (!set.contains(this.f1798a[i2])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1799b) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1799b));
        }
        System.arraycopy(this.f1798a, 0, tArr, 0, this.f1799b);
        int length = tArr.length;
        int i2 = this.f1799b;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    private void b(int i2) {
        if (i2 == 8) {
            synchronized (b.class) {
                Object[] objArr = f1796g;
                if (objArr != null) {
                    this.f1798a = objArr;
                    f1796g = (Object[]) objArr[0];
                    this.f1800i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1797h--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f1794e;
                if (objArr2 != null) {
                    this.f1798a = objArr2;
                    f1794e = (Object[]) objArr2[0];
                    this.f1800i = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1795f--;
                    return;
                }
            }
        }
        this.f1800i = new int[i2];
        this.f1798a = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e2) {
        int hashCode;
        int a2;
        if (e2 == null) {
            a2 = a();
            hashCode = 0;
        } else {
            hashCode = e2.hashCode();
            a2 = a(e2, hashCode);
        }
        if (a2 >= 0) {
            return false;
        }
        int i2 = a2 ^ -1;
        int i3 = this.f1799b;
        int[] iArr = this.f1800i;
        if (i3 >= iArr.length) {
            int i4 = 4;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i4 = 8;
            }
            Object[] objArr = this.f1798a;
            b(i4);
            int[] iArr2 = this.f1800i;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1798a, 0, objArr.length);
            }
            a(iArr, objArr, this.f1799b);
        }
        int i5 = this.f1799b;
        if (i2 < i5) {
            int[] iArr3 = this.f1800i;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f1798a;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f1799b - i2);
        }
        this.f1800i[i2] = hashCode;
        this.f1798a[i2] = e2;
        this.f1799b++;
        return true;
    }

    public final E a(int i2) {
        Object[] objArr = this.f1798a;
        E e2 = (E) objArr[i2];
        int i3 = this.f1799b;
        if (i3 <= 1) {
            a(this.f1800i, objArr, i3);
            this.f1800i = f1792c;
            this.f1798a = f1793d;
            this.f1799b = 0;
        } else {
            int[] iArr = this.f1800i;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i5 = i3 - 1;
                this.f1799b = i5;
                if (i2 < i5) {
                    int i6 = i2 + 1;
                    System.arraycopy(iArr, i6, iArr, i2, i5 - i2);
                    Object[] objArr2 = this.f1798a;
                    System.arraycopy(objArr2, i6, objArr2, i2, this.f1799b - i2);
                }
                this.f1798a[this.f1799b] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                b(i4);
                this.f1799b--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f1800i, 0, i2);
                    System.arraycopy(objArr, 0, this.f1798a, 0, i2);
                }
                int i7 = this.f1799b;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr, i8, this.f1800i, i2, i7 - i2);
                    System.arraycopy(objArr, i8, this.f1798a, i2, this.f1799b - i2);
                }
            }
        }
        return e2;
    }

    private int a(Object obj, int i2) {
        int i3 = this.f1799b;
        if (i3 == 0) {
            return -1;
        }
        int a2 = c.a(this.f1800i, i3, i2);
        if (a2 < 0 || obj.equals(this.f1798a[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f1800i[i4] == i2) {
            if (obj.equals(this.f1798a[i4])) {
                return i4;
            }
            i4++;
        }
        int i5 = a2 - 1;
        while (i5 >= 0 && this.f1800i[i5] == i2) {
            if (obj.equals(this.f1798a[i5])) {
                return i5;
            }
            i5--;
        }
        return i4 ^ -1;
    }

    private static void a(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f1797h < 10) {
                    objArr[0] = f1796g;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1796g = objArr;
                    f1797h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                if (f1795f < 10) {
                    objArr[0] = f1794e;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f1794e = objArr;
                    f1795f++;
                }
            }
        }
    }
}
