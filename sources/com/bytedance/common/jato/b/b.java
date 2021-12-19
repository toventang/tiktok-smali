package com.bytedance.common.jato.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static int f26785a = -1;

    /* renamed from: b  reason: collision with root package name */
    private static int f26786b = -1;

    static {
        Covode.recordClassIndex(15801);
    }

    public static synchronized boolean a() {
        synchronized (b.class) {
            MethodCollector.i(14268);
            int i2 = f26785a;
            if (i2 != -1) {
                if (i2 > 0) {
                    MethodCollector.o(14268);
                    return true;
                }
                MethodCollector.o(14268);
                return false;
            } else if (!b()) {
                f26785a = 0;
                MethodCollector.o(14268);
                return false;
            } else {
                if (new File("/system/lib/arm/nb/libc.so").exists()) {
                    f26785a = 1;
                } else {
                    f26785a = 0;
                }
                if (f26785a > 0) {
                    MethodCollector.o(14268);
                    return true;
                }
                MethodCollector.o(14268);
                return false;
            }
        }
    }

    private static synchronized boolean b() {
        synchronized (b.class) {
            MethodCollector.i(14300);
            int i2 = f26786b;
            if (i2 == -1) {
                try {
                    if (a("ro.kernel.qemu").equals("1")) {
                        f26786b = 1;
                    } else {
                        f26786b = 0;
                    }
                } catch (Throwable unused) {
                    f26786b = 0;
                }
                if (f26786b > 0) {
                    MethodCollector.o(14300);
                    return true;
                }
                MethodCollector.o(14300);
                return false;
            } else if (i2 > 0) {
                MethodCollector.o(14300);
                return true;
            } else {
                MethodCollector.o(14300);
                return false;
            }
        }
    }

    private static synchronized String a(String str) {
        String str2;
        synchronized (b.class) {
            MethodCollector.i(14331);
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str2 = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
            MethodCollector.o(14331);
        }
        return str2;
    }
}
