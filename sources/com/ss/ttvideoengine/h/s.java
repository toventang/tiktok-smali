package com.ss.ttvideoengine.h;

import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.h.r;
import org.json.JSONObject;

final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f152707a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f152708b;

    static {
        Covode.recordClassIndex(101629);
    }

    s(boolean z, JSONObject jSONObject) {
        this.f152707a = z;
        this.f152708b = jSONObject;
    }

    public final void run() {
        r.a.a(this.f152707a, this.f152708b);
    }
}
