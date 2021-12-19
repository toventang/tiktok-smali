package com.ss.android.newmedia.e.a;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.common.c.b;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static String f59970a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f59971b;

    static {
        Covode.recordClassIndex(37057);
    }

    public static final String a(Context context, WebView webView) {
        String str;
        WebSettings settings;
        MethodCollector.i(10373);
        if (webView == null || (settings = webView.getSettings()) == null) {
            str = null;
        } else {
            str = settings.getUserAgentString();
        }
        if (!m.a(str)) {
            f59970a = str;
            MethodCollector.o(10373);
            return str;
        } else if (!m.a(f59970a)) {
            String str2 = f59970a;
            MethodCollector.o(10373);
            return str2;
        } else {
            String a2 = b.f26745a.a(context);
            f59970a = a2;
            if (!m.a(a2)) {
                String str3 = f59970a;
                MethodCollector.o(10373);
                return str3;
            }
            if (!f59971b && webView == null && context != null && (context instanceof Activity)) {
                f59971b = true;
                try {
                    WebView webView2 = new WebView(context);
                    WebSettings settings2 = webView2.getSettings();
                    l.b(settings2, "");
                    f59970a = settings2.getUserAgentString();
                    webView2.destroy();
                } catch (Throwable unused) {
                }
            }
            String str4 = f59970a;
            MethodCollector.o(10373);
            return str4;
        }
    }
}
