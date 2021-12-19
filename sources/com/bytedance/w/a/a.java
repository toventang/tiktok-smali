package com.bytedance.w.a;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final long f45888a;

    /* renamed from: b  reason: collision with root package name */
    private final String f45889b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f45890c;

    static {
        Covode.recordClassIndex(28062);
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", this.f45888a);
            jSONObject.put("message", this.f45889b);
            Map<String, String> map = this.f45890c;
            if (map != null && map.size() > 0) {
                jSONObject.put("fields", new JSONObject(this.f45890c));
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
