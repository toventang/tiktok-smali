package com.ss.android.ugc.tools.view;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(98765);
    }

    public static Drawable a(int[] iArr, GradientDrawable.Orientation orientation) {
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        gradientDrawable.setGradientType(0);
        return gradientDrawable;
    }

    public static Drawable a(int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i3);
        gradientDrawable.setStroke(i4, i2);
        return gradientDrawable;
    }

    public static Drawable a(int i2, int i3, float[] fArr) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i3);
        gradientDrawable.setStroke(0, i2);
        gradientDrawable.setCornerRadii(fArr);
        return gradientDrawable;
    }

    public static Drawable a(int i2, int i3, int i4, int i5) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i3);
        gradientDrawable.setStroke(i4, i2);
        gradientDrawable.setCornerRadius((float) i5);
        return gradientDrawable;
    }
}
