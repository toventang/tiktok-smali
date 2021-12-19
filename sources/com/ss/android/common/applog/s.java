package com.ss.android.common.applog;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class s {
    static {
        Covode.recordClassIndex(36637);
    }

    public static void a(Context context, String str, String str2, String str3, long j2, long j3, boolean z, JSONObject jSONObject) {
        AppLog.onEvent(context, str, str2, str3, j2, j3, z, jSONObject);
    }
}
