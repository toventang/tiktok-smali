package com.ss.android.ad.splash.f;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class p {
    static {
        Covode.recordClassIndex(36491);
    }

    private static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("sslocal://");
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    public static boolean b(String str) {
        if (!c(str)) {
            return false;
        }
        String host = Uri.parse(str).getHost();
        if ("microapp".equals(host) || "microgame".equals(host)) {
            return true;
        }
        return false;
    }
}
