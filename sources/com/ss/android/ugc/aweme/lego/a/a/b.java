package com.ss.android.ugc.aweme.lego.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.lego.ac;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.n;
import com.ss.android.ugc.aweme.lego.p;
import com.ss.android.ugc.aweme.lego.w;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

public final class b extends v {

    /* renamed from: a  reason: collision with root package name */
    private Map<n, n> f107304a = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private Map<n, Integer> f107305c = new LinkedHashMap();

    static {
        Covode.recordClassIndex(68674);
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v, com.ss.android.ugc.e.a
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v, com.ss.android.ugc.e.a
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v
    public final ae c() {
        return ae.BACKGROUND;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.b$b  reason: collision with other inner class name */
    public static final class RunnableC2758b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f107308a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w f107309b;

        static {
            Covode.recordClassIndex(68676);
        }

        RunnableC2758b(b bVar, w wVar) {
            this.f107308a = bVar;
            this.f107309b = wVar;
        }

        public final void run() {
            this.f107308a.a(this.f107309b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f107306a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w f107307b;

        static {
            Covode.recordClassIndex(68675);
        }

        a(b bVar, w wVar) {
            this.f107306a = bVar;
            this.f107307b = wVar;
        }

        public final void run() {
            MethodCollector.i(11336);
            Thread currentThread = Thread.currentThread();
            l.b(currentThread, "");
            int priority = currentThread.getPriority();
            if (((com.ss.android.ugc.aweme.lego.a) this.f107307b).d() > 1) {
                Thread currentThread2 = Thread.currentThread();
                l.b(currentThread2, "");
                currentThread2.setPriority(((com.ss.android.ugc.aweme.lego.a) this.f107307b).d() + 4);
            }
            this.f107306a.a(this.f107307b);
            Thread currentThread3 = Thread.currentThread();
            l.b(currentThread3, "");
            currentThread3.setPriority(priority);
            MethodCollector.o(11336);
        }
    }

    private void b(w wVar) {
        ExecutorService a2;
        l.d(wVar, "");
        if (wVar instanceof com.ss.android.ugc.aweme.lego.a) {
            ac e2 = ((com.ss.android.ugc.aweme.lego.a) wVar).e();
            if (e2 != null) {
                int i2 = c.f107310a[e2.ordinal()];
                if (i2 == 1) {
                    a2 = g.a();
                    l.b(a2, "");
                } else if (i2 == 2) {
                    a2 = p.a(false);
                }
                a2.execute(new a(this, wVar));
                return;
            }
            throw new h.n();
        }
        p.a(false).execute(new RunnableC2758b(this, wVar));
    }

    public final void a(w wVar) {
        f.f107537b.b(wVar);
        n nVar = this.f107304a.get(wVar);
        if (nVar != null) {
            Integer num = this.f107305c.get(nVar);
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == 1) {
                    this.f107305c.remove(nVar);
                    Objects.requireNonNull(nVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoTask");
                    b((w) nVar);
                } else {
                    this.f107305c.put(nVar, Integer.valueOf(intValue - 1));
                }
            }
            this.f107304a.remove(wVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v, com.ss.android.ugc.e.a
    public final void a(List<? extends n> list) {
        l.d(list, "");
        super.a(list);
        for (n nVar : f.f107537b.a(ae.BACKGROUND, list)) {
            Objects.requireNonNull(nVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoTask");
            b((w) nVar);
        }
    }

    public final void a(n nVar, n nVar2) {
        l.d(nVar, "");
        l.d(nVar2, "");
        this.f107304a.put(nVar2, nVar);
        if (this.f107305c.get(nVar) == null) {
            this.f107305c.put(nVar, 1);
            return;
        }
        Map<n, Integer> map = this.f107305c;
        Integer num = map.get(nVar);
        if (num == null) {
            l.b();
        }
        map.put(nVar, Integer.valueOf(num.intValue() + 1));
    }
}
