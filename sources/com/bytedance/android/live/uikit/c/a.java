package com.bytedance.android.live.uikit.c;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.d.f;

public final class a {
    static {
        Covode.recordClassIndex(7159);
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (context.getResources().getConfiguration().locale.getLanguage().equals(f.f30878a) || context.getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }
}
