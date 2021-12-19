package com.bytedance.common.utility.b;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class d extends ThreadPoolExecutor {

    /* renamed from: a  reason: collision with root package name */
    private static final RejectedExecutionHandler f26913a = new ThreadPoolExecutor.AbortPolicy();

    public final void shutdown() {
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return new ArrayList();
    }

    static {
        Covode.recordClassIndex(15882);
    }

    public d(int i2, int i3, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i2, i3, 30, timeUnit, blockingQueue, threadFactory, f26913a);
    }

    public d(int i2, int i3, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i2, i3, 30, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
    }
}
