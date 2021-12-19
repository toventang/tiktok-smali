package com.ttnet.org.chromium.base.a;

import android.content.pm.PackageInfo;
import android.net.LinkProperties;
import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(103288);
    }

    public static long a(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static String b(LinkProperties linkProperties) {
        return linkProperties.getPrivateDnsServerName();
    }

    public static boolean a(LinkProperties linkProperties) {
        return linkProperties.isPrivateDnsActive();
    }
}
