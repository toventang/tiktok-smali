package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class aw {
    static {
        Covode.recordClassIndex(41623);
    }

    public Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
        l.d(activity, "");
        l.d(uri, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return null;
    }

    public String a() {
        return null;
    }

    public void a(Activity activity, Uri uri, boolean z) {
        l.d(activity, "");
        l.d(uri, "");
    }

    public void a(Uri uri, Intent intent, boolean z) {
    }

    public boolean a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return false;
    }

    public String a(Uri uri) {
        l.d(uri, "");
        if (TextUtils.isEmpty(uri.getHost())) {
            return "homepage_hot";
        }
        String host = uri.getHost();
        if (host == null) {
            l.b();
        }
        l.b(host, "");
        return host;
    }

    public boolean a(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return a(str2, str3);
    }

    public boolean a(Uri uri, String str, String str2, String str3) {
        l.d(uri, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return a(str, str2, str3);
    }

    public Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z, boolean z2) {
        l.d(activity, "");
        l.d(uri, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return a(activity, uri, str, str2, str3, z);
    }
}
