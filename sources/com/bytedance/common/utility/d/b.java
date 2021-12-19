package com.bytedance.common.utility.d;

import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

public final class b {
    static {
        Covode.recordClassIndex(15898);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean b(String str) {
        return new File(str).mkdirs();
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                a(file);
            }
        }
    }

    public static long d(String str) {
        try {
            if (TextUtils.isEmpty(str) || !new File(str).exists()) {
                return 0;
            }
            StatFs statFs = new StatFs(str);
            return ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    private static boolean a(File file) {
        MethodCollector.i(1763);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(1763);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(1763);
        return delete;
    }

    public static long c(String str) {
        File[] listFiles;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        File file = new File(str);
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                try {
                    length += c(file2.getAbsolutePath());
                } catch (StackOverflowError e2) {
                    e2.printStackTrace();
                    return 0;
                } catch (OutOfMemoryError e3) {
                    e3.printStackTrace();
                    return 0;
                }
            }
        }
        return length;
    }
}
