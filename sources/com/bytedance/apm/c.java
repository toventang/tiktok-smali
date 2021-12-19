package com.bytedance.apm;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.apm.core.a;
import com.bytedance.apm.core.b;
import com.bytedance.apm.net.DefaultHttpServiceImpl;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.IHttpService;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {
    private static d A;

    /* renamed from: a  reason: collision with root package name */
    public static Context f24685a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f24686b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f24687c;

    /* renamed from: d  reason: collision with root package name */
    public static long f24688d;

    /* renamed from: e  reason: collision with root package name */
    public static long f24689e;

    /* renamed from: f  reason: collision with root package name */
    public static JSONObject f24690f = new JSONObject();

    /* renamed from: g  reason: collision with root package name */
    public static b f24691g = new a();

    /* renamed from: h  reason: collision with root package name */
    public static IHttpService f24692h = new DefaultHttpServiceImpl();

    /* renamed from: i  reason: collision with root package name */
    public static volatile int f24693i = -1;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f24694j = false;

    /* renamed from: k  reason: collision with root package name */
    public static long f24695k;

    /* renamed from: l  reason: collision with root package name */
    public static long f24696l;

    /* renamed from: m  reason: collision with root package name */
    public static String f24697m;
    public static boolean n;
    public static boolean o;
    public static boolean p = true;
    public static List<String> q;
    public static String r;
    public static boolean s = false;
    private static boolean t;
    private static Map<String, String> u = Collections.emptyMap();
    private static long v = -1;
    private static long w;
    private static boolean x;
    private static long y = 0;
    private static boolean z = true;

    public static boolean e() {
        if (f24686b || t) {
            return true;
        }
        return false;
    }

    public static synchronized d g() {
        d dVar;
        synchronized (c.class) {
            dVar = A;
        }
        return dVar;
    }

    public static synchronized Map<String, String> h() {
        Map<String, String> map;
        synchronized (c.class) {
            map = u;
        }
        return map;
    }

    public static String a() {
        if (TextUtils.isEmpty(f24697m)) {
            f24697m = com.bytedance.apm.q.a.a(Process.myPid());
        }
        return f24697m;
    }

    public static boolean c() {
        String a2;
        if (!x && (a2 = a()) != null && a2.contains(":")) {
            return false;
        }
        return true;
    }

    public static long d() {
        if (v == -1) {
            long currentTimeMillis = System.currentTimeMillis();
            v = currentTimeMillis;
            w = currentTimeMillis;
        }
        return v;
    }

    public static boolean f() {
        JSONObject jSONObject = f24690f;
        if (jSONObject == null || jSONObject.optString("channel") == null) {
            return false;
        }
        return f24690f.optString("channel").contains("local");
    }

    public static long i() {
        if (w == 0) {
            w = System.currentTimeMillis();
        }
        return w;
    }

    static {
        Covode.recordClassIndex(14507);
    }

    public static boolean b() {
        boolean z2 = true;
        if (x) {
            return true;
        }
        if (f24685a == null) {
            return c();
        }
        String a2 = a();
        if (a2 == null || a2.contains(":") || !a2.equals(f24685a.getPackageName())) {
            z2 = false;
        }
        x = z2;
        return z2;
    }

    public static void a(Context context) {
        if (context != null) {
            f24685a = com.bytedance.apm.q.a.a(context);
        }
    }

    public static void b(long j2) {
        if (j2 > 0) {
            long j3 = f24695k;
            if (j3 == 0 || j2 < j3) {
                f24695k = j2;
            }
        }
    }

    public static String a(long j2) {
        long j3 = j2 - w;
        if (j3 < 30000) {
            return "0 - 30s";
        }
        if (j3 < 60000) {
            return "30s - 1min";
        }
        if (j3 < 120000) {
            return "1min - 2min";
        }
        if (j3 < 300000) {
            return "2min - 5min";
        }
        if (j3 < 600000) {
            return "5min - 10min";
        }
        if (j3 < 1800000) {
            return "10min - 30min";
        }
        if (j3 < 3600000) {
            return "30min - 1h";
        }
        return "1h - ";
    }

    public static synchronized void a(b bVar) {
        synchronized (c.class) {
            f24691g = bVar;
            Map<String, String> a2 = bVar.a();
            u = a2;
            if (a2 == null) {
                u = new HashMap();
            }
            if (!u.containsKey("aid")) {
                u.put("aid", f24690f.optString("aid"));
            }
            if (!u.containsKey("device_id")) {
                u.put("device_id", f24690f.optString("device_id"));
            }
            if (!u.containsKey("device_platform")) {
                u.put("device_platform", "android");
            }
            u.put("os", "Android");
            if (!u.containsKey("update_version_code")) {
                u.put("update_version_code", f24690f.optString("update_version_code"));
            }
            if (!u.containsKey("version_code")) {
                u.put("version_code", f24690f.optString("version_code"));
            }
            if (!u.containsKey("channel")) {
                u.put("channel", f24690f.optString("channel"));
            }
            if (!u.containsKey("os_api")) {
                u.put("os_api", new StringBuilder().append(Build.VERSION.SDK_INT).toString());
            }
            if (e() && !u.containsKey("_log_level")) {
                u.put("_log_level", "debug");
            }
            if (A == null) {
                A = new d();
            }
            A.f24890l = new HashMap(u);
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x02da */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0340 A[Catch:{ Exception -> 0x03c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0364 A[Catch:{ Exception -> 0x03c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0388 A[Catch:{ Exception -> 0x03c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x039a A[Catch:{ Exception -> 0x03c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x030a A[Catch:{ Exception -> 0x03c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x032e A[Catch:{ Exception -> 0x03c7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(org.json.JSONObject r7) {
        /*
        // Method dump skipped, instructions count: 982
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.c.a(org.json.JSONObject):void");
    }

    public static com.bytedance.services.apm.api.c a(String str, Map<String, String> map) {
        return f24692h.doGet(str, map);
    }

    public static boolean a(String str, String str2) {
        JSONObject jSONObject = f24690f;
        if (jSONObject == null) {
            return false;
        }
        try {
            jSONObject.put(str, str2);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }
}
