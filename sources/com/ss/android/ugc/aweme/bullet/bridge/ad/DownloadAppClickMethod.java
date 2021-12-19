package com.ss.android.ugc.aweme.bullet.bridge.ad;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.ad.b.c;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class DownloadAppClickMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private final String f68871b = "download_app_click";

    static {
        Covode.recordClassIndex(42438);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68871b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DownloadAppClickMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        boolean z;
        l.d(jSONObject, "");
        l.d(aVar, "");
        Context e2 = e();
        if (e2 != null) {
            String optString = jSONObject.optString("app_id");
            boolean z2 = true;
            if (optString == null || optString.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                aVar.a(-1, "app_id is empty");
                return;
            }
            if (jSONObject.optInt("direct_download", 0) != 1) {
                z2 = false;
            }
            l.b(b.a.f65586a, "");
            c a2 = com.ss.android.ugc.aweme.ad.b.b.a();
            if (a2 == null || !a2.a(e2, optString, z2)) {
                aVar.a(-1, "handle failed");
            } else {
                aVar.a((Object) null);
            }
        }
    }
}
