package com.bytedance.ies.ugc.aweme.rich.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f35121a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final List<b> f35122b = new ArrayList();

    private a() {
    }

    static {
        Covode.recordClassIndex(21051);
    }

    public final synchronized void a(b bVar) {
        MethodCollector.i(6826);
        if (bVar != null) {
            List<b> list = f35122b;
            if (!list.contains(bVar)) {
                list.add(bVar);
                MethodCollector.o(6826);
                return;
            }
        }
        MethodCollector.o(6826);
    }

    public final synchronized void b(b bVar) {
        MethodCollector.i(6827);
        if (bVar != null) {
            List<b> list = f35122b;
            if (list.contains(bVar)) {
                list.remove(bVar);
                MethodCollector.o(6827);
                return;
            }
        }
        MethodCollector.o(6827);
    }

    public final synchronized void a(String str, String str2, String str3, JSONObject jSONObject) {
        MethodCollector.i(6829);
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        l.c(jSONObject, "");
        List<b> list = f35122b;
        if (list.isEmpty()) {
            MethodCollector.o(6829);
            return;
        }
        for (b bVar : list) {
            try {
                bVar.a(str, str2, str3, jSONObject);
            } catch (Throwable unused) {
            }
        }
        MethodCollector.o(6829);
    }
}
