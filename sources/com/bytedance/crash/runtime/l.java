package com.bytedance.crash.runtime;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static JSONObject f27929a;

    /* renamed from: b  reason: collision with root package name */
    public static long f27930b;

    /* renamed from: c  reason: collision with root package name */
    private static long f27931c;

    static {
        Covode.recordClassIndex(16344);
    }

    public static void a() {
        m.a("npthStart", null, f27929a);
    }

    public static void a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        JSONObject jSONObject = f27929a;
        if (jSONObject == null) {
            f27929a = new JSONObject();
            f27930b = uptimeMillis;
        } else {
            try {
                jSONObject.put(str, uptimeMillis - f27931c);
            } catch (JSONException unused) {
            }
        }
        f27931c = uptimeMillis;
    }
}
