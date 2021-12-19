package com.google.android.material.b;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class b extends RippleDrawable {
    static {
        Covode.recordClassIndex(32444);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (getDrawable(0) != null) {
            ((GradientDrawable) ((LayerDrawable) ((InsetDrawable) getDrawable(0)).getDrawable()).getDrawable(0)).setColorFilter(colorFilter);
        }
    }

    b(ColorStateList colorStateList, InsetDrawable insetDrawable, Drawable drawable) {
        super(colorStateList, insetDrawable, drawable);
    }
}
