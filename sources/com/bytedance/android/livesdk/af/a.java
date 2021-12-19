package com.bytedance.android.livesdk.af;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.NegativeTestExperiment;
import com.bytedance.android.livesdk.livesetting.performance.NegativeTestAudienceExperiment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.o;
import h.f.b.l;
import h.f.b.z;
import h.h;
import h.i;
import h.m;
import java.util.concurrent.ExecutorService;

public final class a implements com.bytedance.android.live.l.a {

    /* renamed from: b  reason: collision with root package name */
    public static final h f13691b = i.a(m.SYNCHRONIZED, b.f13694a);

    /* renamed from: c  reason: collision with root package name */
    public static final C0287a f13692c = new C0287a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ExecutorService f13693a;

    /* renamed from: com.bytedance.android.livesdk.af.a$a  reason: collision with other inner class name */
    public static final class C0287a {
        static {
            Covode.recordClassIndex(7600);
        }

        private C0287a() {
        }

        public /* synthetic */ C0287a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f13694a = new b();

        static {
            Covode.recordClassIndex(7601);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a();
        }
    }

    static {
        Covode.recordClassIndex(7599);
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f13695a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.d f13696b;

        static {
            Covode.recordClassIndex(7602);
        }

        c(boolean z, z.d dVar) {
            this.f13695a = z;
            this.f13696b = dVar;
        }

        public final void run() {
            long cyclePeriod;
            MethodCollector.i(1149);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            while (true) {
                Thread currentThread = Thread.currentThread();
                l.b(currentThread, "");
                if (currentThread.isInterrupted()) {
                    MethodCollector.o(1149);
                    return;
                }
                if (this.f13695a) {
                    cyclePeriod = NegativeTestExperiment.INSTANCE.getCyclePeriod();
                } else {
                    cyclePeriod = NegativeTestAudienceExperiment.INSTANCE.getCyclePeriod();
                }
                if (elapsedRealtime2 - elapsedRealtime < cyclePeriod - this.f13696b.element) {
                    elapsedRealtime2 = SystemClock.elapsedRealtime();
                } else {
                    try {
                        com.bytedance.android.live.core.c.a.a(4, "negative_test", "sleep " + this.f13696b.element + "ms then set preTime and curTime");
                        Thread.sleep(this.f13696b.element);
                        elapsedRealtime = SystemClock.elapsedRealtime();
                        elapsedRealtime2 = SystemClock.elapsedRealtime();
                        com.bytedance.android.live.core.c.a.a(4, "negative_test", "sleep " + this.f13696b.element + "ms end");
                    } catch (InterruptedException unused) {
                        com.bytedance.android.live.core.c.a.a(4, "negative_test", "interceptor!!---> exit dead loop");
                        MethodCollector.o(1149);
                        return;
                    } catch (Exception e2) {
                        com.bytedance.android.live.core.c.a.a(4, "negative_test", e2.toString());
                        MethodCollector.o(1149);
                        return;
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.l.a
    public final void b(boolean z) {
        if (z) {
            if (!NegativeTestExperiment.INSTANCE.isEnable(true)) {
                return;
            }
        } else if (!NegativeTestAudienceExperiment.INSTANCE.isEnable(false)) {
            return;
        }
        ExecutorService executorService = this.f13693a;
        if (executorService != null) {
            executorService.shutdownNow();
        }
        this.f13693a = null;
    }

    @Override // com.bytedance.android.live.l.a
    public final void a(boolean z) {
        long cpuSleepTime;
        if (z) {
            if (!NegativeTestExperiment.INSTANCE.isEnable(true)) {
                return;
            }
        } else if (!NegativeTestAudienceExperiment.INSTANCE.isEnable(false)) {
            return;
        }
        z.d dVar = new z.d();
        if (z) {
            cpuSleepTime = NegativeTestExperiment.INSTANCE.getCpuSleepTime();
        } else {
            cpuSleepTime = NegativeTestAudienceExperiment.INSTANCE.getCpuSleepTime();
        }
        dVar.element = cpuSleepTime;
        ExecutorService a2 = g.a(com.ss.android.ugc.aweme.cw.l.a(o.SERIAL).a());
        this.f13693a = a2;
        if (a2 != null) {
            a2.submit(new c(z, dVar));
        }
    }
}
