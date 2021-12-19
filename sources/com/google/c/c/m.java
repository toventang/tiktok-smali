package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.i;
import com.google.c.a.k;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class m<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    transient long[] f54061a;

    /* renamed from: b  reason: collision with root package name */
    transient Object[] f54062b;

    /* renamed from: c  reason: collision with root package name */
    transient Object[] f54063c;

    /* renamed from: d  reason: collision with root package name */
    transient float f54064d;

    /* renamed from: e  reason: collision with root package name */
    transient int f54065e;

    /* renamed from: f  reason: collision with root package name */
    public transient int f54066f;

    /* renamed from: g  reason: collision with root package name */
    private transient int[] f54067g;

    /* renamed from: h  reason: collision with root package name */
    private transient int f54068h;

    /* renamed from: i  reason: collision with root package name */
    private transient Set<K> f54069i;

    /* renamed from: j  reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f54070j;

    /* renamed from: k  reason: collision with root package name */
    private transient Collection<V> f54071k;

    static {
        Covode.recordClassIndex(33519);
    }

    private static long a(long j2, int i2) {
        return (j2 & -4294967296L) | (((long) i2) & 4294967295L);
    }

    /* access modifiers changed from: package-private */
    public int a(int i2, int i3) {
        return i2 - 1;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
    }

    final class d extends f<K, V> {

        /* renamed from: b  reason: collision with root package name */
        private final K f54082b;

        /* renamed from: c  reason: collision with root package name */
        private int f54083c;

        static {
            Covode.recordClassIndex(33526);
        }

        @Override // java.util.Map.Entry, com.google.c.c.f
        public final K getKey() {
            return this.f54082b;
        }

        @Override // java.util.Map.Entry, com.google.c.c.f
        public final V getValue() {
            a();
            if (this.f54083c == -1) {
                return null;
            }
            return (V) m.this.f54063c[this.f54083c];
        }

        private void a() {
            int i2 = this.f54083c;
            if (i2 == -1 || i2 >= m.this.size() || !i.a(this.f54082b, m.this.f54062b[this.f54083c])) {
                this.f54083c = m.this.a(this.f54082b);
            }
        }

        @Override // java.util.Map.Entry, com.google.c.c.f
        public final V setValue(V v) {
            a();
            if (this.f54083c == -1) {
                m.this.put(this.f54082b, v);
                return null;
            }
            V v2 = (V) m.this.f54063c[this.f54083c];
            m.this.f54063c[this.f54083c] = v;
            return v2;
        }

        d(int i2) {
            this.f54082b = (K) m.this.f54062b[i2];
            this.f54083c = i2;
        }
    }

    public int size() {
        return this.f54066f;
    }

    class a extends AbstractSet<Map.Entry<K, V>> {
        static {
            Covode.recordClassIndex(33523);
        }

        public final void clear() {
            m.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new m<K, V>.b() {
                /* class com.google.c.c.m.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(33521);
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.c.c.m.b
                public final /* synthetic */ Object a(int i2) {
                    return new d(i2);
                }
            };
        }

        public final int size() {
            return m.this.f54066f;
        }

        a() {
        }

        public final boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int a2 = m.this.a(entry.getKey());
                if (a2 == -1 || !i.a(m.this.f54063c[a2], entry.getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a2 = m.this.a(entry.getKey());
            if (a2 == -1 || !i.a(m.this.f54063c[a2], entry.getValue())) {
                return false;
            }
            m.this.c(a2);
            return true;
        }
    }

    abstract class b<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        int f54076b;

        /* renamed from: c  reason: collision with root package name */
        int f54077c;

        /* renamed from: d  reason: collision with root package name */
        int f54078d;

        static {
            Covode.recordClassIndex(33524);
        }

        /* access modifiers changed from: package-private */
        public abstract T a(int i2);

        public boolean hasNext() {
            if (this.f54077c >= 0) {
                return true;
            }
            return false;
        }

        private void a() {
            if (m.this.f54065e != this.f54076b) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (hasNext()) {
                int i2 = this.f54077c;
                this.f54078d = i2;
                T a2 = a(i2);
                this.f54077c = m.this.e(this.f54077c);
                return a2;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            boolean z;
            a();
            if (this.f54078d >= 0) {
                z = true;
            } else {
                z = false;
            }
            k.b(z, "no calls to next() since the last call to remove()");
            this.f54076b++;
            m.this.c(this.f54078d);
            this.f54077c = m.this.a(this.f54077c, this.f54078d);
            this.f54078d = -1;
        }

        private b() {
            this.f54076b = m.this.f54065e;
            this.f54077c = m.this.a();
            this.f54078d = -1;
        }

        /* synthetic */ b(m mVar, byte b2) {
            this();
        }
    }

    class c extends AbstractSet<K> {
        static {
            Covode.recordClassIndex(33525);
        }

        public final void clear() {
            m.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new m<K, V>.b() {
                /* class com.google.c.c.m.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(33520);
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.c.c.m.b
                public final K a(int i2) {
                    return (K) m.this.f54062b[i2];
                }
            };
        }

        public final int size() {
            return m.this.f54066f;
        }

        c() {
        }

        public final boolean contains(Object obj) {
            return m.this.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            int a2 = m.this.a(obj);
            if (a2 == -1) {
                return false;
            }
            m.this.c(a2);
            return true;
        }
    }

    class e extends AbstractCollection<V> {
        static {
            Covode.recordClassIndex(33527);
        }

        public final void clear() {
            m.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new m<K, V>.b() {
                /* class com.google.c.c.m.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(33522);
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.c.c.m.b
                public final V a(int i2) {
                    return (V) m.this.f54063c[i2];
                }
            };
        }

        public final int size() {
            return m.this.f54066f;
        }

        e() {
        }
    }

    public boolean isEmpty() {
        if (this.f54066f == 0) {
            return true;
        }
        return false;
    }

    m() {
        a(3, 1.0f);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f54070j;
        if (set != null) {
            return set;
        }
        a aVar = new a();
        this.f54070j = aVar;
        return aVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f54069i;
        if (set != null) {
            return set;
        }
        c cVar = new c();
        this.f54069i = cVar;
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f54071k;
        if (collection != null) {
            return collection;
        }
        e eVar = new e();
        this.f54071k = eVar;
        return eVar;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public void clear() {
        this.f54065e++;
        Arrays.fill(this.f54062b, 0, this.f54066f, (Object) null);
        Arrays.fill(this.f54063c, 0, this.f54066f, (Object) null);
        Arrays.fill(this.f54067g, -1);
        Arrays.fill(this.f54061a, -1L);
        this.f54066f = 0;
    }

    m(int i2) {
        this(i2, (byte) 0);
    }

    private static int[] f(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public boolean containsKey(Object obj) {
        if (a(obj) != -1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int e(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.f54066f) {
            return i3;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return a(obj, w.a(obj));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.c.c.m<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        a(3, 1.0f);
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f54066f);
        for (int i2 = 0; i2 < this.f54066f; i2++) {
            objectOutputStream.writeObject(this.f54062b[i2]);
            objectOutputStream.writeObject(this.f54063c[i2]);
        }
    }

    public final V c(int i2) {
        return a(this.f54062b[i2], (int) (this.f54061a[i2] >>> 32));
    }

    public boolean containsValue(Object obj) {
        for (int i2 = 0; i2 < this.f54066f; i2++) {
            if (i.a(obj, this.f54063c[i2])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int a2 = a(obj);
        a(a2);
        if (a2 == -1) {
            return null;
        }
        return (V) this.f54063c[a2];
    }

    public final int a(Object obj) {
        int a2 = w.a(obj);
        int[] iArr = this.f54067g;
        int i2 = iArr[(iArr.length - 1) & a2];
        while (i2 != -1) {
            long j2 = this.f54061a[i2];
            if (((int) (j2 >>> 32)) == a2 && i.a(obj, this.f54062b[i2])) {
                return i2;
            }
            i2 = (int) j2;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        this.f54062b = Arrays.copyOf(this.f54062b, i2);
        this.f54063c = Arrays.copyOf(this.f54063c, i2);
        long[] jArr = this.f54061a;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i2);
        if (i2 > length) {
            Arrays.fill(copyOf, length, i2, -1L);
        }
        this.f54061a = copyOf;
    }

    private void g(int i2) {
        if (this.f54067g.length >= 1073741824) {
            this.f54068h = Integer.MAX_VALUE;
            return;
        }
        int i3 = ((int) (((float) i2) * this.f54064d)) + 1;
        int[] f2 = f(i2);
        long[] jArr = this.f54061a;
        int length = f2.length - 1;
        for (int i4 = 0; i4 < this.f54066f; i4++) {
            int i5 = (int) (jArr[i4] >>> 32);
            int i6 = i5 & length;
            int i7 = f2[i6];
            f2[i6] = i4;
            jArr[i4] = (((long) i5) << 32) | (((long) i7) & 4294967295L);
        }
        this.f54068h = i3;
        this.f54067g = f2;
    }

    /* access modifiers changed from: package-private */
    public void d(int i2) {
        int size = size() - 1;
        if (i2 < size) {
            Object[] objArr = this.f54062b;
            objArr[i2] = objArr[size];
            Object[] objArr2 = this.f54063c;
            objArr2[i2] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr = this.f54061a;
            long j2 = jArr[size];
            jArr[i2] = j2;
            jArr[size] = -1;
            int[] iArr = this.f54067g;
            int length = ((int) (j2 >>> 32)) & (iArr.length - 1);
            int i3 = iArr[length];
            if (i3 == size) {
                iArr[length] = i2;
                return;
            }
            while (true) {
                long[] jArr2 = this.f54061a;
                long j3 = jArr2[i3];
                int i4 = (int) j3;
                if (i4 == size) {
                    jArr2[i3] = a(j3, i2);
                    return;
                }
                i3 = i4;
            }
        } else {
            this.f54062b[i2] = null;
            this.f54063c[i2] = null;
            this.f54061a[i2] = -1;
        }
    }

    m(int i2, byte b2) {
        a(i2, 1.0f);
    }

    private V a(Object obj, int i2) {
        int[] iArr = this.f54067g;
        int length = (iArr.length - 1) & i2;
        int i3 = iArr[length];
        if (i3 == -1) {
            return null;
        }
        int i4 = -1;
        while (true) {
            if (((int) (this.f54061a[i3] >>> 32)) != i2 || !i.a(obj, this.f54062b[i3])) {
                int i5 = (int) this.f54061a[i3];
                if (i5 == -1) {
                    return null;
                }
                i4 = i3;
                i3 = i5;
            } else {
                V v = (V) this.f54063c[i3];
                if (i4 == -1) {
                    this.f54067g[length] = (int) this.f54061a[i3];
                } else {
                    long[] jArr = this.f54061a;
                    jArr[i4] = a(jArr[i4], (int) jArr[i3]);
                }
                d(i3);
                this.f54066f--;
                this.f54065e++;
                return v;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        long[] jArr = this.f54061a;
        Object[] objArr = this.f54062b;
        Object[] objArr2 = this.f54063c;
        int a2 = w.a(k2);
        int[] iArr = this.f54067g;
        int length = (iArr.length - 1) & a2;
        int i2 = this.f54066f;
        int i3 = iArr[length];
        if (i3 == -1) {
            iArr[length] = i2;
        } else {
            while (true) {
                long j2 = jArr[i3];
                if (((int) (j2 >>> 32)) != a2 || !i.a(k2, objArr[i3])) {
                    int i4 = (int) j2;
                    if (i4 == -1) {
                        jArr[i3] = a(j2, i2);
                        break;
                    }
                    i3 = i4;
                } else {
                    V v2 = (V) objArr2[i3];
                    objArr2[i3] = v;
                    a(i3);
                    return v2;
                }
            }
        }
        int i5 = Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            int i6 = i2 + 1;
            int length2 = this.f54061a.length;
            if (i6 > length2) {
                int max = Math.max(1, length2 >>> 1) + length2;
                if (max >= 0) {
                    i5 = max;
                }
                if (i5 != length2) {
                    b(i5);
                }
            }
            a(i2, k2, v, a2);
            this.f54066f = i6;
            if (i2 >= this.f54068h) {
                g(this.f54067g.length * 2);
            }
            this.f54065e++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, float f2) {
        boolean z;
        boolean z2 = false;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        k.a(z, "Initial capacity must be non-negative");
        if (f2 > 0.0f) {
            z2 = true;
        }
        k.a(z2, "Illegal load factor");
        int a2 = w.a(i2, (double) f2);
        this.f54067g = f(a2);
        this.f54064d = f2;
        this.f54062b = new Object[i2];
        this.f54063c = new Object[i2];
        long[] jArr = new long[i2];
        Arrays.fill(jArr, -1L);
        this.f54061a = jArr;
        this.f54068h = Math.max(1, (int) (((float) a2) * f2));
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, K k2, V v, int i3) {
        this.f54061a[i2] = (((long) i3) << 32) | 4294967295L;
        this.f54062b[i2] = k2;
        this.f54063c[i2] = v;
    }
}
