package com.ss.android.ugc.aweme.experiment;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.b;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;

public final class eb {
    static {
        Covode.recordClassIndex(56450);
    }

    private static File c(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    public static boolean a(Context context) {
        if (context == null || !f.a(context)) {
            return false;
        }
        try {
            return new File(c(context) + "/preload.cfg").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean a(File file) {
        MethodCollector.i(6960);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(6960);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(6960);
        return delete;
    }

    public static void b(Context context) {
        if (context != null && f.a(context)) {
            try {
                boolean a2 = b.a().a(true, "keva_auto_preload_ab", false);
                File file = new File(c(context) + "/preload.cfg");
                if (!a2) {
                    a(file);
                } else if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
