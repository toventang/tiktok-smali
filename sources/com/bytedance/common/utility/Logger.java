package com.bytedance.common.utility;

import com.bytedance.covode.number.Covode;

public class Logger {
    private static int mLevel = 4;
    private static b sLogWriter = a.C0576a.f26881a;

    public static void d(String str) {
    }

    public static void e(String str) {
    }

    public static void i(String str) {
    }

    public static void v(String str) {
    }

    public static void w(String str) {
    }

    static final class a extends b {
        static {
            Covode.recordClassIndex(15866);
        }

        private a() {
        }

        /* renamed from: com.bytedance.common.utility.Logger$a$a  reason: collision with other inner class name */
        static class C0576a {

            /* renamed from: a  reason: collision with root package name */
            public static final a f26881a = new a((byte) 0);

            static {
                Covode.recordClassIndex(15867);
            }
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static int getLogLevel() {
        return mLevel;
    }

    static {
        Covode.recordClassIndex(15865);
    }

    public static boolean debug() {
        if (mLevel <= 3) {
            return true;
        }
        return false;
    }

    public static void registerLogHandler(b bVar) {
        sLogWriter = bVar;
    }

    public static void setLogLevel(int i2) {
        mLevel = i2;
    }

    public static void k(String str) {
        k("Logger", str);
    }

    public static abstract class b {
        static {
            Covode.recordClassIndex(15868);
        }

        public static boolean a(int i2) {
            if (Logger.getLogLevel() <= i2) {
                return true;
            }
            return false;
        }
    }

    public static void alertErrorInfo(String str) {
        if (debug()) {
            throw new IllegalStateException(str);
        }
    }

    private static String getSimpleClassName(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    public static void throwException(Throwable th) {
        if (th != null && debug()) {
            throw new RuntimeException("Error! Now in debug, we alert to you to correct it !", th);
        }
    }

    public static void d(String str, String str2) {
        if (str2 != null) {
            b.a(3);
        }
    }

    public static void e(String str, String str2) {
        if (str2 != null) {
            b.a(6);
        }
    }

    public static void i(String str, String str2) {
        if (str2 != null) {
            b.a(4);
        }
    }

    public static void v(String str, String str2) {
        if (str2 != null) {
            b.a(2);
        }
    }

    public static void w(String str, String str2) {
        if (str2 != null) {
            b.a(5);
        }
    }

    public static void k(String str, String str2) {
        b.a(3);
    }

    public static void st(String str, int i2) {
        try {
            throw new Exception();
        } catch (Exception e2) {
            StackTraceElement[] stackTrace = e2.getStackTrace();
            for (int i3 = 1; i3 < Math.min(i2, stackTrace.length); i3++) {
                getSimpleClassName(stackTrace[i3].getClassName());
                stackTrace[i3].getMethodName();
            }
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (str2 != null || th != null) {
            b.a(3);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (str2 != null || th != null) {
            b.a(6);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (str2 != null || th != null) {
            b.a(4);
        }
    }

    public static void v(String str, String str2, Throwable th) {
        if (str2 != null || th != null) {
            b.a(2);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (str2 != null || th != null) {
            b.a(5);
        }
    }
}
