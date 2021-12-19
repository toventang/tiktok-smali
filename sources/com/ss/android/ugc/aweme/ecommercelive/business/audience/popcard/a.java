package com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.b.b;
import h.f.b.l;
import h.z;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public b f87830a;

    /* renamed from: b  reason: collision with root package name */
    private final h.f.a.b<b, z> f87831b;

    static {
        Covode.recordClassIndex(55233);
    }

    public final void run() {
        b bVar = this.f87830a;
        if (bVar != null) {
            this.f87831b.invoke(bVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.ecommercelive.business.audience.b.b, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(h.f.a.b<? super b, z> bVar) {
        l.d(bVar, "");
        this.f87831b = bVar;
    }
}
