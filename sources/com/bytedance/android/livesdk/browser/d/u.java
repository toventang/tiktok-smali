package com.bytedance.android.livesdk.browser.d;

import com.bytedance.android.livesdk.browser.jsbridge.newmethods.bo;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.e;

final /* synthetic */ class u implements e.b {

    /* renamed from: a  reason: collision with root package name */
    private final h f14387a;

    static {
        Covode.recordClassIndex(7970);
    }

    u(h hVar) {
        this.f14387a = hVar;
    }

    @Override // com.bytedance.ies.web.jsbridge2.e.b
    public final e a() {
        h hVar = this.f14387a;
        hVar.r = new bo(hVar);
        return hVar.r;
    }
}
