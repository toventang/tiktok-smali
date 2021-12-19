package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.c.an;
import com.google.c.c.aq;
import com.google.c.c.au;
import com.google.c.c.av;
import com.google.c.c.bi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class af<K, V> extends g<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b  reason: collision with root package name */
    final transient ab<K, ? extends x<V>> f53876b;

    /* renamed from: c  reason: collision with root package name */
    final transient int f53877c;

    static {
        Covode.recordClassIndex(33370);
    }

    @Override // com.google.c.c.ar
    public abstract x<V> get(K k2);

    public abstract af<V, K> inverse();

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: com.google.c.c.ab<K, ? extends com.google.c.c.x<V>>, com.google.c.c.ab<K, java.util.Collection<V>> */
    @Override // com.google.c.c.ar, com.google.c.c.g
    public ab<K, Collection<V>> asMap() {
        return (ab<K, ? extends x<V>>) this.f53876b;
    }

    @Override // com.google.c.c.ar
    public int size() {
        return this.f53877c;
    }

    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        Map<K, Collection<V>> f53885a = new m();

        /* renamed from: b  reason: collision with root package name */
        Comparator<? super K> f53886b;

        /* renamed from: c  reason: collision with root package name */
        Comparator<? super V> f53887c;

        static {
            Covode.recordClassIndex(33373);
        }

        /* access modifiers changed from: package-private */
        public Collection<V> c() {
            return new ArrayList();
        }

        public af<K, V> b() {
            Collection entrySet = this.f53885a.entrySet();
            Comparator<? super K> comparator = this.f53886b;
            if (comparator != null) {
                entrySet = z.sortedCopyOf(az.a(comparator).a(aq.a.KEY), entrySet);
            }
            return aa.a(entrySet, this.f53887c);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.c.c.af$a<K, V> */
        /* JADX WARN: Multi-variable type inference failed */
        public a<K, V> a(Map.Entry<? extends K, ? extends V> entry) {
            return b(entry.getKey(), entry.getValue());
        }

        public a<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            for (Map.Entry<? extends K, ? extends V> entry : iterable) {
                a(entry);
            }
            return this;
        }

        public a<K, V> b(K k2, V v) {
            k.a(k2, v);
            Collection<V> collection = this.f53885a.get(k2);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f53885a;
                collection = c();
                map.put(k2, collection);
            }
            collection.add(v);
            return this;
        }
    }

    static class b<K, V> extends x<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;
        final af<K, V> multimap;

        static {
            Covode.recordClassIndex(33374);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.c.c.x, com.google.c.c.x, java.lang.Iterable
        public final br<Map.Entry<K, V>> iterator() {
            return this.multimap.i();
        }

        public final int size() {
            return this.multimap.size();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.x
        public final boolean a() {
            return this.multimap.f53876b.d();
        }

        b(af<K, V> afVar) {
            this.multimap = afVar;
        }

        @Override // com.google.c.c.x
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.multimap.containsEntry(entry.getKey(), entry.getValue());
        }
    }

    class d extends ag<K> {
        static {
            Covode.recordClassIndex(33376);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.x
        public final boolean a() {
            return true;
        }

        @Override // com.google.c.c.ag, com.google.c.c.ag, com.google.c.c.au
        public final ai<K> elementSet() {
            return af.this.keySet();
        }

        @Override // com.google.c.c.au
        public final int size() {
            return af.this.size();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.ag, com.google.c.c.x
        public final Object writeReplace() {
            return new e(af.this);
        }

        d() {
        }

        @Override // com.google.c.c.ag, com.google.c.c.au, com.google.c.c.x
        public final boolean contains(Object obj) {
            return af.this.containsKey(obj);
        }

        @Override // com.google.c.c.au
        public final int count(Object obj) {
            Collection collection = (Collection) af.this.f53876b.get(obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.ag
        public final au.a<K> a(int i2) {
            Map.Entry<K, ? extends x<V>> entry = af.this.f53876b.entrySet().asList().get(i2);
            return new av.d(entry.getKey(), ((Collection) entry.getValue()).size());
        }
    }

    static final class e implements Serializable {
        final af<?, ?> multimap;

        static {
            Covode.recordClassIndex(33377);
        }

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return this.multimap.keys();
        }

        e(af<?, ?> afVar) {
            this.multimap = afVar;
        }
    }

    static final class f<K, V> extends x<V> {
        private static final long serialVersionUID = 0;

        /* renamed from: a  reason: collision with root package name */
        private final transient af<K, V> f53890a;

        static {
            Covode.recordClassIndex(33378);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.x
        public final boolean a() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.c.c.x, com.google.c.c.x, java.lang.Iterable
        public final br<V> iterator() {
            return this.f53890a.f();
        }

        public final int size() {
            return this.f53890a.size();
        }

        f(af<K, V> afVar) {
            this.f53890a = afVar;
        }

        @Override // com.google.c.c.x
        public final boolean contains(Object obj) {
            return this.f53890a.containsValue(obj);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.x
        public final int a(Object[] objArr, int i2) {
            br<? extends x<V>> it = this.f53890a.f53876b.values().iterator();
            while (it.hasNext()) {
                i2 = ((x) it.next()).a(objArr, i2);
            }
            return i2;
        }
    }

    public static <K, V> a<K, V> builder() {
        return new a<>();
    }

    public static <K, V> af<K, V> of() {
        return aa.of();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final br<Map.Entry<K, V>> i() {
        return new br<Map.Entry<K, V>>() {
            /* class com.google.c.c.af.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final Iterator<? extends Map.Entry<K, ? extends x<V>>> f53878a;

            /* renamed from: b  reason: collision with root package name */
            K f53879b = null;

            /* renamed from: c  reason: collision with root package name */
            Iterator<V> f53880c = an.a.f53919a;

            static {
                Covode.recordClassIndex(33371);
            }

            public final boolean hasNext() {
                if (this.f53880c.hasNext() || this.f53878a.hasNext()) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public final /* synthetic */ Object next() {
                if (!this.f53880c.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f53878a.next();
                    this.f53879b = (K) entry.getKey();
                    this.f53880c = ((x) entry.getValue()).iterator();
                }
                return aq.a((Object) this.f53879b, (Object) this.f53880c.next());
            }

            {
                this.f53878a = af.this.f53876b.entrySet().iterator();
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final br<V> f() {
        return new br<V>() {
            /* class com.google.c.c.af.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            Iterator<? extends x<V>> f53882a;

            /* renamed from: b  reason: collision with root package name */
            Iterator<V> f53883b = an.a.f53919a;

            static {
                Covode.recordClassIndex(33372);
            }

            public final boolean hasNext() {
                if (this.f53883b.hasNext() || this.f53882a.hasNext()) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public final V next() {
                if (!this.f53883b.hasNext()) {
                    this.f53883b = ((x) this.f53882a.next()).iterator();
                }
                return this.f53883b.next();
            }

            {
                this.f53882a = af.this.f53876b.values().iterator();
            }
        };
    }

    @Override // com.google.c.c.ar
    public void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.g
    public final Set<K> d() {
        throw new AssertionError("unreachable");
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.g
    public final /* synthetic */ Collection e() {
        return new f(this);
    }

    @Override // com.google.c.c.ar, com.google.c.c.g
    public x<Map.Entry<K, V>> entries() {
        return (x) super.entries();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.g
    public final /* synthetic */ au g() {
        return new d();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.g
    public final /* synthetic */ Collection h() {
        return new b(this);
    }

    @Override // com.google.c.c.g
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.c.c.ar, com.google.c.c.g
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.g
    public final Map<K, Collection<V>> j() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.c.c.ar, com.google.c.c.g
    public ai<K> keySet() {
        return this.f53876b.keySet();
    }

    @Override // com.google.c.c.g
    public ag<K> keys() {
        return (ag) super.keys();
    }

    @Override // com.google.c.c.g
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.c.c.g
    public x<V> values() {
        return (x) super.values();
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        static final bi.a<af> f53888a = bi.a(af.class, "map");

        /* renamed from: b  reason: collision with root package name */
        static final bi.a<af> f53889b = bi.a(af.class, "size");

        static {
            Covode.recordClassIndex(33375);
        }
    }

    public static <K, V> af<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return aa.copyOf((Iterable) iterable);
    }

    @Override // com.google.c.c.ar
    public boolean containsKey(Object obj) {
        return this.f53876b.containsKey(obj);
    }

    @Override // com.google.c.c.g
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.c.c.g
    public boolean putAll(ar<? extends K, ? extends V> arVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.c.c.ar
    public x<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.c.c.g
    public boolean containsValue(Object obj) {
        if (obj == null || !super.containsValue(obj)) {
            return false;
        }
        return true;
    }

    public static <K, V> af<K, V> copyOf(ar<? extends K, ? extends V> arVar) {
        if (arVar instanceof af) {
            af<K, V> afVar = (af) arVar;
            if (!afVar.f53876b.d()) {
                return afVar;
            }
        }
        return aa.copyOf((ar) arVar);
    }

    af(ab<K, ? extends x<V>> abVar, int i2) {
        this.f53876b = abVar;
        this.f53877c = i2;
    }

    @Override // com.google.c.c.ar, com.google.c.c.g
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.c.c.ar, com.google.c.c.g
    public boolean put(K k2, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.c.c.ar, com.google.c.c.g
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.c.c.g
    public x<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> af<K, V> of(K k2, V v) {
        return aa.of((Object) k2, (Object) v);
    }

    @Override // com.google.c.c.g
    public boolean putAll(K k2, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> af<K, V> of(K k2, V v, K k3, V v2) {
        return aa.of((Object) k2, (Object) v, (Object) k3, (Object) v2);
    }

    public static <K, V> af<K, V> of(K k2, V v, K k3, V v2, K k4, V v3) {
        return aa.of((Object) k2, (Object) v, (Object) k3, (Object) v2, (Object) k4, (Object) v3);
    }

    public static <K, V> af<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4) {
        return aa.of((Object) k2, (Object) v, (Object) k3, (Object) v2, (Object) k4, (Object) v3, (Object) k5, (Object) v4);
    }

    public static <K, V> af<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5) {
        return aa.of((Object) k2, (Object) v, (Object) k3, (Object) v2, (Object) k4, (Object) v3, (Object) k5, (Object) v4, (Object) k6, (Object) v5);
    }
}
