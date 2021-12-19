package com.bytedance.globalpayment.iap.google.helper;

import android.text.TextUtils;
import com.android.billingclient.api.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.d;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class c {
    static {
        Covode.recordClassIndex(17651);
    }

    public static d a(h hVar) {
        String str;
        d dVar = new d();
        int b2 = b(hVar);
        dVar.withErrorCode(b2);
        if (TextUtils.isEmpty(hVar.f5853b)) {
            str = a(b2);
        } else {
            str = hVar.f5853b;
        }
        dVar.withMessage(str);
        return dVar;
    }

    private static String a(int i2) {
        String[] split = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
        if (i2 < 0 || i2 > split.length - 1) {
            return "Unknown.";
        }
        return split[i2];
    }

    private static int b(h hVar) {
        int i2 = hVar.f5852a;
        if (i2 == Integer.MIN_VALUE) {
            return -4;
        }
        switch (i2) {
            case -3:
                return -3;
            case -2:
                return -2;
            case -1:
                return -1;
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return 5;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return 6;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return 7;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return 8;
            default:
                return Integer.MIN_VALUE;
        }
    }
}
