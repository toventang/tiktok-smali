package com.ss.android.ugc.aweme.lancet.a;

import androidx.work.b;
import androidx.work.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f107176a;

    static {
        Covode.recordClassIndex(68560);
    }

    public static void a() {
        MethodCollector.i(5161);
        synchronized (d.class) {
            try {
                if (!f107176a) {
                    try {
                        j.a(com.bytedance.ies.ugc.appcontext.d.a(), new b.a().a());
                        f107176a = true;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        com.bytedance.c.a.a.a.b.a(e2);
                    }
                }
            } finally {
                MethodCollector.o(5161);
            }
        }
    }
}
