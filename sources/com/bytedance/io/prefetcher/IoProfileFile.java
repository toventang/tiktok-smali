package com.bytedance.io.prefetcher;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;

public class IoProfileFile {
    static {
        Covode.recordClassIndex(23849);
    }

    public static native int addFileOffsetToPathmap(int i2, long j2, long j3);

    public static native int addFileToPathmap(int i2, String str);

    public static native int closePathmap();

    public static native int openPathmap(String str);

    public static native int writePathmap();

    private static boolean a(File file) {
        MethodCollector.i(11764);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(11764);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(11764);
        return delete;
    }

    public static void a(a[] aVarArr, File file, File file2) {
        MethodCollector.i(11612);
        if (file2.exists()) {
            a(file2);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!file2.exists()) {
            try {
                file2.createNewFile();
                openPathmap(file2.getAbsolutePath());
                for (int i2 = 0; i2 < aVarArr.length; i2++) {
                    addFileToPathmap(i2, aVarArr[i2].f38937d);
                }
                writePathmap();
                MethodCollector.o(11612);
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        MethodCollector.o(11612);
    }
}
