package com.bytedance.android.livesdk.browser.jsbridge;

import com.bytedance.android.livesdk.browser.jsbridge.newmethods.z;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.e;

/* access modifiers changed from: package-private */
public final /* synthetic */ class s implements e.b {

    /* renamed from: a  reason: collision with root package name */
    private final c f14811a;

    static {
        Covode.recordClassIndex(8207);
    }

    s(c cVar) {
        this.f14811a = cVar;
    }

    @Override // com.bytedance.ies.web.jsbridge2.e.b
    public final e a() {
        return new z(this.f14811a.f14450a);
    }
}
