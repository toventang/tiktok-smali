package com.bytedance.android.livesdk.browser.d;

import com.bytedance.android.livesdk.browser.jsbridge.newmethods.bn;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.e;

final /* synthetic */ class t implements e.b {

    /* renamed from: a  reason: collision with root package name */
    private final h f14386a;

    static {
        Covode.recordClassIndex(7969);
    }

    t(h hVar) {
        this.f14386a = hVar;
    }

    @Override // com.bytedance.ies.web.jsbridge2.e.b
    public final e a() {
        h hVar = this.f14386a;
        hVar.o = new bn(hVar);
        return hVar.o;
    }
}
