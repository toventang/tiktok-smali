package com.d.a.a.a.g;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;

public final class b extends a {
    static {
        Covode.recordClassIndex(28335);
    }

    public b(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
