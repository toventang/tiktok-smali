package com.ss.android.ugc.aweme.bullet.bridge.ad;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.c.e.a.c;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class FeedPlayerTriggerTimeMethod extends BaseBridgeMethod implements au {
    static {
        Covode.recordClassIndex(42446);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return "playerTriggerTime";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedPlayerTriggerTimeMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        Object b2;
        l.d(jSONObject, "");
        l.d(aVar, "");
        c b3 = this.f32005a.b(BulletContainerView.class);
        if (!(b3 == null || (b2 = b3.b()) == null)) {
            b2.hashCode();
        }
        jSONObject.optInt("time");
    }
}
