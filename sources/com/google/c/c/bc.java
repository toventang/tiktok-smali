package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import java.util.AbstractMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class bc<K, V> extends ab<K, V> {

    /* renamed from: b  reason: collision with root package name */
    static final ab<Object, Object> f53979b = new bc(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* renamed from: c  reason: collision with root package name */
    final transient Object[] f53980c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int[] f53981d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f53982e;

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.ab
    public final boolean d() {
        return false;
    }

    static class a<K, V> extends ai<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public final transient Object[] f53983a;

        /* renamed from: b  reason: collision with root package name */
        public final transient int f53984b = 0;

        /* renamed from: c  reason: collision with root package name */
        public final transient int f53985c;

        /* renamed from: d  reason: collision with root package name */
        private final transient ab<K, V> f53986d;

        static {
            Covode.recordClassIndex(33461);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.x
        public final boolean a() {
            return true;
        }

        public int size() {
            return this.f53985c;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.ai
        public final z<Map.Entry<K, V>> d() {
            return new z<Map.Entry<K, V>>() {
                /* class com.google.c.c.bc.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(33462);
                }

                @Override // com.google.c.c.x
                public final boolean a() {
                    return true;
                }

                public final int size() {
                    return a.this.f53985c;
                }

                @Override // java.util.List
                public final /* synthetic */ Object get(int i2) {
                    k.a(i2, a.this.f53985c);
                    int i3 = i2 * 2;
                    return new AbstractMap.SimpleImmutableEntry(a.this.f53983a[a.this.f53984b + i3], a.this.f53983a[i3 + (a.this.f53984b ^ 1)]);
                }
            };
        }

        @Override // com.google.c.c.ai, com.google.c.c.ai, java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.c.c.x, com.google.c.c.x, java.lang.Iterable
        public br<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }

        @Override // com.google.c.c.x
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value == null || !value.equals(this.f53986d.get(key))) {
                    return false;
                }
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.x
        public final int a(Object[] objArr, int i2) {
            return asList().a(objArr, i2);
        }

        a(ab<K, V> abVar, Object[] objArr, int i2) {
            this.f53986d = abVar;
            this.f53983a = objArr;
            this.f53985c = i2;
        }
    }

    static final class b<K> extends ai<K> {

        /* renamed from: a  reason: collision with root package name */
        private final transient ab<K, ?> f53987a;

        /* renamed from: b  reason: collision with root package name */
        private final transient z<K> f53988b;

        static {
            Covode.recordClassIndex(33463);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.x
        public final boolean a() {
            return true;
        }

        @Override // com.google.c.c.ai, com.google.c.c.x
        public final z<K> asList() {
            return this.f53988b;
        }

        public final int size() {
            return this.f53987a.size();
        }

        @Override // com.google.c.c.ai, com.google.c.c.ai, java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.c.c.x, com.google.c.c.x, java.lang.Iterable
        public final br<K> iterator() {
            return asList().iterator();
        }

        @Override // com.google.c.c.x
        public final boolean contains(Object obj) {
            if (this.f53987a.get(obj) != null) {
                return true;
            }
            return false;
        }

        b(ab<K, ?> abVar, z<K> zVar) {
            this.f53987a = abVar;
            this.f53988b = zVar;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.x
        public final int a(Object[] objArr, int i2) {
            return asList().a(objArr, i2);
        }
    }

    static final class c extends z<Object> {

        /* renamed from: a  reason: collision with root package name */
        private final transient Object[] f53989a;

        /* renamed from: b  reason: collision with root package name */
        private final transient int f53990b;

        /* renamed from: c  reason: collision with root package name */
        private final transient int f53991c;

        static {
            Covode.recordClassIndex(33464);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.x
        public final boolean a() {
            return true;
        }

        public final int size() {
            return this.f53991c;
        }

        @Override // java.util.List
        public final Object get(int i2) {
            k.a(i2, this.f53991c);
            return this.f53989a[(i2 * 2) + this.f53990b];
        }

        c(Object[] objArr, int i2, int i3) {
            this.f53989a = objArr;
            this.f53990b = i2;
            this.f53991c = i3;
        }
    }

    public final int size() {
        return this.f53982e;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.ab
    public final ai<Map.Entry<K, V>> a() {
        return new a(this, this.f53980c, this.f53982e);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.ab
    public final ai<K> b() {
        return new b(this, new c(this.f53980c, 0, this.f53982e));
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.ab
    public final x<V> c() {
        return new c(this.f53980c, 1, this.f53982e);
    }

    static {
        Covode.recordClassIndex(33460);
    }

    @Override // java.util.Map, com.google.c.c.ab
    public final V get(Object obj) {
        int[] iArr = this.f53981d;
        Object[] objArr = this.f53980c;
        int i2 = this.f53982e;
        if (obj == null) {
            return null;
        }
        if (i2 == 1) {
            if (objArr[0].equals(obj)) {
                return (V) objArr[1];
            }
            return null;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int a2 = w.a(obj.hashCode());
            while (true) {
                int i3 = a2 & length;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    return null;
                }
                if (objArr[i4].equals(obj)) {
                    return (V) objArr[i4 ^ 1];
                }
                a2 = i3 + 1;
            }
        }
    }

    static <K, V> bc<K, V> a(int i2, Object[] objArr) {
        if (i2 == 0) {
            return (bc) f53979b;
        }
        if (i2 == 1) {
            k.a(objArr[0], objArr[1]);
            return new bc<>(null, objArr, 1);
        }
        k.b(i2, objArr.length >> 1);
        return new bc<>(a(objArr, i2, ai.b(i2)), objArr, i2);
    }

    private bc(int[] iArr, Object[] objArr, int i2) {
        this.f53981d = iArr;
        this.f53980c = objArr;
        this.f53982e = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        r7[r1] = r3;
        r9 = r9 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int[] a(java.lang.Object[] r11, int r12, int r13) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c.c.bc.a(java.lang.Object[], int, int):int[]");
    }
}
