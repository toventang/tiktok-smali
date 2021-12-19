package com.ss.android;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f59126a;

    static {
        String str;
        Covode.recordClassIndex(36563);
        if (Keva.getRepo("ab_repo_cold_boot").getBoolean("isInTikTokRegionForAbTestInit", false)) {
            str = "https://libra-sg.tiktokv.com/common";
        } else {
            str = "https://libra-va.tiktokv.com/common";
        }
        f59126a = str;
    }
}
