package com.ss.android.ugc.aweme.utils;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class ix {
    static {
        Covode.recordClassIndex(93689);
    }

    public static final Integer a(View view) {
        Drawable drawable;
        if (view != null) {
            drawable = view.getBackground();
        } else {
            drawable = null;
        }
        if (!(drawable instanceof ColorDrawable)) {
            drawable = null;
        }
        ColorDrawable colorDrawable = (ColorDrawable) drawable;
        if (colorDrawable != null) {
            return Integer.valueOf(colorDrawable.getColor());
        }
        return null;
    }

    public static final void a(View view, b<? super ViewGroup.LayoutParams, z> bVar) {
        l.d(bVar, "");
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            l.b(layoutParams, "");
            bVar.invoke(layoutParams);
            if (v.v(view)) {
                view.setLayoutParams(layoutParams);
            }
        }
    }

    public static final void a(View view, Integer num) {
        if (view != null && num != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = num.intValue();
            if (v.v(view)) {
                view.setLayoutParams(layoutParams);
            }
        }
    }
}
