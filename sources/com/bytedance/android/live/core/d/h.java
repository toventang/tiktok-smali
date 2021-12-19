package com.bytedance.android.live.core.d;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f8976a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f8977b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f8978c;

    static {
        Covode.recordClassIndex(4579);
    }

    h(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f8976a = str;
        this.f8977b = jSONObject;
        this.f8978c = jSONObject2;
    }

    public final void run() {
        c.a().a(this.f8976a, this.f8977b, this.f8978c);
    }
}
