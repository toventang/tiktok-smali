package com.ss.android.ugc.aweme.cw;

import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.o;
import org.json.JSONObject;

public final class k implements c {
    static {
        Covode.recordClassIndex(49130);
    }

    @Override // com.ss.android.ugc.aweme.cw.c
    public final boolean c() {
        if (ApmDelegate.a.f25042a.a("task_blocked")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.cw.c
    public final boolean d() {
        if (ApmDelegate.a.f25042a.a("task_rejected")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.cw.c
    public final boolean a() {
        if (ApmDelegate.a.f25042a.a("task_wait_timeout")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.cw.c
    public final boolean b() {
        if (ApmDelegate.a.f25042a.a("task_execute_timeout")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.cw.c
    public final void c(JSONObject jSONObject) {
        o.a("task_blocked", jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.cw.c
    public final void d(JSONObject jSONObject) {
        o.a("task_rejected", jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.cw.c
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            o.a("task_wait_timeout", jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.cw.c
    public final void b(JSONObject jSONObject) {
        if (jSONObject != null) {
            o.a("task_execute_timeout", jSONObject);
        }
    }
}
