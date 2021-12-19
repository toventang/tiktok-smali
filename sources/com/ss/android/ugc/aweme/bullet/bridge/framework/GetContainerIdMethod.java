package com.ss.android.ugc.aweme.bullet.bridge.framework;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.z;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class GetContainerIdMethod extends BaseBridgeMethod implements au {
    static {
        Covode.recordClassIndex(42602);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return "getContainerId";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetContainerIdMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        String str;
        z a2;
        l.d(jSONObject, "");
        l.d(aVar, "");
        super.a(jSONObject, aVar);
        JSONObject jSONObject2 = new JSONObject();
        com.bytedance.ies.bullet.c.c.i g2 = g();
        if (g2 == null || (a2 = g2.a()) == null) {
            str = null;
        } else {
            str = a2.f32074a;
        }
        jSONObject2.put("container_id", str);
        aVar.a((Object) jSONObject2);
    }
}
