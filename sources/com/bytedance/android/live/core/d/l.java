package com.bytedance.android.live.core.d;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final long f8989a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8990b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8991c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f8992d;

    static {
        Covode.recordClassIndex(4583);
    }

    l(long j2, String str, int i2, JSONObject jSONObject) {
        this.f8989a = j2;
        this.f8990b = str;
        this.f8991c = i2;
        this.f8992d = jSONObject;
    }

    public final void run() {
        long j2 = this.f8989a;
        c.a(this.f8990b, this.f8991c, c.a(j2), this.f8992d);
    }
}
