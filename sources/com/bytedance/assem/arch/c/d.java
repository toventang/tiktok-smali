package com.bytedance.assem.arch.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class d implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final a f25516a = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicInteger f25517e = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    private final ThreadGroup f25518b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicInteger f25519c = new AtomicInteger(1);

    /* renamed from: d  reason: collision with root package name */
    private final String f25520d;

    public static final class a {
        static {
            Covode.recordClassIndex(14867);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(14866);
    }

    public d() {
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
        this.f25518b = threadGroup;
        this.f25520d = "pool-assem-core-" + f25517e.getAndIncrement() + "-thread-";
    }

    public final Thread newThread(Runnable runnable) {
        MethodCollector.i(2406);
        l.c(runnable, "");
        Thread thread = new Thread(this.f25518b, runnable, this.f25520d + this.f25519c.getAndIncrement(), 0);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        MethodCollector.o(2406);
        return thread;
    }
}
