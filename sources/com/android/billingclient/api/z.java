package com.android.billingclient.api;

import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.h;
import com.bytedance.covode.number.Covode;

final class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ SkuDetails.a f5905a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ x f5906b;

    static {
        Covode.recordClassIndex(2468);
    }

    public final void run() {
        m mVar = this.f5906b.f5899a;
        h.a a2 = h.a();
        a2.f5854a = this.f5905a.f5783b;
        a2.f5855b = this.f5905a.f5784c;
        mVar.b(a2.a(), this.f5905a.f5782a);
    }

    z(x xVar, SkuDetails.a aVar) {
        this.f5906b = xVar;
        this.f5905a = aVar;
    }
}
