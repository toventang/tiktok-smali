package com.google.c.c;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* access modifiers changed from: package-private */
public final class y<K, V> extends f<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final K key;
    final V value;

    static {
        Covode.recordClassIndex(33543);
    }

    @Override // java.util.Map.Entry, com.google.c.c.f
    public final K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry, com.google.c.c.f
    public final V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry, com.google.c.c.f
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    y(K k2, V v) {
        this.key = k2;
        this.value = v;
    }
}
