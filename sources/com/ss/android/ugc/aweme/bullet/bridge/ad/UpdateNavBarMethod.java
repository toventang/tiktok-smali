package com.ss.android.ugc.aweme.bullet.bridge.ad;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.crossplatform.b.a;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import org.json.JSONObject;

public final class UpdateNavBarMethod extends BaseBridgeMethod implements au {
    static {
        Covode.recordClassIndex(42480);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return "updateNavBar";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateNavBarMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        c.a(new a(jSONObject.optString("topbar_type", "")));
        aVar.a((Object) null);
    }
}
