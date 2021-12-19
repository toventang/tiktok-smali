package com.ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.deeplink.p;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private p f66812a;

    /* renamed from: b  reason: collision with root package name */
    private final String f66813b = "webview";

    static {
        Covode.recordClassIndex(41129);
    }

    public k(p pVar) {
        this.f66812a = pVar;
    }

    public final Uri a(Activity activity, Uri uri) {
        Uri parse;
        String queryParameter = uri.getQueryParameter("gd_label");
        String queryParameter2 = uri.getQueryParameter("utm_source");
        String host = uri.getHost();
        if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.equals(host, "webview") && uri.getQueryParameter("url") != null && (parse = Uri.parse(uri.getQueryParameter("url"))) != null) {
            queryParameter = parse.getQueryParameter("gd_label");
            queryParameter2 = parse.getQueryParameter("utm_source");
        }
        Intent intent = activity.getIntent();
        if (intent != null && intent.hasExtra("al_applink_data")) {
            this.f66812a.a("link_direct");
            this.f66812a.b("fb");
            this.f66812a.d("facebook");
        }
        if (!TextUtils.isEmpty(queryParameter)) {
            this.f66812a.a(queryParameter);
        }
        if (!TextUtils.isEmpty(queryParameter2)) {
            this.f66812a.d(queryParameter2);
        } else {
            String queryParameter3 = uri.getQueryParameter("params_url");
            if (!TextUtils.isEmpty(queryParameter3)) {
                String queryParameter4 = Uri.parse(queryParameter3).getQueryParameter("utm_source");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    this.f66812a.d(queryParameter4);
                }
            }
        }
        return uri;
    }
}
