package com.bytedance.bdturing.e;

import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.bdturing.b.b;
import com.bytedance.bdturing.e.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.p;
import h.v;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class g implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f26478a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f26479b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f26480c;

    /* renamed from: d  reason: collision with root package name */
    public static Handler f26481d;

    /* renamed from: e  reason: collision with root package name */
    public static a f26482e;

    /* renamed from: f  reason: collision with root package name */
    public static final List<f.a> f26483f = new LinkedList();

    /* renamed from: g  reason: collision with root package name */
    public static boolean f26484g;

    /* renamed from: h  reason: collision with root package name */
    public static final g f26485h = new g();

    /* renamed from: i  reason: collision with root package name */
    private static int f26486i;

    /* renamed from: j  reason: collision with root package name */
    private static JSONObject f26487j = c.f26468a;

    /* renamed from: k  reason: collision with root package name */
    private static final List<f.a> f26488k = new LinkedList();

    /* renamed from: l  reason: collision with root package name */
    private static final Runnable f26489l = new a();

    public static final class a implements Runnable {
        static {
            Covode.recordClassIndex(15567);
        }

        a() {
        }

        public final void run() {
            String str;
            g gVar = g.f26485h;
            HashMap hashMap = new HashMap();
            a aVar = g.f26482e;
            if (aVar == null) {
                l.a("configProvider");
            }
            p a2 = v.a("aid", aVar.b());
            hashMap.put(a2.getFirst(), a2.getSecond());
            a aVar2 = g.f26482e;
            if (aVar2 == null) {
                l.a("configProvider");
            }
            p a3 = v.a("lang", aVar2.e());
            hashMap.put(a3.getFirst(), a3.getSecond());
            a aVar3 = g.f26482e;
            if (aVar3 == null) {
                l.a("configProvider");
            }
            p a4 = v.a("app_name", aVar3.f());
            hashMap.put(a4.getFirst(), a4.getSecond());
            a aVar4 = g.f26482e;
            if (aVar4 == null) {
                l.a("configProvider");
            }
            p a5 = v.a("channel", aVar4.i());
            hashMap.put(a5.getFirst(), a5.getSecond());
            a aVar5 = g.f26482e;
            if (aVar5 == null) {
                l.a("configProvider");
            }
            p a6 = v.a("region", aVar5.j());
            hashMap.put(a6.getFirst(), a6.getSecond());
            p a7 = v.a("os_type", "0");
            hashMap.put(a7.getFirst(), a7.getSecond());
            p a8 = v.a("datetime", String.valueOf(System.currentTimeMillis()));
            hashMap.put(a8.getFirst(), a8.getSecond());
            a aVar6 = g.f26482e;
            if (aVar6 == null) {
                l.a("configProvider");
            }
            p a9 = v.a("sdk_version", aVar6.h());
            hashMap.put(a9.getFirst(), a9.getSecond());
            a aVar7 = g.f26482e;
            if (aVar7 == null) {
                l.a("configProvider");
            }
            p a10 = v.a("iid", aVar7.c());
            hashMap.put(a10.getFirst(), a10.getSecond());
            a aVar8 = g.f26482e;
            if (aVar8 == null) {
                l.a("configProvider");
            }
            p a11 = v.a("app_version", aVar8.g());
            hashMap.put(a11.getFirst(), a11.getSecond());
            p a12 = v.a("os_name", "Android");
            hashMap.put(a12.getFirst(), a12.getSecond());
            p a13 = v.a("os_version", String.valueOf(Build.VERSION.SDK_INT));
            hashMap.put(a13.getFirst(), a13.getSecond());
            a aVar9 = g.f26482e;
            if (aVar9 == null) {
                l.a("configProvider");
            }
            p a14 = v.a("did", aVar9.d());
            hashMap.put(a14.getFirst(), a14.getSecond());
            String str2 = Build.BRAND;
            try {
                str2 = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e2) {
                com.bytedance.bdturing.g.a(e2);
            }
            p a15 = v.a("device_brand", str2);
            hashMap.put(a15.getFirst(), a15.getSecond());
            String a16 = g.a("common");
            if (a16 == null) {
                str = null;
            } else if (h.m.p.c(a16, "/", false)) {
                str = a16 + "vc/setting";
            } else {
                str = a16 + '/' + "vc/setting";
            }
            com.bytedance.bdturing.g.d(str);
            if (str != null || !com.bytedance.bdturing.g.a()) {
                if (str == null) {
                    str = "";
                }
                a aVar10 = g.f26482e;
                if (aVar10 == null) {
                    l.a("configProvider");
                }
                new f(str, hashMap, gVar, aVar10.a()).a();
                return;
            }
            throw new RuntimeException("url should not empty");
        }
    }

    private g() {
    }

    public static long a() {
        return f26487j.optLong("available_time");
    }

    private static int b() {
        return b("common").optInt("retry_count", 0);
    }

    private static long c() {
        return b("common").optLong("retry_interval", 30000);
    }

    private static long d() {
        return b("common").optLong("period", 30000);
    }

    static {
        Covode.recordClassIndex(15566);
    }

    private static void b(long j2) {
        f26487j.put("available_time", j2);
    }

    public static String a(String str) {
        l.c(str, "");
        return a(str, "host");
    }

    public static JSONObject b(String str) {
        l.c(str, "");
        JSONObject optJSONObject = f26487j.optJSONObject(str);
        if (optJSONObject != null) {
            return optJSONObject;
        }
        JSONObject optJSONObject2 = c.f26468a.optJSONObject(str);
        if (optJSONObject2 == null) {
            return new JSONObject();
        }
        return optJSONObject2;
    }

    public static void c(String str) {
        try {
            f26487j = new JSONObject(str);
            b(System.currentTimeMillis() + d());
            b.f26405b.a(str);
        } catch (JSONException e2) {
            com.bytedance.bdturing.g.a(e2);
        }
    }

    public static long a(boolean z) {
        if (z || f26486i >= b() || c() == 0) {
            return Math.max(Math.min(a() - System.currentTimeMillis(), d()), 30000L);
        }
        f26486i++;
        return c();
    }

    public static void a(long j2) {
        Handler handler = f26481d;
        if (handler != null) {
            handler.removeCallbacks(f26489l);
        }
        Handler handler2 = f26481d;
        if (handler2 != null) {
            handler2.postDelayed(f26489l, j2);
        }
    }

    public static boolean a(f.a aVar) {
        boolean add;
        MethodCollector.i(11354);
        l.c(aVar, "");
        List<f.a> list = f26488k;
        synchronized (list) {
            try {
                add = list.add(aVar);
            } finally {
                MethodCollector.o(11354);
            }
        }
        return add;
    }

    public static String a(String str, String str2) {
        String str3;
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = b(str).optJSONObject(str2);
        if (optJSONObject2 != null) {
            a aVar = f26482e;
            if (aVar == null) {
                l.a("configProvider");
            }
            str3 = optJSONObject2.optString(aVar.j());
        } else {
            str3 = null;
        }
        if (!TextUtils.isEmpty(str3)) {
            return str3;
        }
        JSONObject optJSONObject3 = c.f26468a.optJSONObject(str);
        if (optJSONObject3 == null || (optJSONObject = optJSONObject3.optJSONObject(str2)) == null) {
            return null;
        }
        a aVar2 = f26482e;
        if (aVar2 == null) {
            l.a("configProvider");
        }
        return optJSONObject.optString(aVar2.j());
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c A[LOOP:0: B:8:0x0036->B:10:0x003c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0061 A[SYNTHETIC, Splitter:B:15:0x0061] */
    @Override // com.bytedance.bdturing.e.f.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r6, java.lang.String r7, long r8) {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.e.g.a(int, java.lang.String, long):void");
    }
}
