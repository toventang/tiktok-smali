package com.bytedance.android.live.core.d;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f8993a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8994b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8995c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f8996d;

    static {
        Covode.recordClassIndex(4584);
    }

    m(JSONObject jSONObject, String str, int i2, JSONObject jSONObject2) {
        this.f8993a = jSONObject;
        this.f8994b = str;
        this.f8995c = i2;
        this.f8996d = jSONObject2;
    }

    public final void run() {
        JSONObject jSONObject = this.f8993a;
        c.a().a(this.f8994b, this.f8995c, this.f8996d, c.a(jSONObject));
    }
}
