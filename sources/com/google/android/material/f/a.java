package com.google.android.material.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(32502);
    }

    public static ColorStateList a(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList a2;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (a2 = androidx.appcompat.a.a.a.a(context, resourceId)) == null) {
            return typedArray.getColorStateList(i2);
        }
        return a2;
    }

    public static Drawable b(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable b2;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (b2 = androidx.appcompat.a.a.a.b(context, resourceId)) == null) {
            return typedArray.getDrawable(i2);
        }
        return b2;
    }
}
