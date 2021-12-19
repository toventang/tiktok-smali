package com.bytedance.jedi.a.g.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.g.a.c;
import java.util.AbstractMap;

public final class g<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;
    private final e cause;

    static {
        Covode.recordClassIndex(24051);
    }

    public final e getCause() {
        return this.cause;
    }

    public final boolean wasEvicted() {
        return this.cause.a();
    }

    public static <K, V> g<K, V> create(K k2, V v, e eVar) {
        return new g<>(k2, v, eVar);
    }

    private g(K k2, V v, e eVar) {
        super(k2, v);
        this.cause = (e) c.a(eVar);
    }
}
