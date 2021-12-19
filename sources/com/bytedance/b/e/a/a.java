package com.bytedance.b.e.a;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.services.apm.api.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class a extends com.bytedance.b.k.a {

    /* renamed from: a  reason: collision with root package name */
    public static b f26190a;

    /* renamed from: b  reason: collision with root package name */
    public static long f26191b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static long f26192c;

    /* renamed from: d  reason: collision with root package name */
    public static long f26193d = -1;

    /* renamed from: h  reason: collision with root package name */
    private static String f26194h;

    /* renamed from: i  reason: collision with root package name */
    private static Boolean f26195i;

    /* renamed from: j  reason: collision with root package name */
    private static String f26196j;

    /* renamed from: k  reason: collision with root package name */
    private static int f26197k = -1;

    /* renamed from: l  reason: collision with root package name */
    private static String f26198l;

    /* renamed from: m  reason: collision with root package name */
    private static int f26199m = -1;
    private static String n;
    private static String o;
    private static int p = -1;
    private static JSONObject q;
    private static Map<String, String> r;

    public static int e() {
        return f26190a.c();
    }

    public static String n() {
        return f26190a.d();
    }

    public static String o() {
        return f26190a.f();
    }

    public static long p() {
        return f26190a.e();
    }

    static {
        Covode.recordClassIndex(15202);
    }

    public static long a() {
        if (f26191b < 0) {
            f26191b = System.currentTimeMillis();
        }
        return f26191b;
    }

    public static long b() {
        if (f26192c <= 0) {
            f26192c = System.currentTimeMillis();
        }
        return f26192c;
    }

    public static String d() {
        if (f26194h == null) {
            synchronized (a.class) {
                if (f26194h == null) {
                    f26194h = f26190a.g();
                }
            }
        }
        return f26194h;
    }

    public static String f() {
        if (f26196j == null) {
            synchronized (a.class) {
                if (f26196j == null) {
                    f26196j = f26190a.h();
                }
            }
        }
        return f26196j;
    }

    public static int g() {
        if (f26197k == -1) {
            synchronized (a.class) {
                if (f26197k == -1) {
                    f26197k = f26190a.i();
                }
            }
        }
        return f26197k;
    }

    public static int i() {
        if (f26199m == -1) {
            synchronized (a.class) {
                if (f26199m == -1) {
                    f26199m = f26190a.k();
                }
            }
        }
        return f26199m;
    }

    public static String l() {
        if (p == -1) {
            synchronized (a.class) {
                if (p == -1) {
                    p = f26190a.n();
                }
            }
        }
        return String.valueOf(p);
    }

    public static JSONObject m() {
        if (q == null) {
            synchronized (a.class) {
                if (q == null) {
                    q = f26190a.q();
                }
            }
        }
        return q;
    }

    public static boolean c() {
        boolean z;
        if (f26195i == null) {
            synchronized (a.class) {
                if (f26195i == null) {
                    String d2 = d();
                    if (d2 == null || d2.contains(":") || !d2.equals(com.bytedance.b.k.a.f26313g.getPackageName())) {
                        z = false;
                    } else {
                        z = true;
                    }
                    f26195i = Boolean.valueOf(z);
                }
            }
        }
        return f26195i.booleanValue();
    }

    public static String h() {
        if (TextUtils.isEmpty(f26198l)) {
            synchronized (a.class) {
                if (TextUtils.isEmpty(f26198l)) {
                    f26198l = f26190a.j();
                }
            }
        }
        return f26198l;
    }

    public static String j() {
        if (TextUtils.isEmpty(n)) {
            synchronized (a.class) {
                if (TextUtils.isEmpty(n)) {
                    n = f26190a.l();
                }
            }
        }
        return n;
    }

    public static String k() {
        if (TextUtils.isEmpty(o)) {
            synchronized (a.class) {
                if (TextUtils.isEmpty(o)) {
                    o = f26190a.m();
                }
            }
        }
        return o;
    }

    public static Map<String, String> q() {
        if (r == null) {
            HashMap hashMap = new HashMap();
            r = hashMap;
            hashMap.put("aid", String.valueOf(e()));
            r.put("os", "Android");
            r.put("device_platform", "android");
            r.put("os_api", new StringBuilder().append(Build.VERSION.SDK_INT).toString());
            r.put("update_version_code", String.valueOf(g()));
            r.put("version_code", j());
            r.put("channel", f());
            r.put("device_model", Build.MODEL);
            r.put("device_brand", Build.BRAND);
        }
        r.put("device_id", n());
        if (r()) {
            r.put("_log_level", "debug");
        }
        try {
            Map<String, String> s = f26190a.s();
            if (s != null && s.size() > 0) {
                for (Map.Entry<String, String> entry : s.entrySet()) {
                    r.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable unused) {
        }
        return r;
    }

    public static c a(String str, Map<String, String> map, byte[] bArr) {
        return ((IHttpService) com.bytedance.b.j.c.a(IHttpService.class)).doPost(str, bArr, map);
    }
}
