package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;

public class VEVersionUtil {
    static {
        Covode.recordClassIndex(99231);
    }

    public static String getVESDKVersion() {
        return "10.6.0.132".concat(String.valueOf("-".concat("mt")));
    }
}
