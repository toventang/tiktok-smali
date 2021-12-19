package com.google.c.c;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public abstract class c<K, V> extends d<K, V> implements ao<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    static {
        Covode.recordClassIndex(33485);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract List<V> b();

    @Override // com.google.c.c.ar, com.google.c.c.g
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.d
    public final /* synthetic */ Collection c() {
        return Collections.emptyList();
    }

    protected c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.c.c.g
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.d
    public final <E> Collection<E> a(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.c.c.d, com.google.c.c.ao, com.google.c.c.ar
    public List<V> get(K k2) {
        return (List) super.get((Object) k2);
    }

    @Override // com.google.c.c.d, com.google.c.c.ar
    public List<V> removeAll(Object obj) {
        return (List) super.removeAll(obj);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.d
    public final Collection<V> a(K k2, Collection<V> collection) {
        return a(k2, (List) collection, null);
    }

    @Override // com.google.c.c.d, com.google.c.c.ar, com.google.c.c.g
    public boolean put(K k2, V v) {
        return super.put(k2, v);
    }

    @Override // com.google.c.c.d, com.google.c.c.g
    public List<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        return (List) super.replaceValues((Object) k2, (Iterable) iterable);
    }
}
