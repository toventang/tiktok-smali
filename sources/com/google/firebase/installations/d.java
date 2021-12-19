package com.google.firebase.installations;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f54578a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f54579b = false;

    static {
        Covode.recordClassIndex(33855);
    }

    d(c cVar) {
        this.f54578a = cVar;
    }

    public final void run() {
        c cVar = this.f54578a;
        boolean z = this.f54579b;
        com.google.firebase.installations.a.d d2 = cVar.d();
        if (z) {
            d2 = d2.h().b((String) null).a();
        }
        cVar.a(d2);
        cVar.f54564a.execute(new g(cVar, z));
    }
}
