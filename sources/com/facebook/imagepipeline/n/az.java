package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

public final class az {

    /* renamed from: a  reason: collision with root package name */
    private boolean f48282a;

    /* renamed from: b  reason: collision with root package name */
    private final Deque<Runnable> f48283b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f48284c;

    static {
        Covode.recordClassIndex(29137);
    }

    public final synchronized boolean c() {
        boolean z;
        MethodCollector.i(11833);
        z = this.f48282a;
        MethodCollector.o(11833);
        return z;
    }

    public final synchronized void a() {
        MethodCollector.i(11666);
        this.f48282a = true;
        MethodCollector.o(11666);
    }

    public final synchronized void b() {
        MethodCollector.i(11830);
        this.f48282a = false;
        while (!this.f48283b.isEmpty()) {
            this.f48284c.execute(this.f48283b.pop());
        }
        this.f48283b.clear();
        MethodCollector.o(11830);
    }

    public az(Executor executor) {
        this.f48284c = (Executor) i.a(executor);
    }

    public final synchronized void b(Runnable runnable) {
        MethodCollector.i(11832);
        this.f48283b.remove(runnable);
        MethodCollector.o(11832);
    }

    public final synchronized void a(Runnable runnable) {
        MethodCollector.i(11665);
        if (this.f48282a) {
            this.f48283b.add(runnable);
            MethodCollector.o(11665);
            return;
        }
        this.f48284c.execute(runnable);
        MethodCollector.o(11665);
    }
}
