package com.ss.android.ugc.aweme.web;

import android.content.DialogInterface;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.example.a.c;

public class j extends WebViewClient {
    static {
        Covode.recordClassIndex(94749);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return c.a(webView, renderProcessGoneDetail);
    }

    public void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
        a.C0731a aVar = new a.C0731a(webView.getContext());
        aVar.f33402b = "notification error ssl cert invalid";
        aVar.a("continue", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.ss.android.ugc.aweme.web.j.AnonymousClass2 */

            static {
                Covode.recordClassIndex(94751);
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                sslErrorHandler.proceed();
            }
        }, false).b("cancel", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.ss.android.ugc.aweme.web.j.AnonymousClass1 */

            static {
                Covode.recordClassIndex(94750);
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                sslErrorHandler.cancel();
            }
        }, false).a().b();
    }
}
