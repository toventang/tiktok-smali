package com.ss.android.ugc.aweme.plugin.aab;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.m.a;

public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f115527a;

    static {
        Covode.recordClassIndex(74157);
    }

    private c() {
        com.bytedance.m.c.a(this);
    }

    @Override // com.bytedance.m.a
    public final Application a() {
        return (Application) d.a();
    }

    @Override // com.bytedance.m.a
    public final int b() {
        return com.bytedance.common.utility.a.a.a(d.a(), "SS_VERSION_CODE");
    }

    public static void c() {
        MethodCollector.i(9091);
        if (!f115527a) {
            synchronized (c.class) {
                try {
                    if (!f115527a) {
                        new c();
                        f115527a = true;
                    }
                } finally {
                    MethodCollector.o(9091);
                }
            }
            return;
        }
        MethodCollector.o(9091);
    }
}
