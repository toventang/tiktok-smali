package com.bytedance.android.livesdk.browser.f;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.livesetting.hybrid.WebOfflineEnabledSetting;
import com.bytedance.android.livesdkapi.host.k;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e implements b {
    static {
        Covode.recordClassIndex(7987);
    }

    @Override // com.bytedance.android.livesdk.browser.f.b
    public final WebResourceResponse a(Uri uri, WebView webView) {
        l.d(uri, "");
        l.d(webView, "");
        if (!WebOfflineEnabledSetting.INSTANCE.getValue()) {
            return null;
        }
        return ((k) a.a(k.class)).a(webView, uri.toString());
    }
}
