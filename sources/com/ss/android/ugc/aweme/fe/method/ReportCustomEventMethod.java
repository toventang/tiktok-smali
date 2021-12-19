package com.ss.android.ugc.aweme.fe.method;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ax.a.k;
import com.ss.android.ugc.aweme.ax.a.s;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class ReportCustomEventMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91144a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57354);
    }

    private ReportCustomEventMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57355);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ ReportCustomEventMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public ReportCustomEventMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        String str;
        s a2;
        k b2 = b();
        if (b2 == null || (a2 = b2.a(s.class)) == null) {
            str = "state invalid";
        } else if (jSONObject != null) {
            String optString = jSONObject.optString("service");
            if (optString == null || optString.length() == 0) {
                str = "service empty";
            } else {
                String optString2 = jSONObject.optString("trigger");
                if (optString2 == null || optString2.length() == 0) {
                    str = "trigger empty";
                } else {
                    JSONObject optJSONObject = jSONObject.optJSONObject("category");
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("metrics");
                    JSONObject optJSONObject3 = jSONObject.optJSONObject("extra");
                    if (optString == null) {
                        l.b();
                    }
                    if (optString2 == null) {
                        l.b();
                    }
                    a2.a(optString, optString2, optJSONObject, optJSONObject2, optJSONObject3);
                    if (aVar != null) {
                        aVar.a(new JSONObject(), 1, "report success");
                        return;
                    }
                    return;
                }
            }
        } else {
            str = "params empty";
        }
        if (aVar != null) {
            aVar.a(0, "report error, reason: ".concat(str));
        }
    }
}
