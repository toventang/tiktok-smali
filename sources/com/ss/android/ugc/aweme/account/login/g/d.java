package com.ss.android.ugc.aweme.account.login.g;

import android.app.Activity;
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
    public final Activity f63460a;

    static {
        Covode.recordClassIndex(39107);
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return c.a(webView, renderProcessGoneDetail);
    }

    public d(Activity activity) {
        this.f63460a = activity;
    }

    private boolean a(String str) {
        if (str == null) {
            return false;
        }
        if (p.b(str, "http://", false) || p.b(str, "https://", false)) {
            SmartRouter.buildRoute(this.f63460a, "//webview").withParam(Uri.parse(str)).withParam("use_webview_title", true).open();
            return true;
        } else if (!p.b(str, "mailto:", false)) {
            return false;
        } else {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(str));
            try {
                Activity activity = this.f63460a;
                if (activity != null) {
                    a.a(intent, activity);
                    activity.startActivity(intent);
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
