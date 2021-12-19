package com.bytedance.android.monitorV2.l;

import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.apm.c;
import com.bytedance.covode.number.Covode;

public final class h {
    static {
        Covode.recordClassIndex(14164);
    }

    public static String a() {
        try {
            return f.c(c.f24690f, "version_name");
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return "";
        }
    }

    public static int b() {
        try {
            return f.a(c.f24690f, "version_code");
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return 0;
        }
    }
}
