package com.bytedance.android.livesdk.feed.j;

import com.bytedance.android.live.core.c.b;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    private static a f17577a;

    static {
        Covode.recordClassIndex(9729);
    }

    private a() {
    }

    public static synchronized a b() {
        a aVar;
        synchronized (a.class) {
            MethodCollector.i(1937);
            if (f17577a == null) {
                f17577a = new a();
            }
            aVar = f17577a;
            MethodCollector.o(1937);
        }
        return aVar;
    }

    @Override // com.bytedance.android.live.core.c.b
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("user_id", String.valueOf(((IHostUser) com.bytedance.android.live.t.a.a(IHostUser.class)).getCurUserId()));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }
}
