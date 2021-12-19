package com.ss.ttvideoengine.j;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private int f152932a;

    /* renamed from: b  reason: collision with root package name */
    private int f152933b;

    /* renamed from: c  reason: collision with root package name */
    private String f152934c;

    /* renamed from: d  reason: collision with root package name */
    private String f152935d;

    static {
        Covode.recordClassIndex(101673);
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f152932a = jSONObject.optInt("sub_id");
            this.f152933b = jSONObject.optInt("language_id");
            this.f152934c = jSONObject.optString("format");
            this.f152935d = jSONObject.optString("version");
        }
    }
}
