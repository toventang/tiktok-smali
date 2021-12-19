package com.bytedance.webx.h.d;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tiktok.security.b.h;
import com.zhiliaoapp.musically.R;

public final class a {
    static {
        Covode.recordClassIndex(28146);
    }

    public static boolean a(WebView webView) {
        if (webView == null) {
            return false;
        }
        Object tag = webView.getTag(R.id.fmb);
        if (tag instanceof Boolean) {
            return ((Boolean) tag).booleanValue();
        }
        return false;
    }

    public static void a(WebView webView, boolean z) {
        if (webView != null) {
            webView.setTag(R.id.fmb, Boolean.valueOf(z));
        }
    }

    public static void a(WebView webView, Context context) {
        if (webView != null) {
            webView.stopLoading();
            b(webView, context);
            a(webView, "about:blank");
            webView.destroy();
        }
    }

    public static void b(WebView webView, Context context) {
        if (webView != null && context != null) {
            Context context2 = webView.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context);
            }
        }
    }

    private static void a(WebView webView, String str) {
        MethodCollector.i(3229);
        String a2 = h.f149026a.a(webView, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        webView.loadUrl(str);
        MethodCollector.o(3229);
    }
}
