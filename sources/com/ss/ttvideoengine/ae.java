package com.ss.ttvideoengine;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class ae implements af {

    /* renamed from: a  reason: collision with root package name */
    public final int f152166a;

    /* renamed from: b  reason: collision with root package name */
    public final String f152167b;

    /* renamed from: c  reason: collision with root package name */
    public final String f152168c;

    /* renamed from: d  reason: collision with root package name */
    public final int f152169d;

    /* renamed from: e  reason: collision with root package name */
    public final String f152170e;

    /* renamed from: f  reason: collision with root package name */
    public final int f152171f;

    /* renamed from: g  reason: collision with root package name */
    public final long f152172g;

    static {
        Covode.recordClassIndex(101447);
    }

    @Override // com.ss.ttvideoengine.af
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.f152167b);
            jSONObject.put("language_id", this.f152166a);
            jSONObject.put("format", this.f152168c);
            jSONObject.put("language", this.f152170e);
            jSONObject.put("id", this.f152171f);
            jSONObject.put("expire", this.f152172g);
            jSONObject.put("sub_id", this.f152169d);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public ae(JSONObject jSONObject) {
        this.f152167b = jSONObject.optString("url");
        this.f152166a = jSONObject.optInt("language_id");
        this.f152168c = jSONObject.optString("format");
        this.f152170e = jSONObject.optString("language");
        this.f152171f = jSONObject.optInt("id");
        this.f152172g = jSONObject.optLong("expire");
        this.f152169d = jSONObject.optInt("sub_id");
    }
}
