package com.bytedance.geckox.policy.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private ExecutorService f29959a = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, this.f29960b.f29962a, new ThreadFactory() {
        /* class com.bytedance.geckox.policy.c.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(17391);
        }

        public final Thread newThread(Runnable runnable) {
            MethodCollector.i(6906);
            Thread thread = new Thread(runnable);
            thread.setName("gecko-update-thread");
            thread.setPriority(3);
            MethodCollector.o(6906);
            return thread;
        }
    });

    /* renamed from: b  reason: collision with root package name */
    private b f29960b = new b();

    static {
        Covode.recordClassIndex(17390);
    }

    public final void execute(Runnable runnable) {
        this.f29959a.execute(runnable);
    }
}
