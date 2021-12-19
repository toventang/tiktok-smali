package com.benchmark.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static b f6186a = new b();

    /* renamed from: b  reason: collision with root package name */
    public AtomicBoolean f6187b = new AtomicBoolean(true);

    /* renamed from: c  reason: collision with root package name */
    public AtomicBoolean f6188c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    public final Object f6189d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public ScheduledExecutorService f6190e;

    /* renamed from: f  reason: collision with root package name */
    public volatile LinkedList<c> f6191f;

    /* renamed from: g  reason: collision with root package name */
    public long f6192g;

    /* renamed from: h  reason: collision with root package name */
    private Runnable f6193h;

    static {
        Covode.recordClassIndex(2999);
    }

    private b() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        l.a a2 = l.a(o.SCHEDULED);
        a2.f79174c = availableProcessors;
        this.f6190e = (ScheduledExecutorService) g.a(a2.a());
        this.f6191f = new LinkedList<>();
        this.f6192g = 10;
        AnonymousClass1 r1 = new Runnable() {
            /* class com.benchmark.d.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(3000);
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|61|58|4|3) */
            /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bf, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c0, code lost:
                r0.printStackTrace();
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
            /* JADX WARNING: Removed duplicated region for block: B:3:0x000f A[LOOP:1: B:3:0x000f->B:58:0x000f, LOOP_START, SYNTHETIC, Splitter:B:3:0x000f] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 201
                */
                throw new UnsupportedOperationException("Method not decompiled: com.benchmark.d.b.AnonymousClass1.run():void");
            }
        };
        this.f6193h = r1;
        this.f6190e.execute(r1);
    }

    public final List<c> a() {
        MethodCollector.i(6003);
        ArrayList arrayList = new ArrayList();
        synchronized (this.f6189d) {
            try {
                int size = this.f6191f.size();
                long currentTimeMillis = System.currentTimeMillis();
                for (int i2 = 0; i2 < size; i2++) {
                    c cVar = this.f6191f.get(i2);
                    Date date = cVar.f6197a;
                    date.getTime();
                    if (date.getTime() - currentTimeMillis < this.f6192g) {
                        arrayList.add(cVar);
                    }
                }
                this.f6191f.removeAll(arrayList);
            } catch (Throwable th) {
                MethodCollector.o(6003);
                throw th;
            }
        }
        arrayList.size();
        MethodCollector.o(6003);
        return arrayList;
    }

    public final void a(c cVar) {
        MethodCollector.i(6009);
        synchronized (this.f6189d) {
            int i2 = 0;
            try {
                if (this.f6191f.isEmpty()) {
                    this.f6191f.add(cVar);
                } else {
                    Iterator<c> it = this.f6191f.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (it.next().f6197a.after(cVar.f6197a)) {
                            this.f6191f.add(i2, cVar);
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i2 == this.f6191f.size()) {
                        this.f6191f.add(cVar);
                    }
                }
                this.f6189d.notifyAll();
                this.f6191f.size();
            } finally {
                MethodCollector.o(6009);
            }
        }
    }
}
