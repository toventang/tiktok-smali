package com.ss.android.ugc.tiktok.seclink;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ISecLinkServiceDefault implements ISecLinkService {
    static {
        Covode.recordClassIndex(98135);
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final String a(String str, String str2) {
        return str;
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final boolean a() {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final boolean a(WebView webView) {
        l.d(webView, "");
        return true;
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final String b(WebView webView, String str) {
        l.d(webView, "");
        return str;
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final boolean b(WebView webView) {
        l.d(webView, "");
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final Boolean a(WebView webView, String str) {
        l.d(webView, "");
        return false;
    }
}
