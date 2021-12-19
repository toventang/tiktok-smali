package com.ss.android.ugc.aweme.bullet.bridge.framework;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.service.base.an;
import com.bytedance.ies.bullet.service.base.o;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class ReportCustomEventMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69137b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69138c = "reportCustomEvent";

    static {
        Covode.recordClassIndex(42636);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42637);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69138c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportCustomEventMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        String str;
        l.d(jSONObject, "");
        l.d(aVar, "");
        o j2 = j();
        if (j2 != null) {
            String optString = jSONObject.optString("service");
            if (optString == null || optString.length() == 0) {
                str = "service empty";
            } else {
                String optString2 = jSONObject.optString("trigger");
                if (optString2 == null || optString2.length() == 0) {
                    str = "trigger empty";
                } else {
                    JSONObject optJSONObject = jSONObject.optJSONObject("category");
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                    }
                    optJSONObject.put("trigger", optString2);
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("metrics");
                    JSONObject optJSONObject3 = jSONObject.optJSONObject("extra");
                    an anVar = new an(optString, null, null, 254);
                    anVar.f32554g = optJSONObject;
                    anVar.f32555h = optJSONObject2;
                    anVar.f32558k = optJSONObject3;
                    j2.a(anVar);
                    aVar.a(new JSONObject(), 1, "report success");
                    return;
                }
            }
        } else {
            str = "state invalid";
        }
        aVar.a(0, "report error, reason: ".concat(str));
    }
}
