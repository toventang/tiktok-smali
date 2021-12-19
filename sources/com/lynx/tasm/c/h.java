package com.lynx.tasm.c;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.utils.DisplayMetricsHolder;

public final class h extends c {
    static {
        Covode.recordClassIndex(35252);
    }

    private h(int i2, String str) {
        super(i2, str);
    }

    public static h a(int i2, String str) {
        return new h(i2, str);
    }

    public final void a(int i2, int i3, int i4, int i5, int i6, int i7) {
        if (DisplayMetricsHolder.a() != null) {
            a("scrollLeft", Float.valueOf(((float) i2) / DisplayMetricsHolder.a().density));
            a("scrollTop", Float.valueOf(((float) i3) / DisplayMetricsHolder.a().density));
            a("scrollHeight", Float.valueOf(((float) i4) / DisplayMetricsHolder.a().density));
            a("scrollWidth", Float.valueOf(((float) i5) / DisplayMetricsHolder.a().density));
            a("deltaX", Float.valueOf(((float) i6) / DisplayMetricsHolder.a().density));
            a("deltaY", Float.valueOf(((float) i7) / DisplayMetricsHolder.a().density));
        }
    }
}
