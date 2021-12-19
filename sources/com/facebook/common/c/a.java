package com.facebook.common.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;

public final class a {
    static {
        Covode.recordClassIndex(28622);
    }

    public static boolean b(File file) {
        if (file.isDirectory()) {
            a(file);
        }
        return c(file);
    }

    public static boolean a(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                z &= b(file2);
            }
        }
        return z;
    }

    private static boolean c(File file) {
        MethodCollector.i(5437);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(5437);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(5437);
        return delete;
    }

    public static void a(File file, b bVar) {
        bVar.a(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2, bVar);
                } else {
                    bVar.b(file2);
                }
            }
        }
        bVar.c(file);
    }
}
