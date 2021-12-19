package com.bytedance.ies.bullet.service.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.q;
import h.r;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class a<K, V> extends HashMap<K, V> implements e<K, V> {
    static {
        Covode.recordClassIndex(19264);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    public final Set getEntries() {
        return super.entrySet();
    }

    public final Set getKeys() {
        return super.keySet();
    }

    public final int getSize() {
        return super.size();
    }

    public final Collection getValues() {
        return super.values();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Set<K> keySet() {
        return getKeys();
    }

    public final int size() {
        return getSize();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Collection<V> values() {
        return getValues();
    }

    public final V getAny(K k2) {
        return get(k2);
    }

    @Override // com.bytedance.ies.bullet.service.a.e
    public final Boolean getBoolean(K k2) {
        V v = get(k2);
        if (!(v instanceof Boolean)) {
            v = null;
        }
        return v;
    }

    @Override // com.bytedance.ies.bullet.service.a.e
    public final String getString(K k2) {
        V v = get(k2);
        if (!(v instanceof String)) {
            v = null;
        }
        return v;
    }

    public final boolean putAnyIfAbsent(K k2, V v) {
        if (containsKey(k2)) {
            return false;
        }
        put(k2, v);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ies.bullet.service.a.a<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.bullet.service.a.e
    public final boolean putBooleanIfAbsent(K k2, boolean z) {
        Object obj;
        if (containsKey(k2)) {
            return false;
        }
        try {
            obj = q.m223constructorimpl(put(k2, Boolean.valueOf(z)));
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        return q.m229isSuccessimpl(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.bullet.service.a.e
    public final boolean putStringIfAbsent(K k2, String str) {
        Object obj;
        l.c(str, "");
        if (containsKey(k2)) {
            return false;
        }
        try {
            obj = q.m223constructorimpl(put(k2, str));
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        return q.m229isSuccessimpl(obj);
    }
}
