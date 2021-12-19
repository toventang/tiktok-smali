package com.bytedance.crash.runtime.b;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.crash.m;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.util.j;
import com.bytedance.crash.util.n;
import com.bytedance.crash.util.r;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f27892a;

    /* renamed from: b  reason: collision with root package name */
    public static int f27893b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f27894c;

    /* renamed from: d  reason: collision with root package name */
    protected static JSONObject f27895d = new JSONObject();

    static {
        Covode.recordClassIndex(16326);
    }

    public static void a(JSONObject jSONObject) {
        String str;
        if (jSONObject != null) {
            try {
                File d2 = r.d(m.f27724a);
                JSONObject optJSONObject = jSONObject.optJSONObject("exception_modules");
                if (optJSONObject != null) {
                    str = optJSONObject.optString("npth");
                } else {
                    str = null;
                }
                File file = new File(r.j(m.f27724a), "npth/configCrash/configNative");
                if (str != null) {
                    JSONObject jSONObject2 = new JSONObject(str);
                    f27895d = jSONObject2;
                    if (a(d2, "record")) {
                        j.a(file, " ", false);
                        f27892a = false;
                        return;
                    }
                    b(jSONObject2);
                    j.a(file, b(jSONObject2));
                    if (file.length() > 500) {
                        f27892a = true;
                        return;
                    }
                    return;
                }
                f27895d = new JSONObject();
                j.a(file);
            } catch (JSONException unused) {
            } catch (Throwable th) {
                d.a("NPTH_CATCH", th);
            }
        }
    }

    private static JSONObject b(JSONObject jSONObject) {
        MethodCollector.i(8707);
        Iterator<String> keys = jSONObject.keys();
        b bVar = new b();
        JSONObject jSONObject2 = new JSONObject();
        while (keys.hasNext()) {
            String next = keys.next();
            if ("configType".equals(next)) {
                try {
                    JSONObject optJSONObject = jSONObject.optJSONObject(next);
                    if (optJSONObject == null) {
                        d.a("NPTH_CATCH", new IllegalArgumentException("err config with key: ".concat(String.valueOf(next))));
                        MethodCollector.o(8707);
                        return null;
                    }
                    f27893b = optJSONObject.getInt("npth_enable_online_coreinfo");
                    int i2 = Build.VERSION.SDK_INT;
                    if (f27893b == 1) {
                        jSONObject2.put(next, optJSONObject);
                        NativeImpl.doSetOnlineCoreInfo(1);
                    }
                } catch (JSONException unused) {
                    continue;
                }
            } else if (!"coreinfo_types".equals(next)) {
                continue;
            } else {
                JSONObject optJSONObject2 = jSONObject.optJSONObject(next);
                if (optJSONObject2 == null) {
                    d.a("NPTH_CATCH", new IllegalArgumentException("err config with key: ".concat(String.valueOf(next))));
                    MethodCollector.o(8707);
                    return null;
                } else if (a(optJSONObject2.optJSONArray("disable"), bVar)) {
                    f27893b = 0;
                    MethodCollector.o(8707);
                    return null;
                } else if (!n.a(b(optJSONObject2.optJSONArray("enable"), bVar))) {
                    int i3 = Build.VERSION.SDK_INT;
                    if (f27893b == 1 && f27894c) {
                        jSONObject2.put(next, optJSONObject2);
                    }
                }
            }
        }
        MethodCollector.o(8707);
        return jSONObject2;
    }

    public static boolean a(String str, b bVar) {
        JSONObject optJSONObject;
        JSONObject jSONObject = f27895d;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(str)) == null || a(optJSONObject.optJSONArray("disable"), bVar)) {
            return false;
        }
        return a(optJSONObject.optJSONArray("enable"), bVar);
    }

    private static JSONArray b(JSONArray jSONArray, b bVar) {
        JSONArray jSONArray2 = new JSONArray();
        if (n.a(jSONArray)) {
            return jSONArray2;
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
            if (optJSONObject == null) {
                d.a("NPTH_CATCH", new IllegalArgumentException("err config: ".concat(String.valueOf(jSONArray))));
            } else if (a(optJSONObject, bVar)) {
                f27894c = true;
                jSONArray2.put(optJSONObject);
            }
        }
        return jSONArray2;
    }

    private static boolean a(File file, String str) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        for (File file2 : listFiles) {
            try {
                if (!file2.isDirectory() && file2.getName().startsWith(str) && file2.length() > 0) {
                    long parseLong = Long.parseLong(j.a(file2.getAbsoluteFile(), "\n"));
                    if (currentTimeMillis > parseLong && currentTimeMillis - parseLong < 604800) {
                        return true;
                    }
                    if (currentTimeMillis > parseLong && currentTimeMillis - parseLong >= 604800) {
                        j.a(file2.getAbsoluteFile());
                        return false;
                    }
                }
            } catch (Throwable th) {
                d.a("NPTH_CATCH", th);
            }
        }
        return false;
    }

    private static boolean a(JSONArray jSONArray, b bVar) {
        if (n.a(jSONArray)) {
            return false;
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
            if (optJSONObject == null) {
                d.a("NPTH_CATCH", new IllegalArgumentException("err config: ".concat(String.valueOf(jSONArray))));
            } else if (a(optJSONObject, bVar)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(JSONObject jSONObject, b bVar) {
        Iterator<String> keys = jSONObject.keys();
        boolean z = false;
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next)) {
                z = true;
                if (next.startsWith("header_")) {
                    if (!a(jSONObject.optJSONObject(next), bVar.b(next.substring(7)))) {
                        return false;
                    }
                } else if (next.startsWith("java_") && !a(jSONObject.optJSONObject(next), bVar.a(next.substring(5)))) {
                    return false;
                }
            }
        }
        return z;
    }

    private static boolean a(JSONObject jSONObject, Object obj) {
        JSONArray optJSONArray = jSONObject.optJSONArray("values");
        if (optJSONArray.length() == 0) {
            return false;
        }
        String optString = jSONObject.optString("op");
        String valueOf = String.valueOf(obj);
        if (optString.equals("=")) {
            return valueOf.equals(String.valueOf(optJSONArray.opt(0)));
        }
        if (optString.equals("in")) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                if (String.valueOf(optJSONArray.opt(i2)).equals(valueOf)) {
                    return true;
                }
            }
        }
        return false;
    }
}
