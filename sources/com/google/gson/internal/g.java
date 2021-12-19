package com.google.gson.internal;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public final class g<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f54869a = true;

    /* renamed from: b  reason: collision with root package name */
    private static final Comparator<Comparable> f54870b = new Comparator<Comparable>() {
        /* class com.google.gson.internal.g.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34037);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    Comparator<? super K> comparator;
    private g<K, V>.a entrySet;
    final d<K, V> header;
    private g<K, V>.b keySet;
    int modCount;
    d<K, V> root;
    int size;

    /* access modifiers changed from: package-private */
    public static final class d<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        d<K, V> f54879a;

        /* renamed from: b  reason: collision with root package name */
        d<K, V> f54880b;

        /* renamed from: c  reason: collision with root package name */
        d<K, V> f54881c;

        /* renamed from: d  reason: collision with root package name */
        d<K, V> f54882d;

        /* renamed from: e  reason: collision with root package name */
        d<K, V> f54883e;

        /* renamed from: f  reason: collision with root package name */
        final K f54884f;

        /* renamed from: g  reason: collision with root package name */
        V f54885g;

        /* renamed from: h  reason: collision with root package name */
        int f54886h;

        static {
            Covode.recordClassIndex(34043);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f54884f;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f54885g;
        }

        d() {
            this.f54883e = this;
            this.f54882d = this;
        }

        public final int hashCode() {
            int hashCode;
            K k2 = this.f54884f;
            int i2 = 0;
            if (k2 == null) {
                hashCode = 0;
            } else {
                hashCode = k2.hashCode();
            }
            V v = this.f54885g;
            if (v != null) {
                i2 = v.hashCode();
            }
            return hashCode ^ i2;
        }

        public final String toString() {
            return ((Object) this.f54884f) + "=" + ((Object) this.f54885g);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = this.f54885g;
            this.f54885g = v;
            return v2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k2 = this.f54884f;
                if (k2 != null ? k2.equals(entry.getKey()) : entry.getKey() == null) {
                    V v = this.f54885g;
                    if (v == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        d(d<K, V> dVar, K k2, d<K, V> dVar2, d<K, V> dVar3) {
            this.f54879a = dVar;
            this.f54884f = k2;
            this.f54886h = 1;
            this.f54882d = dVar2;
            this.f54883e = dVar3;
            dVar3.f54882d = this;
            dVar2.f54883e = this;
        }
    }

    public final int size() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    public class a extends AbstractSet<Map.Entry<K, V>> {
        static {
            Covode.recordClassIndex(34038);
        }

        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new g<K, V>.c() {
                /* class com.google.gson.internal.g.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(34039);
                }

                @Override // java.util.Iterator
                public final /* synthetic */ Object next() {
                    return a();
                }

                {
                    g gVar = g.this;
                }
            };
        }

        public int size() {
            return g.this.size;
        }

        a() {
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry) || g.this.a((Map.Entry) obj) == null) {
                return false;
            }
            return true;
        }

        public boolean remove(Object obj) {
            d<K, V> a2;
            if (!(obj instanceof Map.Entry) || (a2 = g.this.a((Map.Entry) obj)) == null) {
                return false;
            }
            g.this.a((d) a2, true);
            return true;
        }
    }

    final class b extends AbstractSet<K> {
        static {
            Covode.recordClassIndex(34040);
        }

        public final void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new g<K, V>.c() {
                /* class com.google.gson.internal.g.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(34041);
                }

                @Override // java.util.Iterator
                public final K next() {
                    return a().f54884f;
                }

                {
                    g gVar = g.this;
                }
            };
        }

        public final int size() {
            return g.this.size;
        }

        b() {
        }

        public final boolean contains(Object obj) {
            return g.this.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            if (g.this.a(obj) != null) {
                return true;
            }
            return false;
        }
    }

    public g() {
        this(f54870b);
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    abstract class c<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        d<K, V> f54875b;

        /* renamed from: c  reason: collision with root package name */
        d<K, V> f54876c;

        /* renamed from: d  reason: collision with root package name */
        int f54877d;

        static {
            Covode.recordClassIndex(34042);
        }

        public final boolean hasNext() {
            if (this.f54875b != g.this.header) {
                return true;
            }
            return false;
        }

        public final void remove() {
            d<K, V> dVar = this.f54876c;
            if (dVar != null) {
                g.this.a((d) dVar, true);
                this.f54876c = null;
                this.f54877d = g.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }

        /* access modifiers changed from: package-private */
        public final d<K, V> a() {
            d<K, V> dVar = this.f54875b;
            if (dVar == g.this.header) {
                throw new NoSuchElementException();
            } else if (g.this.modCount == this.f54877d) {
                this.f54875b = dVar.f54882d;
                this.f54876c = dVar;
                return dVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        c() {
            this.f54875b = g.this.header.f54882d;
            this.f54877d = g.this.modCount;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        g<K, V>.a aVar = this.entrySet;
        if (aVar != null) {
            return aVar;
        }
        g<K, V>.a aVar2 = new a();
        this.entrySet = aVar2;
        return aVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        g<K, V>.b bVar = this.keySet;
        if (bVar != null) {
            return bVar;
        }
        g<K, V>.b bVar2 = new b();
        this.keySet = bVar2;
        return bVar2;
    }

    static {
        Covode.recordClassIndex(34036);
    }

    public final void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        d<K, V> dVar = this.header;
        dVar.f54883e = dVar;
        dVar.f54882d = dVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    private d<K, V> b(Object obj) {
        if (obj != 0) {
            try {
                return a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final d<K, V> a(Object obj) {
        d<K, V> b2 = b(obj);
        if (b2 != null) {
            a((d) b2, true);
        }
        return b2;
    }

    public final boolean containsKey(Object obj) {
        if (b(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        d<K, V> b2 = b(obj);
        if (b2 != null) {
            return b2.f54885g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        d<K, V> a2 = a(obj);
        if (a2 != null) {
            return a2.f54885g;
        }
        return null;
    }

    public g(Comparator<? super K> comparator2) {
        this.header = new d<>();
        this.comparator = comparator2 == null ? f54870b : comparator2;
    }

    /* access modifiers changed from: package-private */
    public final d<K, V> a(Map.Entry<?, ?> entry) {
        d<K, V> b2 = b(entry.getKey());
        if (b2 == null) {
            return null;
        }
        V v = b2.f54885g;
        Object value = entry.getValue();
        if (v == value || (v != null && v.equals(value))) {
            return b2;
        }
        return null;
    }

    private void a(d<K, V> dVar) {
        int i2;
        int i3;
        d<K, V> dVar2 = dVar.f54880b;
        d<K, V> dVar3 = dVar.f54881c;
        d<K, V> dVar4 = dVar3.f54880b;
        d<K, V> dVar5 = dVar3.f54881c;
        dVar.f54881c = dVar4;
        if (dVar4 != null) {
            dVar4.f54879a = dVar;
        }
        a(dVar, dVar3);
        dVar3.f54880b = dVar;
        dVar.f54879a = dVar3;
        int i4 = 0;
        if (dVar2 != null) {
            i2 = dVar2.f54886h;
        } else {
            i2 = 0;
        }
        if (dVar4 != null) {
            i3 = dVar4.f54886h;
        } else {
            i3 = 0;
        }
        dVar.f54886h = Math.max(i2, i3) + 1;
        int i5 = dVar.f54886h;
        if (dVar5 != null) {
            i4 = dVar5.f54886h;
        }
        dVar3.f54886h = Math.max(i5, i4) + 1;
    }

    private void b(d<K, V> dVar) {
        int i2;
        int i3;
        d<K, V> dVar2 = dVar.f54880b;
        d<K, V> dVar3 = dVar.f54881c;
        d<K, V> dVar4 = dVar2.f54880b;
        d<K, V> dVar5 = dVar2.f54881c;
        dVar.f54880b = dVar5;
        if (dVar5 != null) {
            dVar5.f54879a = dVar;
        }
        a(dVar, dVar2);
        dVar2.f54881c = dVar;
        dVar.f54879a = dVar2;
        int i4 = 0;
        if (dVar3 != null) {
            i2 = dVar3.f54886h;
        } else {
            i2 = 0;
        }
        if (dVar5 != null) {
            i3 = dVar5.f54886h;
        } else {
            i3 = 0;
        }
        dVar.f54886h = Math.max(i2, i3) + 1;
        int i5 = dVar.f54886h;
        if (dVar4 != null) {
            i4 = dVar4.f54886h;
        }
        dVar2.f54886h = Math.max(i5, i4) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k2, V v) {
        Objects.requireNonNull(k2, "key == null");
        d<K, V> a2 = a((Object) k2, true);
        V v2 = a2.f54885g;
        a2.f54885g = v;
        return v2;
    }

    private void a(d<K, V> dVar, d<K, V> dVar2) {
        d<K, V> dVar3 = dVar.f54879a;
        dVar.f54879a = null;
        if (dVar2 != null) {
            dVar2.f54879a = dVar3;
        }
        if (dVar3 == null) {
            this.root = dVar2;
        } else if (dVar3.f54880b == dVar) {
            dVar3.f54880b = dVar2;
        } else if (f54869a || dVar3.f54881c == dVar) {
            dVar3.f54881c = dVar2;
        } else {
            throw new AssertionError();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.gson.internal.g.d<K, V> a(K r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.g.a(java.lang.Object, boolean):com.google.gson.internal.g$d");
    }

    private void b(d<K, V> dVar, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        while (dVar != null) {
            d<K, V> dVar2 = dVar.f54880b;
            d<K, V> dVar3 = dVar.f54881c;
            int i6 = 0;
            if (dVar2 != null) {
                i2 = dVar2.f54886h;
            } else {
                i2 = 0;
            }
            if (dVar3 != null) {
                i3 = dVar3.f54886h;
            } else {
                i3 = 0;
            }
            int i7 = i2 - i3;
            if (i7 == -2) {
                d<K, V> dVar4 = dVar3.f54880b;
                d<K, V> dVar5 = dVar3.f54881c;
                if (dVar5 != null) {
                    i5 = dVar5.f54886h;
                } else {
                    i5 = 0;
                }
                if (dVar4 != null) {
                    i6 = dVar4.f54886h;
                }
                int i8 = i6 - i5;
                if (i8 == -1 || (i8 == 0 && !z)) {
                    a((d) dVar);
                } else if (f54869a || i8 == 1) {
                    b((d) dVar3);
                    a((d) dVar);
                } else {
                    throw new AssertionError();
                }
                if (z) {
                    return;
                }
            } else if (i7 == 2) {
                d<K, V> dVar6 = dVar2.f54880b;
                d<K, V> dVar7 = dVar2.f54881c;
                if (dVar7 != null) {
                    i4 = dVar7.f54886h;
                } else {
                    i4 = 0;
                }
                if (dVar6 != null) {
                    i6 = dVar6.f54886h;
                }
                int i9 = i6 - i4;
                if (i9 == 1 || (i9 == 0 && !z)) {
                    b((d) dVar);
                } else if (f54869a || i9 == -1) {
                    a((d) dVar2);
                    b((d) dVar);
                } else {
                    throw new AssertionError();
                }
                if (z) {
                    return;
                }
            } else if (i7 == 0) {
                dVar.f54886h = i2 + 1;
                if (z) {
                    return;
                }
            } else if (f54869a || i7 == -1 || i7 == 1) {
                dVar.f54886h = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            } else {
                throw new AssertionError();
            }
            dVar = dVar.f54879a;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(d<K, V> dVar, boolean z) {
        int i2;
        if (z) {
            dVar.f54883e.f54882d = dVar.f54882d;
            dVar.f54882d.f54883e = dVar.f54883e;
        }
        d<K, V> dVar2 = dVar.f54880b;
        d<K, V> dVar3 = dVar.f54881c;
        d<K, V> dVar4 = dVar.f54879a;
        int i3 = 0;
        if (dVar2 != null) {
            if (dVar3 != null) {
                if (dVar2.f54886h > dVar3.f54886h) {
                    d<K, V> dVar5 = dVar2.f54881c;
                    while (true) {
                        dVar3 = dVar2;
                        dVar2 = dVar5;
                        if (dVar2 == null) {
                            break;
                        }
                        dVar5 = dVar2.f54881c;
                    }
                } else {
                    while (true) {
                        d<K, V> dVar6 = dVar3.f54880b;
                        if (dVar6 == null) {
                            break;
                        }
                        dVar3 = dVar6;
                    }
                }
                a((d) dVar3, false);
                d<K, V> dVar7 = dVar.f54880b;
                if (dVar7 != null) {
                    i2 = dVar7.f54886h;
                    dVar3.f54880b = dVar7;
                    dVar7.f54879a = dVar3;
                    dVar.f54880b = null;
                } else {
                    i2 = 0;
                }
                d<K, V> dVar8 = dVar.f54881c;
                if (dVar8 != null) {
                    i3 = dVar8.f54886h;
                    dVar3.f54881c = dVar8;
                    dVar8.f54879a = dVar3;
                    dVar.f54881c = null;
                }
                dVar3.f54886h = Math.max(i2, i3) + 1;
                a(dVar, dVar3);
                return;
            }
            a(dVar, dVar2);
            dVar.f54880b = null;
        } else if (dVar3 != null) {
            a(dVar, dVar3);
            dVar.f54881c = null;
        } else {
            a(dVar, (d) null);
        }
        b(dVar4, false);
        this.size--;
        this.modCount++;
    }
}
