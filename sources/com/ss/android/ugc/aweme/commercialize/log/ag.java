package com.ss.android.ugc.aweme.commercialize.log;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.a;
import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import h.f.b.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class ag {

    /* renamed from: a  reason: collision with root package name */
    public static final ag f74732a = new ag();

    private ag() {
    }

    static {
        Covode.recordClassIndex(46089);
    }

    public static void a(String str, String str2, JSONObject jSONObject) {
        l.d(str, "");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        IMonitorDepend iMonitorDepend = a.f31873b;
        if (iMonitorDepend != null) {
            iMonitorDepend.monitorCommonLog(str, jSONObject);
        }
    }
}
