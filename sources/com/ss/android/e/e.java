package com.ss.android.e;

import android.content.Context;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.util.Objects;

public final class e {
    static {
        Covode.recordClassIndex(36735);
    }

    private static File b(Context context) {
        if (d.f107194b != null && d.f107197e) {
            return d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        d.f107194b = cacheDir;
        return cacheDir;
    }

    private static void b(String str) {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (listFiles[i2].isDirectory()) {
                    b(listFiles[i2].getAbsolutePath());
                } else {
                    a(listFiles[i2]);
                }
            }
            a(file);
        }
    }

    public static String a(Context context) {
        Objects.requireNonNull(context, "Context is NUll");
        String str = null;
        try {
            if (b(context) != null) {
                str = b(context).getPath();
            } else {
                File dir = context.getDir("/data/data/" + context.getPackageName() + "/cache/", 0);
                if (dir != null) {
                    str = dir.getPath();
                }
            }
        } catch (Throwable unused) {
        }
        if (!m.a(str)) {
            return str;
        }
        throw new NullPointerException("Cannot Create Cache Dir");
    }

    public static void a(String str) {
        File file = new File(str);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (listFiles[i2].isDirectory()) {
                    b(listFiles[i2].getAbsolutePath());
                } else if (listFiles[i2].isFile()) {
                    a(listFiles[i2]);
                }
            }
        }
    }

    private static boolean a(File file) {
        MethodCollector.i(3910);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(3910);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(3910);
        return delete;
    }

    public static long a(File file, boolean z) {
        long j2;
        long j3 = 0;
        try {
            if (!file.exists() && file.isDirectory()) {
                return 0;
            }
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    j2 = a(file2, z);
                } else if (file2.isFile()) {
                    j2 = file2.length();
                }
                j3 += j2;
            }
            return j3;
        } catch (Throwable unused) {
        }
    }
}
