package com.ss.android.ugc.aweme.performance;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import org.json.JSONObject;

final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f114803a;

    static {
        Covode.recordClassIndex(73853);
    }

    f(JSONObject jSONObject) {
        this.f114803a = jSONObject;
    }

    public final void run() {
        r.a("tool_performance_fps_info", this.f114803a);
    }
}
