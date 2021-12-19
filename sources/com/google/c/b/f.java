package com.google.c.b;

import com.bytedance.covode.number.Covode;
import com.google.c.c.u;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;

public abstract class f<K, V> extends u implements b<K, V> {
    static {
        Covode.recordClassIndex(33278);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract b<K, V> c();

    protected f() {
    }

    @Override // com.google.c.b.b
    public final ConcurrentMap<K, V> a() {
        return c().a();
    }

    @Override // com.google.c.b.b
    public final void b(Object obj) {
        c().b(obj);
    }

    @Override // com.google.c.b.b
    public final V a(Object obj) {
        return c().a(obj);
    }

    @Override // com.google.c.b.b
    public final void a(K k2, V v) {
        c().a((Object) k2, (Object) v);
    }

    @Override // com.google.c.b.b
    public final V a(K k2, Callable<? extends V> callable) {
        return c().a((Object) k2, (Callable) callable);
    }
}
