package com.bytedance.android.livesdk.browser.f;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;

public interface b {
    static {
        Covode.recordClassIndex(7984);
    }

    WebResourceResponse a(Uri uri, WebView webView);
}
