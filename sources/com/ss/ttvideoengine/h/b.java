package com.ss.ttvideoengine.h;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.s.j;
import org.json.JSONObject;

final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f152603a;

    /* renamed from: b  reason: collision with root package name */
    private final String f152604b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f152605c;

    static {
        Covode.recordClassIndex(101600);
    }

    b(a aVar, String str, JSONObject jSONObject) {
        this.f152603a = aVar;
        this.f152604b = str;
        this.f152605c = jSONObject;
    }

    public final void run() {
        a aVar = this.f152603a;
        String str = this.f152604b;
        JSONObject jSONObject = this.f152605c;
        j.a("AppLogEngineUploader", "onEvent event ".concat(String.valueOf(str)));
        if (jSONObject != null) {
            a.a(jSONObject);
            try {
                Class<?> cls = Class.forName("com.ss.android.common.applog.AppLog");
                jSONObject.put("session_id", (String) cls.getMethod("getCurrentSessionId", new Class[0]).invoke(null, new Object[0]));
                cls.getMethod("recordMiscLog", Context.class, String.class, JSONObject.class).invoke(null, aVar.f152561a, str, jSONObject);
            } catch (Exception e2) {
                j.e("AppLogEngineUploader", "upload error " + e2.toString());
            }
        }
    }
}
