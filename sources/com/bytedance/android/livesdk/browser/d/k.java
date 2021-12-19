package com.bytedance.android.livesdk.browser.d;

import com.bytedance.android.livesdk.browser.jsbridge.newmethods.br;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.e;

final /* synthetic */ class k implements e.b {

    /* renamed from: a  reason: collision with root package name */
    private final h f14377a;

    static {
        Covode.recordClassIndex(7960);
    }

    k(h hVar) {
        this.f14377a = hVar;
    }

    @Override // com.bytedance.ies.web.jsbridge2.e.b
    public final e a() {
        h hVar = this.f14377a;
        hVar.p = new br(hVar);
        return hVar.p;
    }
}
