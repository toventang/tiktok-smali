package com.ss.android.ugc.aweme.bullet.bridge.ad;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import h.p;
import org.json.JSONObject;

public final class DynamicAdViewSizeMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private final String f68874b = "getDCViewSize";

    static {
        Covode.recordClassIndex(42441);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68874b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DynamicAdViewSizeMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        p<Integer, Integer> b2 = FeedAdServiceImpl.c().b().b();
        if (b2.getSecond().intValue() == 0) {
            l.d("getDCViewSize failed", "");
            aVar.a(-1, "");
            return;
        }
        l.d("getDCViewSize success", "");
        aVar.a((Object) new JSONObject().put("viewPortWidth", b2.getFirst().intValue()).put("viewPortHeight", b2.getSecond().intValue()));
    }
}
