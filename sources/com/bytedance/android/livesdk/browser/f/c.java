package com.bytedance.android.livesdk.browser.f;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.livesdk.livesetting.hybrid.WebviewNativeImageLoadingSetting;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.io.InputStream;

public final class c implements b {
    static {
        Covode.recordClassIndex(7985);
    }

    @Override // com.bytedance.android.livesdk.browser.f.b
    public final WebResourceResponse a(Uri uri, WebView webView) {
        String path;
        String str;
        l.d(uri, "");
        l.d(webView, "");
        if (!WebviewNativeImageLoadingSetting.INSTANCE.getValue() || (path = uri.getPath()) == null) {
            return null;
        }
        l.b(path, "");
        if (p.c(path, "jpg", false) || p.c(path, "jpeg", false)) {
            str = "image/jpeg";
        } else if (p.c(path, "png", false)) {
            str = "image/png";
        } else if (p.c(path, "gif", false)) {
            str = "image/gif";
        } else if (!p.c(path, "ico", false)) {
            return null;
        } else {
            str = "image/x-icon";
        }
        InputStream b2 = k.b(uri);
        if (b2 != null) {
            return new WebResourceResponse(str, "", b2);
        }
        return null;
    }
}
