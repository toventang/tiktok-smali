package com.bytedance.android.ecommerce.k;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class l {
    static {
        Covode.recordClassIndex(3443);
    }

    public static float a(Context context, float f2) {
        if (context != null) {
            return (f2 * context.getResources().getDisplayMetrics().density) + 0.5f;
        }
        return 0.0f;
    }
}
