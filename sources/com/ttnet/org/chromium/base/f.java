package com.ttnet.org.chromium.base;

import com.a;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

public final class f {
    static {
        Covode.recordClassIndex(103308);
    }

    private static Throwable a(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (!(obj instanceof Throwable)) {
            return null;
        }
        return (Throwable) obj;
    }

    private static String a(String str) {
        if (str.startsWith("cr_")) {
            return str;
        }
        int i2 = 0;
        if (str.startsWith("cr.")) {
            i2 = 3;
        }
        return "cr_" + str.substring(i2, str.length());
    }

    private static String a(String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return str;
        }
        return a.a(Locale.US, str, objArr);
    }

    public static void b(String str, String str2, Object... objArr) {
        a(str2, objArr);
        if (a(objArr) != null) {
            a(str);
        } else {
            a(str);
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        a(str2, objArr);
        if (a(objArr) != null) {
            a(str);
        } else {
            a(str);
        }
    }

    public static void a(String str, String str2, Object... objArr) {
        a(str2, objArr);
        if (a(objArr) != null) {
            a(str);
        } else {
            a(str);
        }
    }
}
