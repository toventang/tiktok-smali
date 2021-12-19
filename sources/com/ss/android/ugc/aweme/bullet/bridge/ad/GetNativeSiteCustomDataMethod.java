package com.ss.android.ugc.aweme.bullet.bridge.ad;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.bullet.module.ad.c;
import h.f.b.l;
import org.json.JSONObject;

public final class GetNativeSiteCustomDataMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private final String f68877b = "getNativeSiteCustomData";

    static {
        Covode.recordClassIndex(42447);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68877b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetNativeSiteCustomDataMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        c cVar;
        String str = "";
        l.d(jSONObject, str);
        l.d(aVar, str);
        JSONObject jSONObject2 = new JSONObject();
        com.bytedance.ies.bullet.c.c.i g2 = g();
        if (!(g2 == null || (cVar = (c) g2.a(c.class)) == null)) {
            String b2 = cVar.ah.b();
            if (b2 != null) {
                str = b2;
            }
            jSONObject2.put("customData", str);
        }
        aVar.a(jSONObject2);
    }
}
