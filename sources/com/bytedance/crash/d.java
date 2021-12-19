package com.bytedance.crash;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.ensure.EnsureInitInner$1;
import com.bytedance.crash.ensure.a;
import com.bytedance.crash.j.h;
import com.bytedance.crash.runtime.b;
import com.bytedance.crash.runtime.m;
import com.bytedance.crash.util.k;
import com.bytedance.news.common.service.manager.c;
import com.bytedance.services.apm.api.IEnsure;
import java.util.Map;

public final class d {
    static {
        Covode.recordClassIndex(16168);
    }

    public d() {
        if (!a.f27548a) {
            a.f27548a = true;
            try {
                EnsureInitInner$1 ensureInitInner$1 = new EnsureInitInner$1();
                c.a(IEnsure.class, ensureInitInner$1);
                com.bytedance.services.apm.api.a.f44093a = ensureInitInner$1;
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean a(Throwable th) {
        if (!m.f27730g.isEnsureEnable() || k.a(th)) {
            return false;
        }
        return true;
    }

    public static void a(Throwable th, String str) {
        if (a(th)) {
            h.a(th, str, true);
        }
    }

    public static void a(String str, Throwable th) {
        m.f27730g.isDebugMode();
        if (m.f27724a != null) {
            if (m.f27932a == -1) {
                m.f27932a = 5;
                m.f27932a = b.a(5, "custom_event_settings", "npth_simple_setting", "crash_inner_limit");
            }
            if (m.f27933b < m.f27932a) {
                m.f27933b++;
                m.a().reportCustomErr(str, "INNER", th);
            }
        }
    }

    public static void a(String str, String str2, Map<String, String> map) {
        if (m.f27730g.isEnsureEnable()) {
            h.a((Object) null, (Throwable) null, Thread.currentThread().getStackTrace(), 5, str, true, map, Thread.currentThread(), str2, "core_exception_monitor");
        }
    }
}
