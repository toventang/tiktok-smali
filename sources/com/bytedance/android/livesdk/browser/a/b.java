package com.bytedance.android.livesdk.browser.a;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.i;
import com.bytedance.covode.number.Covode;

public class b extends WebChromeClient {
    static {
        Covode.recordClassIndex(7905);
    }

    public void onProgressChanged(WebView webView, int i2) {
        super.onProgressChanged(webView, i2);
        i.f23764a.a(webView, i2);
    }
}
