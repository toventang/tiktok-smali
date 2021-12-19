package com.bytedance.ies.dmt.ui.common;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class c {
    static {
        Covode.recordClassIndex(19912);
    }

    public static int a(Context context) {
        if (b.b(context)) {
            return Color.parseColor("#161823");
        }
        return b.c(context, R.color.bx);
    }

    public static int b(Context context) {
        if (b.b(context)) {
            return Color.parseColor("#80161823");
        }
        return b.c(context, R.color.c5);
    }

    public static Drawable c(Context context) {
        int i2;
        Resources resources = context.getResources();
        if (b.b(context)) {
            i2 = R.drawable.cbo;
        } else {
            i2 = R.drawable.cbn;
        }
        return resources.getDrawable(i2);
    }
}
