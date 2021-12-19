package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.c.aq;
import com.google.c.c.x;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public abstract class ab<K, V> implements Serializable, Map<K, V> {

    /* renamed from: a  reason: collision with root package name */
    static final Map.Entry<?, ?>[] f53859a = new Map.Entry[0];

    /* renamed from: b  reason: collision with root package name */
    private transient ai<Map.Entry<K, V>> f53860b;

    /* renamed from: c  reason: collision with root package name */
    private transient ai<K> f53861c;

    /* renamed from: d  reason: collision with root package name */
    private transient x<V> f53862d;

    /* renamed from: e  reason: collision with root package name */
    private transient aj<K, V> f53863e;

    /* access modifiers changed from: package-private */
    public static abstract class b<K, V> extends ab<K, V> {
        static {
            Covode.recordClassIndex(33356);
        }

        /* access modifiers changed from: package-private */
        public abstract br<Map.Entry<K, V>> f();

        class a extends ac<K, V> {
            static {
                Covode.recordClassIndex(33357);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.c.ac
            public final ab<K, V> b() {
                return b.this;
            }

            @Override // com.google.c.c.ai, com.google.c.c.ai, java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.c.c.x, com.google.c.c.x, java.lang.Iterable
            public final br<Map.Entry<K, V>> iterator() {
                return b.this.f();
            }

            a() {
            }
        }

        b() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.ab
        public final ai<Map.Entry<K, V>> a() {
            return new a();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.ab
        public ai<K> b() {
            return new ad(this);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.ab
        public final x<V> c() {
            return new ae(this);
        }

        @Override // java.util.Map, com.google.c.c.ab, com.google.c.c.ab
        public /* bridge */ /* synthetic */ Set entrySet() {
            return ab.super.entrySet();
        }

        @Override // java.util.Map, com.google.c.c.ab, com.google.c.c.ab
        public /* bridge */ /* synthetic */ Set keySet() {
            return ab.super.keySet();
        }

        @Override // java.util.Map, com.google.c.c.ab, com.google.c.c.ab
        public /* bridge */ /* synthetic */ Collection values() {
            return ab.super.values();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract ai<Map.Entry<K, V>> a();

    /* access modifiers changed from: package-private */
    public abstract ai<K> b();

    /* access modifiers changed from: package-private */
    public abstract x<V> c();

    /* access modifiers changed from: package-private */
    public abstract boolean d();

    /* access modifiers changed from: package-private */
    public boolean e() {
        return false;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    ab() {
    }

    public static <K, V> ab<K, V> of() {
        return (ab<K, V>) bc.f53979b;
    }

    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        Comparator<? super V> f53866a;

        /* renamed from: b  reason: collision with root package name */
        Object[] f53867b;

        /* renamed from: c  reason: collision with root package name */
        int f53868c;

        /* renamed from: d  reason: collision with root package name */
        boolean f53869d;

        static {
            Covode.recordClassIndex(33355);
        }

        public a() {
            this(4);
        }

        private void b() {
            int i2;
            if (this.f53866a != null) {
                if (this.f53869d) {
                    this.f53867b = Arrays.copyOf(this.f53867b, this.f53868c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f53868c];
                int i3 = 0;
                while (true) {
                    i2 = this.f53868c;
                    if (i3 >= i2) {
                        break;
                    }
                    Object[] objArr = this.f53867b;
                    int i4 = i3 * 2;
                    entryArr[i3] = new AbstractMap.SimpleImmutableEntry(objArr[i4], objArr[i4 + 1]);
                    i3++;
                }
                Arrays.sort(entryArr, 0, i2, az.a(this.f53866a).a(aq.a.VALUE));
                for (int i5 = 0; i5 < this.f53868c; i5++) {
                    int i6 = i5 * 2;
                    this.f53867b[i6] = entryArr[i5].getKey();
                    this.f53867b[i6 + 1] = entryArr[i5].getValue();
                }
            }
        }

        public final ab<K, V> a() {
            b();
            this.f53869d = true;
            return bc.a(this.f53868c, this.f53867b);
        }

        a(int i2) {
            this.f53867b = new Object[(i2 * 2)];
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.c.c.ab$a<K, V> */
        /* JADX WARN: Multi-variable type inference failed */
        private a<K, V> a(Map.Entry<? extends K, ? extends V> entry) {
            return a(entry.getKey(), entry.getValue());
        }

        private void a(int i2) {
            int i3 = i2 * 2;
            Object[] objArr = this.f53867b;
            if (i3 > objArr.length) {
                this.f53867b = Arrays.copyOf(objArr, x.b.a(objArr.length, i3));
                this.f53869d = false;
            }
        }

        public final a<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                a(this.f53868c + ((Collection) iterable).size());
            }
            for (Map.Entry<? extends K, ? extends V> entry : iterable) {
                a(entry);
            }
            return this;
        }

        public final a<K, V> a(K k2, V v) {
            a(this.f53868c + 1);
            k.a(k2, v);
            Object[] objArr = this.f53867b;
            int i2 = this.f53868c;
            objArr[i2 * 2] = k2;
            objArr[(i2 * 2) + 1] = v;
            this.f53868c = i2 + 1;
            return this;
        }
    }

    final class c extends b<K, ai<V>> {
        static {
            Covode.recordClassIndex(33358);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.ab, com.google.c.c.ab.b
        public final ai<K> b() {
            return ab.this.keySet();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.ab
        public final boolean d() {
            return ab.this.d();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.ab
        public final boolean e() {
            return ab.this.e();
        }

        @Override // com.google.c.c.ab
        public final int hashCode() {
            return ab.this.hashCode();
        }

        public final int size() {
            return ab.this.size();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.ab.b
        public final br<Map.Entry<K, ai<V>>> f() {
            final br<Map.Entry<K, V>> it = ab.this.entrySet().iterator();
            return new br<Map.Entry<K, ai<V>>>() {
                /* class com.google.c.c.ab.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(33359);
                }

                public final boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public final /* synthetic */ Object next() {
                    final Map.Entry entry = (Map.Entry) it.next();
                    return new f<K, ai<V>>() {
                        /* class com.google.c.c.ab.c.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(33360);
                        }

                        @Override // java.util.Map.Entry, com.google.c.c.f
                        public final K getKey() {
                            return (K) entry.getKey();
                        }

                        @Override // java.util.Map.Entry, com.google.c.c.f
                        public final /* synthetic */ Object getValue() {
                            return ai.of(entry.getValue());
                        }
                    };
                }
            };
        }

        private c() {
        }

        @Override // com.google.c.c.ab
        public final boolean containsKey(Object obj) {
            return ab.this.containsKey(obj);
        }

        @Override // java.util.Map, com.google.c.c.ab
        public final /* synthetic */ Object get(Object obj) {
            Object obj2 = ab.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return ai.of(obj2);
        }

        /* synthetic */ c(ab abVar, byte b2) {
            this();
        }
    }

    public static <K, V> a<K, V> builder() {
        return new a<>();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new d(this);
    }

    static {
        Covode.recordClassIndex(33353);
    }

    @Override // java.util.Map
    public ai<Map.Entry<K, V>> entrySet() {
        ai<Map.Entry<K, V>> aiVar = this.f53860b;
        if (aiVar != null) {
            return aiVar;
        }
        ai<Map.Entry<K, V>> a2 = a();
        this.f53860b = a2;
        return a2;
    }

    public int hashCode() {
        return bk.a(entrySet());
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public ai<K> keySet() {
        ai<K> aiVar = this.f53861c;
        if (aiVar != null) {
            return aiVar;
        }
        ai<K> b2 = b();
        this.f53861c = b2;
        return b2;
    }

    @Override // java.util.Map
    public x<V> values() {
        x<V> xVar = this.f53862d;
        if (xVar != null) {
            return xVar;
        }
        x<V> c2 = c();
        this.f53862d = c2;
        return c2;
    }

    static class d implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object[] keys;
        private final Object[] values;

        static {
            Covode.recordClassIndex(33361);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.c.c.ab$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            a aVar = new a(this.keys.length);
            int i2 = 0;
            while (true) {
                Object[] objArr = this.keys;
                if (i2 >= objArr.length) {
                    return aVar.a();
                }
                aVar.a(objArr[i2], this.values[i2]);
                i2++;
            }
        }

        d(ab<?, ?> abVar) {
            this.keys = new Object[abVar.size()];
            this.values = new Object[abVar.size()];
            br<Map.Entry<?, ?>> it = abVar.entrySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                this.keys[i2] = next.getKey();
                this.values[i2] = next.getValue();
                i2++;
            }
        }
    }

    public aj<K, V> asMultimap() {
        if (isEmpty()) {
            return aj.of();
        }
        aj<K, V> ajVar = this.f53863e;
        if (ajVar != null) {
            return ajVar;
        }
        aj<K, V> ajVar2 = new aj<>(new c(this, (byte) 0), size(), null);
        this.f53863e = ajVar2;
        return ajVar2;
    }

    public String toString() {
        int size = size();
        k.a(size, "size");
        StringBuilder append = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L)).append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                append.append(", ");
            }
            z = false;
            append.append((Object) entry.getKey()).append('=').append((Object) entry.getValue());
        }
        return append.append('}').toString();
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> a<K, V> builderWithExpectedSize(int i2) {
        k.a(i2, "expectedSize");
        return new a<>(i2);
    }

    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public static <K, V> ab<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        int i2;
        if (iterable instanceof Collection) {
            i2 = ((Collection) iterable).size();
        } else {
            i2 = 4;
        }
        a aVar = new a(i2);
        aVar.a(iterable);
        return aVar.a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> ab<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof ab) && !(map instanceof SortedMap)) {
            ab<K, V> abVar = (ab) map;
            if (!abVar.d()) {
                return abVar;
            }
        }
        return copyOf(map.entrySet());
    }

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    @Override // java.util.Map
    public final V put(K k2, V v) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> ab<K, V> of(K k2, V v) {
        k.a(k2, v);
        return bc.a(1, new Object[]{k2, v});
    }

    public static <K, V> ab<K, V> of(K k2, V v, K k3, V v2) {
        k.a(k2, v);
        k.a(k3, v2);
        return bc.a(2, new Object[]{k2, v, k3, v2});
    }

    public static <K, V> ab<K, V> of(K k2, V v, K k3, V v2, K k4, V v3) {
        k.a(k2, v);
        k.a(k3, v2);
        k.a(k4, v3);
        return bc.a(3, new Object[]{k2, v, k3, v2, k4, v3});
    }

    public static <K, V> ab<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4) {
        k.a(k2, v);
        k.a(k3, v2);
        k.a(k4, v3);
        k.a(k5, v4);
        return bc.a(4, new Object[]{k2, v, k3, v2, k4, v3, k5, v4});
    }

    public static <K, V> ab<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5) {
        k.a(k2, v);
        k.a(k3, v2);
        k.a(k4, v3);
        k.a(k5, v4);
        k.a(k6, v5);
        return bc.a(5, new Object[]{k2, v, k3, v2, k4, v3, k5, v4, k6, v5});
    }
}
