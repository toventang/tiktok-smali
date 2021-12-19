package com.ss.android.ugc.aweme.bullet.bridge.ad;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class VideoFollowButtonClick extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private final String f68925b = "videoFollowButtonClick";

    static {
        Covode.recordClassIndex(42481);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68925b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoFollowButtonClick(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }
}
