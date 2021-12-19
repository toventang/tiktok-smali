package com.ss.android.ad.splash.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONObject;

public class b {

    /* renamed from: d  reason: collision with root package name */
    private static volatile b f58287d;

    /* renamed from: a  reason: collision with root package name */
    public volatile long f58288a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f58289b = true;

    /* renamed from: c  reason: collision with root package name */
    public volatile long f58290c;

    static {
        Covode.recordClassIndex(36207);
    }

    private b() {
    }

    public final void b() {
        this.f58288a = System.currentTimeMillis();
        this.f58289b = true;
    }

    public static b a() {
        MethodCollector.i(1706);
        if (f58287d == null) {
            synchronized (b.class) {
                try {
                    if (f58287d == null) {
                        f58287d = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1706);
                    throw th;
                }
            }
        }
        b bVar = f58287d;
        MethodCollector.o(1706);
        return bVar;
    }

    public final void c() {
        long currentTimeMillis = System.currentTimeMillis() - this.f58290c;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration_ad_show_total_time", currentTimeMillis);
            a.a().a("service_splash_ad_show_time", jSONObject, (JSONObject) null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(int i2) {
        a.a().a("service_splash_ad_show_result", i2, (JSONObject) null);
    }
}
