package com.ss.android.ugc.aweme.performance;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.common.applog.t;
import com.ss.android.ugc.aweme.performance.c;
import java.util.HashMap;
import org.json.JSONObject;

final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c.a f114798a;

    /* renamed from: b  reason: collision with root package name */
    private final String f114799b;

    /* renamed from: c  reason: collision with root package name */
    private final long f114800c;

    /* renamed from: d  reason: collision with root package name */
    private final double f114801d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f114802e;

    static {
        Covode.recordClassIndex(73852);
    }

    e(c.a aVar, String str, long j2, double d2, JSONObject jSONObject) {
        this.f114798a = aVar;
        this.f114799b = str;
        this.f114800c = j2;
        this.f114801d = d2;
        this.f114802e = jSONObject;
    }

    public final void run() {
        String valueOf;
        MethodCollector.i(9912);
        c.a aVar = this.f114798a;
        String str = this.f114799b;
        long j2 = this.f114800c;
        double d2 = this.f114801d;
        JSONObject jSONObject = this.f114802e;
        HashMap hashMap = new HashMap();
        hashMap.put("scene", str);
        hashMap.put("duration", String.valueOf(j2));
        if (d2 > 60.0d) {
            valueOf = "60";
        } else {
            valueOf = String.valueOf(d2);
        }
        hashMap.put("fps", valueOf);
        c.a.a(hashMap, jSONObject);
        JSONObject jSONObject2 = new JSONObject(hashMap);
        synchronized (aVar) {
            try {
                if (aVar.f114794b != null) {
                    aVar.f114794b.onDataAvailable(jSONObject2);
                    return;
                }
                t.a().b(new f(jSONObject2));
                MethodCollector.o(9912);
            } finally {
                MethodCollector.o(9912);
            }
        }
    }
}
