package com.ss.android.ugc.aweme.tools;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;

public final class c {
    static {
        Covode.recordClassIndex(91058);
    }

    public static boolean a(Context context) {
        if (context != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                return true;
            }
        }
        return false;
    }
}
