package com.bytedance.android.ecommerce.a;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public String f6952a;

    /* renamed from: b  reason: collision with root package name */
    public String f6953b;

    /* renamed from: c  reason: collision with root package name */
    public String f6954c;

    static {
        Covode.recordClassIndex(3347);
    }

    public e(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f6952a = jSONObject.optString(StringSet.type);
            this.f6953b = jSONObject.optString("value");
            this.f6954c = jSONObject.optString("error_key");
        }
    }
}
