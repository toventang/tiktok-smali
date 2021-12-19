package com.ss.android.ad.splash.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.core.e.b;
import com.ss.android.ad.splash.core.e.h;
import com.ss.android.ad.splash.f.f;
import com.ss.android.ad.splash.f.g;
import com.ss.android.ad.splash.f.j;
import com.ss.android.ad.splash.f.l;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* access modifiers changed from: package-private */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private static r f58685a;

    static {
        Covode.recordClassIndex(36370);
    }

    private r() {
    }

    public static r a() {
        MethodCollector.i(4717);
        if (f58685a == null) {
            synchronized (r.class) {
                try {
                    if (f58685a == null) {
                        f58685a = new r();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4717);
                    throw th;
                }
            }
        }
        r rVar = f58685a;
        MethodCollector.o(4717);
        return rVar;
    }

    public static List<b> b() {
        JSONArray jSONArray;
        try {
            String string = v.a().f58720b.getString("splash_ad_first_show_data", "");
            if (!l.a(string)) {
                jSONArray = new JSONArray(string);
            } else {
                jSONArray = new JSONArray();
            }
            return j.a(jSONArray, 0L, true);
        } catch (Exception unused) {
            return null;
        }
    }

    static h c() {
        long currentTimeMillis = System.currentTimeMillis();
        String i2 = v.a().i();
        String string = v.a().f58720b.getString("splash_ad_data", "");
        g.b("read sp data time cost: " + (System.currentTimeMillis() - currentTimeMillis));
        h hVar = new h();
        try {
            long currentTimeMillis2 = System.currentTimeMillis();
            List<b> b2 = b(i2);
            List<b> b3 = b(string);
            Map<String, b> a2 = j.a(b2);
            hVar.f58487b = b3;
            hVar.f58488c = a2;
            hVar.f58486a = b2;
            if (!f.a(b3)) {
                hVar.f58490e = h.a(b3);
            } else {
                hVar.f58490e = h.a(b2);
            }
            g.b("parseSplashAdList time : " + (System.currentTimeMillis() - currentTimeMillis2));
            return hVar;
        } catch (Exception unused) {
            return null;
        }
    }

    static List<b> a(String str) {
        JSONArray jSONArray;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!l.a(str)) {
                jSONArray = new JSONArray(str);
            } else {
                jSONArray = new JSONArray();
            }
            g.b("generate json array time : " + (System.currentTimeMillis() - currentTimeMillis));
            List<b> a2 = j.a(jSONArray, 0L, true);
            g.b("parseSplashAdList time : " + (System.currentTimeMillis() - currentTimeMillis));
            return a2;
        } catch (Exception unused) {
            return null;
        }
    }

    private static List<b> b(String str) {
        JSONArray jSONArray;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!l.a(str)) {
                jSONArray = new JSONArray(str);
            } else {
                jSONArray = new JSONArray();
            }
            List<b> a2 = j.a(jSONArray, false);
            g.b("parseSplashAdList time : " + (System.currentTimeMillis() - currentTimeMillis));
            return a2;
        } catch (Exception unused) {
            return null;
        }
    }
}
