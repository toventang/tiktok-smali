package com.bytedance.geckox.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.b.b;
import com.bytedance.geckox.i.a;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.FileFilter;

public final class l {
    static {
        Covode.recordClassIndex(17501);
    }

    private static String a(String str) {
        if (str.indexOf("/") == 0) {
            str = str.substring(1);
        }
        if (str.lastIndexOf("/") == str.length() - 1) {
            return str.substring(0, str.lastIndexOf("/"));
        }
        return str;
    }

    private static boolean b(File file) {
        MethodCollector.i(8356);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(8356);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(8356);
        return delete;
    }

    public static long[] a(File file) {
        long j2;
        long j3;
        long j4;
        a.a("gecko resource info dirs", file);
        File[] listFiles = file.listFiles(new FileFilter() {
            /* class com.bytedance.geckox.utils.l.AnonymousClass1 */

            static {
                Covode.recordClassIndex(17502);
            }

            public final boolean accept(File file) {
                return file.isDirectory();
            }
        });
        int i2 = com.bytedance.geckox.a.a().f29709g;
        if (i2 >= 3 && listFiles != null && listFiles.length > 1) {
            Long l2 = null;
            for (File file2 : listFiles) {
                try {
                    long longValue = Long.valueOf(file2.getName()).longValue();
                    if (l2 == null) {
                        l2 = Long.valueOf(longValue);
                    } else if (longValue > l2.longValue()) {
                        l2 = Long.valueOf(longValue);
                    }
                } catch (Exception unused) {
                }
            }
            b.a(file.getAbsolutePath(), l2, true, 42);
        }
        long j5 = 0;
        if (listFiles == null || listFiles.length <= 0) {
            j4 = 0;
            j3 = 0;
            j2 = 0;
        } else {
            long j6 = 0;
            j2 = 0;
            for (File file3 : listFiles) {
                try {
                    Long.valueOf(file3.getName());
                    File file4 = new File(file3, "res.zip");
                    if (file4.exists()) {
                        if (i2 >= 2) {
                            b(file4);
                        } else {
                            j5 += e.d(file4);
                        }
                    }
                    File file5 = new File(file3, "res");
                    if (file5.exists()) {
                        j6 += e.d(file5);
                    }
                } catch (Exception unused2) {
                    j2 += e.d(file3);
                }
            }
            j3 = j5 + j6 + j2;
            j4 = j5;
            j5 = j6;
        }
        return new long[]{j5, j2, j4, j3};
    }

    public static Long b(File file, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && file != null && file.exists() && file.isDirectory()) {
            try {
                File file2 = new File(file, File.separator + str);
                if (!file2.exists()) {
                    return null;
                }
                File file3 = new File(file2.getAbsolutePath(), str2);
                if (!file3.exists()) {
                    return null;
                }
                return m.a(file3);
            } catch (Throwable unused) {
                a.a();
            }
        }
        return null;
    }

    public static String a(File file, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && file != null && file.exists() && file.isDirectory()) {
            String a2 = a(str2);
            try {
                File file2 = new File(file, File.separator + str);
                if (!file2.exists()) {
                    return null;
                }
                String absolutePath = file2.getAbsolutePath();
                File file3 = new File(absolutePath, a2);
                if (!file3.exists()) {
                    return null;
                }
                Long a3 = m.a(file3);
                if (a3 == null) {
                    com.bytedance.geckox.j.b.a(str, a2, "null", "3", "false", System.currentTimeMillis());
                    return null;
                }
                String str3 = absolutePath + File.separator + a2 + File.separator + a3 + File.separator + "res";
                com.bytedance.geckox.j.b.a(str, a2, String.valueOf(a3), "3", "true", System.currentTimeMillis());
                return str3;
            } catch (Throwable unused) {
                a.a();
            }
        }
        return null;
    }

    public static String a(File file, String str, String str2, long j2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && file != null && j2 != 0 && file.exists() && file.isDirectory()) {
            String a2 = a(str2);
            try {
                File file2 = new File(file, File.separator + str);
                if (!file2.exists()) {
                    return null;
                }
                String absolutePath = file2.getAbsolutePath();
                if (!new File(absolutePath, a2).exists()) {
                    return null;
                }
                return absolutePath + File.separator + a2 + File.separator + j2 + File.separator + "res";
            } catch (Throwable unused) {
                a.a();
            }
        }
        return null;
    }
}
