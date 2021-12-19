package com.ss.android.ugc.aweme.utils;

import com.appsflyer.AppsFlyerLib;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class dp {
    static {
        Covode.recordClassIndex(93444);
    }

    public static void a(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        String[] split = str.split("&");
        for (String str3 : split) {
            if (str3.contains("=")) {
                String[] split2 = str3.split("=");
                if (split2.length > 1) {
                    hashMap.put(split2[0], split2[1]);
                }
            }
        }
        if (hashMap.containsKey("utm_campaign") && (str2 = (String) hashMap.get("utm_campaign")) != null && str2.contains("tiktok-preinstall_")) {
            String[] split3 = str2.split("_");
            if (split3.length > 1) {
                AppsFlyerLib.getInstance().setPreinstallAttribution(split3[1], null, null);
            }
        }
    }
}
