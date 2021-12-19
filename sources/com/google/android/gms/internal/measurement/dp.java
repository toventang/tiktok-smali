package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class dp<K, V> implements Serializable, Map<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private static final Map.Entry<?, ?>[] f50782a = new Map.Entry[0];

    /* renamed from: b  reason: collision with root package name */
    private transient dt<Map.Entry<K, V>> f50783b;

    /* renamed from: c  reason: collision with root package name */
    private transient dt<K> f50784c;

    /* renamed from: d  reason: collision with root package name */
    private transient dm<V> f50785d;

    /* access modifiers changed from: package-private */
    public abstract dt<Map.Entry<K, V>> a();

    /* access modifiers changed from: package-private */
    public abstract dt<K> b();

    /* access modifiers changed from: package-private */
    public abstract dm<V> c();

    @Override // java.util.Map
    public abstract V get(Object obj);

    dp() {
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    static {
        Covode.recordClassIndex(31736);
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        dt<Map.Entry<K, V>> dtVar = this.f50783b;
        if (dtVar != null) {
            return dtVar;
        }
        dt<Map.Entry<K, V>> a2 = a();
        this.f50783b = a2;
        return a2;
    }

    public int hashCode() {
        return ej.a(entrySet());
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        dt<K> dtVar = this.f50784c;
        if (dtVar != null) {
            return dtVar;
        }
        dt<K> b2 = b();
        this.f50784c = b2;
        return b2;
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        dm<V> dmVar = this.f50785d;
        if (dmVar != null) {
            return dmVar;
        }
        dm<V> c2 = c();
        this.f50785d = c2;
        return c2;
    }

    public String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder append = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824L)).append('{');
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
        throw new IllegalArgumentException(new StringBuilder("size".length() + 40).append("size").append(" cannot be negative but was: ").append(size).toString());
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        return ((dm) values()).contains(obj);
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
}
