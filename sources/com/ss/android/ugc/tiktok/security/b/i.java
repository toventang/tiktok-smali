package com.ss.android.ugc.tiktok.security.b;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tiktok.seclink.impl.SecLinkServiceImpl;
import h.f.b.l;

public final class i implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final i f149045a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final f f149046b = null;

    private i() {
    }

    @Override // com.ss.android.ugc.tiktok.security.b.f
    public final f a() {
        return f149046b;
    }

    static {
        Covode.recordClassIndex(98172);
    }

    public static boolean a(WebView webView) {
        l.d(webView, "");
        return SecLinkServiceImpl.b().a(webView);
    }

    public static boolean b(WebView webView) {
        l.d(webView, "");
        return SecLinkServiceImpl.b().b(webView);
    }

    public static boolean b(WebView webView, String str) {
        l.d(webView, "");
        Boolean a2 = SecLinkServiceImpl.b().a(webView, str);
        if (a2 != null) {
            return a2.booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.security.b.d
    public final String a(WebView webView, String str) {
        l.d(webView, "");
        return SecLinkServiceImpl.b().b(webView, str);
    }
}
