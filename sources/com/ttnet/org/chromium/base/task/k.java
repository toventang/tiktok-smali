package com.ttnet.org.chromium.base.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

final class k implements Executor {

    /* renamed from: a  reason: collision with root package name */
    final ArrayDeque<Runnable> f155329a = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    Runnable f155330b;

    static {
        Covode.recordClassIndex(103352);
    }

    k() {
    }

    /* access modifiers changed from: protected */
    public final synchronized void a() {
        MethodCollector.i(11153);
        Runnable poll = this.f155329a.poll();
        this.f155330b = poll;
        if (poll != null) {
            a.f155303a.execute(this.f155330b);
        }
        MethodCollector.o(11153);
    }

    public final synchronized void execute(final Runnable runnable) {
        MethodCollector.i(11152);
        this.f155329a.offer(new Runnable() {
            /* class com.ttnet.org.chromium.base.task.k.AnonymousClass1 */

            static {
                Covode.recordClassIndex(103353);
            }

            public final void run() {
                try {
                    runnable.run();
                } finally {
                    k.this.a();
                }
            }
        });
        if (this.f155330b == null) {
            a();
        }
        MethodCollector.o(11152);
    }
}
