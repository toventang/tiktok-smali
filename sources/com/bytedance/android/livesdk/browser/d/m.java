package com.bytedance.android.livesdk.browser.d;

import com.bytedance.android.livesdk.browser.jsbridge.newmethods.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.e;

final /* synthetic */ class m implements e.b {

    /* renamed from: a  reason: collision with root package name */
    private final h f14379a;

    static {
        Covode.recordClassIndex(7962);
    }

    m(h hVar) {
        this.f14379a = hVar;
    }

    @Override // com.bytedance.ies.web.jsbridge2.e.b
    public final e a() {
        h hVar = this.f14379a;
        hVar.s = new t(hVar);
        return hVar.s;
    }
}
