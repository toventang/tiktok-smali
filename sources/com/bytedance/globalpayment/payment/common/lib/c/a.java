package com.bytedance.globalpayment.payment.common.lib.c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.e.b;
import com.ss.android.common.applog.AppLog;
import org.json.JSONObject;

public final class a implements b {
    static {
        Covode.recordClassIndex(17717);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.e.b
    public final void a(String str, JSONObject jSONObject) {
        AppLog.onEvent((Context) null, "event_v3", str, (String) null, 0, 0, jSONObject);
    }
}
