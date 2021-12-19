package com.bytedance.android.live.liveinteract.multiguest.a.f;

import com.bytedance.android.live.liveinteract.multiguest.a.b.a;
import com.bytedance.android.live.liveinteract.platform.common.g.a;
import com.bytedance.android.live.liveinteract.platform.common.g.i;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import org.json.JSONObject;

final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f11148a;

    static {
        Covode.recordClassIndex(5987);
    }

    c(a aVar) {
        this.f11148a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        a aVar = this.f11148a;
        Throwable th = (Throwable) obj;
        aVar.f11137c = false;
        if (aVar.f11898g != null) {
            a.a("LinkIn_Guest_Apply_Failed", "throwable:".concat(String.valueOf(th)));
            JSONObject jSONObject = new JSONObject();
            i.a(jSONObject, th);
            com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - i.f11978i);
            i.a(false, "apply_failed", jSONObject, 1);
            ((a.b) aVar.f11898g).a(th);
        }
    }
}
