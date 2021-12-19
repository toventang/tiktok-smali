package com.ss.android.i.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.v;
import com.ss.android.i.b;
import com.ss.android.i.c;
import java.util.Map;
import org.json.JSONObject;

public final class a extends b {
    static {
        Covode.recordClassIndex(36774);
    }

    @Override // com.ss.android.i.a.c
    public final String a() {
        return b.f59566c;
    }

    @Override // com.ss.android.i.a.b
    public final void a(c cVar) {
        long j2;
        String str = cVar.f59577a;
        Map<String, Object> map = cVar.f59579c;
        if (!TextUtils.isEmpty(str)) {
            if (b.f59569f == (cVar.f59578b & b.f59569f)) {
                if (map == null) {
                    AppLog.onEvent(null, str);
                    return;
                }
                String str2 = (String) map.get(b.q);
                Object obj = map.get(b.n);
                String str3 = obj instanceof String ? (String) obj : null;
                Object obj2 = map.get(b.r);
                long j3 = 0;
                if (obj2 instanceof Long) {
                    j2 = ((Long) obj2).longValue();
                } else {
                    j2 = 0;
                }
                Object obj3 = map.get(b.s);
                if (obj3 instanceof Long) {
                    j3 = ((Long) obj3).longValue();
                }
                Object obj4 = map.get(b.t);
                AppLog.onEvent((Context) null, str2, str, str3, j2, j3, obj4 instanceof JSONObject ? (JSONObject) obj4 : null);
            } else if (b.f59570g == (cVar.f59578b & b.f59570g)) {
                JSONObject jSONObject = new JSONObject();
                if (map != null) {
                    try {
                        for (Map.Entry<String, Object> entry : map.entrySet()) {
                            if (entry != null && (entry.getValue() instanceof String) && (entry.getKey() instanceof String)) {
                                jSONObject.put(entry.getKey(), entry.getValue());
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                com.ss.android.common.c.a.a(cVar.f59577a, jSONObject);
            }
        }
    }

    @Override // com.ss.android.i.a.c
    public final void a(Context context, com.ss.android.i.a aVar) {
        AppLog.setAppId(aVar.f59549h);
        AppLog.setChannel(aVar.f59545d);
        AppLog.init(context, false, new v(new String[]{"https://log-va.tiktokv.com/service/2/app_log/"}, new String[]{"https://log-va.tiktokv.com/service/2/app_log/"}, new String[]{"https://log-va.tiktokv.com/service/2/device_register/", "https://log-va.tiktokv.com/service/2/device_register/"}, "https://log-va.tiktokv.com/service/2/app_alert_check/", "https://log-va.tiktokv.com/service/2/log_settings/", new String[]{"https://log-va.tiktokv.com/service/2/app_log/"}, "https://log-va.tiktokv.com/service/2/log_settings/", "https://log-va.tiktokv.com"));
    }
}
