package com.bytedance.android.livesdk.ab;

import com.bytedance.android.live.core.d.c;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f13593a = new JSONObject();

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f13594b = new JSONObject();

    static {
        Covode.recordClassIndex(7528);
    }

    public final void a(String str, int i2) {
        c.a(str, i2, this.f13594b, this.f13593a);
    }

    public final l a(String str, Object obj) {
        try {
            this.f13593a.put(str, obj);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return this;
    }
}
