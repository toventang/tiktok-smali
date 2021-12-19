package com.bytedance.geckox.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.FileNotFoundException;

public class BsPatch {
    private static native int patch(String str, String str2, String str3);

    static {
        Covode.recordClassIndex(17481);
        h.a("geckox_bspatch");
    }

    private static boolean a(File file) {
        MethodCollector.i(7422);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(7422);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(7422);
        return delete;
    }

    public static void a(File file, File file2, File file3, String str) {
        MethodCollector.i(7352);
        if (!file.exists()) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("full package not exist：" + file.getAbsolutePath());
            MethodCollector.o(7352);
            throw fileNotFoundException;
        } else if (file2.exists()) {
            e.e(file3);
            File file4 = new File(file3, str);
            a(file4);
            int patch = patch(file.getAbsolutePath(), file4.getAbsolutePath(), file2.getAbsolutePath());
            if (patch == 0) {
                MethodCollector.o(7352);
                return;
            }
            RuntimeException runtimeException = new RuntimeException("patch merged failed, code：" + patch + " full:" + file.getAbsolutePath() + " patch:" + file2.getAbsolutePath() + " dest:" + file4.getAbsolutePath());
            MethodCollector.o(7352);
            throw runtimeException;
        } else {
            FileNotFoundException fileNotFoundException2 = new FileNotFoundException("patch package not exist：" + file2.getAbsolutePath());
            MethodCollector.o(7352);
            throw fileNotFoundException2;
        }
    }
}
