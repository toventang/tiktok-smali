package com.ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.dk;
import com.ss.android.ugc.aweme.property.dl;
import com.ss.android.vesdk.VEVideoEncodeSettings;

public final class av {
    static {
        Covode.recordClassIndex(85347);
    }

    public static VEVideoEncodeSettings.ENCODE_PROFILE b() {
        int a2 = a();
        if (a2 == 1) {
            return VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE;
        }
        if (a2 == 2) {
            return VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_MAIN;
        }
        if (a2 != 8) {
            return VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN;
        }
        return VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_HIGH;
    }

    public static int a() {
        int i2;
        if (dl.a() != 1) {
            i2 = dl.a();
        } else if (dk.a() != 1) {
            i2 = dk.a();
        } else {
            i2 = 1;
            return i2;
        }
        if (!(i2 == 1 || i2 == 2 || i2 == 8)) {
            return 1;
        }
        return i2;
    }
}
