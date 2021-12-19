package com.android.billingclient.api;

import com.android.billingclient.api.h;
import com.bytedance.covode.number.Covode;

final class ad implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ int f5795a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f5796b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ ac f5797c;

    static {
        Covode.recordClassIndex(2429);
    }

    public final void run() {
        c cVar = this.f5797c.f5792a;
        h.a a2 = h.a();
        a2.f5854a = this.f5795a;
        a2.f5855b = this.f5796b;
        cVar.a(a2.a());
    }

    ad(ac acVar, int i2, String str) {
        this.f5797c = acVar;
        this.f5795a = i2;
        this.f5796b = str;
    }
}
