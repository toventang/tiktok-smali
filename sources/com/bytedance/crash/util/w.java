package com.bytedance.crash.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.b;
import com.bytedance.crash.m;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class w {
    static {
        Covode.recordClassIndex(16405);
    }

    public static boolean a(File file) {
        return file.exists() && file.length() > 128;
    }

    private static void a(JSONObject jSONObject, JSONObject jSONObject2, File file) {
        if (file != null) {
            a("has_logcat_file", a(new File(file, "logcat.txt")), jSONObject, jSONObject2);
            b.a(jSONObject, "filters", "logcat_type", new File(file, "logerr.txt").exists() ? "native" : "java");
            a("has_maps_file", a(new File(file, "maps.txt")), jSONObject, jSONObject2);
            a("has_meminfo_file", a(new File(file, "meminfo.txt")), jSONObject, jSONObject2);
            a("has_threads_file", a(new File(file, "threads.txt")), jSONObject, jSONObject2);
            a("has_pthreads_file", a(r.d(file)), jSONObject, jSONObject2);
            a("has_malloc_file", a(r.c(file)), jSONObject, jSONObject2);
            a("has_fds_file", a(new File(file, "fds.txt")), jSONObject, jSONObject2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(org.json.JSONObject r7, org.json.JSONObject r8, org.json.JSONObject r9, org.json.JSONObject r10) {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.w.a(org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject):void");
    }

    private static void a(String str, JSONObject jSONObject) {
        try {
            jSONObject.put(str, 1);
        } catch (JSONException unused) {
        }
    }

    private static void g(JSONObject jSONObject, JSONObject jSONObject2) {
        a(jSONObject.opt("launch_did"), "launch_did", jSONObject2);
    }

    public static int a(Object obj, int i2) {
        if (obj == null) {
            return i2;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt(String.valueOf(obj));
            } catch (Throwable unused) {
            }
        }
        return i2;
    }

    private static void e(JSONObject jSONObject, JSONObject jSONObject2) {
        a(jSONObject.opt("battery"), "battery", jSONObject2);
        a(jSONObject.opt("filters"), "filters", jSONObject2);
    }

    private static void b(JSONObject jSONObject, JSONObject jSONObject2) {
        int i2;
        boolean z = false;
        try {
            if (new JSONObject(jSONObject.optString("data")).optString("mainStackFromTrace").trim().startsWith("at")) {
                i2 = 0;
            } else {
                i2 = 1;
            }
        } catch (Throwable unused) {
            i2 = -1;
        }
        a((Object) 1, (Object) Integer.valueOf(i2), "has_native_stack", jSONObject2);
        if (i2 == 1) {
            z = true;
        }
        b.a(jSONObject, "filters", "has_native_stack", String.valueOf(z));
    }

    private static void c(JSONObject jSONObject, JSONObject jSONObject2) {
        a(jSONObject.opt("miniapp_id"), "miniapp_id", jSONObject2);
        a(jSONObject.opt("plugin_info"), "plugin_info", jSONObject2);
        a(jSONObject.opt("process_name"), "process_name", jSONObject2);
        a(jSONObject.opt("plugin_info"), "plugin_info", jSONObject2);
    }

    private static void d(JSONObject jSONObject, JSONObject jSONObject2) {
        a(jSONObject.opt("pid"), "pid", jSONObject2);
        a(jSONObject.opt("app_start_time"), "app_start_time", jSONObject2);
        a(jSONObject.opt("app_start_time_readable"), "app_start_time_readable", jSONObject2);
        a(jSONObject.opt("patch_info"), "patch_info", jSONObject2);
        a(jSONObject.opt("is_background"), "is_background", jSONObject2);
        a(jSONObject.opt("activity_trace"), "activity_trace", jSONObject2);
        a(jSONObject.opt("custom_long"), "custom_long", jSONObject2);
        a(jSONObject.opt("custom"), "custom", jSONObject2);
        if (jSONObject.optJSONObject("custom_long") != null) {
            a(jSONObject.optJSONObject("custom_long").opt("activity_track"), "activity_track", jSONObject2);
        }
    }

    private static void f(JSONObject jSONObject, JSONObject jSONObject2) {
        a(jSONObject.opt("logcat"), "logcat", jSONObject2);
        b.a(jSONObject, "filters", "has_logcat", String.valueOf(!n.a(jSONObject, "logcat")));
        a(jSONObject.opt("crash_time"), "crash_time", jSONObject2);
        a(jSONObject.opt("crash_uuid"), "crash_uuid", jSONObject2);
        a(jSONObject.opt("storage"), "storage", jSONObject2);
        a(jSONObject.opt("filters"), "filters", jSONObject2);
        if (jSONObject.opt("filters") != null) {
            a(jSONObject.optJSONObject("filters").opt("sdk_version"), "filters:sdk_version", jSONObject2);
            a(jSONObject.optJSONObject("filters").opt("is_root"), "filters:is_root", jSONObject2);
            a(jSONObject.optJSONObject("filters").opt("is_64_devices"), "filters:is_64_devices", jSONObject2);
            a(jSONObject.optJSONObject("filters").opt("is_64_runtime"), "filters:is_64_runtime", jSONObject2);
            a(jSONObject.optJSONObject("filters").opt("is_x86_devices"), "filters:is_x86_devices", jSONObject2);
        }
    }

    public static void a(JSONObject jSONObject, File file) {
        CrashType crashType;
        Object opt = jSONObject.opt("data");
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (opt == null) {
            m.f27730g.isDebugMode();
        } else if (optJSONObject == null) {
            m.f27730g.isDebugMode();
        } else {
            if (opt instanceof JSONArray) {
                crashType = CrashType.LAUNCH;
                m.f27730g.isDebugMode();
                jSONObject = ((JSONArray) opt).optJSONObject(0);
                g(jSONObject, jSONObject2);
            } else if (jSONObject.optInt("is_anr") == 1) {
                crashType = CrashType.ANR;
                b(jSONObject, jSONObject2);
                m.f27730g.isDebugMode();
            } else if (jSONObject.optInt("is_native_crash") == 1) {
                crashType = CrashType.NATIVE;
                m.f27730g.isDebugMode();
            } else if (jSONObject.optInt("is_dart") == 1) {
                m.f27730g.isDebugMode();
                return;
            } else {
                crashType = CrashType.JAVA;
                m.f27730g.isDebugMode();
            }
            n.a(jSONObject2, "crash_type", crashType);
            n.a(jSONObject2, "succ_step", Integer.valueOf(jSONObject.optInt("succ_step", -1)));
            f(jSONObject, jSONObject2);
            a(optJSONObject, jSONObject, jSONObject2, jSONObject3);
            a(jSONObject, jSONObject2);
            a(jSONObject, jSONObject2, file);
            com.bytedance.crash.runtime.m.a("crash_data_check", jSONObject2, jSONObject3);
        }
    }

    private static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        c(jSONObject, jSONObject2);
        d(jSONObject, jSONObject2);
        e(jSONObject, jSONObject2);
    }

    private static void a(long j2, String str, JSONObject jSONObject) {
        if (j2 != 0) {
            n.a(jSONObject, str, Long.valueOf(j2));
        }
    }

    private static void a(Object obj, String str, JSONObject jSONObject) {
        if (obj == null) {
            a("err_null_".concat(String.valueOf(str)), jSONObject);
        }
    }

    private static void a(String str, String str2, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            a("err_empty_".concat(String.valueOf(str2)), jSONObject);
        }
    }

    private static void a(Object obj, Object obj2, String str, JSONObject jSONObject) {
        if (obj == obj2) {
            return;
        }
        if (obj == null) {
            a("err_" + str + "_not_" + obj, jSONObject);
        } else if (!obj.equals(obj2)) {
            a("err_" + str + "_not_" + obj, jSONObject);
        }
    }

    private static void a(String str, boolean z, JSONObject jSONObject, JSONObject jSONObject2) {
        if (!z) {
            a(str + "_false", jSONObject2);
        }
        b.a(jSONObject, "filters", str, String.valueOf(z));
    }
}
