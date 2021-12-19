package com.ss.android.vesdk;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;

public final class aa {
    static {
        Covode.recordClassIndex(99259);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean c(String str) {
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

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    public static boolean d(String str) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("content:") || str.startsWith("file:")) {
            return true;
        }
        return false;
    }

    private static boolean a(File file) {
        MethodCollector.i(2599);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(2599);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(2599);
        return delete;
    }

    public static boolean a(String str, String str2) {
        MethodCollector.i(2604);
        File file = new File(str);
        File file2 = new File(str2);
        if (!file.exists()) {
            MethodCollector.o(2604);
            return false;
        }
        boolean renameTo = file.renameTo(file2);
        MethodCollector.o(2604);
        return renameTo;
    }
}
