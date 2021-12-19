package com.aweme.storage;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static volatile int f5977a;

    static {
        Covode.recordClassIndex(2808);
    }

    public static long a(Context context) {
        try {
            File d2 = d(context);
            if (d2 == null) {
                return 0;
            }
            return d2.getTotalSpace();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static long b(Context context) {
        try {
            File d2 = d(context);
            if (d2 == null) {
                return 0;
            }
            return d2.getFreeSpace();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static boolean c(Context context) {
        if (f5977a <= 0) {
            return false;
        }
        long j2 = ((long) f5977a) * 1024 * 1024;
        if (a(context, j2) || b(context, j2)) {
            return true;
        }
        return false;
    }

    private static File d(Context context) {
        if (d.f107193a != null && d.f107197e) {
            return d.f107193a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        d.f107193a = externalCacheDir;
        return externalCacheDir;
    }

    public static long a(File file) {
        long j2 = 0;
        if (file != null && file.exists()) {
            if (file.isFile()) {
                return file.length();
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2 != null && file2.isFile() && file2.exists()) {
                        j2 += file2.length();
                    }
                }
            }
        }
        return j2;
    }

    public static void b(File file) {
        File[] listFiles;
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                    if (listFiles.length == 0) {
                        c(file);
                        return;
                    }
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            b(file2);
                        } else {
                            c(file2);
                        }
                    }
                    c(file);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static long a(String str) {
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
                    length += a(file2.getAbsolutePath());
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

    private static boolean c(File file) {
        MethodCollector.i(10131);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(10131);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(10131);
        return delete;
    }

    private static boolean a(Context context, long j2) {
        File d2;
        if (context == null || (d2 = d(context)) == null || d2.getFreeSpace() >= j2) {
            return false;
        }
        return true;
    }

    private static boolean b(Context context, long j2) {
        if (context == null) {
            return false;
        }
        if (d.f107194b == null || !d.f107197e) {
            d.f107194b = context.getCacheDir();
        }
        File file = d.f107194b;
        if (file != null && file.getFreeSpace() < j2) {
            return true;
        }
        return false;
    }
}
