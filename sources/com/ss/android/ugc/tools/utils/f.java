package com.ss.android.ugc.tools.utils;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class f extends ThreadPoolExecutor {
    static {
        Covode.recordClassIndex(98743);
    }

    /* access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        Callable<T> callable2;
        l.d(callable, "");
        if (!(callable instanceof Comparable)) {
            callable2 = null;
        } else {
            callable2 = callable;
        }
        return new e(callable, (Comparable) callable2);
    }

    /* access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        Runnable runnable2;
        l.d(runnable, "");
        if (!(runnable instanceof Comparable)) {
            runnable2 = null;
        } else {
            runnable2 = runnable;
        }
        return new e(runnable, t, (Comparable) runnable2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(int i2, int i3, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        super(i2, i3, 8000, timeUnit, blockingQueue);
        l.d(timeUnit, "");
        l.d(blockingQueue, "");
    }
}
