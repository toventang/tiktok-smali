package com.bytedance.hybrid.spark.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.j.b;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f31183a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(18106);
    }

    public static void a(String str, String str2, SparkContext sparkContext) {
        l.c(str, "");
        l.c(str2, "");
        a(b.I, str, str2, sparkContext);
    }

    public static void a(b bVar, String str, String str2, SparkContext sparkContext) {
        String str3;
        StringBuilder append = new StringBuilder().append(str2).append(" containerId:");
        if (sparkContext != null) {
            str3 = sparkContext.f40979f;
        } else {
            str3 = null;
        }
        com.bytedance.lynx.hybrid.j.c.a(append.append(str3).toString(), bVar, "HybridKit-".concat(String.valueOf(str)));
    }
}
