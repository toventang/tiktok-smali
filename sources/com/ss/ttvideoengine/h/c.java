package com.ss.ttvideoengine.h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.s.j;
import org.json.JSONObject;

final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f152606a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f152607b;

    static {
        Covode.recordClassIndex(101601);
    }

    c(String str, JSONObject jSONObject) {
        this.f152606a = str;
        this.f152607b = jSONObject;
    }

    public final void run() {
        String str = this.f152606a;
        JSONObject jSONObject = this.f152607b;
        j.a("AppLogEngineUploader", "onEventV2 monitorName ".concat(String.valueOf(str)));
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            a.a(jSONObject);
            try {
                jSONObject.putOpt("params_for_special", "videoplayer_monitor");
                Class.forName("com.ss.android.common.c.a").getMethod("a", String.class, JSONObject.class).invoke(null, str, jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
                j.e("AppLogEngineUploader", "upload error ".concat(String.valueOf(e2)));
            }
        }
    }
}
