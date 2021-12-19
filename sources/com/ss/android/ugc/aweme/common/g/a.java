package com.ss.android.ugc.aweme.common.g;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(47185);
    }

    public static boolean a() {
        if (TextUtils.equals(Build.MANUFACTURER.toLowerCase(), "genymotion") || TextUtils.equals(Build.MODEL.toLowerCase(), "virtual machine") || Build.DEVICE.contains("generic_")) {
            return false;
        }
        return true;
    }
}
