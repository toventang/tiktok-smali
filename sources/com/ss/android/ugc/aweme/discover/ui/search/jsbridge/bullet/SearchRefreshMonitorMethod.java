package com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.discover.e.e;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import org.json.JSONArray;
import org.json.JSONObject;

public final class SearchRefreshMonitorMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private final String f82720b = "searchRefreshMonitor";

    static {
        Covode.recordClassIndex(51521);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f82720b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchRefreshMonitorMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            c.a(new e(jSONObject.optLong("networkStart"), jSONObject.optLong("networkEnd"), jSONObject.optInt("itemCount"), jSONObject.optInt("status"), jSONObject.optLong("viewDrawEnd")));
            aVar.a(new JSONArray());
        } catch (Exception e2) {
            aVar.a(0, e2.getMessage());
        }
    }
}
