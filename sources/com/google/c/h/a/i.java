package com.google.c.h.a;

import com.bytedance.covode.number.Covode;
import com.google.c.c.u;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class i<V> extends u implements Future<V> {
    static {
        Covode.recordClassIndex(33646);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Future<? extends V> c();

    protected i() {
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return (V) c().get();
    }

    public boolean isCancelled() {
        return c().isCancelled();
    }

    public boolean isDone() {
        return c().isDone();
    }

    public boolean cancel(boolean z) {
        return c().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) {
        return (V) c().get(j2, timeUnit);
    }
}
