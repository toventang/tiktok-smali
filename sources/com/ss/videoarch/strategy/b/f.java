package com.ss.videoarch.strategy.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadPoolExecutor f154452a = new ThreadPoolExecutor(3, 5, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a((byte) 0));

    static {
        Covode.recordClassIndex(102933);
    }

    f() {
    }

    static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final ThreadGroup f154453a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicInteger f154454b;

        /* renamed from: c  reason: collision with root package name */
        private final String f154455c;

        static {
            Covode.recordClassIndex(102934);
        }

        private a() {
            ThreadGroup threadGroup;
            this.f154454b = new AtomicInteger(1);
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f154453a = threadGroup;
            this.f154455c = "live-strategy-network-";
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final Thread newThread(Runnable runnable) {
            MethodCollector.i(6911);
            Thread thread = new Thread(this.f154453a, runnable, this.f154455c + this.f154454b.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            MethodCollector.o(6911);
            return thread;
        }
    }

    public final void a(Runnable runnable) {
        MethodCollector.i(5772);
        this.f154452a.execute(runnable);
        MethodCollector.o(5772);
    }
}
