package com.bytedance.android.livesdk.browser.view;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.android.live.core.c.a;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveDisableWebviewFileUriMtSetting;
import com.bytedance.common.c.d;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f14836a = true;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<Context> f14837b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14838c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14839d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14840e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14841f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f14842g = true;

    /* renamed from: h  reason: collision with root package name */
    private boolean f14843h = true;

    /* renamed from: i  reason: collision with root package name */
    private boolean f14844i = true;

    static {
        Covode.recordClassIndex(8224);
    }

    public static b a(Context context) {
        return new b(context);
    }

    private b(Context context) {
        this.f14837b = new WeakReference<>(context);
    }

    public final void a(WebView webView) {
        WebSettings settings;
        if (webView != null && this.f14837b.get() != null && (settings = webView.getSettings()) != null) {
            try {
                settings.setJavaScriptEnabled(this.f14838c);
            } catch (Exception unused) {
                a.a(5, "SSWebSettings", "setJavaScriptEnabled failed");
            }
            try {
                if (this.f14839d) {
                    settings.setSupportZoom(true);
                    settings.setBuiltInZoomControls(true);
                    com.bytedance.common.c.a.a(settings);
                } else {
                    settings.setSupportZoom(false);
                }
            } catch (Throwable unused2) {
            }
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(this.f14840e);
            settings.setDomStorageEnabled(this.f14842g);
            if (!LiveDisableWebviewFileUriMtSetting.INSTANCE.getValue()) {
                settings.setAllowFileAccess(this.f14843h);
            } else {
                settings.setAllowFileAccess(false);
            }
            settings.setBlockNetworkImage(!this.f14844i);
            if (!this.f14836a) {
                try {
                    webView.setLayerType(1, null);
                } catch (Throwable unused3) {
                }
            }
            settings.setTextZoom(100);
            com.bytedance.common.c.b.a(settings, false);
            a(webView, this.f14841f);
            d.a(settings, 2);
            d.f26747a.a(webView);
        }
    }

    private void a(WebView webView, boolean z) {
        if (!z) {
            webView.setOnLongClickListener(null);
            webView.setLongClickable(false);
            return;
        }
        webView.setLongClickable(true);
        webView.setOnLongClickListener(new c(this));
    }
}
