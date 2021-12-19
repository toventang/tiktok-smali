package com.ss.android.vesdk;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.playerkit.model.v;

public final class o {
    static {
        Covode.recordClassIndex(99546);
    }

    public static String a(int i2) {
        if (i2 == 1) {
            return "beauty_brighten";
        }
        if (i2 == 2) {
            return "beauty_smooth";
        }
        if (i2 == 4) {
            return "reshape_eye";
        }
        if (i2 == 5) {
            return "reshape cheek";
        }
        if (i2 == 9) {
            return "sharp";
        }
        switch (i2) {
            case 17:
                return "beauty_lipstick";
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                return "beauty_blusher";
            case 19:
                return "beauty_nasolabial";
            case v.U:
                return "beauty_pouch";
            default:
                return "";
        }
    }
}
