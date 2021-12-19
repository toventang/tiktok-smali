package com.bytedance.tux.h;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {
    static {
        Covode.recordClassIndex(27507);
    }

    public static final int a(Context context) {
        l.c(context, "");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
