package com.ss.android.ugc.aweme.compliance.business.termspp;

import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.example.a.c;
import com.ss.android.ugc.tiktok.security.a.a;
import com.ss.android.ugc.tiktok.security.b.i;
import h.m.p;

public final class d extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final TermsConsentDialog f77265a;

    static {
        Covode.recordClassIndex(47779);
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return c.a(webView, renderProcessGoneDetail);
    }

    public d(TermsConsentDialog termsConsentDialog) {
        this.f77265a = termsConsentDialog;
    }

    private boolean a(String str) {
        if (str == null) {
            return false;
        }
        if (p.b(str, "http://", false) || p.b(str, "https://", false)) {
            SmartRouter.buildRoute(this.f77265a, "//webview").withParam(Uri.parse(str)).withParam("use_webview_title", true).open();
            return true;
        } else if (!p.b(str, "mailto:", false)) {
            return false;
        } else {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(str));
            try {
                TermsConsentDialog termsConsentDialog = this.f77265a;
                if (termsConsentDialog != null) {
                    a.a(intent, termsConsentDialog);
                    termsConsentDialog.startActivity(intent);
                }
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (i.b(webView, str)) {
            return true;
        }
        return a(str);
    }
}
