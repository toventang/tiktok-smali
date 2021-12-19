package com.ss.android.ad.splash.core.e;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f58434a;

    /* renamed from: b  reason: collision with root package name */
    public String f58435b;

    /* renamed from: c  reason: collision with root package name */
    public String f58436c;

    /* renamed from: d  reason: collision with root package name */
    public String f58437d;

    static {
        Covode.recordClassIndex(36281);
    }

    public final String toString() {
        return "ShareAdInfo{mTitle='" + this.f58434a + '\'' + ", mDescription='" + this.f58435b + '\'' + ", mImageUrl='" + this.f58436c + '\'' + ", mShareUrl='" + this.f58437d + '\'' + '}';
    }

    public a(JSONObject jSONObject) {
        this.f58434a = jSONObject.optString("share_title");
        this.f58435b = jSONObject.optString("share_desc");
        this.f58436c = jSONObject.optString("share_icon");
        this.f58437d = jSONObject.optString("share_url");
    }
}
