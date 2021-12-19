package com.ss.android.common.applog;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.common.applog.b.d;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.util.ConcurrentModificationException;
import org.json.JSONArray;
import org.json.JSONObject;

public class r {

    /* renamed from: b  reason: collision with root package name */
    private static volatile r f59333b;

    /* renamed from: a  reason: collision with root package name */
    public Context f59334a;

    static {
        Covode.recordClassIndex(36636);
    }

    private r(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        this.f59334a = applicationContext;
    }

    public static r a(Context context) {
        MethodCollector.i(6357);
        if (f59333b == null) {
            synchronized (r.class) {
                try {
                    if (f59333b == null) {
                        f59333b = new r(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6357);
                    throw th;
                }
            }
        }
        r rVar = f59333b;
        MethodCollector.o(6357);
        return rVar;
    }

    public final Pair<Long, String> a(d dVar, JSONObject jSONObject) {
        String str;
        if (dVar == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("magic_tag", "ss_app_log");
            jSONObject2.put("header", jSONObject);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("datetime", AppLog.formatDate(dVar.f59231a));
            jSONObject3.put("local_time_ms", System.currentTimeMillis());
            jSONObject3.put("session_id", dVar.f59232b);
            int i2 = 1;
            jSONObject3.put("bg_session", 1);
            if (!TextUtils.isEmpty(dVar.f59234d)) {
                jSONObject3.put("from_session", dVar.f59234d);
            }
            if (!TextUtils.isEmpty(dVar.f59236f)) {
                jSONObject3.put("to_session", dVar.f59236f);
            }
            jSONObject3.put("duration", Math.max(1L, Math.max(0L, (dVar.f59237g - dVar.f59231a) - dVar.f59238h) / 1000));
            boolean z = dVar.f59233c;
            boolean z2 = dVar.f59235e;
            if (z || z2) {
                if (z && !z2) {
                    i2 = 2;
                } else if (z || !z2) {
                    i2 = 4;
                } else {
                    i2 = 3;
                }
            }
            jSONObject3.put("session_type", i2);
            jSONObject3.put("is_background", false);
            AppLog.tryPutEventIndex(jSONObject3);
            jSONArray.put(jSONObject3);
            jSONObject2.put("terminate", jSONArray);
            try {
                str = jSONObject2.toString();
            } catch (ConcurrentModificationException unused) {
                str = jSONObject2.toString();
            }
            return Pair.create(Long.valueOf(d.a(this.f59334a).a(str)), str);
        } catch (Throwable unused2) {
            return null;
        }
    }
}
