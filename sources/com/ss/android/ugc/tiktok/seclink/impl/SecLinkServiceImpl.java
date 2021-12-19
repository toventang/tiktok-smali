package com.ss.android.ugc.tiktok.seclink.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.newmedia.e.a.d;
import com.ss.android.ugc.b;
import com.ss.android.ugc.tiktok.seclink.ISecLinkService;
import com.ss.android.ugc.tiktok.seclink.impl.a.g;
import h.f.b.l;
import h.m.p;
import java.util.Objects;

public final class SecLinkServiceImpl implements ISecLinkService {
    static {
        Covode.recordClassIndex(98142);
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final boolean a() {
        return true;
    }

    public static ISecLinkService b() {
        MethodCollector.i(11148);
        Object a2 = b.a(ISecLinkService.class, false);
        if (a2 != null) {
            ISecLinkService iSecLinkService = (ISecLinkService) a2;
            MethodCollector.o(11148);
            return iSecLinkService;
        }
        if (b.eK == null) {
            synchronized (ISecLinkService.class) {
                try {
                    if (b.eK == null) {
                        b.eK = new SecLinkServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11148);
                    throw th;
                }
            }
        }
        SecLinkServiceImpl secLinkServiceImpl = (SecLinkServiceImpl) b.eK;
        MethodCollector.o(11148);
        return secLinkServiceImpl;
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final boolean a(WebView webView) {
        l.d(webView, "");
        l.d(webView, "");
        com.bytedance.webx.i.a.b bVar = SecLinkManager.f149002a.get(webView);
        if (bVar != null) {
            return bVar.b();
        }
        return true;
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final boolean b(WebView webView) {
        l.d(webView, "");
        l.d(webView, "");
        com.bytedance.webx.i.a.b bVar = SecLinkManager.f149002a.get(webView);
        if (bVar != null) {
            return bVar.c();
        }
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final String a(String str, String str2) {
        return SecLinkManager.a(str, str2);
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final Boolean a(WebView webView, String str) {
        l.d(webView, "");
        return SecLinkManager.b(webView, str);
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final String b(WebView webView, String str) {
        Context context;
        Intent intent;
        String a2;
        l.d(webView, "");
        l.d(webView, "");
        if ((g.a().f149021a || (webView instanceof d)) && str != null && p.b(str, "http", false) && SecLinkManager.f149002a.get(webView) == null) {
            if (webView.getContext() instanceof MutableContextWrapper) {
                Context context2 = webView.getContext();
                Objects.requireNonNull(context2, "null cannot be cast to non-null type android.content.MutableContextWrapper");
                context = ((MutableContextWrapper) context2).getBaseContext();
            } else {
                context = webView.getContext();
            }
            if (!(!(context instanceof Activity) || (intent = ((Activity) context).getIntent()) == null || (a2 = SecLinkManager.a(intent, "sec_link_scene")) == null)) {
                SecLinkManager.a(webView, a2);
                return SecLinkManager.a(str, a2);
            }
        }
        return str;
    }
}
