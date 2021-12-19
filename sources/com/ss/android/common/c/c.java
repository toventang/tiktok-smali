package com.ss.android.common.c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static a f59368a;

    public interface a {
        static {
            Covode.recordClassIndex(36654);
        }
    }

    static {
        Covode.recordClassIndex(36653);
    }

    public static void a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str) && context != null) {
            AppLog.onEvent(context, str, str2);
            if (f59368a != null) {
                TextUtils.isEmpty(str2);
            }
        }
    }

    public static void a(Context context, String str, String str2, JSONObject jSONObject) {
        a(context, "event_v1", str, str2, 0, 0, jSONObject);
    }

    public static void a(Context context, String str, String str2, long j2, long j3) {
        a(context, "event_v1", str, str2, j2, j3, null);
    }

    public static void a(Context context, String str, String str2, String str3, long j2, long j3, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                str = "event_v1";
            }
            if (context != null) {
                AppLog.onEvent(context, str, str2, str3, j2, j3, jSONObject);
                if ("event_v1".equals(str) && f59368a != null && "event_v1".equals(str)) {
                    TextUtils.isEmpty(str3);
                }
            }
        }
    }
}
