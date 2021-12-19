package androidx.c;

import com.bytedance.covode.number.Covode;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class g<K, V> {

    /* renamed from: b  reason: collision with root package name */
    static Object[] f1833b;

    /* renamed from: c  reason: collision with root package name */
    static int f1834c;

    /* renamed from: d  reason: collision with root package name */
    static Object[] f1835d;

    /* renamed from: e  reason: collision with root package name */
    static int f1836e;

    /* renamed from: f  reason: collision with root package name */
    int[] f1837f;

    /* renamed from: g  reason: collision with root package name */
    Object[] f1838g;

    /* renamed from: h  reason: collision with root package name */
    int f1839h;

    static {
        Covode.recordClassIndex(563);
    }

    public int size() {
        return this.f1839h;
    }

    public boolean isEmpty() {
        if (this.f1839h <= 0) {
            return true;
        }
        return false;
    }

    public g() {
        this.f1837f = c.f1803a;
        this.f1838g = c.f1805c;
    }

    public int hashCode() {
        int hashCode;
        int[] iArr = this.f1837f;
        Object[] objArr = this.f1838g;
        int i2 = this.f1839h;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i5 += hashCode ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public void clear() {
        int i2 = this.f1839h;
        if (i2 > 0) {
            int[] iArr = this.f1837f;
            Object[] objArr = this.f1838g;
            this.f1837f = c.f1803a;
            this.f1838g = c.f1805c;
            this.f1839h = 0;
            a(iArr, objArr, i2);
        }
        if (this.f1839h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    private int a() {
        int i2 = this.f1839h;
        if (i2 == 0) {
            return -1;
        }
        int a2 = a(this.f1837f, i2, 0);
        if (a2 < 0 || this.f1838g[a2 << 1] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f1837f[i3] == 0) {
            if (this.f1838g[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.f1837f[i4] == 0) {
            if (this.f1838g[i4 << 1] == null) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1839h * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1839h; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K b2 = b(i2);
            if (b2 != this) {
                sb.append((Object) b2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V c2 = c(i2);
            if (c2 != this) {
                sb.append((Object) c2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final K b(int i2) {
        return (K) this.f1838g[i2 << 1];
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final V c(int i2) {
        return (V) this.f1838g[(i2 << 1) + 1];
    }

    public boolean containsKey(Object obj) {
        if (a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (b(obj) >= 0) {
            return true;
        }
        return false;
    }

    public V remove(Object obj) {
        int a2 = a(obj);
        if (a2 >= 0) {
            return d(a2);
        }
        return null;
    }

    public g(int i2) {
        if (i2 == 0) {
            this.f1837f = c.f1803a;
            this.f1838g = c.f1805c;
        } else {
            e(i2);
        }
        this.f1839h = 0;
    }

    public final int a(Object obj) {
        if (obj == null) {
            return a();
        }
        return a(obj, obj.hashCode());
    }

    public g(g<K, V> gVar) {
        this();
        if (gVar != null) {
            int i2 = gVar.f1839h;
            a(this.f1839h + i2);
            if (this.f1839h != 0) {
                for (int i3 = 0; i3 < i2; i3++) {
                    put(gVar.b(i3), gVar.c(i3));
                }
            } else if (i2 > 0) {
                System.arraycopy(gVar.f1837f, 0, this.f1837f, 0, i2);
                System.arraycopy(gVar.f1838g, 0, this.f1838g, 0, i2 << 1);
                this.f1839h = i2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final int b(Object obj) {
        int i2 = this.f1839h * 2;
        Object[] objArr = this.f1838g;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    private void e(int i2) {
        if (i2 == 8) {
            synchronized (g.class) {
                Object[] objArr = f1835d;
                if (objArr != null) {
                    this.f1838g = objArr;
                    f1835d = (Object[]) objArr[0];
                    this.f1837f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1836e--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (g.class) {
                Object[] objArr2 = f1833b;
                if (objArr2 != null) {
                    this.f1838g = objArr2;
                    f1833b = (Object[]) objArr2[0];
                    this.f1837f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1834c--;
                    return;
                }
            }
        }
        this.f1837f = new int[i2];
        this.f1838g = new Object[(i2 << 1)];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1839h; i2++) {
                try {
                    K b2 = b(i2);
                    V c2 = c(i2);
                    Object obj2 = gVar.get(b2);
                    if (c2 == null) {
                        if (obj2 == null) {
                            if (!gVar.containsKey(b2)) {
                            }
                        }
                        return false;
                    } else if (!c2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f1839h; i3++) {
                try {
                    K b3 = b(i3);
                    V c3 = c(i3);
                    Object obj3 = map.get(b3);
                    if (c3 == null) {
                        if (obj3 == null) {
                            if (!map.containsKey(b3)) {
                            }
                        }
                        return false;
                    } else if (!c3.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final V d(int i2) {
        Object[] objArr = this.f1838g;
        int i3 = i2 << 1;
        V v = (V) objArr[i3 + 1];
        int i4 = this.f1839h;
        int i5 = 0;
        if (i4 <= 1) {
            a(this.f1837f, objArr, i4);
            this.f1837f = c.f1803a;
            this.f1838g = c.f1805c;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f1837f;
            int i7 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i8 = i2 + 1;
                    int i9 = i6 - i2;
                    System.arraycopy(iArr, i8, iArr, i2, i9);
                    Object[] objArr2 = this.f1838g;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i3, i9 << 1);
                }
                Object[] objArr3 = this.f1838g;
                int i10 = i6 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            } else {
                if (i4 > 8) {
                    i7 = i4 + (i4 >> 1);
                }
                e(i7);
                if (i4 == this.f1839h) {
                    if (i2 > 0) {
                        System.arraycopy(iArr, 0, this.f1837f, 0, i2);
                        System.arraycopy(objArr, 0, this.f1838g, 0, i3);
                    }
                    if (i2 < i6) {
                        int i11 = i2 + 1;
                        int i12 = i6 - i2;
                        System.arraycopy(iArr, i11, this.f1837f, i2, i12);
                        System.arraycopy(objArr, i11 << 1, this.f1838g, i3, i12 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i5 = i6;
        }
        if (i4 == this.f1839h) {
            this.f1839h = i5;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public final void a(int i2) {
        int i3 = this.f1839h;
        int[] iArr = this.f1837f;
        if (iArr.length < i2) {
            Object[] objArr = this.f1838g;
            e(i2);
            if (this.f1839h > 0) {
                System.arraycopy(iArr, 0, this.f1837f, 0, i3);
                System.arraycopy(objArr, 0, this.f1838g, 0, i3 << 1);
            }
            a(iArr, objArr, i3);
        }
        if (this.f1839h != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public V getOrDefault(Object obj, V v) {
        int a2 = a(obj);
        return a2 >= 0 ? (V) this.f1838g[(a2 << 1) + 1] : v;
    }

    public V putIfAbsent(K k2, V v) {
        V v2 = get(k2);
        if (v2 == null) {
            return put(k2, v);
        }
        return v2;
    }

    public V replace(K k2, V v) {
        int a2 = a(k2);
        if (a2 >= 0) {
            return a(a2, v);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int a2 = a(obj);
        if (a2 < 0) {
            return false;
        }
        V c2 = c(a2);
        if (obj2 != c2 && (obj2 == null || !obj2.equals(c2))) {
            return false;
        }
        d(a2);
        return true;
    }

    public final V a(int i2, V v) {
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f1838g;
        V v2 = (V) objArr[i3];
        objArr[i3] = v;
        return v2;
    }

    private int a(Object obj, int i2) {
        int i3 = this.f1839h;
        if (i3 == 0) {
            return -1;
        }
        int a2 = a(this.f1837f, i3, i2);
        if (a2 < 0 || obj.equals(this.f1838g[a2 << 1])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f1837f[i4] == i2) {
            if (obj.equals(this.f1838g[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        int i5 = a2 - 1;
        while (i5 >= 0 && this.f1837f[i5] == i2) {
            if (obj.equals(this.f1838g[i5 << 1])) {
                return i5;
            }
            i5--;
        }
        return i4 ^ -1;
    }

    public V put(K k2, V v) {
        int hashCode;
        int a2;
        int i2 = this.f1839h;
        if (k2 == null) {
            a2 = a();
            hashCode = 0;
        } else {
            hashCode = k2.hashCode();
            a2 = a(k2, hashCode);
        }
        if (a2 >= 0) {
            int i3 = (a2 << 1) + 1;
            Object[] objArr = this.f1838g;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = a2 ^ -1;
        int[] iArr = this.f1837f;
        if (i2 >= iArr.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.f1838g;
            e(i5);
            if (i2 == this.f1839h) {
                int[] iArr2 = this.f1837f;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f1838g, 0, objArr2.length);
                }
                a(iArr, objArr2, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr3 = this.f1837f;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f1838g;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f1839h - i4) << 1);
        }
        int i7 = this.f1839h;
        if (i2 == i7) {
            int[] iArr4 = this.f1837f;
            if (i4 < iArr4.length) {
                iArr4[i4] = hashCode;
                Object[] objArr4 = this.f1838g;
                int i8 = i4 << 1;
                objArr4[i8] = k2;
                objArr4[i8 + 1] = v;
                this.f1839h = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    private static int a(int[] iArr, int i2, int i3) {
        try {
            return c.a(iArr, i2, i3);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean replace(K k2, V v, V v2) {
        int a2 = a(k2);
        if (a2 < 0) {
            return false;
        }
        V c2 = c(a2);
        if (c2 != v && (v == null || !v.equals(c2))) {
            return false;
        }
        a(a2, v2);
        return true;
    }

    private static void a(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                if (f1836e < 10) {
                    objArr[0] = f1835d;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1835d = objArr;
                    f1836e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (g.class) {
                if (f1834c < 10) {
                    objArr[0] = f1833b;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f1833b = objArr;
                    f1834c++;
                }
            }
        }
    }
}
