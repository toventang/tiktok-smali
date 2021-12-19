package com.bytedance.android.livesdk.utils;

import android.content.Context;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;

public final class ap {
    static {
        Covode.recordClassIndex(13138);
    }

    public static int a(Context context) {
        if (context == null) {
            return 0;
        }
        int a2 = n.a(context);
        int b2 = n.b(context);
        if (b2 > a2) {
            return a2;
        }
        return b2;
    }

    public static float a(Context context, float f2) {
        return (f2 * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static int b(Context context, float f2) {
        return (int) ((f2 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
