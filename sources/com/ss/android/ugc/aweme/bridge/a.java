package com.ss.android.ugc.aweme.bridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import h.f.b.l;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f68791a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(42367);
    }

    public static void a(k.b bVar, JSONObject jSONObject) {
        l.d(bVar, "");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        jSONObject2.put("data", jSONObject);
        bVar.a(jSONObject2);
    }

    public static void a(k.b bVar, Throwable th) {
        String str;
        String message;
        l.d(bVar, "");
        String str2 = "something went wrong";
        if (th == null || (str = th.getMessage()) == null) {
            str = str2;
        }
        JSONObject jSONObject = new JSONObject();
        if (!(th == null || (message = th.getMessage()) == null)) {
            str2 = message;
        }
        jSONObject.put("message", str2);
        bVar.a(-1, str, jSONObject);
    }
}
