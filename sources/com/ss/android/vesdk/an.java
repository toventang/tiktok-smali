package com.ss.android.vesdk;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.nativePort.TELogcat;

public final class an {

    /* renamed from: a  reason: collision with root package name */
    public static byte f150933a = 7;

    /* renamed from: b  reason: collision with root package name */
    private static String f150934b = "VESDK-";

    /* renamed from: c  reason: collision with root package name */
    private static String f150935c = "monitorInfo";

    static {
        Covode.recordClassIndex(99274);
    }

    public static int b() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null || stackTrace.length < 3) {
            return -1;
        }
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static String a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null || stackTrace.length < 3) {
            return "unknown file";
        }
        return Thread.currentThread().getStackTrace()[2].getFileName();
    }

    public static String c() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null || stackTrace.length < 3) {
            return "unknown function";
        }
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static void a(byte b2) {
        if (!TextUtils.isEmpty(null)) {
            f150934b += ((String) null) + "-";
        }
        f150933a = b2;
        byte b3 = 1;
        if (b2 != 1) {
            if (b2 == 3) {
                b3 = 2;
            } else if (b2 == 7) {
                b3 = 4;
            } else if (b2 == 15) {
                b3 = 8;
            } else if (b2 != 31) {
                b3 = 0;
            } else {
                b3 = 16;
            }
        }
        TELogcat.setLogLevel(b3);
    }

    public static void a(String str, String str2) {
        if ((f150933a & 4) != 0) {
            TELogcat.Log((byte) 4, f150934b + str, str2);
        }
    }

    public static void c(String str, String str2) {
        if ((f150933a & 2) != 0) {
            TELogcat.Log((byte) 2, f150934b + str, str2);
        }
    }

    public static void d(String str, String str2) {
        if ((f150933a & 1) != 0) {
            TELogcat.Log((byte) 1, f150934b + str, str2);
        }
    }

    public static void e(String str, String str2) {
        if ((f150933a & 16) != 0) {
            TELogcat.Log((byte) 16, f150934b + str, str2);
        }
    }

    public static void b(String str, String str2) {
        if ((f150933a & 8) != 0) {
            TELogcat.Log((byte) 8, f150934b + str, str2);
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f150936a;

        /* renamed from: b  reason: collision with root package name */
        String f150937b;

        /* renamed from: c  reason: collision with root package name */
        String f150938c;

        static {
            Covode.recordClassIndex(99275);
        }

        public a(String str, Object obj, String str2) {
            this.f150936a = str;
            this.f150937b = String.valueOf(obj);
            this.f150938c = str2;
        }
    }

    public static String a(String str, String str2, a... aVarArr) {
        StringBuilder sb = new StringBuilder(com.a.a("%s; (Msg): {%s}; ", new Object[]{str, str2}));
        for (a aVar : aVarArr) {
            if (aVar != null) {
                sb.append(com.a.a("(%s): {%s}[%s], ", new Object[]{aVar.f150936a, aVar.f150937b, aVar.f150938c}));
            }
        }
        sb.append("_for_auto_analysis_");
        return sb.toString();
    }

    public static void a(Class<?> cls, String str, Throwable th) {
        if ((f150933a & 1) != 0) {
            TELogcat.Log((byte) 1, f150934b + cls.getSimpleName(), str + " Throwable msg is : " + th.getMessage());
        }
    }
}
