package com.bytedance.android.live.core.d;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f8997a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8998b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f8999c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f9000d;

    static {
        Covode.recordClassIndex(4585);
    }

    n(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f8997a = str;
        this.f8998b = i2;
        this.f8999c = jSONObject;
        this.f9000d = jSONObject2;
    }

    public final void run() {
        c.a().a(this.f8997a, this.f8998b, this.f8999c, this.f9000d);
    }
}
