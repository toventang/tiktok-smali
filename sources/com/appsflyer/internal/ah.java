package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.covode.number.Covode;

public final class ah {

    /* renamed from: ı  reason: contains not printable characters */
    private static String f182;

    /* renamed from: Ι  reason: contains not printable characters */
    private static String f183;

    static {
        Covode.recordClassIndex(2718);
    }

    ah() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m136(String str) {
        f182 = str;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (i2 == 0 || i2 == str.length() - 1) {
                sb.append(str.charAt(i2));
            } else {
                sb.append("*");
            }
        }
        f183 = sb.toString();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m137(String str) {
        if (f182 == null) {
            m136(AppsFlyerProperties.getInstance().getString("AppsFlyerKey"));
        }
        String str2 = f182;
        if (str2 != null && str.contains(str2)) {
            AFLogger.afInfoLog(str.replace(f182, f183));
        }
    }
}
