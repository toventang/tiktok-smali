package com.bytedance.jedi.arch.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.j;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import h.f.b.ab;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.i;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;

public final class e implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public static final h f39480a = i.a((h.f.a.a) c.f39487a);

    /* renamed from: b  reason: collision with root package name */
    public static final h f39481b = i.a((h.f.a.a) b.f39486a);

    /* renamed from: c  reason: collision with root package name */
    public static final a f39482c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private final LinkedBlockingQueue<Runnable> f39483d = new LinkedBlockingQueue<>();

    /* renamed from: e  reason: collision with root package name */
    private Runnable f39484e;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ h.k.i[] f39485a = {new y(ab.a(a.class), "WORKER", "getWORKER()Ljava/util/concurrent/Executor;"), new y(ab.a(a.class), "UNBOUND_EXECUTOR", "getUNBOUND_EXECUTOR$arch_release()Ljava/util/concurrent/ExecutorService;")};

        private a() {
        }

        static {
            Covode.recordClassIndex(24295);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<Executor> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f39487a = new c();

        static {
            Covode.recordClassIndex(24297);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ Executor invoke() {
            return j.f39540f.invoke();
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f39488a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f39489b;

        static {
            Covode.recordClassIndex(24298);
        }

        d(e eVar, Runnable runnable) {
            this.f39488a = eVar;
            this.f39489b = runnable;
        }

        public final void run() {
            try {
                this.f39489b.run();
            } finally {
                this.f39488a.a();
            }
        }
    }

    static {
        Covode.recordClassIndex(24294);
    }

    static final class b extends m implements h.f.a.a<ExecutorService> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f39486a = new b();

        static {
            Covode.recordClassIndex(24296);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ExecutorService invoke() {
            int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
            return g.a(l.a(o.FIXED).a(availableProcessors).a(new a()).a());
        }
    }

    public final synchronized void a() {
        MethodCollector.i(6405);
        Runnable poll = this.f39483d.poll();
        if (poll != null) {
            ((Executor) f39480a.getValue()).execute(poll);
        } else {
            poll = null;
        }
        this.f39484e = poll;
        MethodCollector.o(6405);
    }

    public final synchronized void execute(Runnable runnable) {
        MethodCollector.i(6403);
        h.f.b.l.c(runnable, "");
        this.f39483d.offer(new d(this, runnable));
        if (this.f39484e == null) {
            a();
        }
        MethodCollector.o(6403);
    }
}
