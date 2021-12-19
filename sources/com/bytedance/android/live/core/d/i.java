package com.bytedance.android.live.core.d;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final long f8979a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8980b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8981c;

    static {
        Covode.recordClassIndex(4580);
    }

    i(long j2, String str, int i2) {
        this.f8979a = j2;
        this.f8980b = str;
        this.f8981c = i2;
    }

    public final void run() {
        c.a(this.f8980b, this.f8981c, c.a(this.f8979a), (JSONObject) null);
    }
}
