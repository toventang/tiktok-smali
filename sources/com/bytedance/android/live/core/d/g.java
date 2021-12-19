package com.bytedance.android.live.core.d;

import com.bytedance.android.livesdk.livesetting.performance.LiveEnableSlardarSetting;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final long f8973a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f8974b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8975c;

    static {
        Covode.recordClassIndex(4578);
    }

    g(long j2, JSONObject jSONObject, String str) {
        this.f8973a = j2;
        this.f8974b = jSONObject;
        this.f8975c = str;
    }

    public final void run() {
        long j2 = this.f8973a;
        JSONObject jSONObject = this.f8974b;
        String str = this.f8975c;
        JSONObject a2 = c.a(j2);
        JSONObject a3 = c.a(jSONObject);
        if (c.a() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            com.bytedance.android.live.u.g.b(new h(str, a2, a3));
        }
    }
}
