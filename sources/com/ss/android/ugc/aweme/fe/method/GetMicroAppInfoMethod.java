package com.ss.android.ugc.aweme.fe.method;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.web.a.a;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.miniapp_api.services.c;
import h.f.b.l;
import org.json.JSONObject;

public final class GetMicroAppInfoMethod extends BaseCommonJavaMethod implements au {
    static {
        Covode.recordClassIndex(57277);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetMicroAppInfoMethod(a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        String str;
        try {
            c cVar = c.a.f109704a;
            l.b(cVar, "");
            IMiniAppService a2 = cVar.a();
            JSONObject jSONObject2 = new JSONObject();
            if (a2 != null) {
                Context a3 = d.a();
                if (a3 != null) {
                    str = a2.getJsSdkVersion((Application) a3);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
                }
            } else {
                str = null;
            }
            jSONObject2.put("js_sdk_version", str);
            if (aVar != null) {
                aVar.a(jSONObject2);
            }
        } catch (Exception unused) {
            if (aVar != null) {
                aVar.a(-1, "");
            }
        }
    }
}
