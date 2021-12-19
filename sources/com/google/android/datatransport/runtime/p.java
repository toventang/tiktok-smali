package com.google.android.datatransport.runtime;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.d;
import com.google.android.datatransport.runtime.d.a;
import com.google.android.datatransport.runtime.scheduling.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.h;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.o;

public class p implements o {

    /* renamed from: b  reason: collision with root package name */
    private static volatile q f49459b;

    /* renamed from: a  reason: collision with root package name */
    public final h f49460a;

    /* renamed from: c  reason: collision with root package name */
    private final a f49461c;

    /* renamed from: d  reason: collision with root package name */
    private final a f49462d;

    /* renamed from: e  reason: collision with root package name */
    private final e f49463e;

    static {
        Covode.recordClassIndex(30954);
    }

    public static p a() {
        q qVar = f49459b;
        if (qVar != null) {
            return qVar.a();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void a(Context context) {
        MethodCollector.i(4171);
        if (f49459b == null) {
            synchronized (p.class) {
                try {
                    if (f49459b == null) {
                        f49459b = new d.a((byte) 0).a(context).a();
                    }
                } finally {
                    MethodCollector.o(4171);
                }
            }
            return;
        }
        MethodCollector.o(4171);
    }

    @Override // com.google.android.datatransport.runtime.o
    public final void a(j jVar, com.google.android.datatransport.h hVar) {
        e eVar = this.f49463e;
        k a2 = jVar.a();
        eVar.a(k.d().a(a2.a()).a(jVar.c().c()).a(a2.b()).a(), h.i().a(this.f49461c.a()).b(this.f49462d.a()).a(jVar.b()).a(new g(jVar.e(), jVar.d().a(jVar.c().b()))).a(jVar.c().a()).b(), hVar);
    }

    p(a aVar, a aVar2, e eVar, h hVar, o oVar) {
        this.f49461c = aVar;
        this.f49462d = aVar2;
        this.f49463e = eVar;
        this.f49460a = hVar;
        oVar.f49603a.execute(new com.google.android.datatransport.runtime.scheduling.jobscheduling.p(oVar));
    }
}
