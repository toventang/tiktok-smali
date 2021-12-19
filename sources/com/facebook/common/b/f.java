package com.facebook.common.b;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class f<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f47065a;

    /* renamed from: b  reason: collision with root package name */
    private final FutureTask<V> f47066b;

    static {
        Covode.recordClassIndex(28618);
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return this.f47066b.get();
    }

    public final boolean isCancelled() {
        return this.f47066b.isCancelled();
    }

    public final boolean isDone() {
        return this.f47066b.isDone();
    }

    public final void run() {
        this.f47066b.run();
    }

    public final boolean cancel(boolean z) {
        return this.f47066b.cancel(z);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) {
        return this.f47066b.get(j2, timeUnit);
    }

    public f(Handler handler, Callable<V> callable) {
        this.f47065a = handler;
        this.f47066b = new FutureTask<>(callable);
    }

    public f(Handler handler, Runnable runnable, V v) {
        this.f47065a = handler;
        this.f47066b = new FutureTask<>(runnable, v);
    }
}
