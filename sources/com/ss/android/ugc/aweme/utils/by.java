package com.ss.android.ugc.aweme.utils;

import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class by {
    static {
        Covode.recordClassIndex(93374);
    }

    public static final float a() {
        Resources system = Resources.getSystem();
        l.b(system, "");
        return TypedValue.applyDimension(2, 13.0f, system.getDisplayMetrics());
    }

    public static final float a(int i2) {
        Resources system = Resources.getSystem();
        l.b(system, "");
        return TypedValue.applyDimension(1, (float) i2, system.getDisplayMetrics());
    }
}
