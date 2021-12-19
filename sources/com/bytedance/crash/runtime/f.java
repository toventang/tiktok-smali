package com.bytedance.crash.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.b;
import com.bytedance.crash.n;
import java.io.File;
import java.util.Iterator;

public final class f {
    static {
        Covode.recordClassIndex(16333);
    }

    public static void a(File file, CrashType crashType) {
        if (b.a("custom_event_settings", "npth_simple_setting", "disable_crash_with_custom_files") != 1) {
            try {
                if (crashType == CrashType.ANR || !new File(file, "external_files").exists()) {
                    Iterator<b> it = n.f27742f.f27897b.getList(crashType).iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
