package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;

public final class j extends e<Object, Object> {

    /* renamed from: a  reason: collision with root package name */
    private a f14682a;

    public interface a {
        static {
            Covode.recordClassIndex(8155);
        }

        void d();
    }

    static {
        Covode.recordClassIndex(8154);
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
    }

    public j(a aVar) {
        this.f14682a = aVar;
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void invoke(Object obj, g gVar) {
        a aVar = this.f14682a;
        if (aVar != null) {
            aVar.d();
        }
    }
}
