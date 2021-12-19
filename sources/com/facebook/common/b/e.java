package com.facebook.common.b;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class e extends AbstractExecutorService implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f47064a;

    static {
        Covode.recordClassIndex(28617);
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public final boolean a() {
        if (Thread.currentThread() == this.f47064a.getLooper().getThread()) {
            return true;
        }
        return false;
    }

    public e(Handler handler) {
        this.f47064a = handler;
    }

    public void execute(Runnable runnable) {
        this.f47064a.post(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* synthetic */ Future submit(Runnable runnable) {
        return submit(runnable, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public <T> f<T> newTaskFor(Callable<T> callable) {
        return new f<>(this.f47064a, callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* synthetic */ Future submit(Callable callable) {
        Objects.requireNonNull(callable);
        f a2 = newTaskFor(callable);
        execute(a2);
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public <T> f<T> newTaskFor(Runnable runnable, T t) {
        return new f<>(this.f47064a, runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public <T> ScheduledFuture<T> submit(Runnable runnable, T t) {
        Objects.requireNonNull(runnable);
        f<T> a2 = newTaskFor(runnable, t);
        execute(a2);
        return a2;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        f a2 = newTaskFor(runnable, null);
        this.f47064a.postDelayed(a2, timeUnit.toMillis(j2));
        return a2;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j2, TimeUnit timeUnit) {
        f a2 = newTaskFor(callable);
        this.f47064a.postDelayed(a2, timeUnit.toMillis(j2));
        return a2;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}
