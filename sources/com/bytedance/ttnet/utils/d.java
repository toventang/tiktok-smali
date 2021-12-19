package com.bytedance.ttnet.utils;

import com.bytedance.common.utility.h;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.q;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class d {
    static {
        Covode.recordClassIndex(27307);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r1 != null) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.Throwable r4) {
        /*
            r3 = 0
            java.io.StringWriter r2 = new java.io.StringWriter     // Catch:{ all -> 0x0025 }
            r2.<init>()     // Catch:{ all -> 0x0025 }
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch:{ all -> 0x0025 }
            r1.<init>(r2)     // Catch:{ all -> 0x0025 }
            r4.printStackTrace(r1)     // Catch:{ all -> 0x0026 }
            java.lang.Throwable r0 = r4.getCause()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0020
            r0.printStackTrace(r1)     // Catch:{ all -> 0x0026 }
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0020
            r0.printStackTrace(r1)     // Catch:{ all -> 0x0026 }
        L_0x0020:
            java.lang.String r3 = r2.toString()     // Catch:{ all -> 0x0026 }
            goto L_0x0028
        L_0x0025:
            r1 = r3
        L_0x0026:
            if (r1 == 0) goto L_0x002b
        L_0x0028:
            r1.close()
        L_0x002b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.utils.d.a(java.lang.Throwable):java.lang.String");
    }

    public static void b(String str, List<String> list) {
        if (!(m.a(str) || list == null)) {
            String[] split = str.split(",");
            for (String str2 : split) {
                if (!m.a(str2) && !a(str2, list)) {
                    list.add(str2.trim());
                }
            }
        }
    }

    public static void a(com.bytedance.frameworks.baselib.network.http.g.d<String, q> dVar, a aVar) {
        MethodCollector.i(9151);
        if (dVar == null || dVar.b() <= 0) {
            MethodCollector.o(9151);
            return;
        }
        Map<String, q> c2 = dVar.c();
        Collection<q> values = c2.values();
        synchronized (c2) {
            try {
                for (q qVar : values) {
                    List<a> list = qVar.f42572g;
                    if (list != null && !list.contains(aVar)) {
                        list.add(aVar);
                    }
                }
            } finally {
                MethodCollector.o(9151);
            }
        }
    }

    public static boolean a(String str, List<String> list) {
        if (!m.a(str) && !h.a(list)) {
            for (String str2 : list) {
                if (!m.a(str2) && str.endsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
