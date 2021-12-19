package com.ss.android.ugc.aweme.bullet.bridge.ad;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import org.json.JSONObject;

public final class AdLynxSuperLikeStatus extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private final String f68858b = "adLynxSuperLikeStatus";

    static {
        Covode.recordClassIndex(42425);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68858b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdLynxSuperLikeStatus(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        if (!jSONObject.has("status")) {
            aVar.a(-1, "status is empty");
            return;
        }
        c.a(new com.ss.android.ugc.aweme.ad.c.i(jSONObject.optInt("status")));
        aVar.a((Object) null);
    }
}
