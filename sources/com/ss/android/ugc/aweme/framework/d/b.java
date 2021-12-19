package com.ss.android.ugc.aweme.framework.d;

import android.content.Context;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(61342);
    }

    public static int a(Context context, float f2) {
        return (int) TypedValue.applyDimension(1, f2, context.getResources().getDisplayMetrics());
    }
}
