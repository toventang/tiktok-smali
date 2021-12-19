package com.ss.optimizer.live.sdk.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadPoolExecutor f151687a = new ThreadPoolExecutor(3, 5, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a((byte) 0));

    static {
        Covode.recordClassIndex(101188);
    }

    f() {
    }

    static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final ThreadGroup f151688a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicInteger f151689b;

        /* renamed from: c  reason: collision with root package name */
        private final String f151690c;

        static {
            Covode.recordClassIndex(101189);
        }

        private a() {
            ThreadGroup threadGroup;
            this.f151689b = new AtomicInteger(1);
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f151688a = threadGroup;
            this.f151690c = "live-sdk-";
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final Thread newThread(Runnable runnable) {
            MethodCollector.i(3649);
            Thread thread = new Thread(this.f151688a, runnable, this.f151690c + this.f151689b.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            MethodCollector.o(3649);
            return thread;
        }
    }

    public final void a(Runnable runnable) {
        MethodCollector.i(3641);
        this.f151687a.execute(runnable);
        MethodCollector.o(3641);
    }
}
