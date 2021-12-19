package com.ss.android.ad.splash.core.c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.c.a;
import com.ss.android.ad.splash.core.h;
import com.ss.android.ad.splash.core.k;
import com.ss.android.ad.splash.f.g;
import com.ss.android.ad.splash.f.j;
import com.ss.android.ad.splash.f.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    /* renamed from: b  reason: collision with root package name */
    private static volatile b f58420b;

    /* renamed from: a  reason: collision with root package name */
    public List<a> f58421a = new ArrayList();

    static {
        Covode.recordClassIndex(36273);
    }

    public static void a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.putOpt("uri", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.putOpt("path", str2);
            }
            jSONObject2.put("log_extra", k.a().f58667l);
            jSONObject.putOpt("ad_extra_data", jSONObject2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        h.a(84378473382L, "splash_ad", "error_save_sp", jSONObject);
    }

    public static void a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("status", Integer.valueOf(z ? 1 : 0));
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("log_extra", k.a().f58667l);
            jSONObject.putOpt("is_ad_event", "1");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        h.a(84378473382L, "splash_ad", "response", jSONObject);
    }

    public static void a(com.ss.android.ad.splash.core.e.b bVar, String str) {
        if (bVar != null && !l.a(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(bVar.f58447j)) {
                    jSONObject.put("log_extra", bVar.f58447j);
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_fetch_time", bVar.f58439b);
            } catch (Exception unused) {
                g.a("error in putting log_extra into json");
            }
            h.a(bVar.f58441d, "splash_ad", str, jSONObject);
        }
    }

    private static void a(JSONObject jSONObject, HashMap<String, Object> hashMap) {
        if (!(hashMap == null || hashMap.isEmpty())) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    jSONObject.putOpt(key, value);
                }
            }
        }
    }

    public static void a(com.ss.android.ad.splash.core.e.b bVar, com.ss.android.ad.splash.core.e.b bVar2) {
        if (bVar != null && bVar2 != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (!TextUtils.isEmpty(bVar2.f58447j)) {
                    jSONObject.put("log_extra", bVar2.f58447j);
                }
                if (!TextUtils.isEmpty(bVar.H)) {
                    jSONObject2.put("topview_ad_id", bVar.H);
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_extra_data", jSONObject2);
                jSONObject.put("ad_fetch_time", bVar2.f58439b);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            h.a(bVar2.f58441d, "splash_ad", "topview_other_show", jSONObject);
        }
    }

    public final void b() {
        List<a> list = this.f58421a;
        if (list != null) {
            list.clear();
        }
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(4743);
        if (f58420b == null) {
            synchronized (b.class) {
                try {
                    if (f58420b == null) {
                        f58420b = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4743);
                    throw th;
                }
            }
        }
        b bVar = f58420b;
        MethodCollector.o(4743);
        return bVar;
    }

    public final void c() {
        List<a> list = this.f58421a;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    for (a aVar : this.f58421a) {
                        if (aVar != null && aVar.f58412c > 0) {
                            jSONObject.put(new StringBuilder().append(aVar.f58410a).toString(), aVar.f58412c);
                        }
                    }
                    jSONObject3.put("ad_show_fail_list", jSONObject);
                    jSONObject3.put("ad_show_fail_type", 3);
                    jSONObject2.put("log_extra", "{}");
                    jSONObject2.putOpt("is_ad_event", "1");
                    jSONObject2.put("ad_extra_data", jSONObject3);
                    h.a(84378473382L, "splash_ad", "open_splash", jSONObject2);
                }
                b();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void b(a aVar) {
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (aVar.f58411b > 0 && aVar.f58412c > 0) {
                    jSONObject2.put("ad_show_fail_type", aVar.f58411b);
                    jSONObject2.put("ad_error_code", aVar.f58412c);
                }
                if (!TextUtils.isEmpty(aVar.f58414e)) {
                    jSONObject2.put("is_topview", aVar.f58414e);
                }
                if (!TextUtils.isEmpty(aVar.f58413d)) {
                    jSONObject.put("log_extra", aVar.f58413d);
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_extra_data", jSONObject2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            h.a(aVar.f58410a, "splash_ad", "open_splash", jSONObject);
        }
    }

    public static void c(a aVar) {
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (aVar.f58411b > 0) {
                    jSONObject2.put("ad_show_fail_type", aVar.f58411b);
                }
                if (aVar.f58412c > 0) {
                    jSONObject2.put("ad_error_code", aVar.f58412c);
                }
                if (!TextUtils.isEmpty(aVar.f58413d)) {
                    jSONObject.put("log_extra", aVar.f58413d);
                }
                jSONObject.putOpt("is_ad_event", "1");
                jSONObject.putOpt("ad_extra_data", jSONObject2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            h.a(aVar.f58410a, "splash_ad", "open_splash", jSONObject);
        }
    }

    public static void b(com.ss.android.ad.splash.core.e.b bVar) {
        String str = "1";
        if (bVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (!TextUtils.isEmpty(bVar.f58447j)) {
                    jSONObject.put("log_extra", bVar.f58447j);
                }
                jSONObject.put("is_ad_event", str);
                jSONObject.put("ad_fetch_time", bVar.f58439b);
                if (!j.a(bVar)) {
                    str = "0";
                }
                jSONObject2.putOpt("is_topview", str);
                jSONObject.putOpt("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
                g.a("error in putting log_extra into json");
            }
            h.a(bVar.f58441d, "splash_ad", "ad_no_selected", jSONObject);
        }
    }

    public static void a(a aVar) {
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (aVar.f58411b > 0) {
                    jSONObject2.put("ad_show_fail_type", aVar.f58411b);
                }
                if (!TextUtils.isEmpty(aVar.f58413d)) {
                    jSONObject.put("log_extra", aVar.f58413d);
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_extra_data", jSONObject2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            h.a(aVar.f58410a, "splash_ad", "open_splash", jSONObject);
        }
    }

    public static void a(com.ss.android.ad.splash.core.e.b bVar) {
        String str = "1";
        if (bVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (!TextUtils.isEmpty(bVar.f58447j)) {
                    jSONObject.put("log_extra", bVar.f58447j);
                }
                jSONObject.put("is_ad_event", str);
                jSONObject.put("ad_fetch_time", bVar.f58439b);
                if (!j.a(bVar)) {
                    str = "0";
                }
                jSONObject2.putOpt("is_topview", str);
                jSONObject.putOpt("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
                g.a("error in putting log_extra into json");
            }
            h.a(bVar.f58441d, "splash_ad", "ad_selected", jSONObject);
        }
    }

    public static void a(int i2, int i3) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("diff", Long.valueOf(j.f() - System.currentTimeMillis()));
            jSONObject2.putOpt("server_time", Long.valueOf(j.f()));
            jSONObject2.putOpt("device_time", Long.valueOf(System.currentTimeMillis()));
            jSONObject2.putOpt("is_time_valid", Integer.valueOf(i2));
            jSONObject2.putOpt("invalid_reason", Integer.valueOf(i3));
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("is_ad_event", "1");
            jSONObject.putOpt("log_extra", k.a().f58667l);
        } catch (Exception unused) {
            g.a("error in putting data into json");
        }
        h.a(84378473382L, "splash_ad", "valid_time", jSONObject);
    }

    public static void b(com.ss.android.ad.splash.core.e.b bVar, String str) {
        int i2;
        if (bVar != null && !l.a(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(bVar.f58447j)) {
                    jSONObject.put("log_extra", bVar.f58447j);
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_fetch_time", bVar.f58439b);
                if (bVar.h()) {
                    JSONObject jSONObject2 = new JSONObject();
                    if (bVar.j()) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.put("topview_type", i2));
                }
            } catch (Exception unused) {
                g.a("error in putting log_extra into json");
            }
            h.a(bVar.f58441d, "splash_ad", str, jSONObject);
        }
    }

    public static void a(com.ss.android.ad.splash.core.e.b bVar, int i2) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("ad_error_code", Integer.valueOf(i2));
        if (j.a(bVar)) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("is_topview", str);
        a(bVar, 0, "open_splash", null, hashMap);
    }

    public static void a(a aVar, long j2, String str, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                a(jSONObject, hashMap);
                a(jSONObject2, hashMap2);
                if (aVar != null) {
                    if (!TextUtils.isEmpty(aVar.m())) {
                        jSONObject.put("log_extra", aVar.m());
                    }
                    jSONObject.put("ad_fetch_time", aVar.f());
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.putOpt("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
                g.a("error in putting log_extra into json");
            }
            if (aVar != null) {
                j2 = aVar.l();
            }
            h.a(j2, "splash_ad", str, jSONObject);
        }
    }
}
