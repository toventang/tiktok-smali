package com.google.c.h.a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

public abstract class c extends AbstractExecutorService implements s {
    static {
        Covode.recordClassIndex(33637);
    }

    @Override // com.google.c.h.a.s
    /* renamed from: a */
    public final <T> q<T> submit(Callable<T> callable) {
        return (q) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        return super.submit(runnable);
    }

    /* access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return w.a((Callable) callable);
    }

    /* access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return w.a(runnable, (Object) t);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return super.submit(runnable, obj);
    }
}
