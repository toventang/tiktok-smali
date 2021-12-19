package com.bytedance.tux.h;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.g.a;

public final class f {
    static {
        Covode.recordClassIndex(27508);
    }

    public static final float a(Number number) {
        l.c(number, "");
        float floatValue = number.floatValue();
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        return TypedValue.applyDimension(1, floatValue, system.getDisplayMetrics());
    }

    public static final int b(Number number) {
        l.c(number, "");
        float floatValue = number.floatValue();
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        return a.a(TypedValue.applyDimension(1, floatValue, system.getDisplayMetrics()));
    }

    public static final int a(Context context) {
        l.c(context, "");
        Resources resources = context.getResources();
        l.a((Object) resources, "");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.widthPixels;
        }
        return 0;
    }
}
