package com.ss.android.ugc.tiktok.security;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.b.k;
import com.bytedance.helios.api.b.l;
import com.bytedance.ies.web.jsbridge2.b;
import com.bytedance.ies.web.jsbridge2.w;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f149024a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final l f149025b = l.a.a();

    private a() {
    }

    static {
        Covode.recordClassIndex(98155);
    }

    public static final void a(b bVar, w wVar) {
        String str;
        String str2;
        l lVar = f149025b;
        if (lVar != null && bVar != null) {
            View b2 = bVar.b();
            if (!(b2 instanceof WebView)) {
                b2 = null;
            }
            WebView webView = (WebView) b2;
            k kVar = new k();
            if (webView == null || (str = webView.getUrl()) == null) {
                str = "";
            }
            h.f.b.l.c(str, "");
            kVar.f30666a = str;
            kVar.f30669d = System.currentTimeMillis();
            if (wVar == null || (str2 = wVar.f35692d) == null) {
                str2 = "";
            }
            h.f.b.l.c(str2, "");
            kVar.f30668c = str2;
            String canonicalName = bVar.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = "";
            }
            h.f.b.l.c(canonicalName, "");
            kVar.f30667b = canonicalName;
            lVar.addJsbEvent(kVar);
            if (webView != null) {
                webView.getUrl();
            }
        }
    }
}
