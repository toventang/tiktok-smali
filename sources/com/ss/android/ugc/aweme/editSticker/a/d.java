package com.ss.android.ugc.aweme.editSticker.a;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {
    static {
        Covode.recordClassIndex(55355);
    }

    public static final float a(Context context, float f2) {
        l.d(context, "");
        Resources resources = context.getResources();
        l.b(resources, "");
        return (f2 * resources.getDisplayMetrics().density) + 0.5f;
    }
}
