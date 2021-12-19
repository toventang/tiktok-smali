package com.bytedance.push.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.f;
import com.bytedance.ug.a.j;
import com.bytedance.ug.a.o;
import com.bytedance.ug.a.q;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile j f42170a;

    static {
        Covode.recordClassIndex(25768);
    }

    a() {
    }

    private static j a() {
        MethodCollector.i(7969);
        if (f42170a == null) {
            synchronized (a.class) {
                try {
                    if (f42170a == null) {
                        o oVar = new o();
                        oVar.f45745a = com.ss.android.message.a.f59817a;
                        oVar.f45748d = f.f42099a.j().a();
                        oVar.f45746b = "push";
                        oVar.f45747c = "3.2.3-alpha.16-tiktok";
                        oVar.f45749e = 1;
                        f42170a = q.a(oVar.a());
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7969);
                    throw th;
                }
            }
        }
        j jVar = f42170a;
        MethodCollector.o(7969);
        return jVar;
    }

    static void a(String str, int i2, String str2, JSONObject jSONObject) {
        a().a(str, i2, str2, jSONObject);
    }
}
