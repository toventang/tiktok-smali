package com.bytedance.jedi.arch.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final C0964a f39465a = new C0964a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicInteger f39466e = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    private final ThreadGroup f39467b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicInteger f39468c = new AtomicInteger(1);

    /* renamed from: d  reason: collision with root package name */
    private final String f39469d;

    /* renamed from: com.bytedance.jedi.arch.internal.a$a  reason: collision with other inner class name */
    public static final class C0964a {
        static {
            Covode.recordClassIndex(24286);
        }

        private C0964a() {
        }

        public /* synthetic */ C0964a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(24285);
    }

    public a() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            threadGroup = securityManager.getThreadGroup();
        } else {
            Thread currentThread = Thread.currentThread();
            l.a((Object) currentThread, "");
            threadGroup = currentThread.getThreadGroup();
        }
        l.a((Object) threadGroup, "");
        this.f39467b = threadGroup;
        this.f39469d = "pool-jedi-core-" + f39466e.getAndIncrement() + "-thread-";
    }

    public final Thread newThread(Runnable runnable) {
        MethodCollector.i(6460);
        l.c(runnable, "");
        Thread thread = new Thread(this.f39467b, runnable, this.f39469d + this.f39468c.getAndIncrement(), 0);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        MethodCollector.o(6460);
        return thread;
    }
}
