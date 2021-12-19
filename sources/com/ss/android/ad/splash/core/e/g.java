package com.ss.android.ad.splash.core.e;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public String f58482a;

    /* renamed from: b  reason: collision with root package name */
    public int f58483b;

    /* renamed from: c  reason: collision with root package name */
    public String f58484c;

    /* renamed from: d  reason: collision with root package name */
    public String f58485d;

    static {
        Covode.recordClassIndex(36290);
    }

    public static g a(JSONObject jSONObject) {
        g gVar = new g();
        if (jSONObject != null) {
            gVar.f58482a = jSONObject.optString("background_color");
            gVar.f58483b = jSONObject.optInt("position");
            gVar.f58484c = jSONObject.optString("text_color");
            gVar.f58485d = jSONObject.optString("text");
        }
        return gVar;
    }
}
