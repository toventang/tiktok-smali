package com.ss.android.ad.splash.core.e;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public String f58491a;

    /* renamed from: b  reason: collision with root package name */
    public int f58492b;

    /* renamed from: c  reason: collision with root package name */
    public long f58493c;

    static {
        Covode.recordClassIndex(36292);
    }

    static i a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("promotion_icon")) == null) {
            return null;
        }
        return new i(optJSONObject.optString("promotion_icon_url"), optJSONObject.optInt("promotion_style", 0), optJSONObject.optLong("promotion_show_time", -1));
    }

    private i(String str, int i2, long j2) {
        this.f58491a = str;
        this.f58492b = i2;
        this.f58493c = j2;
    }
}
