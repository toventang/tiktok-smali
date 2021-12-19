package com.ss.android.ugc.aweme.services;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.newmedia.a.b;
import com.ss.android.ugc.aweme.framework.services.IWebViewTweaker;

public final class WebViewTweakerService implements IWebViewTweaker {
    static {
        Covode.recordClassIndex(79580);
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IWebViewTweaker
    public final void clearWebviewOnDestroy(WebView webView) {
        b.a(webView);
    }

    public static IWebViewTweaker createIWebViewTweakerbyMonsterPlugin(boolean z) {
        MethodCollector.i(9945);
        Object a2 = com.ss.android.ugc.b.a(IWebViewTweaker.class, z);
        if (a2 != null) {
            IWebViewTweaker iWebViewTweaker = (IWebViewTweaker) a2;
            MethodCollector.o(9945);
            return iWebViewTweaker;
        }
        if (com.ss.android.ugc.b.dC == null) {
            synchronized (IWebViewTweaker.class) {
                try {
                    if (com.ss.android.ugc.b.dC == null) {
                        com.ss.android.ugc.b.dC = new WebViewTweakerService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9945);
                    throw th;
                }
            }
        }
        WebViewTweakerService webViewTweakerService = (WebViewTweakerService) com.ss.android.ugc.b.dC;
        MethodCollector.o(9945);
        return webViewTweakerService;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IWebViewTweaker
    public final void tweakPauseIfFinishing(Context context, WebView webView) {
        b.a(context, webView);
    }
}
