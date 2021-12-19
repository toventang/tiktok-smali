package com.ss.android.ugc.aweme.preload.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import f.a.aa;
import f.a.e.g.m;
import h.f.b.l;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f115734e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final PriorityBlockingQueue<b> f115735a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f115736b;

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f115737c;

    /* renamed from: d  reason: collision with root package name */
    public final int f115738d;

    static {
        Covode.recordClassIndex(74673);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(74674);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.preload.a.c$c  reason: collision with other inner class name */
    public static final class C2957c {

        /* renamed from: a  reason: collision with root package name */
        static c f115741a = new c((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final C2957c f115742b = new C2957c();

        private C2957c() {
        }

        static {
            Covode.recordClassIndex(74676);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Comparable<b>, Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final e f115739a;

        /* renamed from: b  reason: collision with root package name */
        private final Runnable f115740b;

        static {
            Covode.recordClassIndex(74675);
        }

        public final int hashCode() {
            return this.f115739a.hashCode();
        }

        public final void run() {
            this.f115740b.run();
        }

        public final String toString() {
            return "ComparableRunnable{taskInfo=" + this.f115739a + '}';
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(b bVar) {
            b bVar2 = bVar;
            if (bVar2 == null) {
                return 1;
            }
            return bVar2.f115739a.f115757c - this.f115739a.f115757c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || (!l.a(getClass(), obj.getClass()))) {
                return false;
            }
            return this.f115739a.equals(((b) obj).f115739a);
        }

        public b(e eVar, Runnable runnable) {
            l.d(eVar, "");
            l.d(runnable, "");
            this.f115739a = eVar;
            this.f115740b = runnable;
        }
    }

    static final class e extends aa.c {

        /* renamed from: a  reason: collision with root package name */
        public final PriorityBlockingQueue<b> f115746a;

        /* renamed from: b  reason: collision with root package name */
        private final f.a.b.a f115747b = new f.a.b.a();

        /* renamed from: c  reason: collision with root package name */
        private final e f115748c;

        static {
            Covode.recordClassIndex(74679);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f115747b.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f115747b.isDisposed();
        }

        public static final class a implements Future<Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f115749a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f115750b;

            static {
                Covode.recordClassIndex(74680);
            }

            @Override // java.util.concurrent.Future
            public final Object get() {
                return null;
            }

            @Override // java.util.concurrent.Future
            public final Object get(long j2, TimeUnit timeUnit) {
                l.d(timeUnit, "");
                return null;
            }

            public final boolean isCancelled() {
                return false;
            }

            public final boolean isDone() {
                return false;
            }

            public final boolean cancel(boolean z) {
                return this.f115749a.f115746a.remove(this.f115750b);
            }

            a(e eVar, b bVar) {
                this.f115749a = eVar;
                this.f115750b = bVar;
            }
        }

        @Override // f.a.aa.c
        public final f.a.b.b a(Runnable runnable) {
            l.d(runnable, "");
            return a(runnable, 0, TimeUnit.MILLISECONDS);
        }

        public e(e eVar, PriorityBlockingQueue<b> priorityBlockingQueue) {
            l.d(eVar, "");
            l.d(priorityBlockingQueue, "");
            this.f115748c = eVar;
            this.f115746a = priorityBlockingQueue;
        }

        @Override // f.a.aa.c
        public final f.a.b.b a(Runnable runnable, long j2, TimeUnit timeUnit) {
            l.d(runnable, "");
            l.d(timeUnit, "");
            b bVar = new b(this.f115748c, runnable);
            m mVar = new m(bVar, this.f115747b);
            mVar.setFuture(new a(this, bVar));
            this.f115747b.a(mVar);
            while (this.f115746a.contains(bVar)) {
                this.f115746a.remove(bVar);
            }
            this.f115746a.offer(bVar, j2, timeUnit);
            return mVar;
        }
    }

    final class d extends aa {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f115743a;

        /* renamed from: c  reason: collision with root package name */
        private final e f115744c;

        static {
            Covode.recordClassIndex(74677);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f115745a;

            static {
                Covode.recordClassIndex(74678);
            }

            a(d dVar) {
                this.f115745a = dVar;
            }

            public final void run() {
                while (true) {
                    try {
                        this.f115745a.f115743a.f115735a.take().run();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
        }

        @Override // f.a.aa
        public final aa.c a() {
            MethodCollector.i(9634);
            synchronized (this.f115743a.f115736b) {
                try {
                    if (this.f115743a.f115736b.get() < this.f115743a.f115738d) {
                        this.f115743a.f115736b.incrementAndGet();
                        this.f115743a.f115737c.submit(new a(this));
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9634);
                    throw th;
                }
            }
            e eVar = new e(this.f115744c, this.f115743a.f115735a);
            MethodCollector.o(9634);
            return eVar;
        }

        public d(c cVar, e eVar) {
            l.d(eVar, "");
            this.f115743a = cVar;
            this.f115744c = eVar;
        }
    }

    private c() {
        this.f115738d = 1;
        this.f115735a = new PriorityBlockingQueue<>();
        this.f115736b = new AtomicInteger();
        l.a a2 = com.ss.android.ugc.aweme.cw.l.a(o.FIXED);
        a2.f79174c = 1;
        ExecutorService a3 = g.a(a2.a());
        h.f.b.l.b(a3, "");
        this.f115737c = a3;
    }

    public /* synthetic */ c(byte b2) {
        this();
    }
}
