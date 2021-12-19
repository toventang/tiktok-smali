package com.ss.ttvideoengine.h;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f152760a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f152761b;

    static {
        Covode.recordClassIndex(101639);
    }

    w(boolean z, JSONObject jSONObject) {
        this.f152760a = z;
        this.f152761b = jSONObject;
    }

    public final void run() {
        t.instance.addEventV2(this.f152760a, this.f152761b, "videoplayer_oneevent");
    }
}
