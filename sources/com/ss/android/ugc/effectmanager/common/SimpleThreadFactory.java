package com.ss.android.ugc.effectmanager.common;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class SimpleThreadFactory implements ThreadFactory {
    private boolean ignoreStatusCheck;
    private String threadName;
    private AtomicInteger threadSeq;

    static {
        Covode.recordClassIndex(95255);
    }

    public SimpleThreadFactory(String str) {
        this(str, false);
    }

    public Thread newThread(Runnable runnable) {
        MethodCollector.i(248);
        Thread thread = new Thread(runnable, this.threadName + "-" + this.threadSeq.incrementAndGet());
        if (!this.ignoreStatusCheck) {
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
        }
        MethodCollector.o(248);
        return thread;
    }

    public SimpleThreadFactory(String str, boolean z) {
        this.threadSeq = new AtomicInteger();
        this.threadName = str;
        this.ignoreStatusCheck = z;
    }
}
