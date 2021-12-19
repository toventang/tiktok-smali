package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import com.google.c.c.at;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class g<K, V> implements ar<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private transient Collection<Map.Entry<K, V>> f54044a;

    /* renamed from: b  reason: collision with root package name */
    private transient Set<K> f54045b;

    /* renamed from: c  reason: collision with root package name */
    private transient au<K> f54046c;

    /* renamed from: d  reason: collision with root package name */
    private transient Collection<V> f54047d;

    /* renamed from: e  reason: collision with root package name */
    private transient Map<K, Collection<V>> f54048e;

    static {
        Covode.recordClassIndex(33506);
    }

    /* access modifiers changed from: package-private */
    public abstract Set<K> d();

    /* access modifiers changed from: package-private */
    public abstract Collection<V> e();

    /* access modifiers changed from: package-private */
    public abstract au<K> g();

    /* access modifiers changed from: package-private */
    public abstract Collection<Map.Entry<K, V>> h();

    /* access modifiers changed from: package-private */
    public abstract Iterator<Map.Entry<K, V>> i();

    /* access modifiers changed from: package-private */
    public abstract Map<K, Collection<V>> j();

    class a extends at.b<K, V> {
        static {
            Covode.recordClassIndex(33507);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.at.b
        public final ar<K, V> a() {
            return g.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return g.this.i();
        }

        a() {
        }
    }

    g() {
    }

    class b extends g<K, V>.a implements Set<Map.Entry<K, V>> {
        static {
            Covode.recordClassIndex(33508);
        }

        public final int hashCode() {
            return bk.a(this);
        }

        b() {
            super();
        }

        public final boolean equals(Object obj) {
            return bk.a(this, obj);
        }
    }

    class c extends AbstractCollection<V> {
        static {
            Covode.recordClassIndex(33509);
        }

        public final void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return g.this.f();
        }

        public final int size() {
            return g.this.size();
        }

        c() {
        }

        public final boolean contains(Object obj) {
            return g.this.containsValue(obj);
        }
    }

    @Override // com.google.c.c.ar
    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.f54048e;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> j2 = j();
        this.f54048e = j2;
        return j2;
    }

    @Override // com.google.c.c.ar
    public Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.f54044a;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> h2 = h();
        this.f54044a = h2;
        return h2;
    }

    /* access modifiers changed from: package-private */
    public Iterator<V> f() {
        return aq.b(entries().iterator());
    }

    public int hashCode() {
        return asMap().hashCode();
    }

    @Override // com.google.c.c.ar
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.c.c.ar
    public Set<K> keySet() {
        Set<K> set = this.f54045b;
        if (set != null) {
            return set;
        }
        Set<K> d2 = d();
        this.f54045b = d2;
        return d2;
    }

    public au<K> keys() {
        au<K> auVar = this.f54046c;
        if (auVar != null) {
            return auVar;
        }
        au<K> g2 = g();
        this.f54046c = g2;
        return g2;
    }

    public String toString() {
        return asMap().toString();
    }

    public Collection<V> values() {
        Collection<V> collection = this.f54047d;
        if (collection != null) {
            return collection;
        }
        Collection<V> e2 = e();
        this.f54047d = e2;
        return e2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ar) {
            return asMap().equals(((ar) obj).asMap());
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        for (Collection<V> collection : asMap().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.c.c.g<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean putAll(ar<? extends K, ? extends V> arVar) {
        boolean z = false;
        for (Map.Entry<? extends K, ? extends V> entry : arVar.entries()) {
            z |= put(entry.getKey(), entry.getValue());
        }
        return z;
    }

    @Override // com.google.c.c.ar
    public boolean put(K k2, V v) {
        return get(k2).add(v);
    }

    public Collection<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        k.a(iterable);
        Collection<V> removeAll = removeAll(k2);
        putAll(k2, iterable);
        return removeAll;
    }

    @Override // com.google.c.c.ar
    public boolean containsEntry(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        if (collection == null || !collection.contains(obj2)) {
            return false;
        }
        return true;
    }

    @Override // com.google.c.c.ar
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        if (collection == null || !collection.remove(obj2)) {
            return false;
        }
        return true;
    }

    public boolean putAll(K k2, Iterable<? extends V> iterable) {
        k.a(iterable);
        if (iterable instanceof Collection) {
            Collection<? extends V> collection = (Collection) iterable;
            if (collection.isEmpty() || !get(k2).addAll(collection)) {
                return false;
            }
            return true;
        }
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext() || !an.a(get(k2), it)) {
            return false;
        }
        return true;
    }
}
