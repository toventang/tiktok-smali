package com.ss.android.ugc.aweme.ecommercelive.framework.d;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(55334);
    }

    public static final int a(int i2, Context context) {
        l.d(context, "");
        Resources resources = context.getResources();
        l.b(resources, "");
        return (int) TypedValue.applyDimension(1, (float) i2, resources.getDisplayMetrics());
    }
}
