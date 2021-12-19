package com.ss.android.ugc.aweme.account.util;

import android.webkit.CookieManager;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.NetworkUtils;
import java.util.Locale;

public final class e {
    static {
        Covode.recordClassIndex(40268);
    }

    public static CookieManager a() {
        try {
            return CookieManager.getInstance();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String b() {
        try {
            String shareCookieHost = NetworkUtils.getShareCookieHost();
            if (!a.a() || shareCookieHost.toLowerCase(Locale.ROOT).startsWith("https")) {
                return CookieManager.getInstance().getCookie(shareCookieHost);
            }
            throw new IllegalArgumentException("Cookie url must be https");
        } catch (IllegalArgumentException unused) {
            return "";
        }
    }
}
