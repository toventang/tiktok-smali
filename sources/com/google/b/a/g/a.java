package com.google.b.a.g;

import com.bytedance.covode.number.Covode;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class a<K, V> extends AbstractMap<K, V> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    int f53595a;

    /* renamed from: b  reason: collision with root package name */
    Object[] f53596b;

    static {
        Covode.recordClassIndex(33165);
    }

    public final int size() {
        return this.f53595a;
    }

    final class c extends AbstractSet<Map.Entry<K, V>> {
        static {
            Covode.recordClassIndex(33168);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new b();
        }

        public final int size() {
            return a.this.f53595a;
        }

        c() {
        }
    }

    public void clear() {
        this.f53595a = 0;
        this.f53596b = null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new c();
    }

    /* renamed from: com.google.b.a.g.a$a  reason: collision with other inner class name */
    final class C1227a implements Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        private int f53603b;

        static {
            Covode.recordClassIndex(33166);
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return (V) a.this.a(this.f53603b);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            a aVar = a.this;
            int i2 = this.f53603b;
            if (i2 < 0 || i2 >= aVar.f53595a) {
                return null;
            }
            return (K) aVar.f53596b[i2 << 1];
        }

        public final int hashCode() {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            return (V) a.this.a(this.f53603b, v);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!com.google.b.a.f.a.a.a.a.a.a(getKey(), entry.getKey()) || !com.google.b.a.f.a.a.a.a.a.a(getValue(), entry.getValue())) {
                return false;
            }
            return true;
        }

        C1227a(int i2) {
            this.f53603b = i2;
        }
    }

    final class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b  reason: collision with root package name */
        private boolean f53605b;

        /* renamed from: c  reason: collision with root package name */
        private int f53606c;

        static {
            Covode.recordClassIndex(33167);
        }

        public final boolean hasNext() {
            if (this.f53606c < a.this.f53595a) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            int i2 = this.f53606c;
            if (i2 != a.this.f53595a) {
                this.f53606c++;
                return new C1227a(i2);
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            int i2 = this.f53606c - 1;
            if (this.f53605b || i2 < 0) {
                throw new IllegalArgumentException();
            }
            a.this.b(i2 << 1);
            this.f53605b = true;
        }

        b() {
        }
    }

    /* renamed from: a */
    public final a<K, V> clone() {
        try {
            a<K, V> aVar = (a) super.clone();
            Object[] objArr = this.f53596b;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                aVar.f53596b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return aVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    private V c(int i2) {
        if (i2 < 0) {
            return null;
        }
        return (V) this.f53596b[i2];
    }

    public final boolean containsKey(Object obj) {
        if (-2 != a(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        return c(a(obj) + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        return b(a(obj));
    }

    private int a(Object obj) {
        int i2 = this.f53595a << 1;
        Object[] objArr = this.f53596b;
        for (int i3 = 0; i3 < i2; i3 += 2) {
            Object obj2 = objArr[i3];
            if (obj == null) {
                if (obj2 != null) {
                }
            } else if (!obj.equals(obj2)) {
            }
            return i3;
        }
        return -2;
    }

    public final boolean containsValue(Object obj) {
        int i2 = this.f53595a << 1;
        Object[] objArr = this.f53596b;
        for (int i3 = 1; i3 < i2; i3 += 2) {
            Object obj2 = objArr[i3];
            if (obj == null) {
                if (obj2 != null) {
                }
            } else if (!obj.equals(obj2)) {
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final V b(int i2) {
        int i3 = this.f53595a << 1;
        if (i2 < 0 || i2 >= i3) {
            return null;
        }
        V c2 = c(i2 + 1);
        Object[] objArr = this.f53596b;
        int i4 = (i3 - i2) - 2;
        if (i4 != 0) {
            System.arraycopy(objArr, i2 + 2, objArr, i2, i4);
        }
        this.f53595a--;
        a(i3 - 2, null, null);
        return c2;
    }

    public final V a(int i2) {
        if (i2 < 0 || i2 >= this.f53595a) {
            return null;
        }
        return c((i2 << 1) + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k2, V v) {
        int length;
        int a2 = a(k2) >> 1;
        if (a2 == -1) {
            a2 = this.f53595a;
        }
        if (a2 >= 0) {
            int i2 = a2 + 1;
            if (i2 >= 0) {
                Object[] objArr = this.f53596b;
                int i3 = i2 << 1;
                if (objArr == null) {
                    length = 0;
                } else {
                    length = objArr.length;
                }
                if (i3 > length) {
                    int i4 = ((length / 2) * 3) + 1;
                    if (i4 % 2 != 0) {
                        i4++;
                    }
                    if (i4 >= i3) {
                        i3 = i4;
                    }
                    if (i3 == 0) {
                        this.f53596b = null;
                    } else {
                        int i5 = this.f53595a;
                        if (i5 == 0 || i3 != objArr.length) {
                            Object[] objArr2 = new Object[i3];
                            this.f53596b = objArr2;
                            if (i5 != 0) {
                                System.arraycopy(objArr, 0, objArr2, 0, i5 << 1);
                            }
                        }
                    }
                }
                int i6 = a2 << 1;
                V c2 = c(i6 + 1);
                a(i6, k2, v);
                if (i2 > this.f53595a) {
                    this.f53595a = i2;
                }
                return c2;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IndexOutOfBoundsException();
    }

    public final V a(int i2, V v) {
        int i3 = this.f53595a;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = (i2 << 1) + 1;
        V c2 = c(i4);
        this.f53596b[i4] = v;
        return c2;
    }

    private void a(int i2, K k2, V v) {
        Object[] objArr = this.f53596b;
        objArr[i2] = k2;
        objArr[i2 + 1] = v;
    }
}
