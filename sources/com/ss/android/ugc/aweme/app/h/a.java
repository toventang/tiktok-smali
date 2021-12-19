package com.ss.android.ugc.aweme.app.h;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.c;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.bullet.b;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.fe.method.l;

public final class a implements IInterceptor, t.b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f66755a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f66756b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f66757c;

    static {
        Covode.recordClassIndex(41087);
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ck.t.b
    public final String a(String str) {
        if (!TextUtils.isEmpty(str) && (str.startsWith("aweme://webview/") || str.startsWith("aweme://ame/webview/"))) {
            Uri parse = Uri.parse(str);
            if (!(parse == null || parse.getQueryParameter("rn_schema") == null)) {
                return Uri.parse(parse.getQueryParameter("rn_schema")).buildUpon().appendQueryParameter("fallback_url", parse.getQueryParameter("url")).appendQueryParameter("rn_schema", parse.getQueryParameter("rn_schema")).build().toString();
            }
        } else if (!TextUtils.isEmpty(str) && (str.startsWith("http://") || str.startsWith("https://"))) {
            str = "aweme://webview/?url=" + Uri.encode(str);
        }
        if (l.a(str)) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        boolean z;
        String url = routeIntent.getUrl();
        if (!TextUtils.isEmpty(routeIntent.getUrl())) {
            if (url.startsWith("aweme://webview") || url.startsWith("aweme://ame/webview/")) {
                Uri parse = Uri.parse(url);
                String queryParameter = parse.getQueryParameter("url");
                if (queryParameter != null) {
                    z = TextUtils.equals(Uri.parse(Uri.decode(queryParameter)).getQueryParameter("use_spark"), "1");
                } else {
                    z = false;
                }
                if (TextUtils.equals(parse.getQueryParameter("use_spark"), "1") || z) {
                    this.f66757c = true;
                    return true;
                } else if (TextUtils.equals(parse.getQueryParameter("hybrid_sdk_version"), "bullet")) {
                    this.f66756b = true;
                    return true;
                } else if (parse.getQueryParameter("rn_schema") != null) {
                    routeIntent.setUrl(Uri.parse(parse.getQueryParameter("rn_schema")).buildUpon().appendQueryParameter("fallback_url", parse.getQueryParameter("url")).appendQueryParameter("rn_schema", parse.getQueryParameter("rn_schema")).build().toString());
                    return true;
                }
            } else if (url.startsWith("http://") || url.startsWith("https://")) {
                routeIntent.setUrl("aweme://webview/?url=" + Uri.encode(url));
                Uri parse2 = Uri.parse(url);
                if (parse2 != null && TextUtils.equals(parse2.getQueryParameter("use_spark"), "1")) {
                    this.f66757c = true;
                }
                return true;
            } else if (url.startsWith("aweme://reactnative/")) {
                Uri parse3 = Uri.parse(url);
                if (parse3 != null && TextUtils.equals(parse3.getQueryParameter("hybrid_sdk_version"), "bullet")) {
                    this.f66756b = true;
                    return true;
                }
            } else if (url.startsWith("aweme://lynxview")) {
                Uri parse4 = Uri.parse(url);
                if (parse4 == null || !TextUtils.equals(parse4.getQueryParameter("use_spark"), "1")) {
                    this.f66756b = true;
                } else {
                    this.f66757c = true;
                }
                return true;
            }
        }
        boolean a2 = l.a(url);
        this.f66755a = a2;
        if (a2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (this.f66755a) {
            this.f66755a = false;
            return true;
        } else if (this.f66756b) {
            this.f66756b = false;
            if (routeIntent.getExtra() != null) {
                b.a(context, routeIntent.getUrl(), a(routeIntent.getExtra()));
            } else {
                String url = routeIntent.getUrl();
                h.f.b.l.d(context, "");
                h.f.b.l.d(url, "");
                b.a(context, url, null, null);
            }
            return true;
        } else if (!this.f66757c) {
            return false;
        } else {
            this.f66757c = false;
            SparkContext sparkContext = new SparkContext();
            sparkContext.a(routeIntent.getUrl());
            c.a.a(context, sparkContext).a();
            return true;
        }
    }
}
