package com.ss.ugc.live.a.a.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;

public final class b {
    static {
        Covode.recordClassIndex(102720);
    }

    public static String a(String str) {
        if (c.a(str) || str.endsWith(File.separator)) {
            return str;
        }
        return str + File.separator;
    }

    public static File b(String str) {
        if (str != null) {
            return new File(str + ".tmp");
        }
        throw new IllegalArgumentException("file is null");
    }

    public static boolean a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                return b(file);
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                } else {
                    b(file2);
                }
            }
        }
        return b(file);
    }

    private static boolean b(File file) {
        MethodCollector.i(7375);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(7375);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(7375);
        return delete;
    }
}
