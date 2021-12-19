package com.bytedance.android.monitorV2.l;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public final class d {
    static {
        Covode.recordClassIndex(14159);
    }

    private static boolean b() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean a() {
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
            return true;
        }
        return false;
    }

    public static void a(File file) {
        if (file.exists()) {
            c(file);
        }
    }

    private static void d(File file) {
        if (file != null && !file.exists()) {
            file.mkdirs();
        }
    }

    public static boolean b(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            try {
                if (!file.exists()) {
                    return file.createNewFile();
                }
                return true;
            } catch (IOException unused) {
                HybridMultiMonitor.getInstance().getExceptionHandler();
            }
        }
        return false;
    }

    private static boolean c(File file) {
        MethodCollector.i(10094);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(10094);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(10094);
        return delete;
    }

    public static File a(Context context, String str) {
        if (context == null || !a() || !b()) {
            return null;
        }
        File b2 = b(context, str);
        d(b2);
        return b2;
    }

    private static File b(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return context.getExternalFilesDir(str);
        }
        if (com.ss.android.ugc.aweme.lancet.d.f107196d != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107196d;
        }
        File externalFilesDir = context.getExternalFilesDir(str);
        com.ss.android.ugc.aweme.lancet.d.f107196d = externalFilesDir;
        return externalFilesDir;
    }

    public static synchronized void a(String str, String str2) {
        Throwable th;
        synchronized (d.class) {
            MethodCollector.i(9944);
            if (str == null) {
                MethodCollector.o(9944);
            } else if (str2 == null) {
                MethodCollector.o(9944);
            } else {
                File file = new File(str);
                FileWriter fileWriter = null;
                try {
                    if (!file.exists()) {
                        b(file);
                    }
                    FileWriter fileWriter2 = new FileWriter(file, true);
                    try {
                        fileWriter2.write(str2);
                        fileWriter2.flush();
                        try {
                            fileWriter2.close();
                            MethodCollector.o(9944);
                        } catch (IOException e2) {
                            e2.printStackTrace();
                            MethodCollector.o(9944);
                        }
                    } catch (IOException unused) {
                        fileWriter = fileWriter2;
                        try {
                            fileWriter.close();
                            MethodCollector.o(9944);
                        } catch (IOException e3) {
                            e3.printStackTrace();
                            MethodCollector.o(9944);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            fileWriter2.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                        MethodCollector.o(9944);
                        throw th;
                    }
                } catch (IOException unused2) {
                    if (0 == 0) {
                        MethodCollector.o(9944);
                        return;
                    }
                    fileWriter.close();
                    MethodCollector.o(9944);
                } catch (Throwable th3) {
                    th = th3;
                    MethodCollector.o(9944);
                    throw th;
                }
            }
        }
    }
}
