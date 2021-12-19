package com.ss.android.ugc.aweme.bullet.bridge.framework;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class MonitorLogMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69096b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69097c = "monitorLog";

    static {
        Covode.recordClassIndex(42611);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42612);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69097c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MonitorLogMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        if (jSONObject.length() == 0) {
            aVar.a(0, "params is empty");
            return;
        }
        String optString = jSONObject.optString("log_type");
        if (TextUtils.isEmpty(optString)) {
            aVar.a(0, "log_type is empty");
            return;
        }
        String optString2 = jSONObject.optString("service");
        if (!TextUtils.equals(optString, "service_monitor") || !TextUtils.isEmpty(optString2)) {
            JSONObject jSONObject2 = new JSONObject();
            a(jSONObject, jSONObject2, "status");
            a(jSONObject, jSONObject2, "value");
            n.a(optString, optString2, jSONObject2);
            aVar.a((Object) null);
            return;
        }
        aVar.a(0, "service is required while log_type=".concat(String.valueOf(optString)));
    }

    private static void a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        try {
            Object opt = jSONObject.opt(str);
            if (opt != null) {
                jSONObject2.put(str, opt);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
