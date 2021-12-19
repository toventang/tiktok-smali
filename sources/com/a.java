package com;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.net.e.b;
import java.util.Locale;

public final class a {
    static {
        Covode.recordClassIndex(1934);
    }

    public static String a(String str, Object[] objArr) {
        if (str == null || !str.contains("%d")) {
            return String.format(str, objArr);
        }
        try {
            if (com.ss.android.ugc.aweme.language.a.a()) {
                return String.format(Locale.ENGLISH, str, objArr);
            }
            return String.format(Locale.getDefault(), str, objArr);
        } catch (Exception unused) {
            return str;
        }
    }

    public static String a(Locale locale, String str, Object[] objArr) {
        try {
            if (com.ss.android.ugc.aweme.language.a.a()) {
                locale = Locale.ENGLISH;
            }
            return String.format(locale, str, objArr);
        } catch (Exception unused) {
            return str;
        }
    }

    public static View a(LayoutInflater layoutInflater, int i2, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(5430);
        if (!b.a()) {
            View inflate = layoutInflater.inflate(i2, viewGroup, z);
            MethodCollector.o(5430);
            return inflate;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        View inflate2 = layoutInflater.inflate(i2, viewGroup, z);
        b.a("sys", i2, SystemClock.elapsedRealtime() - elapsedRealtime, inflate2 != null ? inflate2.getContext() : null);
        MethodCollector.o(5430);
        return inflate2;
    }

    public static void a(WebSettings webSettings, String str) {
        if (com.ss.android.ugc.tiktok.security.c.b.a() && (!str.contains("BytedanceWebview/d8a21c6") || !str.endsWith("BytedanceWebview/d8a21c6"))) {
            String replace = str.replace("BytedanceWebview/d8a21c6", "");
            StringBuilder sb = new StringBuilder();
            sb.append(replace).append(" BytedanceWebview/d8a21c6");
            str = sb.toString();
        }
        webSettings.setUserAgentString(str);
    }
}
