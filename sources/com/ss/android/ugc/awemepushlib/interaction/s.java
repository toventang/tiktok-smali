package com.ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.b;
import com.ss.android.ugc.awemepushlib.manager.a;
import org.json.JSONObject;

final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f145466a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f145467b;

    static {
        Covode.recordClassIndex(95121);
    }

    s(Context context, JSONObject jSONObject) {
        this.f145466a = context;
        this.f145467b = jSONObject;
    }

    public final void run() {
        Context context = this.f145466a;
        JSONObject jSONObject = this.f145467b;
        c.a("method_push_start_ttsetting_data_callback");
        b.f42047a.a(context, jSONObject);
        System.out.println();
        a.a().g(context);
        a.a();
        a.a(context, jSONObject);
        c.b("method_push_start_ttsetting_data_callback");
    }
}
