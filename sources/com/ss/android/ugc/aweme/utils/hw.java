package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;

public final class hw {
    static {
        Covode.recordClassIndex(93652);
    }

    public static boolean a(Context context, String str) {
        try {
            return b(context, str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private static boolean b(Context context, String str) {
        if (context == null || m.a(str)) {
            return false;
        }
        try {
            if (context.getPackageManager().getPackageInfo(str, 64) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
