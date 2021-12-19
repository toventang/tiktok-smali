package com.ss.ttvideoengine.k;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ttvideoengine.k.k;
import com.ss.ttvideoengine.s.c;
import com.ss.ttvideoengine.s.j;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e extends a {

    /* renamed from: f  reason: collision with root package name */
    private static String f153023f = "";

    /* renamed from: g  reason: collision with root package name */
    private int f153024g = 2;

    static {
        Covode.recordClassIndex(101690);
    }

    @Override // com.ss.ttvideoengine.k.a
    public final void c() {
        if (!this.f153008b) {
            this.f153008b = true;
            this.f153011e.a();
        }
    }

    @Override // com.ss.ttvideoengine.k.a
    public final void b() {
        StringBuilder sb = new StringBuilder();
        sb.append("https://" + f153023f + "/q?host=");
        sb.append(this.f153009c);
        String sb2 = sb.toString();
        j.b("HTTPDNS", "http dns parse url is".concat(String.valueOf(sb2)));
        Method[] declaredMethods = this.f153011e.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Method method = declaredMethods[i2];
            if (method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            this.f153011e.a(sb2, (Map<String, String>) null, new k.a() {
                /* class com.ss.ttvideoengine.k.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(101691);
                }

                @Override // com.ss.ttvideoengine.k.k.a
                public final void a(JSONObject jSONObject, c cVar) {
                    e.this.a(jSONObject, cVar);
                }
            });
        } else {
            this.f153011e.b(sb2, null, new k.a() {
                /* class com.ss.ttvideoengine.k.e.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(101692);
                }

                @Override // com.ss.ttvideoengine.k.k.a
                public final void a(JSONObject jSONObject, c cVar) {
                    e.this.a(jSONObject, cVar);
                }
            });
        }
    }

    public static void a(String str) {
        MethodCollector.i(13325);
        synchronized (g.class) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    f153023f = str;
                }
            } finally {
                MethodCollector.o(13325);
            }
        }
    }

    public final void a(JSONObject jSONObject, c cVar) {
        if (cVar != null) {
            cVar.f153262c = "kTTVideoErrorDomainHTTPDNS";
        } else {
            String str = "TT_";
            if (jSONObject == null || jSONObject.length() == 0) {
                StringBuilder sb = new StringBuilder();
                if (this.f153024g != 2) {
                    str = "ALI_";
                }
                cVar = new c("kTTVideoErrorDomainHTTPDNS", -9997, sb.append(str).append("HTTP dns empty").toString());
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("ips");
                if (optJSONArray == null || optJSONArray.length() == 0) {
                    StringBuilder sb2 = new StringBuilder();
                    if (this.f153024g != 2) {
                        str = "ALI_";
                    }
                    cVar = new c("kTTVideoErrorDomainHTTPDNS", -9997, sb2.append(str).append("HTTP dns empty").toString());
                } else {
                    try {
                        jSONObject.put("time", System.currentTimeMillis());
                        jSONObject.put("dns_type", "httpDNS");
                    } catch (JSONException unused) {
                    }
                    a(jSONObject);
                    return;
                }
            }
        }
        c(cVar);
    }

    public e(String str, k kVar, int i2) {
        super(str, kVar);
        String str2;
        this.f153024g = i2;
        StringBuilder sb = new StringBuilder("DNS use HTTPDNS");
        if (i2 == 2) {
            str2 = "_TT";
        } else {
            str2 = "_ALI";
        }
        j.a("HTTPDNS", sb.append(str2).toString());
    }
}
