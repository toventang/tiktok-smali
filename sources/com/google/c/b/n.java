package com.google.c.b;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import java.util.AbstractMap;

public final class n<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;
    private final l cause;

    static {
        Covode.recordClassIndex(33345);
    }

    public final l getCause() {
        return this.cause;
    }

    public final boolean wasEvicted() {
        return this.cause.a();
    }

    public static <K, V> n<K, V> create(K k2, V v, l lVar) {
        return new n<>(k2, v, lVar);
    }

    private n(K k2, V v, l lVar) {
        super(k2, v);
        this.cause = (l) k.a(lVar);
    }
}
