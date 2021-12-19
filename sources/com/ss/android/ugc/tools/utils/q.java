package com.ss.android.ugc.tools.utils;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import java.net.UnknownHostException;

public final class q {
    static {
        Covode.recordClassIndex(98760);
    }

    public static void a(String str) {
        g.a().I().a(3, "Tools-Client", str);
    }

    public static void b(String str) {
        g.a().I().a(6, "Tools-Client", str);
    }

    public static void c(String str) {
        g.a().I().a(5, "Tools-Client", str);
    }

    public static void d(String str) {
        g.a().I().a(4, "Tools-Client", str);
    }

    public static String b(Throwable th) {
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "UnknownHostException";
            }
        }
        return Log.getStackTraceString(th);
    }

    public static void a(Throwable th) {
        g.a().I().a(6, "Tools-Client", b(th));
    }

    public static void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "Tools-Client";
        }
        g.a().I().a(3, str, str2);
    }

    public static void a(String str, Throwable th) {
        if (TextUtils.isEmpty(str)) {
            a(th);
        } else {
            g.a().I().a(6, str, b(th));
        }
    }
}
