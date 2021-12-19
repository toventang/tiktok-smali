package com.ss.android.ugc.effectmanager.common.utils;

import com.bytedance.covode.number.Covode;

public final class EPUtils {
    public static final EPUtils INSTANCE = new EPUtils();

    public static final String getPlatformSDKVersion() {
        return "760.0.1.110-alpha.0-mt";
    }

    private EPUtils() {
    }

    static {
        Covode.recordClassIndex(95332);
    }
}
