package com.example.a;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;

public final class b extends WebViewClient {
    static {
        Covode.recordClassIndex(28360);
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (c.f46463a != null) {
            return c.f46463a.a(webView, renderProcessGoneDetail);
        }
        return true;
    }
}
