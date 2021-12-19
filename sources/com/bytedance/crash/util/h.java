package com.bytedance.crash.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.m;
import com.bytedance.crash.runtime.j;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.lang.reflect.Method;

public final class h {
    static {
        Covode.recordClassIndex(16383);
    }

    public static void a() {
        File g2 = r.g(m.f27724a);
        g2.mkdirs();
        a(g2);
    }

    private static void c(File file) {
        File file2 = new File(file, "malloc.txt");
        if (!file2.exists()) {
            file2.getParentFile().mkdirs();
            NativeTools.a().a(file2.getAbsolutePath());
        }
    }

    private static void d(File file) {
        File file2 = new File(file, "pthreads.txt");
        if (!file2.exists()) {
            File file3 = new File(file, "rountines.txt");
            file2.getParentFile().mkdirs();
            NativeTools.a().b(file2.getAbsolutePath(), file3.getAbsolutePath());
        }
    }

    public static void b(File file) {
        MethodCollector.i(11412);
        FileOutputStream fileOutputStream = null;
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Object invoke = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            Method declaredMethod = cls.getDeclaredMethod("dumpGfxInfo", FileDescriptor.class, String[].class);
            declaredMethod.setAccessible(true);
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(file, "gfxinfo.txt"));
            try {
                declaredMethod.invoke(invoke, fileOutputStream2.getFD(), new String[0]);
                m.a(fileOutputStream2);
            } catch (Throwable unused) {
                fileOutputStream = fileOutputStream2;
                m.a(fileOutputStream);
                MethodCollector.o(11412);
            }
        } catch (Throwable unused2) {
            m.a(fileOutputStream);
            MethodCollector.o(11412);
        }
        MethodCollector.o(11412);
    }

    public static void a(File file) {
        String str;
        String str2;
        String str3;
        String str4;
        try {
            File file2 = new File(file, "maps.txt");
            String str5 = null;
            if (!file2.exists()) {
                str = file2.getAbsolutePath();
            } else {
                str = null;
            }
            File file3 = new File(file, "smaps.txt");
            if (!file3.exists()) {
                str2 = file3.getAbsolutePath();
            } else {
                str2 = null;
            }
            File file4 = new File(file, "meminfo.txt");
            if (!file4.exists()) {
                str3 = file4.getAbsolutePath();
            } else {
                str3 = null;
            }
            File file5 = new File(file, "fds.txt");
            if (!file5.exists()) {
                str4 = file5.getAbsolutePath();
            } else {
                str4 = null;
            }
            File file6 = new File(file, "threads.txt");
            if (!file6.exists()) {
                str5 = file6.getAbsolutePath();
            }
            a(new File(file, "logcat.txt"), new File(file, "logerr.txt"), false);
            NativeTools.a();
            NativeTools.a(str4, str, str2, str5, str3);
            d(file);
            c(file);
            b(file);
        } catch (Throwable unused) {
        }
    }

    public static File a(File file, File file2, boolean z) {
        if (file.exists() && file.length() > 0) {
            return file;
        }
        file.getParentFile().mkdirs();
        j.a(file.getAbsolutePath(), file2.getAbsolutePath(), z);
        return file;
    }
}
