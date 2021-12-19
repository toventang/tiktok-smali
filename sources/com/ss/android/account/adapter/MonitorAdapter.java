package com.ss.android.account.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.o.c;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.c.a;
import org.json.JSONObject;

public class MonitorAdapter implements c {
    static {
        Covode.recordClassIndex(36162);
    }

    @Override // com.bytedance.sdk.a.o.c
    public final void a(String str, JSONObject jSONObject) {
        a.a(str, jSONObject);
    }

    @Override // com.bytedance.sdk.a.o.c
    public final void a(long j2, String str) {
        AppLog.setUserId(j2);
        AppLog.setSessionKey(str);
    }
}
