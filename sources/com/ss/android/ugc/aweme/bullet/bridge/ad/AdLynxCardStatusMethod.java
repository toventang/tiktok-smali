package com.ss.android.ugc.aweme.bullet.bridge.ad;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.c.e.a.c;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.ss.android.ugc.aweme.ad.c.g;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class AdLynxCardStatusMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private final String f68857b = "adLynxCardStatus";

    static {
        Covode.recordClassIndex(42424);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68857b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdLynxCardStatusMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        Object b2;
        l.d(jSONObject, "");
        l.d(aVar, "");
        if (!jSONObject.has("status")) {
            aVar.a(-1, "status is empty");
            return;
        }
        int optInt = jSONObject.optInt("status");
        c b3 = this.f32005a.b(BulletContainerView.class);
        int i2 = 0;
        if (!(b3 == null || (b2 = b3.b()) == null)) {
            i2 = b2.hashCode();
        }
        com.ss.android.ugc.d.a.c.a(new g(optInt, i2));
    }
}
