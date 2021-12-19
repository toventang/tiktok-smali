package com.ss.ugc.live.a.a;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final f f154055a;

    /* renamed from: b  reason: collision with root package name */
    private final c f154056b;

    static {
        Covode.recordClassIndex(102726);
    }

    i(f fVar, c cVar) {
        this.f154055a = fVar;
        this.f154056b = cVar;
    }

    public final void run() {
        f fVar = this.f154055a;
        c cVar = this.f154056b;
        cVar.b();
        fVar.c(cVar);
    }
}
