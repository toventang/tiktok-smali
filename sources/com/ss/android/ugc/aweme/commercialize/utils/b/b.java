package com.ss.android.ugc.aweme.commercialize.utils.b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.GoogleApiAvailability;
import com.ss.android.ugc.aweme.commercialize.utils.b.a.c;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f75656a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(46658);
    }

    public static final boolean a(Context context) {
        if (context == null || GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) != 0) {
            return false;
        }
        return true;
    }

    public static final boolean a(Uri uri) {
        l.d(uri, "");
        if (!w.a(uri)) {
            return false;
        }
        if (TextUtils.equals(uri.getHost(), "play.app.goo.gl")) {
            return true;
        }
        if (TextUtils.equals(uri.getHost(), "google.com") && uri.getQueryParameter("url") != null) {
            Uri parse = Uri.parse(uri.getQueryParameter("url"));
            l.b(parse, "");
            if (TextUtils.equals(parse.getHost(), "play.app.goo.gl")) {
                return true;
            }
        }
        if (!TextUtils.equals(uri.getHost(), "play.google.com") || !TextUtils.equals(uri.getPath(), "/store/apps/details") || TextUtils.isEmpty(uri.getQueryParameter("id"))) {
            return false;
        }
        return true;
    }

    public static final boolean a(Context context, Uri uri) {
        String str;
        if (context == null) {
            return false;
        }
        if (uri != null) {
            str = uri.getScheme();
        } else {
            str = null;
        }
        if ((!l.a((Object) str, (Object) "market")) || !a(context)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        return w.a(context, intent);
    }

    public static final boolean a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!a(context)) {
            return c.a(context, str);
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=".concat(String.valueOf(str))));
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        return w.a(context, intent);
    }

    public static final boolean b(Context context, Uri uri) {
        if (!(context == null || uri == null)) {
            if (TextUtils.equals(uri.getHost(), "play.app.goo.gl")) {
                return a(context, uri, "com.google.android.gms");
            }
            if (TextUtils.equals(uri.getHost(), "google.com") && uri.getQueryParameter("url") != null) {
                Uri parse = Uri.parse(uri.getQueryParameter("url"));
                l.b(parse, "");
                if (TextUtils.equals(parse.getHost(), "play.app.goo.gl")) {
                    Uri parse2 = Uri.parse(uri.getQueryParameter("url"));
                    l.b(parse2, "");
                    return a(context, parse2, "com.google.android.gms");
                }
            }
            if (TextUtils.equals(uri.getHost(), "play.google.com") && TextUtils.equals(uri.getPath(), "/store/apps/details") && !TextUtils.isEmpty(uri.getQueryParameter("id"))) {
                return a(context, uri, "com.android.vending");
            }
        }
        return false;
    }

    private static final boolean a(Context context, Uri uri, String str) {
        if (!a(context)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage(str);
        intent.setData(uri);
        intent.addFlags(268435456);
        return w.a(context, intent);
    }
}
