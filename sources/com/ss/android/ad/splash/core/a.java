package com.ss.android.ad.splash.core;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.b.a;
import com.ss.android.ad.splash.core.e.b;
import com.ss.android.ad.splash.core.e.h;
import com.ss.android.ad.splash.core.e.s;
import com.ss.android.ad.splash.core.r;
import com.ss.android.ad.splash.f.d;
import com.ss.android.ad.splash.f.g;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f58296a;

    static {
        Covode.recordClassIndex(36214);
    }

    public static a a() {
        MethodCollector.i(2966);
        if (f58296a == null) {
            synchronized (a.class) {
                try {
                    if (f58296a == null) {
                        f58296a = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2966);
                    throw th;
                }
            }
        }
        a aVar = f58296a;
        MethodCollector.o(2966);
        return aVar;
    }

    static void b() {
        if (h.Y) {
            r a2 = r.a();
            if (!h.E) {
                h.E = true;
                r.AnonymousClass1 r1 = new Runnable() {
                    /* class com.ss.android.ad.splash.core.r.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(36371);
                    }

                    public final void run() {
                        String str;
                        String str2;
                        long currentTimeMillis = System.currentTimeMillis();
                        try {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            v a2 = v.a();
                            if (h.ag) {
                                str = d.b(v.f58717a + "splash_ad_ordered_data");
                            } else {
                                str = a2.f58720b.getString("splash_ad_data", "");
                            }
                            g.b("load splashAdData from local time : " + (System.currentTimeMillis() - currentTimeMillis2));
                            List<b> a3 = r.a(str);
                            g.b("wait for load local:" + (System.currentTimeMillis() - currentTimeMillis));
                            if (!h.F) {
                                k a4 = k.a();
                                if (h.ad) {
                                    a4.f58657b = r.b();
                                }
                                long j2 = v.a().j();
                                long k2 = v.a().k();
                                long j3 = v.a().f58720b.getLong("splash_ad_cold_launch_interval", 0);
                                long j4 = v.a().f58720b.getLong("splash_ad_last_show_time", 0);
                                String s = v.a().s();
                                String t = v.a().t();
                                boolean n = v.a().n();
                                String string = v.a().f58720b.getString("key_splash_ad_time_period_map", "");
                                g.b("wait for load sp:" + (System.currentTimeMillis() - currentTimeMillis));
                                if (!TextUtils.isEmpty(s)) {
                                    JSONArray jSONArray = new JSONArray(s);
                                    if (jSONArray.length() == 2) {
                                        a4.a(jSONArray.getLong(0) * 1000);
                                        a4.b(jSONArray.getLong(1) * 1000);
                                    }
                                }
                                a4.f58656a = a3;
                                a4.f58660e = j2;
                                a4.f58659d = k2;
                                a4.f58664i = j3;
                                a4.f58667l = t;
                                a4.f58663h = n;
                                if (!TextUtils.isEmpty(string)) {
                                    a4.f58666k = s.a(string);
                                }
                                if (h.a().f58918j) {
                                    n.a().f58672a = j4;
                                }
                                h.F = true;
                                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                                g.b("load local and init time:".concat(String.valueOf(currentTimeMillis3)));
                                JSONObject jSONObject = new JSONObject();
                                if (h.ag) {
                                    str2 = "dur_use_file";
                                } else {
                                    str2 = "dur_use_sp";
                                }
                                jSONObject.put(str2, currentTimeMillis3);
                                a.a().a("service_load_local_data", jSONObject);
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                };
                if (h.af) {
                    h.f58579h.execute(r1);
                } else {
                    r1.run();
                }
            }
        } else {
            r.a();
            if (!h.E) {
                long currentTimeMillis = System.currentTimeMillis();
                h.E = true;
                try {
                    h c2 = r.c();
                    if (!h.F) {
                        k a3 = k.a();
                        a3.f58658c = c2;
                        long j2 = v.a().j();
                        long k2 = v.a().k();
                        String s = v.a().s();
                        String t = v.a().t();
                        boolean n = v.a().n();
                        if (!TextUtils.isEmpty(s)) {
                            JSONArray jSONArray = new JSONArray(s);
                            if (jSONArray.length() == 2) {
                                k.a().a(jSONArray.getLong(0) * 1000);
                                k.a().b(jSONArray.getLong(1) * 1000);
                            }
                        }
                        a3.f58660e = j2;
                        a3.f58659d = k2;
                        a3.f58658c = c2;
                        a3.f58667l = t;
                        a3.f58663h = n;
                        h.F = true;
                        long currentTimeMillis2 = System.currentTimeMillis();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration_load_local_data_time", currentTimeMillis2 - currentTimeMillis);
                        com.ss.android.ad.splash.b.a.a().a("service_ad_load_local_sync_data", jSONObject);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    com.ss.android.ad.splash.b.a.a().a(e2, "key_exception_local_data");
                }
            }
        }
    }
}
