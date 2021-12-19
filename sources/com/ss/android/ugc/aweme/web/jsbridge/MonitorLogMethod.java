package com.ss.android.ugc.aweme.web.jsbridge;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

public class MonitorLogMethod extends BaseCommonJavaMethod implements au {
    static {
        Covode.recordClassIndex(94773);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        if (jSONObject != null && jSONObject.length() != 0) {
            String optString = jSONObject.optString("log_type");
            if (!TextUtils.isEmpty(optString)) {
                String optString2 = jSONObject.optString("service");
                if (!TextUtils.equals(optString, "service_monitor") || !TextUtils.isEmpty(optString2)) {
                    JSONObject jSONObject2 = new JSONObject();
                    a(jSONObject, jSONObject2, "status");
                    a(jSONObject, jSONObject2, "value");
                    n.a(optString, optString2, jSONObject2);
                    if (aVar != null) {
                        aVar.a((Object) null);
                    }
                } else if (aVar != null) {
                    aVar.a(0, "service is required while log_type=".concat(String.valueOf(optString)));
                }
            } else if (aVar != null) {
                aVar.a(0, "log_type is empty");
            }
        } else if (aVar != null) {
            aVar.a(0, "params is empty");
        }
    }

    private static void a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Object opt = jSONObject.opt(str);
        if (opt != null) {
            jSONObject2.put(str, opt);
        }
    }
}
