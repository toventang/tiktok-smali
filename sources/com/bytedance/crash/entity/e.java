package com.bytedance.crash.entity;

import android.provider.Settings;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.m;
import com.bytedance.crash.util.n;
import com.bytedance.crash.util.v;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f27562a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f27563b;

    /* renamed from: c  reason: collision with root package name */
    private static JSONObject f27564c;

    /* renamed from: d  reason: collision with root package name */
    private static String f27565d;

    /* renamed from: e  reason: collision with root package name */
    private static String f27566e;

    static {
        Covode.recordClassIndex(16189);
    }

    public static boolean a() {
        return "true".equals(f27565d);
    }

    public static boolean b() {
        return "true".equals(f27566e);
    }

    public static JSONObject d() {
        if (f27564c == null) {
            try {
                f27564c = new JSONObject(Settings.Global.getString(m.f27724a.getContentResolver(), "bytest_automation_info"));
            } catch (JSONException unused) {
                f27564c = new JSONObject();
            } catch (Throwable unused2) {
            }
        }
        return f27564c;
    }

    public static void c() {
        d();
        if (!n.a(f27564c)) {
            f27563b = true;
            Iterator<String> keys = f27564c.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if ("slardar_filter".equals(next)) {
                    JSONObject optJSONObject = f27564c.optJSONObject(next);
                    if (optJSONObject == null) {
                        v.b("bytest config is null");
                        return;
                    }
                    f27565d = optJSONObject.optString("core_dump_switch");
                    f27566e = optJSONObject.optString("gwp_asan_switch");
                    f27562a = "true".equals(optJSONObject.optString("is_all_exception_collected"));
                }
            }
        }
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                c(jSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    static void b(JSONObject jSONObject) {
        Object opt;
        d();
        JSONObject jSONObject2 = f27564c;
        if (jSONObject2 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!"slardar_filter".equals(next) && (opt = f27564c.opt(next)) != null) {
                    try {
                        jSONObject.put(next, opt);
                    } catch (JSONException unused) {
                    }
                }
            }
        }
    }

    private static void c(JSONObject jSONObject) {
        d();
        JSONObject jSONObject2 = f27564c;
        if (jSONObject2 != null) {
            JSONObject optJSONObject = jSONObject2.optJSONObject("slardar_filter");
            if (!n.a(optJSONObject)) {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("filters");
                if (optJSONObject2 == null) {
                    optJSONObject2 = new JSONObject();
                    try {
                        jSONObject.put("filters", optJSONObject2);
                    } catch (JSONException unused) {
                    }
                }
                b.b(optJSONObject2, optJSONObject);
            }
        }
    }
}
