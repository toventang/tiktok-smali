package com.ss.android.ttve.monitor;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.sdkmonitor.k;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.vesdk.g.a;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f61195a = true;

    /* renamed from: b  reason: collision with root package name */
    public static Thread f61196b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile boolean f61197c;

    /* renamed from: d  reason: collision with root package name */
    public static final Object f61198d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static boolean f61199e = false;

    static {
        Covode.recordClassIndex(37683);
    }

    public static void a() {
        MethodCollector.i(1625);
        if (!f61199e || f61197c) {
            MethodCollector.o(1625);
            return;
        }
        synchronized (f61198d) {
            while (!f61197c) {
                try {
                    try {
                        System.currentTimeMillis();
                        f61198d.wait();
                        System.currentTimeMillis();
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                } finally {
                    MethodCollector.o(1625);
                }
            }
        }
    }

    static String a(String str) {
        if (!f61195a) {
            return null;
        }
        a();
        return c.a(str);
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(1622);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(1622);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static void a(String str, String str2) {
        JSONObject jSONObject;
        if (f61195a) {
            a();
            k a2 = c.a();
            if (a2 != null && (jSONObject = a2.f29549b) != null) {
                try {
                    jSONObject.put(str, str2);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static void a(String str, int i2, a aVar) {
        JSONObject a2;
        if (f61195a) {
            a();
            if (aVar == null) {
                a2 = null;
            } else {
                a2 = aVar.a();
            }
            c.a(str, i2, a2);
        }
    }

    public static void a(String str, int i2, JSONObject jSONObject) {
        if (f61195a && jSONObject != null) {
            a();
            if (TextUtils.isEmpty(a("device_id"))) {
                a("device_id", "Unknown");
            }
            if (TextUtils.isEmpty(a("user_id"))) {
                a("user_id", "Unknown");
            }
            if (TextUtils.isEmpty(a("app_version"))) {
                a("app_version", "Unknown");
            }
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("model", f.f61206c);
                hashMap.put("cpu", f.f61207d);
                hashMap.put("cpu_freq", f.f61208e);
                hashMap.put("cpu_core", f.f61209f);
                hashMap.put("memory", f.f61210g);
                hashMap.put("storage", f.f61211h);
                hashMap.put("external_storage", f.f61212i);
                hashMap.put("screen_width", f.f61213j);
                hashMap.put("screen_height", f.f61214k);
                hashMap.put("os_sdk_int", f.f61215l);
                hashMap.put("appid", f.f61216m);
                hashMap.put("abi", f.n);
                hashMap.put("brand", f.o);
                if (!f.f61204a) {
                    f.p = "10.6.0.132";
                    f.f61204a = true;
                }
                hashMap.put("ve_version", f.p);
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getValue();
                    if (!f.f61205b.contains(entry.getKey())) {
                        jSONObject.put("te_device_info_" + ((String) entry.getKey()), str2);
                    } else if (!TextUtils.isEmpty(str2)) {
                        try {
                            jSONObject.put("te_device_info_" + ((String) entry.getKey()), (double) Float.parseFloat(str2));
                        } catch (Exception unused) {
                            entry.getKey();
                        }
                    }
                }
            } catch (JSONException unused2) {
            }
            c.a(str, i2, jSONObject);
        }
    }

    static JSONObject a(Context context, String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_id", str);
            try {
                jSONObject.put("app_version", context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionName);
            } catch (PackageManager.NameNotFoundException unused) {
                jSONObject.put("app_version", "vesdk:10.6.0.132");
            }
            jSONObject.put("ve_version", "10.6.0.132");
            jSONObject.put("effect_version", "10.6.0_rel_13_mt_202112161409_f7765781541");
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("channel", "10.6.0.132" + "-mt");
            jSONObject.put("package_name", context.getPackageName());
            jSONObject.put("user_id", str2);
            jSONObject.put("version_code", str3);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }
}
