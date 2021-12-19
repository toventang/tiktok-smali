package com.ss.android.ad.splash.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ad.splash.core.h;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static int f58952a = 2;

    static {
        Covode.recordClassIndex(36473);
    }

    public static void a() {
        if (f58952a <= 6) {
            b();
        }
    }

    private static String b() {
        if (!h.s) {
            return "";
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i2 = 1; i2 < stackTrace.length; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            String className = stackTraceElement.getClassName();
            if (!(className.equals(Thread.class.getCanonicalName()) || className.equals(g.class.getCanonicalName()))) {
                return "(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")#" + stackTraceElement.getMethodName() + ". ";
            }
        }
        return "";
    }

    public static void b(String str) {
        if (str != null && f58952a <= 3) {
            b();
        }
    }

    public static void c(String str) {
        if (str != null && f58952a <= 4) {
            b();
        }
    }

    public static void d(String str) {
        if (str != null && f58952a <= 5) {
            b();
        }
    }

    public static void e(String str) {
        if (str != null && f58952a <= 6) {
            b();
        }
    }

    public static void a(String str) {
        b(b() + str);
    }
}
