package com.bytedance.android.live.design;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import androidx.appcompat.a.a.a;
import com.bytedance.covode.number.Covode;

public final class c {
    static {
        Covode.recordClassIndex(4801);
    }

    public static ColorStateList a(Context context, TypedArray typedArray, int i2) {
        if (typedArray == null || !typedArray.hasValue(i2)) {
            return null;
        }
        int resourceId = typedArray.getResourceId(i2, 0);
        if (resourceId == 0) {
            return typedArray.getColorStateList(i2);
        }
        if (context == null) {
            return null;
        }
        return a.a(context, resourceId);
    }
}
