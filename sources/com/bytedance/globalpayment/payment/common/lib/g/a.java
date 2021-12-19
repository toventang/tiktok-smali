package com.bytedance.globalpayment.payment.common.lib.g;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class a extends com.bytedance.globalpayment.payment.common.lib.a {

    /* renamed from: a  reason: collision with root package name */
    protected String f30566a;

    /* renamed from: b  reason: collision with root package name */
    private long f30567b;

    static {
        Covode.recordClassIndex(17723);
    }

    public a(String str) {
        this.f30566a = str;
    }

    public final void a(JSONObject jSONObject) {
        this.f30567b = SystemClock.uptimeMillis();
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "api_name", this.f30566a);
        com.bytedance.globalpayment.payment.common.lib.h.a.a().d().a("api_request_start", jSONObject2, null, jSONObject);
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        long j2 = 0;
        if (this.f30567b > 0) {
            j2 = SystemClock.uptimeMillis() - this.f30567b;
        }
        JSONObject jSONObject3 = new JSONObject();
        add(jSONObject3, "time_consuming", j2);
        com.bytedance.globalpayment.payment.common.lib.h.a.a().d().a("api_request_end", jSONObject, jSONObject3, jSONObject2);
    }
}
