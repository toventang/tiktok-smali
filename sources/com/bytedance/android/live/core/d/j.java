package com.bytedance.android.live.core.d;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f8982a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8983b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f8984c;

    static {
        Covode.recordClassIndex(4581);
    }

    j(String str, int i2, JSONObject jSONObject) {
        this.f8982a = str;
        this.f8983b = i2;
        this.f8984c = jSONObject;
    }

    public final void run() {
        c.a(this.f8982a, this.f8983b, (JSONObject) null, this.f8984c);
    }
}
