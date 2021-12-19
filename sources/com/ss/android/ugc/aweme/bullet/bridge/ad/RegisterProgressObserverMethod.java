package com.ss.android.ugc.aweme.bullet.bridge.ad;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.ad.c.p;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import org.json.JSONArray;
import org.json.JSONObject;

public final class RegisterProgressObserverMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private final String f68921b = "registerProgressObserver";

    static {
        Covode.recordClassIndex(42474);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68921b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegisterProgressObserverMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        JSONArray optJSONArray = jSONObject.optJSONArray("timer_list");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            aVar.a(-1, "timer_list is empty");
            return;
        }
        com.bytedance.ies.bullet.c.c.i g2 = g();
        if (g2 != null) {
            c.a(new p(optJSONArray, g2));
        }
        aVar.a((Object) null);
    }
}
