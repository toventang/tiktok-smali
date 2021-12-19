package com.bytedance.geckox.policy.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.q.a.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static int f29965a;

    /* renamed from: b  reason: collision with root package name */
    private static long f29966b;

    /* renamed from: c  reason: collision with root package name */
    private static long f29967c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f29968d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.geckox.statistic.model.a f29969e;

    /* renamed from: f  reason: collision with root package name */
    private int f29970f;

    static {
        Covode.recordClassIndex(17394);
    }

    public final synchronized void b() {
        MethodCollector.i(6999);
        f29965a = 0;
        MethodCollector.o(6999);
    }

    public final synchronized void c() {
        MethodCollector.i(7042);
        f29965a++;
        f29966b = System.currentTimeMillis();
        MethodCollector.o(7042);
    }

    public final synchronized void a() {
        MethodCollector.i(6997);
        if (System.currentTimeMillis() - f29966b > 60000) {
            f29965a = 0;
        }
        if (f29965a == 3 && this.f29970f == 1) {
            this.f29968d = true;
            f29967c = System.currentTimeMillis();
        } else {
            this.f29968d = false;
        }
        if (!this.f29968d || System.currentTimeMillis() - f29967c > 60000) {
            this.f29968d = false;
            MethodCollector.o(6997);
        } else {
            com.bytedance.geckox.i.a.a("gecko update request exception hit");
            this.f29969e.f30080h = 1;
            this.f29969e.f30081i = 601;
            e eVar = new e(601, "gecko update request is intercepted", new Throwable("gecko update request failed more than 3 times"));
            MethodCollector.o(6997);
            throw eVar;
        }
    }

    public a(int i2, com.bytedance.geckox.statistic.model.a aVar) {
        this.f29970f = i2;
        this.f29969e = aVar;
    }
}
