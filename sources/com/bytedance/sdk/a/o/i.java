package com.bytedance.sdk.a.o;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.covode.number.Covode;

public final class i {
    static {
        Covode.recordClassIndex(26627);
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2).append("/");
        return sb.toString();
    }

    public static String b(String str, String str2) {
        try {
            String cookie = CookieManager.getInstance().getCookie(str);
            if (!TextUtils.isEmpty(cookie)) {
                String[] split = cookie.split(";");
                for (String str3 : split) {
                    if (!TextUtils.isEmpty(str3)) {
                        String[] split2 = str3.split("=");
                        if (split2.length >= 2 && split2[0] != null && split2[0].trim().equalsIgnoreCase(str2)) {
                            return split2[1];
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }
}
