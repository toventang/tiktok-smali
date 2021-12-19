package com.bytedance.android.livesdk.container.b;

import android.webkit.WebView;
import com.bytedance.android.livesdk.browser.a.d;
import com.bytedance.android.livesdk.container.c.c;
import com.bytedance.android.livesdk.livesetting.hybrid.AllowHtmlVideoSetting;
import com.bytedance.android.monitor.webview.i;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b extends d {

    /* renamed from: e  reason: collision with root package name */
    public static final a f16733e = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public final c f16734d;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f16735f = AllowHtmlVideoSetting.INSTANCE.getValue();

    static {
        Covode.recordClassIndex(9273);
    }

    public final void onGeolocationPermissionsHidePrompt() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(9274);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(cVar.f16751b);
        l.d(cVar, "");
        this.f16734d = cVar;
    }

    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
    }

    @Override // com.bytedance.android.livesdk.browser.a.b
    public final void onProgressChanged(WebView webView, int i2) {
        super.onProgressChanged(webView, i2);
        i.f23764a.a(webView, i2);
    }

    public final void onConsoleMessage(String str, int i2, String str2) {
        l.d(str, "");
        if (Logger.debug()) {
            com.bytedance.android.live.core.c.a.a(3, "LiveWebChromeClient", str + " -- line " + i2);
        }
    }
}
