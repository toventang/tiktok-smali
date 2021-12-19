package com.ss.android.socialbase.downloader.j;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final String f60692a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f60693b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f60694c;

    static {
        Covode.recordClassIndex(37462);
    }

    public a(String str) {
        this(str, false);
    }

    public final Thread newThread(Runnable runnable) {
        MethodCollector.i(11934);
        Thread thread = new Thread(runnable, this.f60692a + "-" + this.f60693b.incrementAndGet());
        if (!this.f60694c) {
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
        }
        MethodCollector.o(11934);
        return thread;
    }

    public a(String str, boolean z) {
        this.f60693b = new AtomicInteger();
        this.f60692a = str;
        this.f60694c = z;
    }
}
