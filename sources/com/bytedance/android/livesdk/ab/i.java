package com.bytedance.android.livesdk.ab;

import com.bytedance.android.live.core.c.b;
import com.bytedance.android.livesdk.ab.c.c;
import com.bytedance.android.livesdk.ab.c.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONException;
import org.json.JSONObject;

public final class i extends b {

    /* renamed from: a  reason: collision with root package name */
    private static i f13590a;

    static {
        Covode.recordClassIndex(7524);
    }

    private i() {
    }

    public static synchronized i b() {
        i iVar;
        synchronized (i.class) {
            MethodCollector.i(10879);
            if (f13590a == null) {
                f13590a = new i();
            }
            iVar = f13590a;
            MethodCollector.o(10879);
        }
        return iVar;
    }

    @Override // com.bytedance.android.live.core.c.b
    public final JSONObject a() {
        long j2;
        c cVar;
        Long l2;
        JSONObject jSONObject = new JSONObject();
        String valueOf = String.valueOf(e.i());
        String valueOf2 = String.valueOf(e.h());
        h n = e.n();
        if (n == null || (cVar = n.f13529d) == null || (l2 = cVar.f13488i) == null) {
            j2 = 0;
        } else {
            j2 = l2.longValue();
        }
        try {
            jSONObject.put("user_id", String.valueOf(j2));
            jSONObject.put("room_id", valueOf);
            jSONObject.put("anchor_id", valueOf2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }
}
