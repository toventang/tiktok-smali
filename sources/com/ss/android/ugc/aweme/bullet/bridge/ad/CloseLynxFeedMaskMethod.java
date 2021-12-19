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

public final class CloseLynxFeedMaskMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private final String f68863b = "closeLynxFeedMask";

    static {
        Covode.recordClassIndex(42430);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68863b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CloseLynxFeedMaskMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        Object b2;
        l.d(jSONObject, "");
        l.d(aVar, "");
        c b3 = this.f32005a.b(BulletContainerView.class);
        int i2 = 0;
        if (!(b3 == null || (b2 = b3.b()) == null)) {
            i2 = b2.hashCode();
        }
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ad.c.l(i2));
    }
}
