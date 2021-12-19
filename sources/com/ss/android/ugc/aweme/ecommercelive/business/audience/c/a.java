package com.ss.android.ugc.aweme.ecommercelive.business.audience.c;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.ecommercelive.business.audience.b.a f87786a;

    /* renamed from: b  reason: collision with root package name */
    private final b<com.ss.android.ugc.aweme.ecommercelive.business.audience.b.a, z> f87787b;

    static {
        Covode.recordClassIndex(55209);
    }

    public final void run() {
        com.ss.android.ugc.aweme.ecommercelive.business.audience.b.a aVar = this.f87786a;
        if (aVar != null) {
            this.f87787b.invoke(aVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.ecommercelive.business.audience.b.a, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(b<? super com.ss.android.ugc.aweme.ecommercelive.business.audience.b.a, z> bVar) {
        l.d(bVar, "");
        this.f87787b = bVar;
    }
}
