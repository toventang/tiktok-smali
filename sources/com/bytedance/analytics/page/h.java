package com.bytedance.analytics.page;

import com.bytedance.analytics.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f6590a;

    static {
        Covode.recordClassIndex(3169);
    }

    h(a aVar) {
        this.f6590a = aVar;
    }

    public final void run() {
        a aVar = this.f6590a;
        l.d(aVar, "");
        g.a(aVar);
        com.bytedance.analytics.b.a.a("pushDelay", "fragmentViewNull");
    }
}
