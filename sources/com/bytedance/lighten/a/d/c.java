package com.bytedance.lighten.a.d;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class c {
    static {
        Covode.recordClassIndex(24598);
    }

    public static float a(Context context, float f2) {
        return (f2 * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static int b(Context context, float f2) {
        return (int) ((f2 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
