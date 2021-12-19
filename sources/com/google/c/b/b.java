package com.google.c.b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;

public interface b<K, V> {
    static {
        Covode.recordClassIndex(33268);
    }

    V a(Object obj);

    V a(K k2, Callable<? extends V> callable);

    ConcurrentMap<K, V> a();

    void a(K k2, V v);

    void b(Object obj);
}
