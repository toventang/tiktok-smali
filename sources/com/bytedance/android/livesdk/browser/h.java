package com.bytedance.android.livesdk.browser;

import android.os.Build;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.example.a.c;
import com.ss.android.common.util.f;
import com.ss.android.ugc.tiktok.security.c.b;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f14422a;

    /* renamed from: b  reason: collision with root package name */
    public static int f14423b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static int f14424c = -1;

    /* renamed from: d  reason: collision with root package name */
    static Handler f14425d = null;

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f14426e;

    /* renamed from: f  reason: collision with root package name */
    private static int f14427f = -1;

    static {
        boolean z;
        Covode.recordClassIndex(7993);
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (f.c()) {
            z = true;
        } else {
            z = false;
        }
        f14426e = z;
        if (z || (Build.VERSION.SDK_INT == 16 && "ZTE N5".equals(Build.MODEL))) {
            z2 = true;
        }
        f14422a = z2;
    }

    public static void a(WebView webView) {
        MethodCollector.i(7699);
        if (webView == null) {
            MethodCollector.o(7699);
            return;
        }
        webView.setWebChromeClient(null);
        b.a();
        webView.setWebViewClient(c.a(null));
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(webView);
            try {
                webView.destroy();
                MethodCollector.o(7699);
                return;
            } catch (Throwable unused) {
            }
        }
        MethodCollector.o(7699);
    }
}
