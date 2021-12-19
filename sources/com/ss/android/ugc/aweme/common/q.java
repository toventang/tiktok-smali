package com.ss.android.ugc.aweme.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.i.b;
import com.ss.android.i.d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static String f76480a;

    static {
        Covode.recordClassIndex(47231);
    }

    public static void a(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(f76480a)) {
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put("launch_from", f76480a);
            }
            d.a.f59589a.a(str, map, b.f59570g);
        }
    }

    public static void a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str) || context == null) {
            return;
        }
        if (!TextUtils.isEmpty(f76480a)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("launch_from", f76480a);
            } catch (JSONException unused) {
                d.a.f59589a.a("event_v1", str, str2, null, null, jSONObject, b.f59569f);
            }
        } else {
            d.a.f59589a.a("event_v1", str, str2, b.f59569f);
        }
    }

    public static void a(Context context, String str, String str2, long j2, long j3) {
        a(context, "event_v1", str, str2, j2, j3, null);
    }

    public static void a(Context context, String str, String str2, long j2, long j3, JSONObject jSONObject) {
        a(context, "event_v1", str, str2, j2, j3, jSONObject);
    }

    public static void a(Context context, String str, String str2, String str3, long j2, long j3, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        String str4 = str;
        if (!TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str4)) {
                str4 = "event_v1";
            }
            if (!m.a(f76480a)) {
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                try {
                    jSONObject2.put("launch_from", f76480a);
                } catch (JSONException unused) {
                }
            }
            if (context != null) {
                d.a.f59589a.a(str4, str2, str3, Long.valueOf(j2), Long.valueOf(j3), jSONObject2, b.f59569f);
            }
        }
    }
}
