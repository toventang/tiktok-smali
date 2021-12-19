package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public final class ad implements d {

    /* renamed from: a  reason: collision with root package name */
    WeakReference<Context> f145017a;

    /* renamed from: b  reason: collision with root package name */
    a f145018b;

    static {
        Covode.recordClassIndex(94819);
    }

    public ad(WeakReference<Context> weakReference, a aVar) {
        this.f145017a = weakReference;
        this.f145018b = aVar;
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        int i2;
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (com.ss.android.ugc.aweme.compliance.api.a.o().a()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject2.put("isTeenagersModel", i2);
            jSONObject2.put("language", com.ss.android.ugc.aweme.language.d.g());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        a aVar = this.f145018b;
        if (aVar != null) {
            aVar.a(hVar.f35531b, jSONObject2);
        }
    }
}
