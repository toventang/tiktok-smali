package com.ss.android.ad.splash.f;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ad.splash.core.h;

public final class a {
    static {
        Covode.recordClassIndex(36467);
    }

    public static void b(String str) {
        if (h.c() != null) {
            StringBuilder sb = new StringBuilder();
            a(sb, 0, str, null);
            h.c().c("[BDASplash]", sb.toString(), null, null);
        }
    }

    public static void a(String str) {
        if (h.c() != null) {
            StringBuilder sb = new StringBuilder();
            a(sb, 0, str, null);
            h.c().a("[BDASplash]", sb.toString(), null, null);
        }
    }

    public static void a(long j2, String str) {
        if (h.c() != null) {
            StringBuilder sb = new StringBuilder();
            a(sb, j2, str, null);
            h.c().b("[BDASplash]", sb.toString(), null, null);
        }
    }

    public static void a(long j2, String str, Throwable th) {
        if (h.c() != null) {
            StringBuilder sb = new StringBuilder();
            a(sb, j2, str, th);
            h.c().d("[BDASplash]", sb.toString(), th, null);
        }
    }

    private static void a(StringBuilder sb, long j2, String str, Throwable th) {
        sb.append("[BDASplash]");
        if (j2 > 0) {
            sb.append(", ");
            sb.append("SplashAdId");
            sb.append("= ");
            sb.append(j2);
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(", message: ");
            sb.append(str);
        }
        if (th != null) {
            sb.append(", tr: ");
            sb.append(th.getMessage());
        }
    }
}
