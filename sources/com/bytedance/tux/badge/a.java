package com.bytedance.tux.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(27332);
    }

    public static final String a(int i2, int i3, int i4) {
        if (i2 == 0) {
            return "";
        }
        if (i3 == 0 || i3 > 9) {
            return String.valueOf(i4);
        }
        int i5 = 1;
        if (i3 > 0) {
            int i6 = 1;
            while (true) {
                i5 *= 10;
                if (i6 == i3) {
                    break;
                }
                i6++;
            }
        }
        int i7 = i5 - 1;
        if (i4 > i7) {
            return new StringBuilder().append(i7).append('+').toString();
        }
        return String.valueOf(i4);
    }

    public static final c a(TypedArray typedArray, int i2, int i3, int i4) {
        l.c(typedArray, "");
        return new c(typedArray.getInt(1, 0), typedArray.getColor(2, i2), typedArray.getColor(0, i3), typedArray.getDimensionPixelSize(4, i4));
    }

    public static /* synthetic */ c a(Context context, AttributeSet attributeSet, int i2, int i3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            attributeSet = null;
        }
        if ((i5 & 8) != 0) {
            i2 = -1;
        }
        if ((i5 & 16) != 0) {
            i3 = -16777216;
        }
        if ((i5 & 32) != 0) {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            i4 = h.g.a.a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
        }
        l.c(context, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.cr, R.attr.cs, R.attr.ct, R.attr.aoe, R.attr.aof, R.attr.aog, R.attr.aok}, R.attr.bn, 0);
        l.a((Object) obtainStyledAttributes, "");
        c a2 = a(obtainStyledAttributes, i2, i3, i4);
        obtainStyledAttributes.recycle();
        return a2;
    }
}
