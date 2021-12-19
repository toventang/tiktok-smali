package d.a.b.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import d.a.b.d.h;
import h.f.b.l;
import h.z;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    private final e f156556a;

    static final class a implements h.a {

        /* renamed from: c  reason: collision with root package name */
        public static final C4133a f156557c = new C4133a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public volatile ScheduledExecutorService f156558a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f156559b = new Object();

        /* renamed from: d  reason: collision with root package name */
        private final e f156560d;

        static {
            Covode.recordClassIndex(103953);
        }

        /* renamed from: d.a.b.d.d$a$a  reason: collision with other inner class name */
        static final class C4133a {
            static {
                Covode.recordClassIndex(103954);
            }

            private C4133a() {
            }

            /* renamed from: d.a.b.d.d$a$a$a  reason: collision with other inner class name */
            static final class RunnableC4134a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h.f.a.a f156561a;

                static {
                    Covode.recordClassIndex(103955);
                }

                RunnableC4134a(h.f.a.a aVar) {
                    this.f156561a = aVar;
                }

                public final void run() {
                    try {
                        this.f156561a.invoke();
                    } catch (Throwable unused) {
                    }
                }
            }

            public /* synthetic */ C4133a(byte b2) {
                this();
            }
        }

        @Override // d.a.b.d.h.a
        public final void a() {
            ScheduledExecutorService scheduledExecutorService = this.f156558a;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
        }

        public a(e eVar) {
            l.c(eVar, "");
            this.f156560d = eVar;
            this.f156558a = eVar.a();
        }

        @Override // d.a.b.d.h.a
        public final void a(h.f.a.a<z> aVar) {
            MethodCollector.i(7484);
            l.c(aVar, "");
            if (this.f156558a != null) {
                synchronized (this.f156559b) {
                    try {
                        ScheduledExecutorService scheduledExecutorService = this.f156558a;
                        if (scheduledExecutorService != null) {
                            scheduledExecutorService.schedule(new C4133a.RunnableC4134a(aVar), 0, TimeUnit.MILLISECONDS);
                        }
                    } finally {
                        MethodCollector.o(7484);
                    }
                }
                return;
            }
            MethodCollector.o(7484);
        }
    }

    static {
        Covode.recordClassIndex(103952);
    }

    @Override // d.a.b.d.h
    public final h.a a() {
        return new a(this.f156556a);
    }

    public d(e eVar) {
        l.c(eVar, "");
        this.f156556a = eVar;
    }
}
