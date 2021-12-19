package com.ss.android.ugc.aweme.fe.method;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.miniapp_api.services.c;
import h.f.b.l;
import org.json.JSONObject;

public final class MiniAppPreloadMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91098a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57311);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57312);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        if (jSONObject != null && jSONObject.has("mini_app_url")) {
            c cVar = c.a.f109704a;
            l.b(cVar, "");
            cVar.a().preloadMiniApp(jSONObject.optString("mini_app_url"));
        }
    }
}
