package com.bytedance.assem.arch.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import h.h;
import h.i;
import h.m;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;

public final class c implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public static final h f25509a = i.a(m.NONE, b.f25513a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f25510b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final LinkedBlockingQueue<Runnable> f25511c = new LinkedBlockingQueue<>();

    /* renamed from: d  reason: collision with root package name */
    private Runnable f25512d;

    public static final class a {
        static {
            Covode.recordClassIndex(14863);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<ExecutorService> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f25513a = new b();

        static {
            Covode.recordClassIndex(14864);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ExecutorService invoke() {
            d dVar = new d();
            l.a a2 = l.a(o.FIXED);
            a2.f79174c = 1;
            a2.f79178g = dVar;
            return g.a(a2.a());
        }
    }

    /* renamed from: com.bytedance.assem.arch.c.c$c  reason: collision with other inner class name */
    static final class RunnableC0537c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f25514a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f25515b;

        static {
            Covode.recordClassIndex(14865);
        }

        RunnableC0537c(c cVar, Runnable runnable) {
            this.f25514a = cVar;
            this.f25515b = runnable;
        }

        public final void run() {
            try {
                this.f25515b.run();
            } finally {
                this.f25514a.a();
            }
        }
    }

    static {
        Covode.recordClassIndex(14862);
    }

    public final synchronized void a() {
        MethodCollector.i(2420);
        Runnable poll = this.f25511c.poll();
        if (poll != null) {
            ((ExecutorService) f25509a.getValue()).execute(poll);
        } else {
            poll = null;
        }
        this.f25512d = poll;
        MethodCollector.o(2420);
    }

    public final synchronized void execute(Runnable runnable) {
        MethodCollector.i(2418);
        h.f.b.l.c(runnable, "");
        this.f25511c.offer(new RunnableC0537c(this, runnable));
        if (this.f25512d == null) {
            a();
        }
        MethodCollector.o(2418);
    }
}
