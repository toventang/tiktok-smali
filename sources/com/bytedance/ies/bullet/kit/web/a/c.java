package com.bytedance.ies.bullet.kit.web.a;

import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.kit.web.a;
import com.bytedance.ies.bullet.kit.web.f;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.service.f.a.g;
import h.f.b.l;
import java.util.Map;

public class c implements f {
    static {
        Covode.recordClassIndex(19183);
    }

    @Override // com.bytedance.ies.bullet.kit.web.f
    public Map<String, Object> a(com.bytedance.ies.bullet.kit.web.c cVar, b bVar) {
        l.c(cVar, "");
        l.c(bVar, "");
        return null;
    }

    @Override // com.bytedance.ies.bullet.kit.web.f
    public com.bytedance.ies.bullet.kit.web.b.b b() {
        return null;
    }

    @Override // com.bytedance.ies.bullet.kit.web.f
    public final a a() {
        return new a(true, 2);
    }

    @Override // com.bytedance.ies.bullet.c.c.m
    public q a(b bVar) {
        l.c(bVar, "");
        return new g();
    }

    @Override // com.bytedance.ies.bullet.kit.web.f
    public void a(WebSettings webSettings, WebView webView) {
        l.c(webSettings, "");
        l.c(webView, "");
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setBlockNetworkImage(false);
    }
}
