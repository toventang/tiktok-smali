package com.bytedance.crash.entity;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICommonParams;
import com.bytedance.crash.h.a;
import com.bytedance.crash.m;
import com.bytedance.crash.nativecrash.c;
import com.bytedance.crash.nativecrash.e;
import com.bytedance.crash.util.ab;
import com.bytedance.crash.util.n;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f27557a;

    /* renamed from: b  reason: collision with root package name */
    private Header f27558b;

    static {
        Covode.recordClassIndex(16185);
    }

    private static String a(long j2) {
        return j2 <= 1024 ? "0 - 1K" : j2 <= 65536 ? "1K - 64K" : j2 <= 524288 ? "64K - 512K" : j2 <= 1048576 ? "512K - 1M" : j2 <= 67108864 ? "1M - 64M" : "64M - ";
    }

    public static boolean a(String str) {
        return ((long) e.c(str)) > c.c();
    }

    public final b a(JSONObject jSONObject) {
        a("header", jSONObject);
        return this;
    }

    public final Header a() {
        if (this.f27558b == null) {
            Header header = new Header(m.f27724a);
            this.f27558b = header;
            a(header);
        }
        return this.f27558b;
    }

    public final b a(long j2, long j3) {
        try {
            a("app_start_time", Long.valueOf(j2));
            if (j3 != 0) {
                a("app_start_up_time", Long.valueOf(j3));
            }
            a("app_start_time_readable", (Object) new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date(j2)));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return this;
    }

    public final b a(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null || list.isEmpty()) {
            a("patch_info", (Object) jSONArray);
            return this;
        }
        for (String str : list) {
            jSONArray.put(str);
        }
        a("patch_info", (Object) jSONArray);
        return this;
    }

    public final b a(String str, List<String> list) {
        if (list == null) {
            return this;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str2 : list) {
            jSONArray.put(str2);
        }
        a(str, jSONArray);
        return this;
    }

    public final b a(String str, JSONArray jSONArray) {
        JSONObject optJSONObject = this.f27557a.optJSONObject("custom_long");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            a("custom_long", optJSONObject);
        }
        n.a(optJSONObject, str, jSONArray);
        return this;
    }

    public final b a(String str, String str2) {
        a(b(), "filters", str, str2);
        return this;
    }

    public final void a(String str, Object obj) {
        n.a(this.f27557a, str, obj);
    }

    public final b a(ICommonParams iCommonParams) {
        JSONArray jSONArray;
        Throwable th;
        boolean z = a.f27605a;
        n.a(this.f27557a, "mira_init", Boolean.valueOf(z));
        if (z) {
            jSONArray = a.a();
            if (jSONArray == null) {
                try {
                    Map<String, Integer> pluginInfo = iCommonParams.getPluginInfo();
                    if (pluginInfo != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        try {
                            for (Map.Entry<String, Integer> entry : pluginInfo.entrySet()) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("package_name", entry.getKey());
                                jSONObject.put("version_code", entry.getValue());
                                jSONArray2.put(jSONObject);
                            }
                            jSONArray = jSONArray2;
                        } catch (Throwable th2) {
                            th = th2;
                            jSONArray = jSONArray2;
                            try {
                                this.f27557a.put("Code err:\n" + ab.a(th), 0);
                            } catch (Throwable unused) {
                            }
                            n.a(this.f27557a, "plugin_info", jSONArray);
                            return this;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    this.f27557a.put("Code err:\n" + ab.a(th), 0);
                    n.a(this.f27557a, "plugin_info", jSONArray);
                    return this;
                }
            }
        } else {
            jSONArray = null;
        }
        n.a(this.f27557a, "plugin_info", jSONArray);
        return this;
    }

    public final b a(Map<? extends String, ? extends String> map) {
        JSONObject jSONObject;
        JSONObject optJSONObject;
        if (map != null) {
            Object opt = this.f27557a.opt("data");
            if (opt instanceof JSONArray) {
                jSONObject = ((JSONArray) opt).optJSONObject(0);
            } else {
                jSONObject = this.f27557a;
            }
            if (jSONObject == null) {
                optJSONObject = new JSONObject();
            } else {
                optJSONObject = jSONObject.optJSONObject("filters");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                    a("filters", optJSONObject);
                }
            }
            for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                n.a(optJSONObject, (String) entry.getKey(), entry.getValue());
            }
            a("filters", optJSONObject);
        }
        return this;
    }

    public b() {
        this.f27557a = new JSONObject();
    }

    public final JSONObject b() {
        Object opt = this.f27557a.opt("data");
        if (opt instanceof JSONArray) {
            return ((JSONArray) opt).optJSONObject(0);
        }
        return this.f27557a;
    }

    public b(JSONObject jSONObject) {
        this.f27557a = jSONObject;
    }

    public final void c(JSONObject jSONObject) {
        b(this.f27557a, jSONObject);
    }

    public static boolean b(String str) {
        if (e.a(str) > 960) {
            return true;
        }
        return false;
    }

    public static boolean c(String str) {
        if (e.b(str) > 350) {
            return true;
        }
        return false;
    }

    public final b a(Header header) {
        a("header", header.f27553a);
        this.f27558b = header;
        return this;
    }

    public final b b(JSONObject jSONObject) {
        a(this.f27557a, jSONObject);
        return this;
    }

    public final b a(String str, long j2) {
        a(this.f27557a, "features_num", str, j2);
        return this;
    }

    public final b b(String str, String str2) {
        a(this.f27557a, "features_str", str, str2);
        return this;
    }

    public final b c(String str, String str2) {
        a(b(), "custom", str, str2);
        return this;
    }

    public static void b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null && jSONObject2.length() > 0) {
            try {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt = jSONObject.opt(next);
                    if (opt == null) {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } else if (opt instanceof JSONObject) {
                        b(jSONObject.getJSONObject(next), jSONObject2.getJSONObject(next));
                    } else if (opt instanceof JSONArray) {
                        JSONArray optJSONArray = jSONObject2.optJSONArray(next);
                        if (optJSONArray != null) {
                            JSONArray jSONArray = (JSONArray) opt;
                            if (jSONArray.length() != 1 || !(jSONArray.opt(0) instanceof JSONObject) || !(optJSONArray.opt(0) instanceof JSONObject)) {
                                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                    jSONArray.put(optJSONArray.get(i2));
                                }
                            } else {
                                b(jSONArray.getJSONObject(0), optJSONArray.getJSONObject(0));
                            }
                        }
                    } else {
                        jSONObject.put(next, jSONObject2.opt(next));
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    public static void a(JSONObject jSONObject, Throwable th) {
        if (jSONObject.opt("npth_err_info") == null) {
            try {
                jSONObject.put("npth_err_info", ab.a(th));
            } catch (Throwable unused) {
            }
        } else {
            int i2 = 0;
            while (jSONObject.opt("npth_err_info" + i2) != null) {
                i2++;
                if (i2 >= 5) {
                    return;
                }
            }
            try {
                jSONObject.put("npth_err_info" + i2, ab.a(th));
            } catch (Throwable unused2) {
            }
        }
    }

    public static void a(JSONObject jSONObject, Map<? extends String, ? extends String> map) {
        if (map != null) {
            try {
                for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        n.a(jSONObject, "storage", jSONObject2);
        long optLong = jSONObject2.optLong("inner_free");
        long optLong2 = jSONObject2.optLong("sdcard_free");
        long optLong3 = jSONObject2.optLong("inner_free_real");
        String a2 = a(optLong);
        String a3 = a(optLong2);
        String a4 = a(optLong3);
        a(jSONObject, "filters", "inner_free", a2);
        a(jSONObject, "filters", "inner_free_real", a4);
        a(jSONObject, "filters", "sdcard_free", a3);
    }

    public static void a(JSONObject jSONObject, String str, String str2, long j2) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject == null) {
                try {
                    optJSONObject = new JSONObject();
                    jSONObject.put(str, optJSONObject);
                } catch (Throwable unused) {
                    return;
                }
            }
            optJSONObject.put(str2, j2);
        }
    }

    public static b a(Context context, String str, String str2, String str3) {
        b bVar = new b();
        bVar.a("crash_time", Long.valueOf(System.currentTimeMillis()));
        bVar.a("process_name", (Object) com.bytedance.crash.util.b.c(context));
        bVar.a("crash_name", (Object) str);
        bVar.a("crash_reason", (Object) str2);
        bVar.a("data", (Object) str3);
        bVar.a("crash_type", (Object) CrashType.GAME.getName());
        com.bytedance.crash.util.b.a(context, bVar.f27557a);
        return bVar;
    }

    public static void a(JSONObject jSONObject, String str, String str2, Object obj) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
                n.a(jSONObject, str, optJSONObject);
            }
            n.a(optJSONObject, str2, obj);
        }
    }
}
