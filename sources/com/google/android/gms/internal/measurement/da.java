package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class da<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final Object f50755a = new Object();

    /* renamed from: b  reason: collision with root package name */
    transient Object f50756b;

    /* renamed from: c  reason: collision with root package name */
    transient int[] f50757c;

    /* renamed from: d  reason: collision with root package name */
    transient Object[] f50758d;

    /* renamed from: e  reason: collision with root package name */
    transient Object[] f50759e;

    /* renamed from: f  reason: collision with root package name */
    transient int f50760f = en.a(3, 1);

    /* renamed from: g  reason: collision with root package name */
    transient int f50761g;

    /* renamed from: h  reason: collision with root package name */
    private transient Set<K> f50762h;

    /* renamed from: i  reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f50763i;

    /* renamed from: j  reason: collision with root package name */
    private transient Collection<V> f50764j;

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if (this.f50756b == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.f50760f += 32;
    }

    static {
        Covode.recordClassIndex(31721);
    }

    /* access modifiers changed from: package-private */
    public final Map<K, V> b() {
        Object obj = this.f50756b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final int c() {
        return (1 << (this.f50760f & 31)) - 1;
    }

    /* access modifiers changed from: package-private */
    public final int e() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f50763i;
        if (set != null) {
            return set;
        }
        de deVar = new de(this);
        this.f50763i = deVar;
        return deVar;
    }

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.f50762h;
        if (set != null) {
            return set;
        }
        dg dgVar = new dg(this);
        this.f50762h = dgVar;
        return dgVar;
    }

    public final int size() {
        Map<K, V> b2 = b();
        if (b2 != null) {
            return b2.size();
        }
        return this.f50761g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.f50764j;
        if (collection != null) {
            return collection;
        }
        di diVar = new di(this);
        this.f50764j = diVar;
        return diVar;
    }

    da() {
        cl.a(true, (Object) "Expected size must be >= 0");
    }

    public final void clear() {
        if (!a()) {
            d();
            Map<K, V> b2 = b();
            if (b2 != null) {
                this.f50760f = en.a(size(), 3);
                b2.clear();
                this.f50756b = null;
                this.f50761g = 0;
                return;
            }
            Arrays.fill(this.f50758d, 0, this.f50761g, (Object) null);
            Arrays.fill(this.f50759e, 0, this.f50761g, (Object) null);
            Object obj = this.f50756b;
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(this.f50757c, 0, this.f50761g, 0);
            this.f50761g = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.f50761g) {
            return i3;
        }
        return -1;
    }

    private final void b(int i2) {
        this.f50760f = dh.a(this.f50760f, 32 - Integer.numberOfLeadingZeros(i2), 31);
    }

    public final boolean containsKey(Object obj) {
        Map<K, V> b2 = b();
        if (b2 != null) {
            return b2.containsKey(obj);
        }
        if (a(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Map<K, V> b2 = b();
        if (b2 != null) {
            return b2.get(obj);
        }
        int a2 = a(obj);
        if (a2 == -1) {
            return null;
        }
        return (V) this.f50759e[a2];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        Map<K, V> b2 = b();
        if (b2 != null) {
            return b2.remove(obj);
        }
        V v = (V) b(obj);
        if (v == f50755a) {
            return null;
        }
        return v;
    }

    /* access modifiers changed from: package-private */
    public final Object b(Object obj) {
        if (a()) {
            return f50755a;
        }
        int c2 = c();
        int a2 = dh.a(obj, null, c2, this.f50756b, this.f50757c, this.f50758d, null);
        if (a2 == -1) {
            return f50755a;
        }
        Object obj2 = this.f50759e[a2];
        a(a2, c2);
        this.f50761g--;
        d();
        return obj2;
    }

    public final boolean containsValue(Object obj) {
        Map<K, V> b2 = b();
        if (b2 != null) {
            return b2.containsValue(obj);
        }
        for (int i2 = 0; i2 < this.f50761g; i2++) {
            if (ck.a(obj, this.f50759e[i2])) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object obj) {
        if (a()) {
            return -1;
        }
        int a2 = dj.a(obj);
        int c2 = c();
        int a3 = dh.a(this.f50756b, a2 & c2);
        if (a3 == 0) {
            return -1;
        }
        int i2 = c2 ^ -1;
        int i3 = a2 & i2;
        do {
            int i4 = a3 - 1;
            int i5 = this.f50757c[i4];
            if ((i5 & i2) == i3 && ck.a(obj, this.f50758d[i4])) {
                return i4;
            }
            a3 = i5 & c2;
        } while (a3 != 0);
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        int i4;
        int[] iArr;
        int i5;
        int size = size() - 1;
        if (i2 < size) {
            Object[] objArr = this.f50758d;
            Object obj = objArr[size];
            objArr[i2] = obj;
            Object[] objArr2 = this.f50759e;
            objArr2[i2] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            int[] iArr2 = this.f50757c;
            iArr2[i2] = iArr2[size];
            iArr2[size] = 0;
            int a2 = dj.a(obj) & i3;
            int a3 = dh.a(this.f50756b, a2);
            int i6 = size + 1;
            if (a3 == i6) {
                dh.a(this.f50756b, a2, i2 + 1);
                return;
            }
            do {
                i4 = a3 - 1;
                iArr = this.f50757c;
                i5 = iArr[i4];
                a3 = i5 & i3;
            } while (a3 != i6);
            iArr[i4] = dh.a(i5, i2 + 1, i3);
            return;
        }
        this.f50758d[i2] = null;
        this.f50759e[i2] = null;
        this.f50757c[i2] = 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k2, V v) {
        int min;
        if (a()) {
            cl.b(a(), "Arrays already allocated");
            int i2 = this.f50760f;
            int max = Math.max(i2 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            double d2 = (double) highestOneBit;
            Double.isNaN(d2);
            if (max > ((int) (d2 * 1.0d)) && (highestOneBit = highestOneBit << 1) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f50756b = dh.a(max2);
            b(max2 - 1);
            this.f50757c = new int[i2];
            this.f50758d = new Object[i2];
            this.f50759e = new Object[i2];
        }
        Map<K, V> b2 = b();
        if (b2 != null) {
            return b2.put(k2, v);
        }
        int[] iArr = this.f50757c;
        Object[] objArr = this.f50758d;
        Object[] objArr2 = this.f50759e;
        int i3 = this.f50761g;
        int i4 = i3 + 1;
        int a2 = dj.a(k2);
        int c2 = c();
        int i5 = a2 & c2;
        int a3 = dh.a(this.f50756b, i5);
        if (a3 != 0) {
            int i6 = c2 ^ -1;
            int i7 = a2 & i6;
            int i8 = 0;
            while (true) {
                int i9 = a3 - 1;
                int i10 = iArr[i9];
                if ((i10 & i6) != i7 || !ck.a(k2, objArr[i9])) {
                    int i11 = i10 & c2;
                    i8++;
                    if (i11 != 0) {
                        a3 = i11;
                    } else if (i8 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(c() + 1, 1.0f);
                        int e2 = e();
                        while (e2 >= 0) {
                            linkedHashMap.put(this.f50758d[e2], this.f50759e[e2]);
                            e2 = a(e2);
                        }
                        this.f50756b = linkedHashMap;
                        this.f50757c = null;
                        this.f50758d = null;
                        this.f50759e = null;
                        d();
                        return (V) linkedHashMap.put(k2, v);
                    } else if (i4 > c2) {
                        c2 = a(c2, dh.b(c2), a2, i3);
                    } else {
                        iArr[i9] = dh.a(i10, i4, c2);
                    }
                } else {
                    V v2 = (V) objArr2[i9];
                    objArr2[i9] = v;
                    return v2;
                }
            }
        } else if (i4 > c2) {
            c2 = a(c2, dh.b(c2), a2, i3);
        } else {
            dh.a(this.f50756b, i5, i4);
        }
        int length = this.f50757c.length;
        if (i4 > length && (min = Math.min(1073741823, 1 | (Math.max(1, length >>> 1) + length))) != length) {
            this.f50757c = Arrays.copyOf(this.f50757c, min);
            this.f50758d = Arrays.copyOf(this.f50758d, min);
            this.f50759e = Arrays.copyOf(this.f50759e, min);
        }
        this.f50757c[i3] = dh.a(a2, 0, c2);
        this.f50758d[i3] = k2;
        this.f50759e[i3] = v;
        this.f50761g = i4;
        d();
        return null;
    }

    private final int a(int i2, int i3, int i4, int i5) {
        Object a2 = dh.a(i3);
        int i6 = i3 - 1;
        if (i5 != 0) {
            dh.a(a2, i4 & i6, i5 + 1);
        }
        Object obj = this.f50756b;
        int[] iArr = this.f50757c;
        for (int i7 = 0; i7 <= i2; i7++) {
            int a3 = dh.a(obj, i7);
            while (a3 != 0) {
                int i8 = a3 - 1;
                int i9 = iArr[i8];
                int i10 = ((i2 ^ -1) & i9) | i7;
                int i11 = i10 & i6;
                int a4 = dh.a(a2, i11);
                dh.a(a2, i11, a3);
                iArr[i8] = dh.a(i10, a4, i6);
                a3 = i9 & i2;
            }
        }
        this.f50756b = a2;
        b(i6);
        return i6;
    }
}
