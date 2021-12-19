package com.bytedance.ies.bullet.kit.web;

import android.webkit.WebView;
import com.bytedance.android.monitor.webview.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.web.k;

public final class h extends k {

    /* renamed from: a  reason: collision with root package name */
    private final c f32425a;

    static {
        Covode.recordClassIndex(19203);
    }

    public h(c cVar) {
        this.f32425a = cVar;
    }

    public final void onProgressChanged(WebView webView, int i2) {
        super.onProgressChanged(webView, i2);
        c cVar = this.f32425a;
        if (cVar != null) {
            cVar.a(webView, i2);
        }
    }
}
