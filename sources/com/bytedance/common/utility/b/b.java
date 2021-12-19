package com.bytedance.common.utility.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private String f26888a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicInteger f26889b = new AtomicInteger();

    /* renamed from: c  reason: collision with root package name */
    private boolean f26890c;

    static {
        Covode.recordClassIndex(15876);
    }

    public b(String str) {
        this.f26888a = str;
        this.f26890c = true;
    }

    public final Thread newThread(Runnable runnable) {
        MethodCollector.i(1925);
        Thread thread = new Thread(runnable, this.f26888a + "-" + this.f26889b.incrementAndGet());
        if (!this.f26890c) {
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
        }
        MethodCollector.o(1925);
        return thread;
    }
}
