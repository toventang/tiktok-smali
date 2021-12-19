package com.bytedance.android.live.core.d;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f8968a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f8969b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8970c;

    static {
        Covode.recordClassIndex(4576);
    }

    e(String str, JSONObject jSONObject, int i2) {
        this.f8968a = str;
        this.f8969b = jSONObject;
        this.f8970c = i2;
    }

    public final void run() {
        String str = this.f8968a;
        JSONObject jSONObject = this.f8969b;
        int i2 = this.f8970c;
        if (!str.startsWith("ttlive_")) {
            str = "ttlive_".concat(String.valueOf(str));
        }
        c.a().a(str, i2, c.a(jSONObject));
    }
}
