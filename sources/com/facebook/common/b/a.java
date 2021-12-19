package com.facebook.common.b;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

public final class a extends AbstractExecutorService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f47054a = new a();

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j2, TimeUnit timeUnit) {
        return true;
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final void shutdown() {
    }

    private a() {
    }

    public static a a() {
        return f47054a;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }

    static {
        Covode.recordClassIndex(28612);
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
