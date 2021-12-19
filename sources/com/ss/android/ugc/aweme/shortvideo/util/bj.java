package com.ss.android.ugc.aweme.shortvideo.util;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.tools.d.b;
import java.net.UnknownHostException;

public final class bj {
    static {
        Covode.recordClassIndex(86623);
    }

    public static void a(String str) {
        a.a(3, "Tools-Client", str);
        bk.a(3, "Tools-Client", str);
        b.b(com.ss.android.ugc.aweme.tools.d.a.f139289a, str);
    }

    public static void b(String str) {
        a.a(6, "Tools-Client", str);
        bk.a(6, "Tools-Client", str);
        b.d(com.ss.android.ugc.aweme.tools.d.a.f139289a, str);
    }

    public static void c(String str) {
        a.a(5, "Tools-Client", str);
        bk.a(5, "Tools-Client", str);
        b.e(com.ss.android.ugc.aweme.tools.d.a.f139289a, str);
    }

    public static void d(String str) {
        a.a(4, "Tools-Client", str);
        bk.a(4, "Tools-Client", str);
        b.c(com.ss.android.ugc.aweme.tools.d.a.f139289a, str);
    }

    public static void a(Throwable th) {
        a.a(6, "Tools-Client", b(th));
    }

    public static String b(Throwable th) {
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "UnknownHostException";
            }
        }
        return Log.getStackTraceString(th);
    }
}
