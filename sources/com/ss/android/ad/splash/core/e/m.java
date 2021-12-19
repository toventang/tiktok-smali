package com.ss.android.ad.splash.core.e;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public String f58498a;

    /* renamed from: b  reason: collision with root package name */
    public int f58499b;

    /* renamed from: c  reason: collision with root package name */
    public int f58500c;

    /* renamed from: d  reason: collision with root package name */
    public String f58501d;

    /* renamed from: e  reason: collision with root package name */
    public String f58502e;

    /* renamed from: f  reason: collision with root package name */
    public String f58503f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f58504g;

    /* renamed from: h  reason: collision with root package name */
    public int f58505h;

    /* renamed from: i  reason: collision with root package name */
    private int f58506i;

    static {
        Covode.recordClassIndex(36296);
    }

    public final boolean a(int i2) {
        if ((i2 & this.f58506i) != 0) {
            return true;
        }
        return false;
    }

    public static m a(JSONObject jSONObject) {
        m mVar = new m();
        if (jSONObject != null) {
            mVar.f58498a = jSONObject.optString("countdown_unit", "");
            mVar.f58499b = jSONObject.optInt("height_extra_size");
            mVar.f58500c = jSONObject.optInt("width_extra_size");
            mVar.f58501d = jSONObject.optString("text_color");
            mVar.f58502e = jSONObject.optString("background_color");
            mVar.f58503f = jSONObject.optString("text");
            boolean z = true;
            if (jSONObject.optInt("countdown_enable", 0) != 1) {
                z = false;
            }
            mVar.f58504g = z;
            mVar.f58505h = jSONObject.optInt("show_skip_seconds", 0);
            mVar.f58506i = jSONObject.optInt("button_extra_style", 0);
        }
        return mVar;
    }
}
